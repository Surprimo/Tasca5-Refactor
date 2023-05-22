import static org.junit.jupiter.api.Assertions.*;

class TDDSongTest {
  @org.junit.jupiter.api.Test
    void testFly() {
        TDDSong song = new TDDSong();
        String[] cadena = {"fly"};
        String expected = "There was an old lady who swallowed a fly.\n"+
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String actual = song.TDDSong(cadena);
        assertEquals(expected, actual);
    }
}