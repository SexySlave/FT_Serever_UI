package org.fileserverdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform