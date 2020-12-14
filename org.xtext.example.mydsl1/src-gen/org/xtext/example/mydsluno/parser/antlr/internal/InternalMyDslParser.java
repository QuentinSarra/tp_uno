package org.xtext.example.mydsluno.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsluno.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<Uno_Config> <pioche> '", "' </pioche> <poser> '", "' </poser> <main> '", "'</main> <carte_speciale> : '", "' </carte_speciale> '", "' <temps> '", "' </temps> '", "' <tas> '", "' </tas> '", "' <nb_carte_de_depart> '", "' </nb_carte_de_depart> '", "' </Uno_Config>'", "' <une_fois> '", "' </une_fois> '", "'\"jusqu\\u00E0 pouvoir jouer\"'", "'\"classique couleur chiffre\"'", "'\"cumul + 2\"'", "'\"cumul + 4\"'", "'\"cumul +2 et +4\"'", "'\"visible\"'", "'\"invisible\"'", "'\"peut jouer\"'", "'\"passe son tour\"'", "'\"zero\"'", "'\"sept\"'", "'\"+ 4 menteur\"'", "'\"aucune\"'", "','", "'\"oui\"'", "'\"1 tas\"'", "'\"4 tas\"'", "'\"7 cartes\"'", "'\"10 cartes\"'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_uno_0_0= ruleUno ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_uno_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_uno_0_0= ruleUno ) )* )
            // InternalMyDsl.g:78:2: ( (lv_uno_0_0= ruleUno ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_uno_0_0= ruleUno ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_uno_0_0= ruleUno )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_uno_0_0= ruleUno )
            	    // InternalMyDsl.g:80:4: lv_uno_0_0= ruleUno
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getUnoUnoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_uno_0_0=ruleUno();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"uno",
            	    					lv_uno_0_0,
            	    					"org.xtext.example.mydsluno.MyDsl.Uno");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUno"
    // InternalMyDsl.g:100:1: entryRuleUno returns [EObject current=null] : iv_ruleUno= ruleUno EOF ;
    public final EObject entryRuleUno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUno = null;


        try {
            // InternalMyDsl.g:100:44: (iv_ruleUno= ruleUno EOF )
            // InternalMyDsl.g:101:2: iv_ruleUno= ruleUno EOF
            {
             newCompositeNode(grammarAccess.getUnoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUno=ruleUno();

            state._fsp--;

             current =iv_ruleUno; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUno"


    // $ANTLR start "ruleUno"
    // InternalMyDsl.g:107:1: ruleUno returns [EObject current=null] : (otherlv_0= '<Uno_Config> <pioche> ' ( (lv_pioche_1_0= rulePioche ) ) otherlv_2= ' </pioche> <poser> ' ( (lv_poser_3_0= rulePoser ) ) otherlv_4= ' </poser> <main> ' ( (lv_main_5_0= ruleMain ) ) otherlv_6= '</main> <carte_speciale> : ' ( (lv_cartespe_7_0= ruleCarteSpe ) ) otherlv_8= ' </carte_speciale> ' (otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> ' )? otherlv_12= ' <tas> ' ( (lv_tas_13_0= ruleTas ) ) otherlv_14= ' </tas> ' (otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> ' )? otherlv_18= ' </Uno_Config>' ) ;
    public final EObject ruleUno() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_pioche_1_0 = null;

        AntlrDatatypeRuleToken lv_poser_3_0 = null;

        AntlrDatatypeRuleToken lv_main_5_0 = null;

        AntlrDatatypeRuleToken lv_cartespe_7_0 = null;

        AntlrDatatypeRuleToken lv_temps_10_0 = null;

        AntlrDatatypeRuleToken lv_tas_13_0 = null;

        AntlrDatatypeRuleToken lv_nbcarte_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= '<Uno_Config> <pioche> ' ( (lv_pioche_1_0= rulePioche ) ) otherlv_2= ' </pioche> <poser> ' ( (lv_poser_3_0= rulePoser ) ) otherlv_4= ' </poser> <main> ' ( (lv_main_5_0= ruleMain ) ) otherlv_6= '</main> <carte_speciale> : ' ( (lv_cartespe_7_0= ruleCarteSpe ) ) otherlv_8= ' </carte_speciale> ' (otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> ' )? otherlv_12= ' <tas> ' ( (lv_tas_13_0= ruleTas ) ) otherlv_14= ' </tas> ' (otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> ' )? otherlv_18= ' </Uno_Config>' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= '<Uno_Config> <pioche> ' ( (lv_pioche_1_0= rulePioche ) ) otherlv_2= ' </pioche> <poser> ' ( (lv_poser_3_0= rulePoser ) ) otherlv_4= ' </poser> <main> ' ( (lv_main_5_0= ruleMain ) ) otherlv_6= '</main> <carte_speciale> : ' ( (lv_cartespe_7_0= ruleCarteSpe ) ) otherlv_8= ' </carte_speciale> ' (otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> ' )? otherlv_12= ' <tas> ' ( (lv_tas_13_0= ruleTas ) ) otherlv_14= ' </tas> ' (otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> ' )? otherlv_18= ' </Uno_Config>' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= '<Uno_Config> <pioche> ' ( (lv_pioche_1_0= rulePioche ) ) otherlv_2= ' </pioche> <poser> ' ( (lv_poser_3_0= rulePoser ) ) otherlv_4= ' </poser> <main> ' ( (lv_main_5_0= ruleMain ) ) otherlv_6= '</main> <carte_speciale> : ' ( (lv_cartespe_7_0= ruleCarteSpe ) ) otherlv_8= ' </carte_speciale> ' (otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> ' )? otherlv_12= ' <tas> ' ( (lv_tas_13_0= ruleTas ) ) otherlv_14= ' </tas> ' (otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> ' )? otherlv_18= ' </Uno_Config>' )
            // InternalMyDsl.g:115:3: otherlv_0= '<Uno_Config> <pioche> ' ( (lv_pioche_1_0= rulePioche ) ) otherlv_2= ' </pioche> <poser> ' ( (lv_poser_3_0= rulePoser ) ) otherlv_4= ' </poser> <main> ' ( (lv_main_5_0= ruleMain ) ) otherlv_6= '</main> <carte_speciale> : ' ( (lv_cartespe_7_0= ruleCarteSpe ) ) otherlv_8= ' </carte_speciale> ' (otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> ' )? otherlv_12= ' <tas> ' ( (lv_tas_13_0= ruleTas ) ) otherlv_14= ' </tas> ' (otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> ' )? otherlv_18= ' </Uno_Config>'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUnoAccess().getUno_ConfigPiocheKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_pioche_1_0= rulePioche ) )
            // InternalMyDsl.g:120:4: (lv_pioche_1_0= rulePioche )
            {
            // InternalMyDsl.g:120:4: (lv_pioche_1_0= rulePioche )
            // InternalMyDsl.g:121:5: lv_pioche_1_0= rulePioche
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getPiochePiocheParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_pioche_1_0=rulePioche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"pioche",
            						lv_pioche_1_0,
            						"org.xtext.example.mydsluno.MyDsl.Pioche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUnoAccess().getPiochePoserKeyword_2());
            		
            // InternalMyDsl.g:142:3: ( (lv_poser_3_0= rulePoser ) )
            // InternalMyDsl.g:143:4: (lv_poser_3_0= rulePoser )
            {
            // InternalMyDsl.g:143:4: (lv_poser_3_0= rulePoser )
            // InternalMyDsl.g:144:5: lv_poser_3_0= rulePoser
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getPoserPoserParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_poser_3_0=rulePoser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"poser",
            						lv_poser_3_0,
            						"org.xtext.example.mydsluno.MyDsl.Poser");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getUnoAccess().getPoserMainKeyword_4());
            		
            // InternalMyDsl.g:165:3: ( (lv_main_5_0= ruleMain ) )
            // InternalMyDsl.g:166:4: (lv_main_5_0= ruleMain )
            {
            // InternalMyDsl.g:166:4: (lv_main_5_0= ruleMain )
            // InternalMyDsl.g:167:5: lv_main_5_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getMainMainParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_main_5_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"main",
            						lv_main_5_0,
            						"org.xtext.example.mydsluno.MyDsl.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getUnoAccess().getMainCarte_specialeKeyword_6());
            		
            // InternalMyDsl.g:188:3: ( (lv_cartespe_7_0= ruleCarteSpe ) )
            // InternalMyDsl.g:189:4: (lv_cartespe_7_0= ruleCarteSpe )
            {
            // InternalMyDsl.g:189:4: (lv_cartespe_7_0= ruleCarteSpe )
            // InternalMyDsl.g:190:5: lv_cartespe_7_0= ruleCarteSpe
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getCartespeCarteSpeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_cartespe_7_0=ruleCarteSpe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"cartespe",
            						lv_cartespe_7_0,
            						"org.xtext.example.mydsluno.MyDsl.CarteSpe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getUnoAccess().getCarte_specialeKeyword_8());
            		
            // InternalMyDsl.g:211:3: (otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> ' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:212:4: otherlv_9= ' <temps> ' ( (lv_temps_10_0= ruleTemps ) ) otherlv_11= ' </temps> '
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getUnoAccess().getTempsKeyword_9_0());
                    			
                    // InternalMyDsl.g:216:4: ( (lv_temps_10_0= ruleTemps ) )
                    // InternalMyDsl.g:217:5: (lv_temps_10_0= ruleTemps )
                    {
                    // InternalMyDsl.g:217:5: (lv_temps_10_0= ruleTemps )
                    // InternalMyDsl.g:218:6: lv_temps_10_0= ruleTemps
                    {

                    						newCompositeNode(grammarAccess.getUnoAccess().getTempsTempsParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_temps_10_0=ruleTemps();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnoRule());
                    						}
                    						add(
                    							current,
                    							"temps",
                    							lv_temps_10_0,
                    							"org.xtext.example.mydsluno.MyDsl.Temps");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getUnoAccess().getTempsKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getUnoAccess().getTasKeyword_10());
            		
            // InternalMyDsl.g:244:3: ( (lv_tas_13_0= ruleTas ) )
            // InternalMyDsl.g:245:4: (lv_tas_13_0= ruleTas )
            {
            // InternalMyDsl.g:245:4: (lv_tas_13_0= ruleTas )
            // InternalMyDsl.g:246:5: lv_tas_13_0= ruleTas
            {

            					newCompositeNode(grammarAccess.getUnoAccess().getTasTasParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_17);
            lv_tas_13_0=ruleTas();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnoRule());
            					}
            					add(
            						current,
            						"tas",
            						lv_tas_13_0,
            						"org.xtext.example.mydsluno.MyDsl.Tas");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getUnoAccess().getTasKeyword_12());
            		
            // InternalMyDsl.g:267:3: (otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> ' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:268:4: otherlv_15= ' <nb_carte_de_depart> ' ( (lv_nbcarte_16_0= ruleNbCarte ) ) otherlv_17= ' </nb_carte_de_depart> '
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getUnoAccess().getNb_carte_de_departKeyword_13_0());
                    			
                    // InternalMyDsl.g:272:4: ( (lv_nbcarte_16_0= ruleNbCarte ) )
                    // InternalMyDsl.g:273:5: (lv_nbcarte_16_0= ruleNbCarte )
                    {
                    // InternalMyDsl.g:273:5: (lv_nbcarte_16_0= ruleNbCarte )
                    // InternalMyDsl.g:274:6: lv_nbcarte_16_0= ruleNbCarte
                    {

                    						newCompositeNode(grammarAccess.getUnoAccess().getNbcarteNbCarteParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_nbcarte_16_0=ruleNbCarte();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnoRule());
                    						}
                    						add(
                    							current,
                    							"nbcarte",
                    							lv_nbcarte_16_0,
                    							"org.xtext.example.mydsluno.MyDsl.NbCarte");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_17, grammarAccess.getUnoAccess().getNb_carte_de_departKeyword_13_2());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getUnoAccess().getUno_ConfigKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUno"


    // $ANTLR start "entryRulePioche"
    // InternalMyDsl.g:304:1: entryRulePioche returns [EObject current=null] : iv_rulePioche= rulePioche EOF ;
    public final EObject entryRulePioche() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePioche = null;


        try {
            // InternalMyDsl.g:304:47: (iv_rulePioche= rulePioche EOF )
            // InternalMyDsl.g:305:2: iv_rulePioche= rulePioche EOF
            {
             newCompositeNode(grammarAccess.getPiocheRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePioche=rulePioche();

            state._fsp--;

             current =iv_rulePioche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePioche"


    // $ANTLR start "rulePioche"
    // InternalMyDsl.g:311:1: rulePioche returns [EObject current=null] : ( (otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> ' ) | otherlv_3= '\"jusqu\\u00E0 pouvoir jouer\"' ) ;
    public final EObject rulePioche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_unefois_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:317:2: ( ( (otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> ' ) | otherlv_3= '\"jusqu\\u00E0 pouvoir jouer\"' ) )
            // InternalMyDsl.g:318:2: ( (otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> ' ) | otherlv_3= '\"jusqu\\u00E0 pouvoir jouer\"' )
            {
            // InternalMyDsl.g:318:2: ( (otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> ' ) | otherlv_3= '\"jusqu\\u00E0 pouvoir jouer\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==25) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:319:3: (otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> ' )
                    {
                    // InternalMyDsl.g:319:3: (otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> ' )
                    // InternalMyDsl.g:320:4: otherlv_0= ' <une_fois> ' ( (lv_unefois_1_0= ruleUneFois ) ) otherlv_2= ' </une_fois> '
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getPiocheAccess().getUne_foisKeyword_0_0());
                    			
                    // InternalMyDsl.g:324:4: ( (lv_unefois_1_0= ruleUneFois ) )
                    // InternalMyDsl.g:325:5: (lv_unefois_1_0= ruleUneFois )
                    {
                    // InternalMyDsl.g:325:5: (lv_unefois_1_0= ruleUneFois )
                    // InternalMyDsl.g:326:6: lv_unefois_1_0= ruleUneFois
                    {

                    						newCompositeNode(grammarAccess.getPiocheAccess().getUnefoisUneFoisParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_unefois_1_0=ruleUneFois();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPiocheRule());
                    						}
                    						add(
                    							current,
                    							"unefois",
                    							lv_unefois_1_0,
                    							"org.xtext.example.mydsluno.MyDsl.UneFois");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPiocheAccess().getUne_foisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:349:3: otherlv_3= '\"jusqu\\u00E0 pouvoir jouer\"'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getPiocheAccess().getJusquPouvoirJouerKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePioche"


    // $ANTLR start "entryRulePoser"
    // InternalMyDsl.g:357:1: entryRulePoser returns [String current=null] : iv_rulePoser= rulePoser EOF ;
    public final String entryRulePoser() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePoser = null;


        try {
            // InternalMyDsl.g:357:45: (iv_rulePoser= rulePoser EOF )
            // InternalMyDsl.g:358:2: iv_rulePoser= rulePoser EOF
            {
             newCompositeNode(grammarAccess.getPoserRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoser=rulePoser();

            state._fsp--;

             current =iv_rulePoser.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoser"


    // $ANTLR start "rulePoser"
    // InternalMyDsl.g:364:1: rulePoser returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"classique couleur chiffre\"' | kw= '\"cumul + 2\"' | kw= '\"cumul + 4\"' | kw= '\"cumul +2 et +4\"' ) ;
    public final AntlrDatatypeRuleToken rulePoser() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:370:2: ( (kw= '\"classique couleur chiffre\"' | kw= '\"cumul + 2\"' | kw= '\"cumul + 4\"' | kw= '\"cumul +2 et +4\"' ) )
            // InternalMyDsl.g:371:2: (kw= '\"classique couleur chiffre\"' | kw= '\"cumul + 2\"' | kw= '\"cumul + 4\"' | kw= '\"cumul +2 et +4\"' )
            {
            // InternalMyDsl.g:371:2: (kw= '\"classique couleur chiffre\"' | kw= '\"cumul + 2\"' | kw= '\"cumul + 4\"' | kw= '\"cumul +2 et +4\"' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case 29:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:372:3: kw= '\"classique couleur chiffre\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPoserAccess().getClassiqueCouleurChiffreKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:378:3: kw= '\"cumul + 2\"'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPoserAccess().getCumul2Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:384:3: kw= '\"cumul + 4\"'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPoserAccess().getCumul4Keyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:390:3: kw= '\"cumul +2 et +4\"'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPoserAccess().getCumul2Et4Keyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoser"


    // $ANTLR start "entryRuleMain"
    // InternalMyDsl.g:399:1: entryRuleMain returns [String current=null] : iv_ruleMain= ruleMain EOF ;
    public final String entryRuleMain() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMain = null;


        try {
            // InternalMyDsl.g:399:44: (iv_ruleMain= ruleMain EOF )
            // InternalMyDsl.g:400:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyDsl.g:406:1: ruleMain returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"visible\"' | kw= '\"invisible\"' ) ;
    public final AntlrDatatypeRuleToken ruleMain() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:412:2: ( (kw= '\"visible\"' | kw= '\"invisible\"' ) )
            // InternalMyDsl.g:413:2: (kw= '\"visible\"' | kw= '\"invisible\"' )
            {
            // InternalMyDsl.g:413:2: (kw= '\"visible\"' | kw= '\"invisible\"' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:414:3: kw= '\"visible\"'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMainAccess().getVisibleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:420:3: kw= '\"invisible\"'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMainAccess().getInvisibleKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleUneFois"
    // InternalMyDsl.g:429:1: entryRuleUneFois returns [String current=null] : iv_ruleUneFois= ruleUneFois EOF ;
    public final String entryRuleUneFois() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUneFois = null;


        try {
            // InternalMyDsl.g:429:47: (iv_ruleUneFois= ruleUneFois EOF )
            // InternalMyDsl.g:430:2: iv_ruleUneFois= ruleUneFois EOF
            {
             newCompositeNode(grammarAccess.getUneFoisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUneFois=ruleUneFois();

            state._fsp--;

             current =iv_ruleUneFois.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUneFois"


    // $ANTLR start "ruleUneFois"
    // InternalMyDsl.g:436:1: ruleUneFois returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"peut jouer\"' | kw= '\"passe son tour\"' ) ;
    public final AntlrDatatypeRuleToken ruleUneFois() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:442:2: ( (kw= '\"peut jouer\"' | kw= '\"passe son tour\"' ) )
            // InternalMyDsl.g:443:2: (kw= '\"peut jouer\"' | kw= '\"passe son tour\"' )
            {
            // InternalMyDsl.g:443:2: (kw= '\"peut jouer\"' | kw= '\"passe son tour\"' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            else if ( (LA7_0==33) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:444:3: kw= '\"peut jouer\"'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUneFoisAccess().getPeutJouerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:450:3: kw= '\"passe son tour\"'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUneFoisAccess().getPasseSonTourKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUneFois"


    // $ANTLR start "entryRuleCarteSpe"
    // InternalMyDsl.g:459:1: entryRuleCarteSpe returns [String current=null] : iv_ruleCarteSpe= ruleCarteSpe EOF ;
    public final String entryRuleCarteSpe() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCarteSpe = null;


        try {
            // InternalMyDsl.g:459:48: (iv_ruleCarteSpe= ruleCarteSpe EOF )
            // InternalMyDsl.g:460:2: iv_ruleCarteSpe= ruleCarteSpe EOF
            {
             newCompositeNode(grammarAccess.getCarteSpeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCarteSpe=ruleCarteSpe();

            state._fsp--;

             current =iv_ruleCarteSpe.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCarteSpe"


    // $ANTLR start "ruleCarteSpe"
    // InternalMyDsl.g:466:1: ruleCarteSpe returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '\"zero\"' | kw= '\"sept\"' | kw= '\"+ 4 menteur\"' | kw= '\"aucune\"' ) (kw= ',' )* ) ;
    public final AntlrDatatypeRuleToken ruleCarteSpe() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:472:2: ( ( (kw= '\"zero\"' | kw= '\"sept\"' | kw= '\"+ 4 menteur\"' | kw= '\"aucune\"' ) (kw= ',' )* ) )
            // InternalMyDsl.g:473:2: ( (kw= '\"zero\"' | kw= '\"sept\"' | kw= '\"+ 4 menteur\"' | kw= '\"aucune\"' ) (kw= ',' )* )
            {
            // InternalMyDsl.g:473:2: ( (kw= '\"zero\"' | kw= '\"sept\"' | kw= '\"+ 4 menteur\"' | kw= '\"aucune\"' ) (kw= ',' )* )
            // InternalMyDsl.g:474:3: (kw= '\"zero\"' | kw= '\"sept\"' | kw= '\"+ 4 menteur\"' | kw= '\"aucune\"' ) (kw= ',' )*
            {
            // InternalMyDsl.g:474:3: (kw= '\"zero\"' | kw= '\"sept\"' | kw= '\"+ 4 menteur\"' | kw= '\"aucune\"' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case 36:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:475:4: kw= '\"zero\"'
                    {
                    kw=(Token)match(input,34,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCarteSpeAccess().getZeroKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:481:4: kw= '\"sept\"'
                    {
                    kw=(Token)match(input,35,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCarteSpeAccess().getSeptKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:487:4: kw= '\"+ 4 menteur\"'
                    {
                    kw=(Token)match(input,36,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCarteSpeAccess().getMenteurKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:493:4: kw= '\"aucune\"'
                    {
                    kw=(Token)match(input,37,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getCarteSpeAccess().getAucuneKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:499:3: (kw= ',' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:500:4: kw= ','
            	    {
            	    kw=(Token)match(input,38,FOLLOW_24); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getCarteSpeAccess().getCommaKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCarteSpe"


    // $ANTLR start "entryRuleTemps"
    // InternalMyDsl.g:510:1: entryRuleTemps returns [String current=null] : iv_ruleTemps= ruleTemps EOF ;
    public final String entryRuleTemps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTemps = null;


        try {
            // InternalMyDsl.g:510:45: (iv_ruleTemps= ruleTemps EOF )
            // InternalMyDsl.g:511:2: iv_ruleTemps= ruleTemps EOF
            {
             newCompositeNode(grammarAccess.getTempsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemps=ruleTemps();

            state._fsp--;

             current =iv_ruleTemps.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemps"


    // $ANTLR start "ruleTemps"
    // InternalMyDsl.g:517:1: ruleTemps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\"oui\"' ;
    public final AntlrDatatypeRuleToken ruleTemps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:523:2: (kw= '\"oui\"' )
            // InternalMyDsl.g:524:2: kw= '\"oui\"'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTempsAccess().getOuiKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemps"


    // $ANTLR start "entryRuleTas"
    // InternalMyDsl.g:532:1: entryRuleTas returns [String current=null] : iv_ruleTas= ruleTas EOF ;
    public final String entryRuleTas() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTas = null;


        try {
            // InternalMyDsl.g:532:43: (iv_ruleTas= ruleTas EOF )
            // InternalMyDsl.g:533:2: iv_ruleTas= ruleTas EOF
            {
             newCompositeNode(grammarAccess.getTasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTas=ruleTas();

            state._fsp--;

             current =iv_ruleTas.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTas"


    // $ANTLR start "ruleTas"
    // InternalMyDsl.g:539:1: ruleTas returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"1 tas\"' | kw= '\"4 tas\"' ) ;
    public final AntlrDatatypeRuleToken ruleTas() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:545:2: ( (kw= '\"1 tas\"' | kw= '\"4 tas\"' ) )
            // InternalMyDsl.g:546:2: (kw= '\"1 tas\"' | kw= '\"4 tas\"' )
            {
            // InternalMyDsl.g:546:2: (kw= '\"1 tas\"' | kw= '\"4 tas\"' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            else if ( (LA10_0==41) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:547:3: kw= '\"1 tas\"'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTasAccess().getTasKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:553:3: kw= '\"4 tas\"'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTasAccess().getTasKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTas"


    // $ANTLR start "entryRuleNbCarte"
    // InternalMyDsl.g:562:1: entryRuleNbCarte returns [String current=null] : iv_ruleNbCarte= ruleNbCarte EOF ;
    public final String entryRuleNbCarte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNbCarte = null;


        try {
            // InternalMyDsl.g:562:47: (iv_ruleNbCarte= ruleNbCarte EOF )
            // InternalMyDsl.g:563:2: iv_ruleNbCarte= ruleNbCarte EOF
            {
             newCompositeNode(grammarAccess.getNbCarteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNbCarte=ruleNbCarte();

            state._fsp--;

             current =iv_ruleNbCarte.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNbCarte"


    // $ANTLR start "ruleNbCarte"
    // InternalMyDsl.g:569:1: ruleNbCarte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"7 cartes\"' | kw= '\"10 cartes\"' ) ;
    public final AntlrDatatypeRuleToken ruleNbCarte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:575:2: ( (kw= '\"7 cartes\"' | kw= '\"10 cartes\"' ) )
            // InternalMyDsl.g:576:2: (kw= '\"7 cartes\"' | kw= '\"10 cartes\"' )
            {
            // InternalMyDsl.g:576:2: (kw= '\"7 cartes\"' | kw= '\"10 cartes\"' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            else if ( (LA11_0==43) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:577:3: kw= '\"7 cartes\"'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNbCarteAccess().getCartesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:583:3: kw= '\"10 cartes\"'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNbCarteAccess().getCartesKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNbCarte"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000002L});

}