package org.xtext.example.mydsluno.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '<Uno_Config> <pioche> ' )
            // InternalMyDsl.g:11:9: '<Uno_Config> <pioche> '
            {
            match("<Uno_Config> <pioche> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ' </pioche> <poser> ' )
            // InternalMyDsl.g:12:9: ' </pioche> <poser> '
            {
            match(" </pioche> <poser> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( ' </poser> <main> ' )
            // InternalMyDsl.g:13:9: ' </poser> <main> '
            {
            match(" </poser> <main> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( '</main> <carte_speciale> : ' )
            // InternalMyDsl.g:14:9: '</main> <carte_speciale> : '
            {
            match("</main> <carte_speciale> : "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( ' </carte_speciale> ' )
            // InternalMyDsl.g:15:9: ' </carte_speciale> '
            {
            match(" </carte_speciale> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( ' <temps> ' )
            // InternalMyDsl.g:16:9: ' <temps> '
            {
            match(" <temps> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( ' </temps> ' )
            // InternalMyDsl.g:17:9: ' </temps> '
            {
            match(" </temps> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( ' <tas> ' )
            // InternalMyDsl.g:18:9: ' <tas> '
            {
            match(" <tas> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( ' </tas> ' )
            // InternalMyDsl.g:19:9: ' </tas> '
            {
            match(" </tas> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( ' <nb_carte_de_depart> ' )
            // InternalMyDsl.g:20:9: ' <nb_carte_de_depart> '
            {
            match(" <nb_carte_de_depart> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( ' </nb_carte_de_depart> ' )
            // InternalMyDsl.g:21:9: ' </nb_carte_de_depart> '
            {
            match(" </nb_carte_de_depart> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( ' </Uno_Config>' )
            // InternalMyDsl.g:22:9: ' </Uno_Config>'
            {
            match(" </Uno_Config>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( ' <une_fois> ' )
            // InternalMyDsl.g:23:9: ' <une_fois> '
            {
            match(" <une_fois> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( ' </une_fois> ' )
            // InternalMyDsl.g:24:9: ' </une_fois> '
            {
            match(" </une_fois> "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( '\"jusqu\\u00E0 pouvoir jouer\"' )
            // InternalMyDsl.g:25:9: '\"jusqu\\u00E0 pouvoir jouer\"'
            {
            match("\"jusqu\u00E0 pouvoir jouer\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '\"classique couleur chiffre\"' )
            // InternalMyDsl.g:26:9: '\"classique couleur chiffre\"'
            {
            match("\"classique couleur chiffre\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '\"cumul + 2\"' )
            // InternalMyDsl.g:27:9: '\"cumul + 2\"'
            {
            match("\"cumul + 2\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '\"cumul + 4\"' )
            // InternalMyDsl.g:28:9: '\"cumul + 4\"'
            {
            match("\"cumul + 4\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( '\"cumul +2 et +4\"' )
            // InternalMyDsl.g:29:9: '\"cumul +2 et +4\"'
            {
            match("\"cumul +2 et +4\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( '\"visible\"' )
            // InternalMyDsl.g:30:9: '\"visible\"'
            {
            match("\"visible\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( '\"invisible\"' )
            // InternalMyDsl.g:31:9: '\"invisible\"'
            {
            match("\"invisible\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '\"peut jouer\"' )
            // InternalMyDsl.g:32:9: '\"peut jouer\"'
            {
            match("\"peut jouer\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '\"passe son tour\"' )
            // InternalMyDsl.g:33:9: '\"passe son tour\"'
            {
            match("\"passe son tour\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( '\"zero\"' )
            // InternalMyDsl.g:34:9: '\"zero\"'
            {
            match("\"zero\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( '\"sept\"' )
            // InternalMyDsl.g:35:9: '\"sept\"'
            {
            match("\"sept\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( '\"+ 4 menteur\"' )
            // InternalMyDsl.g:36:9: '\"+ 4 menteur\"'
            {
            match("\"+ 4 menteur\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '\"aucune\"' )
            // InternalMyDsl.g:37:9: '\"aucune\"'
            {
            match("\"aucune\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( ',' )
            // InternalMyDsl.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( '\"oui\"' )
            // InternalMyDsl.g:39:9: '\"oui\"'
            {
            match("\"oui\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( '\"1 tas\"' )
            // InternalMyDsl.g:40:9: '\"1 tas\"'
            {
            match("\"1 tas\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( '\"4 tas\"' )
            // InternalMyDsl.g:41:9: '\"4 tas\"'
            {
            match("\"4 tas\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( '\"7 cartes\"' )
            // InternalMyDsl.g:42:9: '\"7 cartes\"'
            {
            match("\"7 cartes\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( '\"10 cartes\"' )
            // InternalMyDsl.g:43:9: '\"10 cartes\"'
            {
            match("\"10 cartes\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:591:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:591:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:591:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:591:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:591:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:593:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:593:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:593:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:593:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:595:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:595:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:595:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:595:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:595:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:595:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:595:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:595:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:595:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:595:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:595:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:597:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:597:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:597:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:597:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:599:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:599:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:599:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:599:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:599:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:599:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:599:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:599:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:601:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:601:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:601:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:603:16: ( . )
            // InternalMyDsl.g:603:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=40;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:216: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:225: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:237: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:253: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:269: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:277: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\13\1\17\1\13\1\uffff\1\13\2\uffff\2\13\u00da\uffff";
    static final String DFA12_eofS =
        "\u00e4\uffff";
    static final String DFA12_minS =
        "\1\0\1\57\1\74\1\0\1\uffff\1\101\2\uffff\1\0\1\52\4\uffff\1\57\1\uffff\15\0\6\uffff\1\125\1\141\2\uffff\20\0\1\151\1\uffff\1\141\5\uffff\20\0\4\uffff\13\0\1\uffff\13\0\2\uffff\2\0\1\uffff\13\0\2\uffff\2\0\1\uffff\1\0\1\uffff\11\0\2\uffff\1\0\1\uffff\5\0\1\uffff\4\0\1\uffff\7\0\1\uffff\5\0\1\uffff\2\0\2\uffff\1\0\1\uffff\3\0\2\uffff\2\0\2\uffff\1\0\2\uffff\2\0\1\uffff\3\0\1\uffff\1\0\1\uffff\4\0\1\uffff\6\0\2\uffff\2\0\2\uffff\10\0\1\uffff\1\0\1\uffff\4\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\125\1\74\1\uffff\1\uffff\1\172\2\uffff\1\uffff\1\57\4\uffff\1\165\1\uffff\15\uffff\6\uffff\1\165\1\145\2\uffff\20\uffff\1\157\1\uffff\1\145\5\uffff\20\uffff\4\uffff\13\uffff\1\uffff\13\uffff\2\uffff\2\uffff\1\uffff\13\uffff\2\uffff\2\uffff\1\uffff\1\uffff\1\uffff\11\uffff\2\uffff\1\uffff\1\uffff\5\uffff\1\uffff\4\uffff\1\uffff\7\uffff\1\uffff\5\uffff\1\uffff\2\uffff\2\uffff\1\uffff\1\uffff\3\uffff\2\uffff\2\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\4\uffff\1\uffff\6\uffff\2\uffff\2\uffff\2\uffff\10\uffff\1\uffff\1\uffff\1\uffff\4\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\34\1\uffff\1\42\1\43\2\uffff\1\47\1\50\1\1\1\4\1\uffff\1\47\15\uffff\1\44\1\34\1\42\1\43\1\45\1\46\2\uffff\1\12\1\15\21\uffff\1\5\1\uffff\1\13\1\14\1\16\1\6\1\10\20\uffff\1\2\1\3\1\7\1\11\13\uffff\1\35\13\uffff\1\30\1\31\2\uffff\1\35\13\uffff\1\30\1\31\2\uffff\1\36\1\uffff\1\37\11\uffff\1\33\1\36\1\uffff\1\37\5\uffff\1\24\4\uffff\1\33\7\uffff\1\24\5\uffff\1\40\2\uffff\1\21\1\22\1\uffff\1\25\3\uffff\1\41\1\40\2\uffff\1\21\1\22\1\uffff\1\25\1\26\2\uffff\1\41\3\uffff\1\26\1\uffff\1\32\4\uffff\1\32\6\uffff\1\23\1\27\2\uffff\1\23\1\27\10\uffff\1\17\1\uffff\1\17\4\uffff\2\20";
    static final String DFA12_specialS =
        "\1\115\2\uffff\1\20\4\uffff\1\21\7\uffff\1\23\1\2\1\110\1\121\1\117\1\160\1\164\1\170\1\u0083\1\u0089\1\11\1\u0090\1\u0095\12\uffff\1\24\1\47\1\12\1\111\1\122\1\132\1\143\1\161\1\165\1\171\1\u0084\1\u008a\1\u008c\1\0\1\u0091\1\u0096\10\uffff\1\25\1\50\1\13\1\112\1\123\1\133\1\144\1\162\1\166\1\172\1\u0085\1\u008b\1\u008d\1\1\1\u0092\1\u0097\4\uffff\1\26\1\51\1\14\1\113\1\124\1\134\1\145\1\163\1\167\1\173\1\u0086\1\uffff\1\u008e\1\3\1\u0093\1\u0098\1\27\1\52\1\15\1\114\1\125\1\135\1\146\2\uffff\1\174\1\u0087\1\uffff\1\u008f\1\4\1\u0094\1\u0099\1\30\1\53\1\16\1\116\1\126\1\136\1\147\2\uffff\1\175\1\u0088\1\uffff\1\5\1\uffff\1\u009a\1\31\1\54\1\17\1\120\1\127\1\137\1\150\1\176\2\uffff\1\6\1\uffff\1\u009b\1\32\1\55\1\22\1\101\1\uffff\1\130\1\140\1\151\1\177\1\uffff\1\7\1\u009c\1\33\1\56\1\77\1\100\1\102\1\uffff\1\131\1\141\1\152\1\u0080\1\10\1\uffff\1\34\1\57\2\uffff\1\103\1\uffff\1\142\1\153\1\u0081\2\uffff\1\35\1\60\2\uffff\1\104\2\uffff\1\154\1\u0082\1\uffff\1\36\1\61\1\105\1\uffff\1\155\1\uffff\1\37\1\62\1\106\1\156\1\uffff\1\40\1\63\1\107\1\157\1\41\1\64\2\uffff\1\42\1\65\2\uffff\1\43\1\66\1\44\1\67\1\45\1\70\1\46\1\71\1\uffff\1\72\1\uffff\1\73\1\74\1\75\1\76\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\13\2\12\2\13\1\12\22\13\1\2\1\13\1\3\4\13\1\10\4\13\1\4\2\13\1\11\12\7\2\13\1\1\4\13\32\6\3\13\1\5\1\6\1\13\32\6\uff85\13",
            "\1\15\45\uffff\1\14",
            "\1\16",
            "\53\35\1\27\5\35\1\32\2\35\1\33\2\35\1\34\51\35\1\30\1\35\1\21\5\35\1\23\1\20\4\35\1\31\1\24\2\35\1\26\2\35\1\22\3\35\1\25\uff85\35",
            "",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\0\35",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "",
            "",
            "\1\43\76\uffff\1\45\5\uffff\1\44\1\46",
            "",
            "\165\35\1\47\uff8a\35",
            "\154\35\1\50\10\35\1\51\uff8a\35",
            "\151\35\1\52\uff96\35",
            "\156\35\1\53\uff91\35",
            "\141\35\1\55\3\35\1\54\uff9a\35",
            "\145\35\1\56\uff9a\35",
            "\145\35\1\57\uff9a\35",
            "\40\35\1\60\uffdf\35",
            "\165\35\1\61\uff8a\35",
            "\165\35\1\62\uff8a\35",
            "\40\35\1\63\17\35\1\64\uffcf\35",
            "\40\35\1\65\uffdf\35",
            "\40\35\1\66\uffdf\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73\15\uffff\1\70\12\uffff\1\72\1\uffff\1\67\3\uffff\1\71\1\74",
            "\1\76\3\uffff\1\75",
            "",
            "",
            "\163\35\1\77\uff8c\35",
            "\141\35\1\100\uff9e\35",
            "\155\35\1\101\uff92\35",
            "\163\35\1\102\uff8c\35",
            "\166\35\1\103\uff89\35",
            "\165\35\1\104\uff8a\35",
            "\163\35\1\105\uff8c\35",
            "\162\35\1\106\uff8d\35",
            "\160\35\1\107\uff8f\35",
            "\64\35\1\110\uffcb\35",
            "\143\35\1\111\uff9c\35",
            "\151\35\1\112\uff96\35",
            "\164\35\1\113\uff8b\35",
            "\40\35\1\114\uffdf\35",
            "\164\35\1\115\uff8b\35",
            "\143\35\1\116\uff9c\35",
            "\1\117\5\uffff\1\120",
            "",
            "\1\122\3\uffff\1\121",
            "",
            "",
            "",
            "",
            "",
            "\161\35\1\123\uff8e\35",
            "\163\35\1\124\uff8c\35",
            "\165\35\1\125\uff8a\35",
            "\151\35\1\126\uff96\35",
            "\151\35\1\127\uff96\35",
            "\164\35\1\130\uff8b\35",
            "\163\35\1\131\uff8c\35",
            "\157\35\1\132\uff90\35",
            "\164\35\1\133\uff8b\35",
            "\40\35\1\134\uffdf\35",
            "\165\35\1\135\uff8a\35",
            "\42\35\1\136\uffdd\35",
            "\141\35\1\137\uff9e\35",
            "\143\35\1\140\uff9c\35",
            "\141\35\1\141\uff9e\35",
            "\141\35\1\142\uff9e\35",
            "",
            "",
            "",
            "",
            "\165\35\1\143\uff8a\35",
            "\163\35\1\144\uff8c\35",
            "\154\35\1\145\uff93\35",
            "\142\35\1\146\uff9d\35",
            "\163\35\1\147\uff8c\35",
            "\40\35\1\150\uffdf\35",
            "\145\35\1\151\uff9a\35",
            "\42\35\1\152\uffdd\35",
            "\42\35\1\153\uffdd\35",
            "\155\35\1\154\uff92\35",
            "\156\35\1\155\uff91\35",
            "",
            "\163\35\1\157\uff8c\35",
            "\141\35\1\160\uff9e\35",
            "\163\35\1\161\uff8c\35",
            "\162\35\1\162\uff8d\35",
            "\u00e0\35\1\163\uff1f\35",
            "\151\35\1\164\uff96\35",
            "\40\35\1\165\uffdf\35",
            "\154\35\1\166\uff93\35",
            "\151\35\1\167\uff96\35",
            "\152\35\1\170\uff95\35",
            "\40\35\1\171\uffdf\35",
            "",
            "",
            "\145\35\1\174\uff9a\35",
            "\145\35\1\175\uff9a\35",
            "",
            "\42\35\1\176\uffdd\35",
            "\162\35\1\177\uff8d\35",
            "\42\35\1\u0080\uffdd\35",
            "\164\35\1\u0081\uff8b\35",
            "\40\35\1\u0082\uffdf\35",
            "\161\35\1\u0083\uff8e\35",
            "\53\35\1\u0084\uffd4\35",
            "\145\35\1\u0085\uff9a\35",
            "\142\35\1\u0086\uff9d\35",
            "\157\35\1\u0087\uff90\35",
            "\163\35\1\u0088\uff8c\35",
            "",
            "",
            "\156\35\1\u0089\uff91\35",
            "\42\35\1\u008a\uffdd\35",
            "",
            "\164\35\1\u008c\uff8b\35",
            "",
            "\145\35\1\u008e\uff9a\35",
            "\160\35\1\u008f\uff8f\35",
            "\165\35\1\u0090\uff8a\35",
            "\40\35\1\u0091\21\35\1\u0092\uffcd\35",
            "\42\35\1\u0093\uffdd\35",
            "\154\35\1\u0094\uff93\35",
            "\165\35\1\u0095\uff8a\35",
            "\157\35\1\u0096\uff90\35",
            "\164\35\1\u0097\uff8b\35",
            "",
            "",
            "\145\35\1\u0099\uff9a\35",
            "",
            "\163\35\1\u009a\uff8c\35",
            "\157\35\1\u009b\uff90\35",
            "\145\35\1\u009c\uff9a\35",
            "\62\35\1\u009d\1\35\1\u009e\uffcb\35",
            "\40\35\1\u009f\uffdf\35",
            "",
            "\145\35\1\u00a1\uff9a\35",
            "\145\35\1\u00a2\uff9a\35",
            "\156\35\1\u00a3\uff91\35",
            "\145\35\1\u00a4\uff9a\35",
            "",
            "\163\35\1\u00a5\uff8c\35",
            "\42\35\1\u00a6\uffdd\35",
            "\165\35\1\u00a7\uff8a\35",
            "\40\35\1\u00a8\uffdf\35",
            "\42\35\1\u00a9\uffdd\35",
            "\42\35\1\u00aa\uffdd\35",
            "\145\35\1\u00ab\uff9a\35",
            "",
            "\42\35\1\u00ac\uffdd\35",
            "\162\35\1\u00ad\uff8d\35",
            "\40\35\1\u00ae\uffdf\35",
            "\165\35\1\u00af\uff8a\35",
            "\42\35\1\u00b0\uffdd\35",
            "",
            "\166\35\1\u00b2\uff89\35",
            "\143\35\1\u00b3\uff9c\35",
            "",
            "",
            "\164\35\1\u00b6\uff8b\35",
            "",
            "\42\35\1\u00b8\uffdd\35",
            "\164\35\1\u00b9\uff8b\35",
            "\162\35\1\u00ba\uff8d\35",
            "",
            "",
            "\157\35\1\u00bc\uff90\35",
            "\157\35\1\u00bd\uff90\35",
            "",
            "",
            "\40\35\1\u00be\uffdf\35",
            "",
            "",
            "\157\35\1\u00c0\uff90\35",
            "\42\35\1\u00c1\uffdd\35",
            "",
            "\151\35\1\u00c2\uff96\35",
            "\165\35\1\u00c3\uff8a\35",
            "\53\35\1\u00c4\uffd4\35",
            "",
            "\165\35\1\u00c5\uff8a\35",
            "",
            "\162\35\1\u00c7\uff8d\35",
            "\154\35\1\u00c8\uff93\35",
            "\64\35\1\u00c9\uffcb\35",
            "\162\35\1\u00ca\uff8d\35",
            "",
            "\40\35\1\u00cb\uffdf\35",
            "\145\35\1\u00cc\uff9a\35",
            "\42\35\1\u00cd\uffdd\35",
            "\42\35\1\u00ce\uffdd\35",
            "\152\35\1\u00cf\uff95\35",
            "\165\35\1\u00d0\uff8a\35",
            "",
            "",
            "\157\35\1\u00d3\uff90\35",
            "\162\35\1\u00d4\uff8d\35",
            "",
            "",
            "\165\35\1\u00d5\uff8a\35",
            "\40\35\1\u00d6\uffdf\35",
            "\145\35\1\u00d7\uff9a\35",
            "\143\35\1\u00d8\uff9c\35",
            "\162\35\1\u00d9\uff8d\35",
            "\150\35\1\u00da\uff97\35",
            "\42\35\1\u00db\uffdd\35",
            "\151\35\1\u00dc\uff96\35",
            "",
            "\146\35\1\u00de\uff99\35",
            "",
            "\146\35\1\u00df\uff99\35",
            "\162\35\1\u00e0\uff8d\35",
            "\145\35\1\u00e1\uff9a\35",
            "\42\35\1\u00e2\uffdd\35",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_52 = input.LA(1);

                        s = -1;
                        if ( (LA12_52==' ') ) {s = 76;}

                        else if ( ((LA12_52>='\u0000' && LA12_52<='\u001F')||(LA12_52>='!' && LA12_52<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='c') ) {s = 96;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='b')||(LA12_76>='d' && LA12_76<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( (LA12_17=='l') ) {s = 40;}

                        else if ( (LA12_17=='u') ) {s = 41;}

                        else if ( ((LA12_17>='\u0000' && LA12_17<='k')||(LA12_17>='m' && LA12_17<='t')||(LA12_17>='v' && LA12_17<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_96 = input.LA(1);

                        s = -1;
                        if ( (LA12_96=='a') ) {s = 112;}

                        else if ( ((LA12_96>='\u0000' && LA12_96<='`')||(LA12_96>='b' && LA12_96<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='r') ) {s = 127;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='q')||(LA12_112>='s' && LA12_112<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_127 = input.LA(1);

                        s = -1;
                        if ( (LA12_127=='t') ) {s = 140;}

                        else if ( ((LA12_127>='\u0000' && LA12_127<='s')||(LA12_127>='u' && LA12_127<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_140 = input.LA(1);

                        s = -1;
                        if ( (LA12_140=='e') ) {s = 153;}

                        else if ( ((LA12_140>='\u0000' && LA12_140<='d')||(LA12_140>='f' && LA12_140<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_153 = input.LA(1);

                        s = -1;
                        if ( (LA12_153=='s') ) {s = 165;}

                        else if ( ((LA12_153>='\u0000' && LA12_153<='r')||(LA12_153>='t' && LA12_153<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='\"') ) {s = 176;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='!')||(LA12_165>='#' && LA12_165<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( (LA12_26==' ') ) {s = 51;}

                        else if ( (LA12_26=='0') ) {s = 52;}

                        else if ( ((LA12_26>='\u0000' && LA12_26<='\u001F')||(LA12_26>='!' && LA12_26<='/')||(LA12_26>='1' && LA12_26<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='m') ) {s = 65;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='l')||(LA12_41>='n' && LA12_41<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_65 = input.LA(1);

                        s = -1;
                        if ( (LA12_65=='u') ) {s = 85;}

                        else if ( ((LA12_65>='\u0000' && LA12_65<='t')||(LA12_65>='v' && LA12_65<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_85 = input.LA(1);

                        s = -1;
                        if ( (LA12_85=='l') ) {s = 101;}

                        else if ( ((LA12_85>='\u0000' && LA12_85<='k')||(LA12_85>='m' && LA12_85<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_101 = input.LA(1);

                        s = -1;
                        if ( (LA12_101==' ') ) {s = 117;}

                        else if ( ((LA12_101>='\u0000' && LA12_101<='\u001F')||(LA12_101>='!' && LA12_101<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_117 = input.LA(1);

                        s = -1;
                        if ( (LA12_117=='+') ) {s = 132;}

                        else if ( ((LA12_117>='\u0000' && LA12_117<='*')||(LA12_117>=',' && LA12_117<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_132 = input.LA(1);

                        s = -1;
                        if ( (LA12_132==' ') ) {s = 145;}

                        else if ( (LA12_132=='2') ) {s = 146;}

                        else if ( ((LA12_132>='\u0000' && LA12_132<='\u001F')||(LA12_132>='!' && LA12_132<='1')||(LA12_132>='3' && LA12_132<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_3 = input.LA(1);

                        s = -1;
                        if ( (LA12_3=='j') ) {s = 16;}

                        else if ( (LA12_3=='c') ) {s = 17;}

                        else if ( (LA12_3=='v') ) {s = 18;}

                        else if ( (LA12_3=='i') ) {s = 19;}

                        else if ( (LA12_3=='p') ) {s = 20;}

                        else if ( (LA12_3=='z') ) {s = 21;}

                        else if ( (LA12_3=='s') ) {s = 22;}

                        else if ( (LA12_3=='+') ) {s = 23;}

                        else if ( (LA12_3=='a') ) {s = 24;}

                        else if ( (LA12_3=='o') ) {s = 25;}

                        else if ( (LA12_3=='1') ) {s = 26;}

                        else if ( (LA12_3=='4') ) {s = 27;}

                        else if ( (LA12_3=='7') ) {s = 28;}

                        else if ( ((LA12_3>='\u0000' && LA12_3<='*')||(LA12_3>=',' && LA12_3<='0')||(LA12_3>='2' && LA12_3<='3')||(LA12_3>='5' && LA12_3<='6')||(LA12_3>='8' && LA12_3<='`')||LA12_3=='b'||(LA12_3>='d' && LA12_3<='h')||(LA12_3>='k' && LA12_3<='n')||(LA12_3>='q' && LA12_3<='r')||(LA12_3>='t' && LA12_3<='u')||(LA12_3>='w' && LA12_3<='y')||(LA12_3>='{' && LA12_3<='\uFFFF')) ) {s = 29;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_8 = input.LA(1);

                        s = -1;
                        if ( ((LA12_8>='\u0000' && LA12_8<='\uFFFF')) ) {s = 29;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_145 = input.LA(1);

                        s = -1;
                        if ( (LA12_145=='2') ) {s = 157;}

                        else if ( (LA12_145=='4') ) {s = 158;}

                        else if ( ((LA12_145>='\u0000' && LA12_145<='1')||LA12_145=='3'||(LA12_145>='5' && LA12_145<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( (LA12_16=='u') ) {s = 39;}

                        else if ( ((LA12_16>='\u0000' && LA12_16<='t')||(LA12_16>='v' && LA12_16<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( (LA12_39=='s') ) {s = 63;}

                        else if ( ((LA12_39>='\u0000' && LA12_39<='r')||(LA12_39>='t' && LA12_39<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_63 = input.LA(1);

                        s = -1;
                        if ( (LA12_63=='q') ) {s = 83;}

                        else if ( ((LA12_63>='\u0000' && LA12_63<='p')||(LA12_63>='r' && LA12_63<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_83 = input.LA(1);

                        s = -1;
                        if ( (LA12_83=='u') ) {s = 99;}

                        else if ( ((LA12_83>='\u0000' && LA12_83<='t')||(LA12_83>='v' && LA12_83<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_99 = input.LA(1);

                        s = -1;
                        if ( (LA12_99=='\u00E0') ) {s = 115;}

                        else if ( ((LA12_99>='\u0000' && LA12_99<='\u00DF')||(LA12_99>='\u00E1' && LA12_99<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_115 = input.LA(1);

                        s = -1;
                        if ( (LA12_115==' ') ) {s = 130;}

                        else if ( ((LA12_115>='\u0000' && LA12_115<='\u001F')||(LA12_115>='!' && LA12_115<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_130 = input.LA(1);

                        s = -1;
                        if ( (LA12_130=='p') ) {s = 143;}

                        else if ( ((LA12_130>='\u0000' && LA12_130<='o')||(LA12_130>='q' && LA12_130<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_143 = input.LA(1);

                        s = -1;
                        if ( (LA12_143=='o') ) {s = 155;}

                        else if ( ((LA12_143>='\u0000' && LA12_143<='n')||(LA12_143>='p' && LA12_143<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_155 = input.LA(1);

                        s = -1;
                        if ( (LA12_155=='u') ) {s = 167;}

                        else if ( ((LA12_155>='\u0000' && LA12_155<='t')||(LA12_155>='v' && LA12_155<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='v') ) {s = 178;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='u')||(LA12_167>='w' && LA12_167<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_178 = input.LA(1);

                        s = -1;
                        if ( (LA12_178=='o') ) {s = 188;}

                        else if ( ((LA12_178>='\u0000' && LA12_178<='n')||(LA12_178>='p' && LA12_178<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_188 = input.LA(1);

                        s = -1;
                        if ( (LA12_188=='i') ) {s = 194;}

                        else if ( ((LA12_188>='\u0000' && LA12_188<='h')||(LA12_188>='j' && LA12_188<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='r') ) {s = 199;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='q')||(LA12_194>='s' && LA12_194<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_199 = input.LA(1);

                        s = -1;
                        if ( (LA12_199==' ') ) {s = 203;}

                        else if ( ((LA12_199>='\u0000' && LA12_199<='\u001F')||(LA12_199>='!' && LA12_199<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_203 = input.LA(1);

                        s = -1;
                        if ( (LA12_203=='j') ) {s = 207;}

                        else if ( ((LA12_203>='\u0000' && LA12_203<='i')||(LA12_203>='k' && LA12_203<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_207 = input.LA(1);

                        s = -1;
                        if ( (LA12_207=='o') ) {s = 211;}

                        else if ( ((LA12_207>='\u0000' && LA12_207<='n')||(LA12_207>='p' && LA12_207<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_211 = input.LA(1);

                        s = -1;
                        if ( (LA12_211=='u') ) {s = 213;}

                        else if ( ((LA12_211>='\u0000' && LA12_211<='t')||(LA12_211>='v' && LA12_211<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_213 = input.LA(1);

                        s = -1;
                        if ( (LA12_213=='e') ) {s = 215;}

                        else if ( ((LA12_213>='\u0000' && LA12_213<='d')||(LA12_213>='f' && LA12_213<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_215 = input.LA(1);

                        s = -1;
                        if ( (LA12_215=='r') ) {s = 217;}

                        else if ( ((LA12_215>='\u0000' && LA12_215<='q')||(LA12_215>='s' && LA12_215<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_217 = input.LA(1);

                        s = -1;
                        if ( (LA12_217=='\"') ) {s = 219;}

                        else if ( ((LA12_217>='\u0000' && LA12_217<='!')||(LA12_217>='#' && LA12_217<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='a') ) {s = 64;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='`')||(LA12_40>='b' && LA12_40<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_64 = input.LA(1);

                        s = -1;
                        if ( (LA12_64=='s') ) {s = 84;}

                        else if ( ((LA12_64>='\u0000' && LA12_64<='r')||(LA12_64>='t' && LA12_64<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_84 = input.LA(1);

                        s = -1;
                        if ( (LA12_84=='s') ) {s = 100;}

                        else if ( ((LA12_84>='\u0000' && LA12_84<='r')||(LA12_84>='t' && LA12_84<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_100 = input.LA(1);

                        s = -1;
                        if ( (LA12_100=='i') ) {s = 116;}

                        else if ( ((LA12_100>='\u0000' && LA12_100<='h')||(LA12_100>='j' && LA12_100<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_116 = input.LA(1);

                        s = -1;
                        if ( (LA12_116=='q') ) {s = 131;}

                        else if ( ((LA12_116>='\u0000' && LA12_116<='p')||(LA12_116>='r' && LA12_116<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_131 = input.LA(1);

                        s = -1;
                        if ( (LA12_131=='u') ) {s = 144;}

                        else if ( ((LA12_131>='\u0000' && LA12_131<='t')||(LA12_131>='v' && LA12_131<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_144 = input.LA(1);

                        s = -1;
                        if ( (LA12_144=='e') ) {s = 156;}

                        else if ( ((LA12_144>='\u0000' && LA12_144<='d')||(LA12_144>='f' && LA12_144<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_156 = input.LA(1);

                        s = -1;
                        if ( (LA12_156==' ') ) {s = 168;}

                        else if ( ((LA12_156>='\u0000' && LA12_156<='\u001F')||(LA12_156>='!' && LA12_156<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_168 = input.LA(1);

                        s = -1;
                        if ( (LA12_168=='c') ) {s = 179;}

                        else if ( ((LA12_168>='\u0000' && LA12_168<='b')||(LA12_168>='d' && LA12_168<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_179 = input.LA(1);

                        s = -1;
                        if ( (LA12_179=='o') ) {s = 189;}

                        else if ( ((LA12_179>='\u0000' && LA12_179<='n')||(LA12_179>='p' && LA12_179<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_189 = input.LA(1);

                        s = -1;
                        if ( (LA12_189=='u') ) {s = 195;}

                        else if ( ((LA12_189>='\u0000' && LA12_189<='t')||(LA12_189>='v' && LA12_189<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_195 = input.LA(1);

                        s = -1;
                        if ( (LA12_195=='l') ) {s = 200;}

                        else if ( ((LA12_195>='\u0000' && LA12_195<='k')||(LA12_195>='m' && LA12_195<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_200 = input.LA(1);

                        s = -1;
                        if ( (LA12_200=='e') ) {s = 204;}

                        else if ( ((LA12_200>='\u0000' && LA12_200<='d')||(LA12_200>='f' && LA12_200<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_204 = input.LA(1);

                        s = -1;
                        if ( (LA12_204=='u') ) {s = 208;}

                        else if ( ((LA12_204>='\u0000' && LA12_204<='t')||(LA12_204>='v' && LA12_204<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_208 = input.LA(1);

                        s = -1;
                        if ( (LA12_208=='r') ) {s = 212;}

                        else if ( ((LA12_208>='\u0000' && LA12_208<='q')||(LA12_208>='s' && LA12_208<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_212 = input.LA(1);

                        s = -1;
                        if ( (LA12_212==' ') ) {s = 214;}

                        else if ( ((LA12_212>='\u0000' && LA12_212<='\u001F')||(LA12_212>='!' && LA12_212<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_214 = input.LA(1);

                        s = -1;
                        if ( (LA12_214=='c') ) {s = 216;}

                        else if ( ((LA12_214>='\u0000' && LA12_214<='b')||(LA12_214>='d' && LA12_214<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_216 = input.LA(1);

                        s = -1;
                        if ( (LA12_216=='h') ) {s = 218;}

                        else if ( ((LA12_216>='\u0000' && LA12_216<='g')||(LA12_216>='i' && LA12_216<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_218 = input.LA(1);

                        s = -1;
                        if ( (LA12_218=='i') ) {s = 220;}

                        else if ( ((LA12_218>='\u0000' && LA12_218<='h')||(LA12_218>='j' && LA12_218<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_220 = input.LA(1);

                        s = -1;
                        if ( (LA12_220=='f') ) {s = 222;}

                        else if ( ((LA12_220>='\u0000' && LA12_220<='e')||(LA12_220>='g' && LA12_220<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_222 = input.LA(1);

                        s = -1;
                        if ( (LA12_222=='f') ) {s = 223;}

                        else if ( ((LA12_222>='\u0000' && LA12_222<='e')||(LA12_222>='g' && LA12_222<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_223 = input.LA(1);

                        s = -1;
                        if ( (LA12_223=='r') ) {s = 224;}

                        else if ( ((LA12_223>='\u0000' && LA12_223<='q')||(LA12_223>='s' && LA12_223<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_224 = input.LA(1);

                        s = -1;
                        if ( (LA12_224=='e') ) {s = 225;}

                        else if ( ((LA12_224>='\u0000' && LA12_224<='d')||(LA12_224>='f' && LA12_224<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_225 = input.LA(1);

                        s = -1;
                        if ( (LA12_225=='\"') ) {s = 226;}

                        else if ( ((LA12_225>='\u0000' && LA12_225<='!')||(LA12_225>='#' && LA12_225<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_157 = input.LA(1);

                        s = -1;
                        if ( (LA12_157=='\"') ) {s = 169;}

                        else if ( ((LA12_157>='\u0000' && LA12_157<='!')||(LA12_157>='#' && LA12_157<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_158 = input.LA(1);

                        s = -1;
                        if ( (LA12_158=='\"') ) {s = 170;}

                        else if ( ((LA12_158>='\u0000' && LA12_158<='!')||(LA12_158>='#' && LA12_158<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_146 = input.LA(1);

                        s = -1;
                        if ( (LA12_146==' ') ) {s = 159;}

                        else if ( ((LA12_146>='\u0000' && LA12_146<='\u001F')||(LA12_146>='!' && LA12_146<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_159 = input.LA(1);

                        s = -1;
                        if ( (LA12_159=='e') ) {s = 171;}

                        else if ( ((LA12_159>='\u0000' && LA12_159<='d')||(LA12_159>='f' && LA12_159<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_171 = input.LA(1);

                        s = -1;
                        if ( (LA12_171=='t') ) {s = 182;}

                        else if ( ((LA12_171>='\u0000' && LA12_171<='s')||(LA12_171>='u' && LA12_171<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_182 = input.LA(1);

                        s = -1;
                        if ( (LA12_182==' ') ) {s = 190;}

                        else if ( ((LA12_182>='\u0000' && LA12_182<='\u001F')||(LA12_182>='!' && LA12_182<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_190 = input.LA(1);

                        s = -1;
                        if ( (LA12_190=='+') ) {s = 196;}

                        else if ( ((LA12_190>='\u0000' && LA12_190<='*')||(LA12_190>=',' && LA12_190<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_196 = input.LA(1);

                        s = -1;
                        if ( (LA12_196=='4') ) {s = 201;}

                        else if ( ((LA12_196>='\u0000' && LA12_196<='3')||(LA12_196>='5' && LA12_196<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_201 = input.LA(1);

                        s = -1;
                        if ( (LA12_201=='\"') ) {s = 205;}

                        else if ( ((LA12_201>='\u0000' && LA12_201<='!')||(LA12_201>='#' && LA12_201<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( (LA12_18=='i') ) {s = 42;}

                        else if ( ((LA12_18>='\u0000' && LA12_18<='h')||(LA12_18>='j' && LA12_18<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_42 = input.LA(1);

                        s = -1;
                        if ( (LA12_42=='s') ) {s = 66;}

                        else if ( ((LA12_42>='\u0000' && LA12_42<='r')||(LA12_42>='t' && LA12_42<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_66 = input.LA(1);

                        s = -1;
                        if ( (LA12_66=='i') ) {s = 86;}

                        else if ( ((LA12_66>='\u0000' && LA12_66<='h')||(LA12_66>='j' && LA12_66<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_86 = input.LA(1);

                        s = -1;
                        if ( (LA12_86=='b') ) {s = 102;}

                        else if ( ((LA12_86>='\u0000' && LA12_86<='a')||(LA12_86>='c' && LA12_86<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_102 = input.LA(1);

                        s = -1;
                        if ( (LA12_102=='l') ) {s = 118;}

                        else if ( ((LA12_102>='\u0000' && LA12_102<='k')||(LA12_102>='m' && LA12_102<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='<') ) {s = 1;}

                        else if ( (LA12_0==' ') ) {s = 2;}

                        else if ( (LA12_0=='\"') ) {s = 3;}

                        else if ( (LA12_0==',') ) {s = 4;}

                        else if ( (LA12_0=='^') ) {s = 5;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 6;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 7;}

                        else if ( (LA12_0=='\'') ) {s = 8;}

                        else if ( (LA12_0=='/') ) {s = 9;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r') ) {s = 10;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='=' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_118 = input.LA(1);

                        s = -1;
                        if ( (LA12_118=='e') ) {s = 133;}

                        else if ( ((LA12_118>='\u0000' && LA12_118<='d')||(LA12_118>='f' && LA12_118<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( (LA12_20=='e') ) {s = 44;}

                        else if ( (LA12_20=='a') ) {s = 45;}

                        else if ( ((LA12_20>='\u0000' && LA12_20<='`')||(LA12_20>='b' && LA12_20<='d')||(LA12_20>='f' && LA12_20<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_133 = input.LA(1);

                        s = -1;
                        if ( (LA12_133=='\"') ) {s = 147;}

                        else if ( ((LA12_133>='\u0000' && LA12_133<='!')||(LA12_133>='#' && LA12_133<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( (LA12_19=='n') ) {s = 43;}

                        else if ( ((LA12_19>='\u0000' && LA12_19<='m')||(LA12_19>='o' && LA12_19<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_43 = input.LA(1);

                        s = -1;
                        if ( (LA12_43=='v') ) {s = 67;}

                        else if ( ((LA12_43>='\u0000' && LA12_43<='u')||(LA12_43>='w' && LA12_43<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_67 = input.LA(1);

                        s = -1;
                        if ( (LA12_67=='i') ) {s = 87;}

                        else if ( ((LA12_67>='\u0000' && LA12_67<='h')||(LA12_67>='j' && LA12_67<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_87 = input.LA(1);

                        s = -1;
                        if ( (LA12_87=='s') ) {s = 103;}

                        else if ( ((LA12_87>='\u0000' && LA12_87<='r')||(LA12_87>='t' && LA12_87<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_103 = input.LA(1);

                        s = -1;
                        if ( (LA12_103=='i') ) {s = 119;}

                        else if ( ((LA12_103>='\u0000' && LA12_103<='h')||(LA12_103>='j' && LA12_103<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_119 = input.LA(1);

                        s = -1;
                        if ( (LA12_119=='b') ) {s = 134;}

                        else if ( ((LA12_119>='\u0000' && LA12_119<='a')||(LA12_119>='c' && LA12_119<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_134 = input.LA(1);

                        s = -1;
                        if ( (LA12_134=='l') ) {s = 148;}

                        else if ( ((LA12_134>='\u0000' && LA12_134<='k')||(LA12_134>='m' && LA12_134<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_148 = input.LA(1);

                        s = -1;
                        if ( (LA12_148=='e') ) {s = 161;}

                        else if ( ((LA12_148>='\u0000' && LA12_148<='d')||(LA12_148>='f' && LA12_148<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_161 = input.LA(1);

                        s = -1;
                        if ( (LA12_161=='\"') ) {s = 172;}

                        else if ( ((LA12_161>='\u0000' && LA12_161<='!')||(LA12_161>='#' && LA12_161<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_44 = input.LA(1);

                        s = -1;
                        if ( (LA12_44=='u') ) {s = 68;}

                        else if ( ((LA12_44>='\u0000' && LA12_44<='t')||(LA12_44>='v' && LA12_44<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_68 = input.LA(1);

                        s = -1;
                        if ( (LA12_68=='t') ) {s = 88;}

                        else if ( ((LA12_68>='\u0000' && LA12_68<='s')||(LA12_68>='u' && LA12_68<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_88 = input.LA(1);

                        s = -1;
                        if ( (LA12_88==' ') ) {s = 104;}

                        else if ( ((LA12_88>='\u0000' && LA12_88<='\u001F')||(LA12_88>='!' && LA12_88<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='j') ) {s = 120;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='i')||(LA12_104>='k' && LA12_104<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_120 = input.LA(1);

                        s = -1;
                        if ( (LA12_120=='o') ) {s = 135;}

                        else if ( ((LA12_120>='\u0000' && LA12_120<='n')||(LA12_120>='p' && LA12_120<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_135 = input.LA(1);

                        s = -1;
                        if ( (LA12_135=='u') ) {s = 149;}

                        else if ( ((LA12_135>='\u0000' && LA12_135<='t')||(LA12_135>='v' && LA12_135<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_149 = input.LA(1);

                        s = -1;
                        if ( (LA12_149=='e') ) {s = 162;}

                        else if ( ((LA12_149>='\u0000' && LA12_149<='d')||(LA12_149>='f' && LA12_149<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_162 = input.LA(1);

                        s = -1;
                        if ( (LA12_162=='r') ) {s = 173;}

                        else if ( ((LA12_162>='\u0000' && LA12_162<='q')||(LA12_162>='s' && LA12_162<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_173 = input.LA(1);

                        s = -1;
                        if ( (LA12_173=='\"') ) {s = 184;}

                        else if ( ((LA12_173>='\u0000' && LA12_173<='!')||(LA12_173>='#' && LA12_173<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_45 = input.LA(1);

                        s = -1;
                        if ( (LA12_45=='s') ) {s = 69;}

                        else if ( ((LA12_45>='\u0000' && LA12_45<='r')||(LA12_45>='t' && LA12_45<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_69 = input.LA(1);

                        s = -1;
                        if ( (LA12_69=='s') ) {s = 89;}

                        else if ( ((LA12_69>='\u0000' && LA12_69<='r')||(LA12_69>='t' && LA12_69<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_89 = input.LA(1);

                        s = -1;
                        if ( (LA12_89=='e') ) {s = 105;}

                        else if ( ((LA12_89>='\u0000' && LA12_89<='d')||(LA12_89>='f' && LA12_89<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105==' ') ) {s = 121;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<='\u001F')||(LA12_105>='!' && LA12_105<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_121 = input.LA(1);

                        s = -1;
                        if ( (LA12_121=='s') ) {s = 136;}

                        else if ( ((LA12_121>='\u0000' && LA12_121<='r')||(LA12_121>='t' && LA12_121<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='o') ) {s = 150;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='n')||(LA12_136>='p' && LA12_136<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA12_150 = input.LA(1);

                        s = -1;
                        if ( (LA12_150=='n') ) {s = 163;}

                        else if ( ((LA12_150>='\u0000' && LA12_150<='m')||(LA12_150>='o' && LA12_150<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA12_163 = input.LA(1);

                        s = -1;
                        if ( (LA12_163==' ') ) {s = 174;}

                        else if ( ((LA12_163>='\u0000' && LA12_163<='\u001F')||(LA12_163>='!' && LA12_163<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='t') ) {s = 185;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='s')||(LA12_174>='u' && LA12_174<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA12_185 = input.LA(1);

                        s = -1;
                        if ( (LA12_185=='o') ) {s = 192;}

                        else if ( ((LA12_185>='\u0000' && LA12_185<='n')||(LA12_185>='p' && LA12_185<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA12_192 = input.LA(1);

                        s = -1;
                        if ( (LA12_192=='u') ) {s = 197;}

                        else if ( ((LA12_192>='\u0000' && LA12_192<='t')||(LA12_192>='v' && LA12_192<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='r') ) {s = 202;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='q')||(LA12_197>='s' && LA12_197<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA12_202 = input.LA(1);

                        s = -1;
                        if ( (LA12_202=='\"') ) {s = 206;}

                        else if ( ((LA12_202>='\u0000' && LA12_202<='!')||(LA12_202>='#' && LA12_202<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( (LA12_21=='e') ) {s = 46;}

                        else if ( ((LA12_21>='\u0000' && LA12_21<='d')||(LA12_21>='f' && LA12_21<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA12_46 = input.LA(1);

                        s = -1;
                        if ( (LA12_46=='r') ) {s = 70;}

                        else if ( ((LA12_46>='\u0000' && LA12_46<='q')||(LA12_46>='s' && LA12_46<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA12_70 = input.LA(1);

                        s = -1;
                        if ( (LA12_70=='o') ) {s = 90;}

                        else if ( ((LA12_70>='\u0000' && LA12_70<='n')||(LA12_70>='p' && LA12_70<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA12_90 = input.LA(1);

                        s = -1;
                        if ( (LA12_90=='\"') ) {s = 106;}

                        else if ( ((LA12_90>='\u0000' && LA12_90<='!')||(LA12_90>='#' && LA12_90<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( (LA12_22=='e') ) {s = 47;}

                        else if ( ((LA12_22>='\u0000' && LA12_22<='d')||(LA12_22>='f' && LA12_22<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA12_47 = input.LA(1);

                        s = -1;
                        if ( (LA12_47=='p') ) {s = 71;}

                        else if ( ((LA12_47>='\u0000' && LA12_47<='o')||(LA12_47>='q' && LA12_47<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA12_71 = input.LA(1);

                        s = -1;
                        if ( (LA12_71=='t') ) {s = 91;}

                        else if ( ((LA12_71>='\u0000' && LA12_71<='s')||(LA12_71>='u' && LA12_71<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA12_91 = input.LA(1);

                        s = -1;
                        if ( (LA12_91=='\"') ) {s = 107;}

                        else if ( ((LA12_91>='\u0000' && LA12_91<='!')||(LA12_91>='#' && LA12_91<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( (LA12_23==' ') ) {s = 48;}

                        else if ( ((LA12_23>='\u0000' && LA12_23<='\u001F')||(LA12_23>='!' && LA12_23<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( (LA12_48=='4') ) {s = 72;}

                        else if ( ((LA12_48>='\u0000' && LA12_48<='3')||(LA12_48>='5' && LA12_48<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72==' ') ) {s = 92;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='\u001F')||(LA12_72>='!' && LA12_72<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA12_92 = input.LA(1);

                        s = -1;
                        if ( (LA12_92=='m') ) {s = 108;}

                        else if ( ((LA12_92>='\u0000' && LA12_92<='l')||(LA12_92>='n' && LA12_92<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='e') ) {s = 124;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='d')||(LA12_108>='f' && LA12_108<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA12_124 = input.LA(1);

                        s = -1;
                        if ( (LA12_124=='n') ) {s = 137;}

                        else if ( ((LA12_124>='\u0000' && LA12_124<='m')||(LA12_124>='o' && LA12_124<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='t') ) {s = 151;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='s')||(LA12_137>='u' && LA12_137<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA12_151 = input.LA(1);

                        s = -1;
                        if ( (LA12_151=='e') ) {s = 164;}

                        else if ( ((LA12_151>='\u0000' && LA12_151<='d')||(LA12_151>='f' && LA12_151<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA12_164 = input.LA(1);

                        s = -1;
                        if ( (LA12_164=='u') ) {s = 175;}

                        else if ( ((LA12_164>='\u0000' && LA12_164<='t')||(LA12_164>='v' && LA12_164<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='r') ) {s = 186;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='q')||(LA12_175>='s' && LA12_175<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA12_186 = input.LA(1);

                        s = -1;
                        if ( (LA12_186=='\"') ) {s = 193;}

                        else if ( ((LA12_186>='\u0000' && LA12_186<='!')||(LA12_186>='#' && LA12_186<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( (LA12_24=='u') ) {s = 49;}

                        else if ( ((LA12_24>='\u0000' && LA12_24<='t')||(LA12_24>='v' && LA12_24<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( (LA12_49=='c') ) {s = 73;}

                        else if ( ((LA12_49>='\u0000' && LA12_49<='b')||(LA12_49>='d' && LA12_49<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='u') ) {s = 93;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<='t')||(LA12_73>='v' && LA12_73<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA12_93 = input.LA(1);

                        s = -1;
                        if ( (LA12_93=='n') ) {s = 109;}

                        else if ( ((LA12_93>='\u0000' && LA12_93<='m')||(LA12_93>='o' && LA12_93<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA12_109 = input.LA(1);

                        s = -1;
                        if ( (LA12_109=='e') ) {s = 125;}

                        else if ( ((LA12_109>='\u0000' && LA12_109<='d')||(LA12_109>='f' && LA12_109<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA12_125 = input.LA(1);

                        s = -1;
                        if ( (LA12_125=='\"') ) {s = 138;}

                        else if ( ((LA12_125>='\u0000' && LA12_125<='!')||(LA12_125>='#' && LA12_125<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( (LA12_25=='u') ) {s = 50;}

                        else if ( ((LA12_25>='\u0000' && LA12_25<='t')||(LA12_25>='v' && LA12_25<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA12_50 = input.LA(1);

                        s = -1;
                        if ( (LA12_50=='i') ) {s = 74;}

                        else if ( ((LA12_50>='\u0000' && LA12_50<='h')||(LA12_50>='j' && LA12_50<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='\"') ) {s = 94;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='!')||(LA12_74>='#' && LA12_74<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA12_51 = input.LA(1);

                        s = -1;
                        if ( (LA12_51=='t') ) {s = 75;}

                        else if ( ((LA12_51>='\u0000' && LA12_51<='s')||(LA12_51>='u' && LA12_51<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='a') ) {s = 95;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='`')||(LA12_75>='b' && LA12_75<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA12_95 = input.LA(1);

                        s = -1;
                        if ( (LA12_95=='s') ) {s = 111;}

                        else if ( ((LA12_95>='\u0000' && LA12_95<='r')||(LA12_95>='t' && LA12_95<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='\"') ) {s = 126;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='!')||(LA12_111>='#' && LA12_111<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA12_27 = input.LA(1);

                        s = -1;
                        if ( (LA12_27==' ') ) {s = 53;}

                        else if ( ((LA12_27>='\u0000' && LA12_27<='\u001F')||(LA12_27>='!' && LA12_27<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA12_53 = input.LA(1);

                        s = -1;
                        if ( (LA12_53=='t') ) {s = 77;}

                        else if ( ((LA12_53>='\u0000' && LA12_53<='s')||(LA12_53>='u' && LA12_53<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='a') ) {s = 97;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='`')||(LA12_77>='b' && LA12_77<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA12_97 = input.LA(1);

                        s = -1;
                        if ( (LA12_97=='s') ) {s = 113;}

                        else if ( ((LA12_97>='\u0000' && LA12_97<='r')||(LA12_97>='t' && LA12_97<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA12_113 = input.LA(1);

                        s = -1;
                        if ( (LA12_113=='\"') ) {s = 128;}

                        else if ( ((LA12_113>='\u0000' && LA12_113<='!')||(LA12_113>='#' && LA12_113<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA12_28 = input.LA(1);

                        s = -1;
                        if ( (LA12_28==' ') ) {s = 54;}

                        else if ( ((LA12_28>='\u0000' && LA12_28<='\u001F')||(LA12_28>='!' && LA12_28<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 150 : 
                        int LA12_54 = input.LA(1);

                        s = -1;
                        if ( (LA12_54=='c') ) {s = 78;}

                        else if ( ((LA12_54>='\u0000' && LA12_54<='b')||(LA12_54>='d' && LA12_54<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 151 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='a') ) {s = 98;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='`')||(LA12_78>='b' && LA12_78<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 152 : 
                        int LA12_98 = input.LA(1);

                        s = -1;
                        if ( (LA12_98=='r') ) {s = 114;}

                        else if ( ((LA12_98>='\u0000' && LA12_98<='q')||(LA12_98>='s' && LA12_98<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 153 : 
                        int LA12_114 = input.LA(1);

                        s = -1;
                        if ( (LA12_114=='t') ) {s = 129;}

                        else if ( ((LA12_114>='\u0000' && LA12_114<='s')||(LA12_114>='u' && LA12_114<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 154 : 
                        int LA12_129 = input.LA(1);

                        s = -1;
                        if ( (LA12_129=='e') ) {s = 142;}

                        else if ( ((LA12_129>='\u0000' && LA12_129<='d')||(LA12_129>='f' && LA12_129<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 155 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='s') ) {s = 154;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='r')||(LA12_142>='t' && LA12_142<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 156 : 
                        int LA12_154 = input.LA(1);

                        s = -1;
                        if ( (LA12_154=='\"') ) {s = 166;}

                        else if ( ((LA12_154>='\u0000' && LA12_154<='!')||(LA12_154>='#' && LA12_154<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}