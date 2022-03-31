package com.fernandocejas.sample

import com.fernandocejas.sample.core.functional.MovieValidator
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test


class MovieValidatorTest {

    @Test
    fun isValidMovie() {
        assertTrue(MovieValidator.isValidMovie("The lord of the rings"))
        assertFalse(MovieValidator.isValidMovie("name@email"))

    }

}