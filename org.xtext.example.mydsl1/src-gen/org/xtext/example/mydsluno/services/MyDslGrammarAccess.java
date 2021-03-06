/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsluno.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Model");
		private final Assignment cUnoAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cUnoUnoParserRuleCall_0 = (RuleCall)cUnoAssignment.eContents().get(0);
		
		//Model:
		//	uno+=Uno*;
		@Override public ParserRule getRule() { return rule; }
		
		//uno+=Uno*
		public Assignment getUnoAssignment() { return cUnoAssignment; }
		
		//Uno
		public RuleCall getUnoUnoParserRuleCall_0() { return cUnoUnoParserRuleCall_0; }
	}
	public class UnoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Uno");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUno_ConfigPiocheKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPiocheAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPiochePiocheParserRuleCall_1_0 = (RuleCall)cPiocheAssignment_1.eContents().get(0);
		private final Keyword cPiochePoserKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPoserAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPoserPoserParserRuleCall_3_0 = (RuleCall)cPoserAssignment_3.eContents().get(0);
		private final Keyword cPoserMainKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cMainAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMainMainParserRuleCall_5_0 = (RuleCall)cMainAssignment_5.eContents().get(0);
		private final Keyword cMainCarte_specialeKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cCartespeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCartespeCarteSpeParserRuleCall_7_0 = (RuleCall)cCartespeAssignment_7.eContents().get(0);
		private final Keyword cCarte_specialeKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cTempsKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cTempsAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cTempsTempsParserRuleCall_9_1_0 = (RuleCall)cTempsAssignment_9_1.eContents().get(0);
		private final Keyword cTempsKeyword_9_2 = (Keyword)cGroup_9.eContents().get(2);
		private final Keyword cTasKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cTasAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cTasTasParserRuleCall_11_0 = (RuleCall)cTasAssignment_11.eContents().get(0);
		private final Keyword cTasKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Group cGroup_13 = (Group)cGroup.eContents().get(13);
		private final Keyword cNb_carte_de_departKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final Assignment cNbcarteAssignment_13_1 = (Assignment)cGroup_13.eContents().get(1);
		private final RuleCall cNbcarteNbCarteParserRuleCall_13_1_0 = (RuleCall)cNbcarteAssignment_13_1.eContents().get(0);
		private final Keyword cNb_carte_de_departKeyword_13_2 = (Keyword)cGroup_13.eContents().get(2);
		private final Keyword cUno_ConfigKeyword_14 = (Keyword)cGroup.eContents().get(14);
		
		//Uno:
		//	'<Uno_Config> <pioche> ' pioche+=Pioche ' </pioche> <poser> ' poser+=Poser ' </poser> <main> ' main+=Main
		//	'</main> <carte_speciale> : ' cartespe+=CarteSpe ' </carte_speciale> ' (' <temps> ' temps+=Temps ' </temps> ')?
		//	' <tas> ' tas+=Tas ' </tas> ' (' <nb_carte_de_depart> ' nbcarte+=NbCarte ' </nb_carte_de_depart> ')?
		//	' </Uno_Config>';
		@Override public ParserRule getRule() { return rule; }
		
		//'<Uno_Config> <pioche> ' pioche+=Pioche ' </pioche> <poser> ' poser+=Poser ' </poser> <main> ' main+=Main
		//'</main> <carte_speciale> : ' cartespe+=CarteSpe ' </carte_speciale> ' (' <temps> ' temps+=Temps ' </temps> ')?
		//' <tas> ' tas+=Tas ' </tas> ' (' <nb_carte_de_depart> ' nbcarte+=NbCarte ' </nb_carte_de_depart> ')? ' </Uno_Config>'
		public Group getGroup() { return cGroup; }
		
		//'<Uno_Config> <pioche> '
		public Keyword getUno_ConfigPiocheKeyword_0() { return cUno_ConfigPiocheKeyword_0; }
		
		//pioche+=Pioche
		public Assignment getPiocheAssignment_1() { return cPiocheAssignment_1; }
		
		//Pioche
		public RuleCall getPiochePiocheParserRuleCall_1_0() { return cPiochePiocheParserRuleCall_1_0; }
		
		//' </pioche> <poser> '
		public Keyword getPiochePoserKeyword_2() { return cPiochePoserKeyword_2; }
		
		//poser+=Poser
		public Assignment getPoserAssignment_3() { return cPoserAssignment_3; }
		
		//Poser
		public RuleCall getPoserPoserParserRuleCall_3_0() { return cPoserPoserParserRuleCall_3_0; }
		
		//' </poser> <main> '
		public Keyword getPoserMainKeyword_4() { return cPoserMainKeyword_4; }
		
		//main+=Main
		public Assignment getMainAssignment_5() { return cMainAssignment_5; }
		
		//Main
		public RuleCall getMainMainParserRuleCall_5_0() { return cMainMainParserRuleCall_5_0; }
		
		//'</main> <carte_speciale> : '
		public Keyword getMainCarte_specialeKeyword_6() { return cMainCarte_specialeKeyword_6; }
		
		//cartespe+=CarteSpe
		public Assignment getCartespeAssignment_7() { return cCartespeAssignment_7; }
		
		//CarteSpe
		public RuleCall getCartespeCarteSpeParserRuleCall_7_0() { return cCartespeCarteSpeParserRuleCall_7_0; }
		
		//' </carte_speciale> '
		public Keyword getCarte_specialeKeyword_8() { return cCarte_specialeKeyword_8; }
		
		//(' <temps> ' temps+=Temps ' </temps> ')?
		public Group getGroup_9() { return cGroup_9; }
		
		//' <temps> '
		public Keyword getTempsKeyword_9_0() { return cTempsKeyword_9_0; }
		
		//temps+=Temps
		public Assignment getTempsAssignment_9_1() { return cTempsAssignment_9_1; }
		
		//Temps
		public RuleCall getTempsTempsParserRuleCall_9_1_0() { return cTempsTempsParserRuleCall_9_1_0; }
		
		//' </temps> '
		public Keyword getTempsKeyword_9_2() { return cTempsKeyword_9_2; }
		
		//' <tas> '
		public Keyword getTasKeyword_10() { return cTasKeyword_10; }
		
		//tas+=Tas
		public Assignment getTasAssignment_11() { return cTasAssignment_11; }
		
		//Tas
		public RuleCall getTasTasParserRuleCall_11_0() { return cTasTasParserRuleCall_11_0; }
		
		//' </tas> '
		public Keyword getTasKeyword_12() { return cTasKeyword_12; }
		
		//(' <nb_carte_de_depart> ' nbcarte+=NbCarte ' </nb_carte_de_depart> ')?
		public Group getGroup_13() { return cGroup_13; }
		
		//' <nb_carte_de_depart> '
		public Keyword getNb_carte_de_departKeyword_13_0() { return cNb_carte_de_departKeyword_13_0; }
		
		//nbcarte+=NbCarte
		public Assignment getNbcarteAssignment_13_1() { return cNbcarteAssignment_13_1; }
		
		//NbCarte
		public RuleCall getNbcarteNbCarteParserRuleCall_13_1_0() { return cNbcarteNbCarteParserRuleCall_13_1_0; }
		
		//' </nb_carte_de_depart> '
		public Keyword getNb_carte_de_departKeyword_13_2() { return cNb_carte_de_departKeyword_13_2; }
		
		//' </Uno_Config>'
		public Keyword getUno_ConfigKeyword_14() { return cUno_ConfigKeyword_14; }
	}
	public class PiocheElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Pioche");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cUne_foisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cUnefoisAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cUnefoisUneFoisParserRuleCall_0_1_0 = (RuleCall)cUnefoisAssignment_0_1.eContents().get(0);
		private final Keyword cUne_foisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Keyword cJusquPouvoirJouerKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Pioche:
		//	' <une_fois> ' unefois+=UneFois ' </une_fois> ' | '"jusqu� pouvoir jouer"';
		@Override public ParserRule getRule() { return rule; }
		
		//' <une_fois> ' unefois+=UneFois ' </une_fois> ' | '"jusqu� pouvoir jouer"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//' <une_fois> ' unefois+=UneFois ' </une_fois> '
		public Group getGroup_0() { return cGroup_0; }
		
		//' <une_fois> '
		public Keyword getUne_foisKeyword_0_0() { return cUne_foisKeyword_0_0; }
		
		//unefois+=UneFois
		public Assignment getUnefoisAssignment_0_1() { return cUnefoisAssignment_0_1; }
		
		//UneFois
		public RuleCall getUnefoisUneFoisParserRuleCall_0_1_0() { return cUnefoisUneFoisParserRuleCall_0_1_0; }
		
		//' </une_fois> '
		public Keyword getUne_foisKeyword_0_2() { return cUne_foisKeyword_0_2; }
		
		//'"jusqu� pouvoir jouer"'
		public Keyword getJusquPouvoirJouerKeyword_1() { return cJusquPouvoirJouerKeyword_1; }
	}
	public class PoserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Poser");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cClassiqueCouleurChiffreKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cCumul2Keyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cCumul4Keyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cCumul2Et4Keyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//Poser:
		//	'"classique couleur chiffre"' | '"cumul + 2"' | '"cumul + 4"' | '"cumul +2 et +4"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"classique couleur chiffre"' | '"cumul + 2"' | '"cumul + 4"' | '"cumul +2 et +4"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'"classique couleur chiffre"'
		public Keyword getClassiqueCouleurChiffreKeyword_0() { return cClassiqueCouleurChiffreKeyword_0; }
		
		//'"cumul + 2"'
		public Keyword getCumul2Keyword_1() { return cCumul2Keyword_1; }
		
		//'"cumul + 4"'
		public Keyword getCumul4Keyword_2() { return cCumul4Keyword_2; }
		
		//'"cumul +2 et +4"'
		public Keyword getCumul2Et4Keyword_3() { return cCumul2Et4Keyword_3; }
	}
	public class MainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Main");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cVisibleKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cInvisibleKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Main:
		//	'"visible"' | '"invisible"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"visible"' | '"invisible"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'"visible"'
		public Keyword getVisibleKeyword_0() { return cVisibleKeyword_0; }
		
		//'"invisible"'
		public Keyword getInvisibleKeyword_1() { return cInvisibleKeyword_1; }
	}
	public class UneFoisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.UneFois");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cPeutJouerKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPasseSonTourKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//UneFois:
		//	'"peut jouer"' | '"passe son tour"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"peut jouer"' | '"passe son tour"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'"peut jouer"'
		public Keyword getPeutJouerKeyword_0() { return cPeutJouerKeyword_0; }
		
		//'"passe son tour"'
		public Keyword getPasseSonTourKeyword_1() { return cPasseSonTourKeyword_1; }
	}
	public class CarteSpeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.CarteSpe");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cZeroKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Keyword cSeptKeyword_0_1 = (Keyword)cAlternatives_0.eContents().get(1);
		private final Keyword cMenteurKeyword_0_2 = (Keyword)cAlternatives_0.eContents().get(2);
		private final Keyword cAucuneKeyword_0_3 = (Keyword)cAlternatives_0.eContents().get(3);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//CarteSpe:
		//	('"zero"' | '"sept"' | '"+ 4 menteur"' | '"aucune"') ','*;
		@Override public ParserRule getRule() { return rule; }
		
		//('"zero"' | '"sept"' | '"+ 4 menteur"' | '"aucune"') ','*
		public Group getGroup() { return cGroup; }
		
		//('"zero"' | '"sept"' | '"+ 4 menteur"' | '"aucune"')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'"zero"'
		public Keyword getZeroKeyword_0_0() { return cZeroKeyword_0_0; }
		
		//'"sept"'
		public Keyword getSeptKeyword_0_1() { return cSeptKeyword_0_1; }
		
		//'"+ 4 menteur"'
		public Keyword getMenteurKeyword_0_2() { return cMenteurKeyword_0_2; }
		
		//'"aucune"'
		public Keyword getAucuneKeyword_0_3() { return cAucuneKeyword_0_3; }
		
		//','*
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
	}
	public class TempsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Temps");
		private final Keyword cOuiKeyword = (Keyword)rule.eContents().get(1);
		
		//Temps:
		//	'"oui"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"oui"'
		public Keyword getOuiKeyword() { return cOuiKeyword; }
	}
	public class TasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.Tas");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTasKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cTasKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Tas:
		//	'"1 tas"' | '"4 tas"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"1 tas"' | '"4 tas"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'"1 tas"'
		public Keyword getTasKeyword_0() { return cTasKeyword_0; }
		
		//'"4 tas"'
		public Keyword getTasKeyword_1() { return cTasKeyword_1; }
	}
	public class NbCarteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsluno.MyDsl.NbCarte");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cCartesKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cCartesKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//NbCarte:
		//	'"7 cartes"' | '"10 cartes"';
		@Override public ParserRule getRule() { return rule; }
		
		//'"7 cartes"' | '"10 cartes"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'"7 cartes"'
		public Keyword getCartesKeyword_0() { return cCartesKeyword_0; }
		
		//'"10 cartes"'
		public Keyword getCartesKeyword_1() { return cCartesKeyword_1; }
	}
	
	
	private final ModelElements pModel;
	private final UnoElements pUno;
	private final PiocheElements pPioche;
	private final PoserElements pPoser;
	private final MainElements pMain;
	private final UneFoisElements pUneFois;
	private final CarteSpeElements pCarteSpe;
	private final TempsElements pTemps;
	private final TasElements pTas;
	private final NbCarteElements pNbCarte;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pUno = new UnoElements();
		this.pPioche = new PiocheElements();
		this.pPoser = new PoserElements();
		this.pMain = new MainElements();
		this.pUneFois = new UneFoisElements();
		this.pCarteSpe = new CarteSpeElements();
		this.pTemps = new TempsElements();
		this.pTas = new TasElements();
		this.pNbCarte = new NbCarteElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsluno.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	uno+=Uno*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Uno:
	//	'<Uno_Config> <pioche> ' pioche+=Pioche ' </pioche> <poser> ' poser+=Poser ' </poser> <main> ' main+=Main
	//	'</main> <carte_speciale> : ' cartespe+=CarteSpe ' </carte_speciale> ' (' <temps> ' temps+=Temps ' </temps> ')?
	//	' <tas> ' tas+=Tas ' </tas> ' (' <nb_carte_de_depart> ' nbcarte+=NbCarte ' </nb_carte_de_depart> ')?
	//	' </Uno_Config>';
	public UnoElements getUnoAccess() {
		return pUno;
	}
	
	public ParserRule getUnoRule() {
		return getUnoAccess().getRule();
	}
	
	//Pioche:
	//	' <une_fois> ' unefois+=UneFois ' </une_fois> ' | '"jusqu� pouvoir jouer"';
	public PiocheElements getPiocheAccess() {
		return pPioche;
	}
	
	public ParserRule getPiocheRule() {
		return getPiocheAccess().getRule();
	}
	
	//Poser:
	//	'"classique couleur chiffre"' | '"cumul + 2"' | '"cumul + 4"' | '"cumul +2 et +4"';
	public PoserElements getPoserAccess() {
		return pPoser;
	}
	
	public ParserRule getPoserRule() {
		return getPoserAccess().getRule();
	}
	
	//Main:
	//	'"visible"' | '"invisible"';
	public MainElements getMainAccess() {
		return pMain;
	}
	
	public ParserRule getMainRule() {
		return getMainAccess().getRule();
	}
	
	//UneFois:
	//	'"peut jouer"' | '"passe son tour"';
	public UneFoisElements getUneFoisAccess() {
		return pUneFois;
	}
	
	public ParserRule getUneFoisRule() {
		return getUneFoisAccess().getRule();
	}
	
	//CarteSpe:
	//	('"zero"' | '"sept"' | '"+ 4 menteur"' | '"aucune"') ','*;
	public CarteSpeElements getCarteSpeAccess() {
		return pCarteSpe;
	}
	
	public ParserRule getCarteSpeRule() {
		return getCarteSpeAccess().getRule();
	}
	
	//Temps:
	//	'"oui"';
	public TempsElements getTempsAccess() {
		return pTemps;
	}
	
	public ParserRule getTempsRule() {
		return getTempsAccess().getRule();
	}
	
	//Tas:
	//	'"1 tas"' | '"4 tas"';
	public TasElements getTasAccess() {
		return pTas;
	}
	
	public ParserRule getTasRule() {
		return getTasAccess().getRule();
	}
	
	//NbCarte:
	//	'"7 cartes"' | '"10 cartes"';
	public NbCarteElements getNbCarteAccess() {
		return pNbCarte;
	}
	
	public ParserRule getNbCarteRule() {
		return getNbCarteAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
