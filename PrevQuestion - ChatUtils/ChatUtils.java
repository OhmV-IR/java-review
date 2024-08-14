package org.metamechanists.metalib.utils; // this corresponds to the folder structure

import io.github.bakedlibs.dough.common.CommonPatterns; // Regex library I assume

import javax.annotation.Nonnull; //this package helps to find null pointer references(bugs)
import java.util.Locale;

public class ChatUtils {
    public static @Nonnull String humanize(@Nonnull String string) { // Things tagged with the nonnull tag will be checked for potentially null pointers by IDE
        StringBuilder builder = new StringBuilder(); // Create a new instance of the string builder class
        String[] segments = CommonPatterns.UNDERSCORE.split(string.toLowerCase(Locale.ROOT)); // Turn all letters of the string to lowercase and split the string at every underscore, excluding the underscore itself

        builder.append(Character.toUpperCase(segments[0].charAt(0))).append(segments[0].substring(1)); // Capitalize the first letter of the first segment and then add the rest of the word

        for (int i = 1; i < segments.length; i++) { // For every remaining word
            String segment = segments[i]; // current word
            builder.append(' ').append(Character.toUpperCase(segment.charAt(0))).append(segment.substring(1)); // Add a space before adding the next word using the same system as before
        }

        return builder.toString(); // Return the completed string once all words have been added
    }
}