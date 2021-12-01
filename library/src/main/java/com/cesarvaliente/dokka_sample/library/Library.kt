package com.cesarvaliente.dokka_sample.library

import kotlin.random.Random

/**
 * This is a sample Library that does two things:
 * <p>
 *     Here is where we can write a longer description for the lib
 * </p>
 *
 * Now we are going to list the functionality of this Library:
 * <ul>
 *     <li> getRandomNumber returns a random number @see Int </li>
 *     <li> getRandomString returns a random string {@see String} </li>
 * </ul>
 *
 * @author Cesar Valiente Gordo
 * @version 1.0
 * @since 2021/11/30
 *
 */
object LibraryOne {

    /**
     * Get random number
     *
     * @property limit
     * @return Int
     */
    fun getRandomNumber(limit: Int): Int {
        return Random.nextInt(0, limit)
    }

    /**
     * Get random string
     *
     * @return
     */
    fun getRandomString(): String {
        return System.currentTimeMillis().toString()
    }

}