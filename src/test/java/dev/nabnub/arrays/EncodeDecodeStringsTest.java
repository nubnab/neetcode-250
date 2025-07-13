package dev.nabnub.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class EncodeDecodeStringsTest {

    private final EncodeDecodeStrings encodeDecodeStrings = new EncodeDecodeStrings();

    @ParameterizedTest
    @MethodSource("testCases")
    void strArray_shouldBeEncodedAndDecoded(List<String> input) {
        String encodedStr = encodeDecodeStrings.encode(input);
        assertEquals(input, encodeDecodeStrings.decode(encodedStr));
    }

    private static Stream<Arguments> testCases() {
        List<String> normalCase = Arrays.asList("neet","code","love","you");
        List<String> emptyString = List.of("");
        List<String> singleString = List.of("neet");
        List<String> stringsWithSpaces = Arrays.asList("ne  et","c ode","lo  ve","yo u");
        List<String> specialCharacters = Arrays.asList("ne(*$&Q(*et","cod!@#)(*!@#e","lov12(*#@&^e","yo$#()*u");

        return Stream.of(
                Arguments.of(normalCase),
                Arguments.of(emptyString),
                Arguments.of(singleString),
                Arguments.of(stringsWithSpaces),
                Arguments.of(specialCharacters));
    }

}