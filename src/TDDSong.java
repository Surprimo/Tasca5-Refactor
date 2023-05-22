public class TDDSong {
    public String TDDSong(String[] cadena) {

        if (cadena.length == 0) {
            return "";
        } else if (cadena.length == 1) {
            return "There was an old lady who swallowed a " + cadena[0] + ".\n"+
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n";
        } else if (cadena.length == 2) {
            return "There was an old lady who swallowed a " + cadena[0] + ".\n"+
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n"+
                    "\n" +
                    "There was an old lady who swallowed a " + cadena[1] + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + cadena[1] + " to catch the "+ cadena[0] + ";\n" +
                    "I don't know why she swallowed a "  + cadena[0] + "- perhaps she'll die!\n";
        } else if (cadena.length == 3) {
            return "There was an old lady who swallowed a " + cadena[0] + ".\n"+
                    "I don't know why she swallowed a " + cadena[0] + " - perhaps she'll die!\n"+
                    "\n" +
                    "There was an old lady who swallowed a " + cadena[1] + ";\n" +
                    "That wriggled and wiggled and tickled inside her.\n" +
                    "She swallowed the " + cadena[1] + " to catch the "+ cadena[0] + ";\n" +
                    "I don't know why she swallowed a "  + cadena[0] + "- perhaps she'll die!\n"
                    +
                    "\n" +
                    "There was an old lady who swallowed a " + cadena[2] + ";\n"  +
                    "How absurd to swallow a "+ cadena[2] + ".\n" +
                    "She swallowed the " + cadena[2] + " to catch the "+ cadena[1] + ";\n" +
                    "She swallowed the " + cadena[1] + " to catch the "+ cadena[0] + ";\n" +
                    "I don't know why she swallowed a "  + cadena[0] + "- perhaps she'll die!\n";
        }
        return "";
    }
}
