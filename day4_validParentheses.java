

public class day4_validParentheses {
    public static void main(String[] args) {
            enum Bracket { PARENTHESIS_OPEN('('),
                PARENTHESIS_CLOSE(')'),
                SQUARE_OPEN('['),
                SQUARE_CLOSE(']'),
                CURLY_OPEN('{'),
                CURLY_CLOSE('}');
                private final char character;
                Bracket(char character) {
                    this.character = character;
                }
                public char getCharacter() {
                    return character;
                }
            }

        Bracket bracket = Bracket.PARENTHESIS_OPEN;
        System.out.println("Enum constant: " + bracket);
        System.out.println("Character value: " + bracket.getCharacter());
        }
    }

