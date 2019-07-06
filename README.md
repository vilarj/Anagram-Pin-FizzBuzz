# Anagram
Your task is to write a simple anagram detector: it compares two phrases and reports whether or not they use the same number of the same letters (ignoring case and any non-letter symbols). The detector will work by checking if both phrases use the same number of each letter: 1. The countLetters method counts how many times each letter occurs in a word and returns an array of integers representing this tally. The 0th element represents how many a or A’s were found in the word, the 1st element represents how many b/B’s, … and the 25th element how many z/Z’s. All other symbols are ignored in the resulting array. 2. The sameCounts method compares two integer arrays and returns true only if they have the same contents, including their sizes and values for each element. Note: you are not allowed to use Arrays.equals, or equivalent, to implement this method.
