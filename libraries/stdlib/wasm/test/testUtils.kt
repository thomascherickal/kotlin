/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package test

import kotlin.test.*
import kotlin.reflect.qualifiedOrSimpleName

public actual fun assertTypeEquals(expected: Any?, actual: Any?) {
    assertEquals(expected?.let { it::class }, actual?.let { it::class })
}

@Suppress("NOTHING_TO_INLINE")
internal actual inline fun String.removeLeadingPlusOnJava6(): String = this

internal actual inline fun testOnNonJvm6And7(f: () -> Unit) {
    f()
}


public actual fun testOnJvm(action: () -> Unit) { }
public actual fun testOnJs(action: () -> Unit) { }

// TODO: See KT-24975
public actual val isFloat32RangeEnforced: Boolean = false

actual val supportsSuppressedExceptions: Boolean get() = true

public actual val supportsNamedCapturingGroup: Boolean get() = true

public actual val regexSplitUnicodeCodePointHandling: Boolean get() = true

public actual object BackReferenceHandling {
    actual val captureLargestValidIndex: Boolean get() = true

    actual val notYetDefinedGroup: HandlingOption = HandlingOption.THROW
    actual val notYetDefinedNamedGroup: HandlingOption = HandlingOption.THROW
    actual val enclosingGroup: HandlingOption = HandlingOption.MATCH_NOTHING
    actual val nonExistentGroup: HandlingOption = HandlingOption.THROW
    actual val nonExistentNamedGroup: HandlingOption = HandlingOption.THROW
}