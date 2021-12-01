package com.cesarvaliente.dokka_sample.library

/**
 * Library two description bla, bla, bla
 * 
 * @author Cesar Valiente Gordo
 * @version 1.0
 * @since 2021/11/30
 *
 * @constructor
 *
 */
class LibraryTwo(param1: Int) {

    /**
     * this is the description for the constructor with two parameters
     */
    constructor(param1: Int, param2: Int) : this(param1) {}

    /**
     * this is the description for the constructor with three parameters
     */
    constructor(param1: Int, param2: Int, param3: Int) : this(param1, param2) {}

    /**
     * Do something one
     *
     * @param param1
     * @param param2
     */
    fun doSomethingOne(param1: Int, param2: String) {

    }

    /**
     * Return something one
     *
     * @param Int
     * @param Int
     * @return Int
     */
    fun returnSomethingOne(param1: Int, param2: Int): Int {
        return param1 + param2
    }
}