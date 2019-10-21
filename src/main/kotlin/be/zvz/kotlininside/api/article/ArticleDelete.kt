package be.zvz.kotlininside.api.article

import be.zvz.kotlininside.KotlinInside
import be.zvz.kotlininside.http.HttpException
import be.zvz.kotlininside.http.Request
import be.zvz.kotlininside.session.Session
import be.zvz.kotlininside.session.user.Anonymous
import be.zvz.kotlininside.utils.StringUtil
import be.zvz.kotlininside.value.ApiUrl

class ArticleDelete(
    val gallId: String,
    val articleId: Int,
    val session: Session
) {
    data class DeleteResult(
        val result: Boolean,
        val cause: String? = null
    )

    /**
     * 글을 삭제합니다.
     * @exception [be.zvz.kotlininside.http.HttpException] 글을 삭제하지 못할 경우, HttpException 발생
     */
    @Throws(HttpException::class)
    fun delete(): DeleteResult {
        val option = Request.getDefaultOption()
            .addMultipartParameter("id", gallId)
            .addMultipartParameter("app_id", KotlinInside.getInstance().auth.getAppId())
            .addMultipartParameter("no", articleId.toString())
            .addMultipartParameter("mode", "board_del")

        if (session.user is Anonymous) {
            option
                .addMultipartParameter("write_pw", URLEncoder.encode(session.user.id, "UTF-8"))
        } else {
            option
                .addMultipartParameter("user_id", session.detail!!.userId)
        }

        val json = KotlinInside.getInstance().httpInterface.upload(ApiUrl.Article.WRITE, option)!!.index(0)

        val result = json.get("result").`as`(Boolean::class.java)

        return when {
            result -> DeleteResult(
                result = result
            )
            else -> DeleteResult(
                result = result,
                cause = json.get("cause").text()
            )
        }
    }
}