import org.junit.Test;
import romanWithEnum.RomanNumeralGenerator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralGeneratorShould {
    @Test public void
    generate_a_roman_numeral_for_a_given_decimal_number(){
        assertThat(RomanNumeralGenerator.romanFor(1), is("I"));
        assertThat(RomanNumeralGenerator.romanFor(2), is("II"));
        assertThat(RomanNumeralGenerator.romanFor(3), is("III"));
        assertThat(RomanNumeralGenerator.romanFor(4), is("IV"));
        assertThat(RomanNumeralGenerator.romanFor(5), is("V"));
        assertThat(RomanNumeralGenerator.romanFor(7), is("VII"));
        assertThat(RomanNumeralGenerator.romanFor(9), is("IX"));
        assertThat(RomanNumeralGenerator.romanFor(10), is("X"));
        assertThat(RomanNumeralGenerator.romanFor(18), is("XVIII"));
        assertThat(RomanNumeralGenerator.romanFor(30), is("XXX"));
        assertThat(RomanNumeralGenerator.romanFor(34), is("XXXIV"));
        assertThat(RomanNumeralGenerator.romanFor(40), is("XL"));
        assertThat(RomanNumeralGenerator.romanFor(50), is("L"));
        assertThat(RomanNumeralGenerator.romanFor(59), is("LIX"));
        assertThat(RomanNumeralGenerator.romanFor(70), is("LXX"));
        assertThat(RomanNumeralGenerator.romanFor(99), is("XCIX"));
        assertThat(RomanNumeralGenerator.romanFor(100), is("C"));
        assertThat(RomanNumeralGenerator.romanFor(120), is("CXX"));
        assertThat(RomanNumeralGenerator.romanFor(400), is("CD"));
        assertThat(RomanNumeralGenerator.romanFor(500), is("D"));
        assertThat(RomanNumeralGenerator.romanFor(900), is("CM"));
        assertThat(RomanNumeralGenerator.romanFor(949), is("CMXLIX"));
        assertThat(RomanNumeralGenerator.romanFor(999), is("CMXCIX"));
        assertThat(RomanNumeralGenerator.romanFor(1000), is("M"));
        assertThat(RomanNumeralGenerator.romanFor(2687), is("MMDCLXXXVII"));
        assertThat(RomanNumeralGenerator.romanFor(3499), is("MMMCDXCIX"));
    }
}

