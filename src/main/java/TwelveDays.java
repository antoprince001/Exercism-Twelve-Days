import java.util.HashMap;
class TwelveDays {
static HashMap<Integer,String> verseToLyric = new HashMap<>();
    static{
            verseToLyric.put(1,"On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n");
    verseToLyric.put(2,"On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(3,"On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(4,"On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(5,"On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(6,"On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(7,"On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(8,"On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(9,"On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(10,"On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(11,"On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");
    verseToLyric.put(12,"On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n");     
    }

    String verse(int verseNumber) {
        if(verseNumber >=1 && verseNumber <= 12)
            return verseToLyric.get(verseNumber);
        else
            return "";
    }

    String verses(int startVerse, int endVerse) {
        String lyrics = "";
        for(int itr=startVerse;itr<endVerse;itr++){
            if(itr >=1 && itr <= 12)
                lyrics += verse(itr) + "\n"; 
        }
        if(endVerse >=1 && endVerse <= 12)
            lyrics += verse(endVerse);
        return lyrics;
    }
    
    String sing() {
        return verses(1,12);
    }
}
