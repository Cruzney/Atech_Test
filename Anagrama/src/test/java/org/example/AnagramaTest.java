package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramaTest {

    @Test
    public void isAnagram_shouldReturnTrue_forValidAnagrams() {
        assertTrue("'anagram' e 'nagaram' deveriam ser anagramas", Anagrama.isAnagram("anagram", "nagaram"));
        assertTrue("'listen' e 'silent' deveriam ser anagramas", Anagrama.isAnagram("listen", "silent"));
    }

    @Test
    public void isAnagram_shouldReturnFalse_forDifferentLengths() {
        assertFalse("'rat' e 'car' não são anagramas", Anagrama.isAnagram("rat", "car"));
        assertFalse("'a' e 'ab' não são anagramas", Anagrama.isAnagram("a", "ab"));
    }

    @Test
    public void isAnagram_shouldReturnFalse_forSameLengthNonAnagrams() {
        assertFalse("'hello' e 'world' não são anagramas", Anagrama.isAnagram("hello", "world"));
    }

    @Test
    public void isAnagram_shouldReturnTrue_forEmptyStrings() {
        assertTrue("Duas strings vazias deveriam ser consideradas anagramas", Anagrama.isAnagram("", ""));
    }

    @Test
    public void isAnagram_shouldBeCaseSensitive() {
        // A implementação atual é sensível a maiúsculas/minúsculas
        assertFalse("'Listen' e 'silent' não deveriam ser anagramas devido ao caso", Anagrama.isAnagram("Listen", "silent"));
    }

}