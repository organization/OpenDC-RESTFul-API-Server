---
title: JsonBrowser - KotlinInside
---

[KotlinInside](../../index.html) / [be.zvz.kotlininside.json](../index.html) / [JsonBrowser](./index.html)

# JsonBrowser

(JVM) `open class JsonBrowser`

Allows to easily navigate in decoded JSON data

### Properties

| (JVM) [NULL_BROWSER](-n-u-l-l_-b-r-o-w-s-e-r.html) | `static val NULL_BROWSER: `[`JsonBrowser`](./index.html)`!` |

### Functions

| (JVM) [as](as.html) | Attempt to retrieve the value in the specified format`open fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!> as(klass: `[`Class`](https://docs.oracle.com/javase/7/docs/api/java/lang/Class.html)`<T>!): T` |
| (JVM) [asBoolean](as-boolean.html) | `open fun asBoolean(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>`open fun asBoolean(defaultValue: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [asInteger](as-integer.html) | `open fun asInteger(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>`open fun asInteger(defaultValue: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| (JVM) [asLong](as-long.html) | `open fun asLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>`open fun asLong(defaultValue: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| (JVM) [asNullableBoolean](as-nullable-boolean.html) | `open fun asNullableBoolean(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| (JVM) [asNullableInteger](as-nullable-integer.html) | `open fun asNullableInteger(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| (JVM) [asNullableLong](as-nullable-long.html) | `open fun asNullableLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| (JVM) [format](format.html) | `open fun format(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| (JVM) [get](get.html) | Get an element by key from a map value`open fun get(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`JsonBrowser`](./index.html) |
| (JVM) [index](--index--.html) | Get an element at an index for a list value`open fun index(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`JsonBrowser`](./index.html) |
| (JVM) [isList](is-list.html) | `open fun isList(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [isMap](is-map.html) | `open fun isMap(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [isNull](is-null.html) | `open fun isNull(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| (JVM) [parse](parse.html) | Parse from string.`open static fun parse(json: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!): `[`JsonBrowser`](./index.html)<br>`open static fun parse(stream: `[`InputStream`](https://docs.oracle.com/javase/7/docs/api/java/io/InputStream.html)`!): `[`JsonBrowser`](./index.html) |
| (JVM) [put](put.html) | Put a value into the map if this instance contains a map.`open fun put(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`!, item: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| (JVM) [safeText](safe-text.html) | `open fun safeText(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM) [text](text.html) | `open fun text(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| (JVM) [toMap](to-map.html) | `open fun <K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!, V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`!> toMap(): `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<K, V>` |
| (JVM) [toString](to-string.html) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| (JVM) [values](values.html) | Returns a list of all the values in this element`open fun values(): `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`JsonBrowser`](./index.html)`!>` |
