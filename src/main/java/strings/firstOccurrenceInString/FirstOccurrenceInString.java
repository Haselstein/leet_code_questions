package strings.firstOccurrenceInString;

public class FirstOccurrenceInString {
    /*
    Даны 2 строки. Найти первое вхождение строки needle внутри строки haystack.
    Если точного вхождения нет, то вернуть -1, иначе индекс начала первого вхождения.
     */

    public int firstOccurrenceInString(String haystack, String needle) {

        if (!haystack.contains(needle))
            return -1;

        return haystack.indexOf(needle);

    }

}
