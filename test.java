
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class test {

    private static final String[] FONT_NAMES = {
            "Abadi MT Condensed Extra Bold", "Abadi MT Condensed Light", "Academy Engraved LET", "Al Bayan",
            "American Typewriter", "Andale Mono", "Apple Casual", "Apple Chancery", "Apple LiGothic", "Apple LiSung",
            "Apple Symbols", "AppleGothic", "AppleMyungjo", "Arial", "Arial Black", "Arial Hebrew", "Arial Narrow",
            "Arial Rounded MT Bold", "Ayuthaya", "Baghdad", "Bank Gothic", "Baskerville", "Baskerville Old Face",
            "Batang", "Bauhaus 93", "Bell MT", "Bernard MT Condensed", "BiauKai", "Big Caslon", "Bitstream Vera Sans",
            "Bitstream Vera Sans Mono", "Bitstream Vera Serif", "Blackmoor LET", "BlairMdITC TT", "Bodoni Ornaments ITC TT",
            "Bodoni SvtyTwo ITC TT", "Bodoni SvtyTwo OS ITC TT", "Bodoni SvtyTwo SC ITC TT", "Book Antiqua",
            "Bookman Old Style", "Bordeaux Roman Bold LET", "Bradley Hand ITC TT", "Braggadocio", "Britannic Bold",
            "Brush Script MT", "Calisto MT", "Century", "Century Gothic", "Century Schoolbook", "Chalkboard", "Charcoal CY",
            "Cochin", "Colonna MT", "Comic Sans MS", "Cooper Black", "Copperplate", "Copperplate Gothic Bold",
            "Copperplate Gothic Light", "Corsiva Hebrew", "Courier", "Courier New", "Cracked", "Curlz MT", "DecoType Naskh",
            "Desdemona", "Devanagari MT", "Dialog", "DialogInput", "Didot", "Edwardian Script ITC", "Engravers MT",
            "Euphemia UCAS", "Eurostile", "Footlight MT Light", "Futura", "Garamond", "GB18030 Bitmap", "Geeza Pro",
            "Geneva", "Geneva CY", "Georgia", "Gill Sans", "Gill Sans Ultra Bold", "Gloucester MT Extra Condensed",
            "Goudy Old Style", "Gujarati MT", "Gulim", "Gurmukhi MT", "Haettenschweiler", "Handwriting - Dakota",
            "Harrington", "Hei", "Helvetica", "Helvetica CY", "Helvetica Neue", "Herculanum", "Hiragino Kaku Gothic Pro",
            "Hiragino Kaku Gothic Std", "Hiragino Maru Gothic Pro", "Hiragino Mincho Pro", "Hoefler Text", "Impact",
            "Imprint MT Shadow", "InaiMathi", "Jazz LET", "Kai", "Kino MT", "Krungthep", "KufiStandardGK", "LiHei Pro",
            "LiSong Pro", "Lucida Blackletter", "Lucida Bright", "Lucida Calligraphy", "Lucida Fax", "Lucida Grande",
            "Lucida Handwriting", "Lucida Sans", "Lucida Sans Typewriter", "Marker Felt", "Matura MT Script Capitals",
            "Mistral", "Modern No. 20", "Mona Lisa Solid ITC TT", "Monaco", "Monospaced", "Monotype Corsiva",
            "Monotype Sorts", "MS Gothic", "MS Mincho", "MS PGothic", "MS PMincho", "Mshtakan", "MT Extra", "Nadeem",
            "New Peninim MT", "News Gothic MT", "Onyx", "OpenSymbol", "Optima", "Osaka", "Palatino", "Papyrus", "Party LET",
            "Perpetua Titling MT", "Plantagenet Cherokee", "Playbill", "PMingLiU", "PortagoITC TT", "Princetown LET",
            "Raanana", "Rockwell", "Rockwell Extra Bold", "SansSerif", "Santa Fe LET", "Sathu", "Savoye LET",
            "SchoolHouse Cursive B", "SchoolHouse Printed A", "Serif", "Silom", "SimSun", "Skia", "Snell Roundhand",
            "Stencil", "STFangsong", "STHeiti", "STKaiti", "Stone Sans ITC TT", "Stone Sans Sem ITC TT", "STSong",
            "Symbol", "Synchro LET", "Tahoma", "Thonburi", "Times", "Times New Roman", "Trebuchet MS",
            "Type Embellishments One LET", "Verdana", "Webdings", "Wide Latin", "Wingdings", "Wingdings 2", "Wingdings 3",
            "Zapf Dingbats", "Zapfino"
    };

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Font Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JPanel fontPanel = new JPanel();
            fontPanel.setLayout(new GridLayout(FONT_NAMES.length, 1));

            for (String fontName : FONT_NAMES) {
                JLabel label = new JLabel(fontName + ": Sample Text");
                label.setFont(new Font(fontName, Font.PLAIN, 16));
                fontPanel.add(label);
            }

            JScrollPane scrollPane = new JScrollPane(fontPanel);
            frame.getContentPane().add(scrollPane);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}


