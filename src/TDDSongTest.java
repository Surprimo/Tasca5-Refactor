import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {
    //Test para fly
  @org.junit.jupiter.api.Test
    void testFly() {
        TDDSong song = new TDDSong();
        String[] cadena = {"fly"};
        String expected = "There was an old lady who swallowed a fly.\n"+
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String actual = song.TDDSong(cadena);
        assertEquals(expected, actual);
    }
    //Test para fly y spider
    @org.junit.jupiter.api.Test
    void testFlySpider() {
        TDDSong song = new TDDSong();
        String[] cadena = {"fly", "spider"};
        String expected = "There was an old lady who swallowed a fly.\n"+
                "I don't know why she swallowed a fly - perhaps she'll die!\n"+
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly- perhaps she'll die!\n";
        String actual = song.TDDSong(cadena);
        assertEquals(expected, actual);
    }
    //Test para spider y fly
    @org.junit.jupiter.api.Test
    void testSpiderFly() {
        TDDSong song = new TDDSong();
        String[] cadena = {"spider", "fly"};
        String expected = "There was an old lady who swallowed a spider.\n"+
                "I don't know why she swallowed a spider - perhaps she'll die!\n"+
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider- perhaps she'll die!\n";
        String actual = song.TDDSong(cadena);
        assertEquals(expected, actual);
    }
    //Test para "fly", "spider", "bird".
    @org.junit.jupiter.api.Test
    void testFlySpiderBird(){
        TDDSong song = new TDDSong();
        String[] cadena = {"fly", "spider", "bird"};
        String expected = "There was an old lady who swallowed a fly.\n"+
                "I don't know why she swallowed a fly - perhaps she'll die!\n"+
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly- perhaps she'll die!\n"
                +
                "\n" +
                "There was an old lady who swallowed a bird;\n"  +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider;\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly- perhaps she'll die!\n";
        String actual = song.TDDSong(cadena);
        assertEquals(expected, actual);
    }
    //Test para bird fly spider.
    @org.junit.jupiter.api.Test
    void testBirdFlySpider(){
        TDDSong song = new TDDSong();
        String[] cadena = {"bird", "fly", "spider"};
        String expected =  "There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n";

        String actual = song.TDDSong(cadena);
        assertEquals(expected, actual);
    }
}