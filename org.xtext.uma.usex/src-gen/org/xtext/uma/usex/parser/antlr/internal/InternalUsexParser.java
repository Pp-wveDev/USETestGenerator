package org.xtext.uma.usex.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.uma.usex.services.UsexGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUsexParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'constraints'", "'context'", "'inv'", "':'", "'abstract'", "'class'", "'<'", "'attributes'", "'operations'", "'end'", "'enum'", "'{'", "'}'", "','", "'init'", "'derived'", "'String'", "'Real'", "'Integer'", "'Boolean'", "'('", "')'", "'='", "'begin'", "'pre'", "'post'", "'association'", "'composition'", "'aggregation'", "'between'", "'role'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'Map'", "'Tuple'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<='", "':='", "'<>'", "'and'", "'and2'", "'implies'", "'implies2'", "'or'", "'or2'", "'xor'", "'xor2'", "'.'", "'->'", "'?.'", "'?->'", "'not'", "'not2'", "'++'", "'..'", "'['", "'|?'", "'|1'", "']'", "'?'", "'::'", "'@'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'in'", "'|'", "';'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalUsexParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUsexParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUsexParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUsex.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private UsexGrammarAccess grammarAccess;

        public InternalUsexParser(TokenStream input, UsexGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UsexGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUsex.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUsex.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalUsex.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalUsex.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* (otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )* )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;

        EObject lv_generalConstraints_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:83:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* (otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )* )? ) )
            // InternalUsex.g:84:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* (otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )* )? )
            {
            // InternalUsex.g:84:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* (otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )* )? )
            // InternalUsex.g:85:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* (otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )* )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
              		
            }
            // InternalUsex.g:89:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:90:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:90:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:91:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUsex.g:107:3: ( (lv_elements_2_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)||LA1_0==22||(LA1_0>=38 && LA1_0<=40)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUsex.g:108:4: (lv_elements_2_0= ruleAbstractElement )
            	    {
            	    // InternalUsex.g:108:4: (lv_elements_2_0= ruleAbstractElement )
            	    // InternalUsex.g:109:5: lv_elements_2_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_2_0,
            	      						"org.xtext.uma.usex.Usex.AbstractElement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUsex.g:126:3: (otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUsex.g:127:4: otherlv_3= 'constraints' ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )*
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getConstraintsKeyword_3_0());
                      			
                    }
                    // InternalUsex.g:131:4: ( (lv_generalConstraints_4_0= ruleGeneralConstraint ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUsex.g:132:5: (lv_generalConstraints_4_0= ruleGeneralConstraint )
                    	    {
                    	    // InternalUsex.g:132:5: (lv_generalConstraints_4_0= ruleGeneralConstraint )
                    	    // InternalUsex.g:133:6: lv_generalConstraints_4_0= ruleGeneralConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getModelAccess().getGeneralConstraintsGeneralConstraintParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_5);
                    	    lv_generalConstraints_4_0=ruleGeneralConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getModelRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"generalConstraints",
                    	      							lv_generalConstraints_4_0,
                    	      							"org.xtext.uma.usex.Usex.GeneralConstraint");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGeneralConstraint"
    // InternalUsex.g:155:1: entryRuleGeneralConstraint returns [EObject current=null] : iv_ruleGeneralConstraint= ruleGeneralConstraint EOF ;
    public final EObject entryRuleGeneralConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralConstraint = null;


        try {
            // InternalUsex.g:155:58: (iv_ruleGeneralConstraint= ruleGeneralConstraint EOF )
            // InternalUsex.g:156:2: iv_ruleGeneralConstraint= ruleGeneralConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGeneralConstraint=ruleGeneralConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGeneralConstraint"


    // $ANTLR start "ruleGeneralConstraint"
    // InternalUsex.g:162:1: ruleGeneralConstraint returns [EObject current=null] : (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_constraintBody_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleGeneralConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_constraintBody_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:168:2: ( (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_constraintBody_5_0= ruleExpCS ) ) ) )
            // InternalUsex.g:169:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_constraintBody_5_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:169:2: (otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_constraintBody_5_0= ruleExpCS ) ) )
            // InternalUsex.g:170:3: otherlv_0= 'context' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'inv' ( (lv_name_3_0= RULE_ID ) )? otherlv_4= ':' ( (lv_constraintBody_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGeneralConstraintAccess().getContextKeyword_0());
              		
            }
            // InternalUsex.g:174:3: ( (otherlv_1= RULE_ID ) )
            // InternalUsex.g:175:4: (otherlv_1= RULE_ID )
            {
            // InternalUsex.g:175:4: (otherlv_1= RULE_ID )
            // InternalUsex.g:176:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGeneralConstraintRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getGeneralConstraintAccess().getContextClassUseClassCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGeneralConstraintAccess().getInvKeyword_2());
              		
            }
            // InternalUsex.g:194:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUsex.g:195:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUsex.g:195:4: (lv_name_3_0= RULE_ID )
                    // InternalUsex.g:196:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_3_0, grammarAccess.getGeneralConstraintAccess().getNameIDTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGeneralConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_3_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGeneralConstraintAccess().getColonKeyword_4());
              		
            }
            // InternalUsex.g:216:3: ( (lv_constraintBody_5_0= ruleExpCS ) )
            // InternalUsex.g:217:4: (lv_constraintBody_5_0= ruleExpCS )
            {
            // InternalUsex.g:217:4: (lv_constraintBody_5_0= ruleExpCS )
            // InternalUsex.g:218:5: lv_constraintBody_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGeneralConstraintAccess().getConstraintBodyExpCSParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constraintBody_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGeneralConstraintRule());
              					}
              					set(
              						current,
              						"constraintBody",
              						lv_constraintBody_5_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGeneralConstraint"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalUsex.g:239:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalUsex.g:239:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalUsex.g:240:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalUsex.g:246:1: ruleAbstractElement returns [EObject current=null] : (this_UseClass_0= ruleUseClass | this_Enumeration_1= ruleEnumeration | this_Relation_2= ruleRelation ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_UseClass_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_Relation_2 = null;



        	enterRule();

        try {
            // InternalUsex.g:252:2: ( (this_UseClass_0= ruleUseClass | this_Enumeration_1= ruleEnumeration | this_Relation_2= ruleRelation ) )
            // InternalUsex.g:253:2: (this_UseClass_0= ruleUseClass | this_Enumeration_1= ruleEnumeration | this_Relation_2= ruleRelation )
            {
            // InternalUsex.g:253:2: (this_UseClass_0= ruleUseClass | this_Enumeration_1= ruleEnumeration | this_Relation_2= ruleRelation )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUsex.g:254:3: this_UseClass_0= ruleUseClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getUseClassParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UseClass_0=ruleUseClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UseClass_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:266:3: this_Enumeration_1= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getEnumerationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Enumeration_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:278:3: this_Relation_2= ruleRelation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Relation_2=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Relation_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUseClass"
    // InternalUsex.g:293:1: entryRuleUseClass returns [EObject current=null] : iv_ruleUseClass= ruleUseClass EOF ;
    public final EObject entryRuleUseClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseClass = null;


        try {
            // InternalUsex.g:293:49: (iv_ruleUseClass= ruleUseClass EOF )
            // InternalUsex.g:294:2: iv_ruleUseClass= ruleUseClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUseClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUseClass=ruleUseClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUseClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUseClass"


    // $ANTLR start "ruleUseClass"
    // InternalUsex.g:300:1: ruleUseClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) ) )? (otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )* )? (otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )* )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )* )? otherlv_11= 'end' ) ;
    public final EObject ruleUseClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_parentClass_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_attributes_6_0 = null;

        EObject lv_operations_8_0 = null;

        EObject lv_constraints_10_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:306:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) ) )? (otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )* )? (otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )* )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )* )? otherlv_11= 'end' ) )
            // InternalUsex.g:307:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) ) )? (otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )* )? (otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )* )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )* )? otherlv_11= 'end' )
            {
            // InternalUsex.g:307:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) ) )? (otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )* )? (otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )* )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )* )? otherlv_11= 'end' )
            // InternalUsex.g:308:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) ) )? (otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )* )? (otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )* )? (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )* )? otherlv_11= 'end'
            {
            // InternalUsex.g:308:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUsex.g:309:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUsex.g:309:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUsex.g:310:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_abstract_0_0, grammarAccess.getUseClassAccess().getAbstractAbstractKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getUseClassRule());
                      					}
                      					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUseClassAccess().getClassKeyword_1());
              		
            }
            // InternalUsex.g:326:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUsex.g:327:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUsex.g:327:4: (lv_name_2_0= RULE_ID )
            // InternalUsex.g:328:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getUseClassAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getUseClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUsex.g:344:3: (otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUsex.g:345:4: otherlv_3= '<' ( (lv_parentClass_4_0= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUseClassAccess().getLessThanSignKeyword_3_0());
                      			
                    }
                    // InternalUsex.g:349:4: ( (lv_parentClass_4_0= RULE_ID ) )
                    // InternalUsex.g:350:5: (lv_parentClass_4_0= RULE_ID )
                    {
                    // InternalUsex.g:350:5: (lv_parentClass_4_0= RULE_ID )
                    // InternalUsex.g:351:6: lv_parentClass_4_0= RULE_ID
                    {
                    lv_parentClass_4_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_parentClass_4_0, grammarAccess.getUseClassAccess().getParentClassIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getUseClassRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"parentClass",
                      							lv_parentClass_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUsex.g:368:3: (otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsex.g:369:4: otherlv_5= 'attributes' ( (lv_attributes_6_0= ruleAttribute ) )*
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getUseClassAccess().getAttributesKeyword_4_0());
                      			
                    }
                    // InternalUsex.g:373:4: ( (lv_attributes_6_0= ruleAttribute ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalUsex.g:374:5: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // InternalUsex.g:374:5: (lv_attributes_6_0= ruleAttribute )
                    	    // InternalUsex.g:375:6: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getUseClassAccess().getAttributesAttributeParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_attributes_6_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"attributes",
                    	      							lv_attributes_6_0,
                    	      							"org.xtext.uma.usex.Usex.Attribute");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUsex.g:393:3: (otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUsex.g:394:4: otherlv_7= 'operations' ( (lv_operations_8_0= ruleOperation ) )*
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getUseClassAccess().getOperationsKeyword_5_0());
                      			
                    }
                    // InternalUsex.g:398:4: ( (lv_operations_8_0= ruleOperation ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalUsex.g:399:5: (lv_operations_8_0= ruleOperation )
                    	    {
                    	    // InternalUsex.g:399:5: (lv_operations_8_0= ruleOperation )
                    	    // InternalUsex.g:400:6: lv_operations_8_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getUseClassAccess().getOperationsOperationParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_14);
                    	    lv_operations_8_0=ruleOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"operations",
                    	      							lv_operations_8_0,
                    	      							"org.xtext.uma.usex.Usex.Operation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUsex.g:418:3: (otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUsex.g:419:4: otherlv_9= 'constraints' ( (lv_constraints_10_0= ruleConstraint ) )*
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getUseClassAccess().getConstraintsKeyword_6_0());
                      			
                    }
                    // InternalUsex.g:423:4: ( (lv_constraints_10_0= ruleConstraint ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalUsex.g:424:5: (lv_constraints_10_0= ruleConstraint )
                    	    {
                    	    // InternalUsex.g:424:5: (lv_constraints_10_0= ruleConstraint )
                    	    // InternalUsex.g:425:6: lv_constraints_10_0= ruleConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getUseClassAccess().getConstraintsConstraintParserRuleCall_6_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_15);
                    	    lv_constraints_10_0=ruleConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"constraints",
                    	      							lv_constraints_10_0,
                    	      							"org.xtext.uma.usex.Usex.Constraint");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getUseClassAccess().getEndKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUseClass"


    // $ANTLR start "entryRuleEnumeration"
    // InternalUsex.g:451:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalUsex.g:451:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalUsex.g:452:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalUsex.g:458:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumerationElem ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:464:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumerationElem ) )+ otherlv_4= '}' ) )
            // InternalUsex.g:465:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumerationElem ) )+ otherlv_4= '}' )
            {
            // InternalUsex.g:465:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumerationElem ) )+ otherlv_4= '}' )
            // InternalUsex.g:466:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleEnumerationElem ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
              		
            }
            // InternalUsex.g:470:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:471:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:471:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:472:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUsex.g:492:3: ( (lv_elements_3_0= ruleEnumerationElem ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUsex.g:493:4: (lv_elements_3_0= ruleEnumerationElem )
            	    {
            	    // InternalUsex.g:493:4: (lv_elements_3_0= ruleEnumerationElem )
            	    // InternalUsex.g:494:5: lv_elements_3_0= ruleEnumerationElem
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEnumerationAccess().getElementsEnumerationElemParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_elements_3_0=ruleEnumerationElem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_3_0,
            	      						"org.xtext.uma.usex.Usex.EnumerationElem");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationElem"
    // InternalUsex.g:519:1: entryRuleEnumerationElem returns [EObject current=null] : iv_ruleEnumerationElem= ruleEnumerationElem EOF ;
    public final EObject entryRuleEnumerationElem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationElem = null;


        try {
            // InternalUsex.g:519:56: (iv_ruleEnumerationElem= ruleEnumerationElem EOF )
            // InternalUsex.g:520:2: iv_ruleEnumerationElem= ruleEnumerationElem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationElemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationElem=ruleEnumerationElem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationElem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumerationElem"


    // $ANTLR start "ruleEnumerationElem"
    // InternalUsex.g:526:1: ruleEnumerationElem returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleEnumerationElem() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:532:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalUsex.g:533:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalUsex.g:533:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalUsex.g:534:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalUsex.g:534:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:535:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:535:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:536:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationElemAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumerationElemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUsex.g:552:3: (otherlv_1= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUsex.g:553:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEnumerationElemAccess().getCommaKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEnumerationElem"


    // $ANTLR start "entryRuleAttribute"
    // InternalUsex.g:562:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUsex.g:562:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUsex.g:563:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUsex.g:569:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_type_2_0 = null;

        EObject lv_initialization_5_0 = null;

        EObject lv_derivedFrom_8_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:575:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? ) )
            // InternalUsex.g:576:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? )
            {
            // InternalUsex.g:576:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? )
            // InternalUsex.g:577:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )?
            {
            // InternalUsex.g:577:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:578:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:578:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:579:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:599:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalUsex.g:600:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalUsex.g:600:4: (lv_type_2_0= ruleAttributeType )
            // InternalUsex.g:601:5: lv_type_2_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.uma.usex.Usex.AttributeType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:618:3: (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUsex.g:619:4: otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getInitKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_3_1());
                      			
                    }
                    // InternalUsex.g:627:4: ( (lv_initialization_5_0= ruleExpCS ) )
                    // InternalUsex.g:628:5: (lv_initialization_5_0= ruleExpCS )
                    {
                    // InternalUsex.g:628:5: (lv_initialization_5_0= ruleExpCS )
                    // InternalUsex.g:629:6: lv_initialization_5_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getInitializationExpCSParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_initialization_5_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"initialization",
                      							lv_initialization_5_0,
                      							"org.xtext.uma.usex.Usex.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUsex.g:647:3: (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUsex.g:648:4: otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDerivedKeyword_4_0());
                      			
                    }
                    otherlv_7=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getColonKeyword_4_1());
                      			
                    }
                    // InternalUsex.g:656:4: ( (lv_derivedFrom_8_0= ruleExpCS ) )
                    // InternalUsex.g:657:5: (lv_derivedFrom_8_0= ruleExpCS )
                    {
                    // InternalUsex.g:657:5: (lv_derivedFrom_8_0= ruleExpCS )
                    // InternalUsex.g:658:6: lv_derivedFrom_8_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getDerivedFromExpCSParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_derivedFrom_8_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAttributeRule());
                      						}
                      						set(
                      							current,
                      							"derivedFrom",
                      							lv_derivedFrom_8_0,
                      							"org.xtext.uma.usex.Usex.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUsex.g:680:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUsex.g:680:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUsex.g:681:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUsex.g:687:1: ruleAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType | this_CollectionType_2= ruleCollectionType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ClassType_1 = null;

        EObject this_CollectionType_2 = null;



        	enterRule();

        try {
            // InternalUsex.g:693:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType | this_CollectionType_2= ruleCollectionType ) )
            // InternalUsex.g:694:2: (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType | this_CollectionType_2= ruleCollectionType )
            {
            // InternalUsex.g:694:2: (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType | this_CollectionType_2= ruleCollectionType )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalUsex.g:695:3: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:707:3: this_ClassType_1= ruleClassType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeTypeAccess().getClassTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ClassType_1=ruleClassType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:719:3: this_CollectionType_2= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAttributeTypeAccess().getCollectionTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionType_2=ruleCollectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalUsex.g:734:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalUsex.g:734:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalUsex.g:735:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalUsex.g:741:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalUsex.g:747:2: ( ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) ) )
            // InternalUsex.g:748:2: ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) )
            {
            // InternalUsex.g:748:2: ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) )
            // InternalUsex.g:749:3: ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) )
            {
            // InternalUsex.g:749:3: ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) )
            // InternalUsex.g:750:4: (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' )
            {
            // InternalUsex.g:750:4: (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            case 31:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalUsex.g:751:5: lv_type_0_1= 'String'
                    {
                    lv_type_0_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getPrimitiveTypeAccess().getTypeStringKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:762:5: lv_type_0_2= 'Real'
                    {
                    lv_type_0_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getPrimitiveTypeAccess().getTypeRealKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:773:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getPrimitiveTypeAccess().getTypeIntegerKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:784:5: lv_type_0_4= 'Boolean'
                    {
                    lv_type_0_4=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getPrimitiveTypeAccess().getTypeBooleanKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleClassType"
    // InternalUsex.g:800:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalUsex.g:800:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalUsex.g:801:2: iv_ruleClassType= ruleClassType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalUsex.g:807:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUsex.g:813:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUsex.g:814:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUsex.g:814:2: ( (otherlv_0= RULE_ID ) )
            // InternalUsex.g:815:3: (otherlv_0= RULE_ID )
            {
            // InternalUsex.g:815:3: (otherlv_0= RULE_ID )
            // InternalUsex.g:816:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getClassTypeRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeUseClassCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleCollectionType"
    // InternalUsex.g:833:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalUsex.g:833:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalUsex.g:834:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalUsex.g:840:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_colType_0_0= ruleCollectionTypeIdentifier ) ) otherlv_1= '(' ( (lv_objType_2_0= ruleAttributeType ) )? otherlv_3= ')' ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_colType_0_0 = null;

        EObject lv_objType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:846:2: ( ( ( (lv_colType_0_0= ruleCollectionTypeIdentifier ) ) otherlv_1= '(' ( (lv_objType_2_0= ruleAttributeType ) )? otherlv_3= ')' ) )
            // InternalUsex.g:847:2: ( ( (lv_colType_0_0= ruleCollectionTypeIdentifier ) ) otherlv_1= '(' ( (lv_objType_2_0= ruleAttributeType ) )? otherlv_3= ')' )
            {
            // InternalUsex.g:847:2: ( ( (lv_colType_0_0= ruleCollectionTypeIdentifier ) ) otherlv_1= '(' ( (lv_objType_2_0= ruleAttributeType ) )? otherlv_3= ')' )
            // InternalUsex.g:848:3: ( (lv_colType_0_0= ruleCollectionTypeIdentifier ) ) otherlv_1= '(' ( (lv_objType_2_0= ruleAttributeType ) )? otherlv_3= ')'
            {
            // InternalUsex.g:848:3: ( (lv_colType_0_0= ruleCollectionTypeIdentifier ) )
            // InternalUsex.g:849:4: (lv_colType_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalUsex.g:849:4: (lv_colType_0_0= ruleCollectionTypeIdentifier )
            // InternalUsex.g:850:5: lv_colType_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeAccess().getColTypeCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_colType_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
              					}
              					set(
              						current,
              						"colType",
              						lv_colType_0_0,
              						"org.xtext.uma.usex.Usex.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:871:3: ( (lv_objType_2_0= ruleAttributeType ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||(LA20_0>=28 && LA20_0<=31)||(LA20_0>=47 && LA20_0<=51)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUsex.g:872:4: (lv_objType_2_0= ruleAttributeType )
                    {
                    // InternalUsex.g:872:4: (lv_objType_2_0= ruleAttributeType )
                    // InternalUsex.g:873:5: lv_objType_2_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionTypeAccess().getObjTypeAttributeTypeParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    lv_objType_2_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
                      					}
                      					set(
                      						current,
                      						"objType",
                      						lv_objType_2_0,
                      						"org.xtext.uma.usex.Usex.AttributeType");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleOperation"
    // InternalUsex.g:898:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalUsex.g:898:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalUsex.g:899:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalUsex.g:905:1: ruleOperation returns [EObject current=null] : (this_Query_0= ruleQuery | this_Method_1= ruleMethod ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Query_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:911:2: ( (this_Query_0= ruleQuery | this_Method_1= ruleMethod ) )
            // InternalUsex.g:912:2: (this_Query_0= ruleQuery | this_Method_1= ruleMethod )
            {
            // InternalUsex.g:912:2: (this_Query_0= ruleQuery | this_Method_1= ruleMethod )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred25_InternalUsex()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUsex.g:913:3: this_Query_0= ruleQuery
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getQueryParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Query_0=ruleQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Query_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:925:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleQuery"
    // InternalUsex.g:940:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalUsex.g:940:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalUsex.g:941:2: iv_ruleQuery= ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuery; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalUsex.g:947:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inputParameters_2_0 = null;

        EObject lv_returnParameter_5_0 = null;

        EObject lv_operationBody_7_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:953:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) ) )
            // InternalUsex.g:954:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:954:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) )
            // InternalUsex.g:955:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) )
            {
            // InternalUsex.g:955:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:956:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:956:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:957:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getQueryRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:977:3: ( (lv_inputParameters_2_0= ruleParameter ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUsex.g:978:4: (lv_inputParameters_2_0= ruleParameter )
            	    {
            	    // InternalUsex.g:978:4: (lv_inputParameters_2_0= ruleParameter )
            	    // InternalUsex.g:979:5: lv_inputParameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQueryAccess().getInputParametersParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_inputParameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getQueryRule());
            	      					}
            	      					add(
            	      						current,
            	      						"inputParameters",
            	      						lv_inputParameters_2_0,
            	      						"org.xtext.uma.usex.Usex.Parameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getColonKeyword_4());
              		
            }
            // InternalUsex.g:1004:3: ( (lv_returnParameter_5_0= ruleAttributeType ) )
            // InternalUsex.g:1005:4: (lv_returnParameter_5_0= ruleAttributeType )
            {
            // InternalUsex.g:1005:4: (lv_returnParameter_5_0= ruleAttributeType )
            // InternalUsex.g:1006:5: lv_returnParameter_5_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQueryAccess().getReturnParameterAttributeTypeParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_returnParameter_5_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQueryRule());
              					}
              					set(
              						current,
              						"returnParameter",
              						lv_returnParameter_5_0,
              						"org.xtext.uma.usex.Usex.AttributeType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getEqualsSignKeyword_6());
              		
            }
            // InternalUsex.g:1027:3: ( (lv_operationBody_7_0= ruleExpCS ) )
            // InternalUsex.g:1028:4: (lv_operationBody_7_0= ruleExpCS )
            {
            // InternalUsex.g:1028:4: (lv_operationBody_7_0= ruleExpCS )
            // InternalUsex.g:1029:5: lv_operationBody_7_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQueryAccess().getOperationBodyExpCSParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_operationBody_7_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQueryRule());
              					}
              					set(
              						current,
              						"operationBody",
              						lv_operationBody_7_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleMethod"
    // InternalUsex.g:1050:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUsex.g:1050:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUsex.g:1051:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUsex.g:1057:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? ( (lv_operationBody_6_0= ruleMethodBody ) )? ( (lv_conditions_7_0= ruleCondition ) )* ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_inputParameters_2_0 = null;

        EObject lv_returnParameter_5_0 = null;

        EObject lv_operationBody_6_0 = null;

        EObject lv_conditions_7_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1063:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? ( (lv_operationBody_6_0= ruleMethodBody ) )? ( (lv_conditions_7_0= ruleCondition ) )* ) )
            // InternalUsex.g:1064:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? ( (lv_operationBody_6_0= ruleMethodBody ) )? ( (lv_conditions_7_0= ruleCondition ) )* )
            {
            // InternalUsex.g:1064:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? ( (lv_operationBody_6_0= ruleMethodBody ) )? ( (lv_conditions_7_0= ruleCondition ) )* )
            // InternalUsex.g:1065:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? ( (lv_operationBody_6_0= ruleMethodBody ) )? ( (lv_conditions_7_0= ruleCondition ) )*
            {
            // InternalUsex.g:1065:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:1066:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:1066:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:1067:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:1087:3: ( (lv_inputParameters_2_0= ruleParameter ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUsex.g:1088:4: (lv_inputParameters_2_0= ruleParameter )
            	    {
            	    // InternalUsex.g:1088:4: (lv_inputParameters_2_0= ruleParameter )
            	    // InternalUsex.g:1089:5: lv_inputParameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodAccess().getInputParametersParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_inputParameters_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMethodRule());
            	      					}
            	      					add(
            	      						current,
            	      						"inputParameters",
            	      						lv_inputParameters_2_0,
            	      						"org.xtext.uma.usex.Usex.Parameter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUsex.g:1110:3: (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUsex.g:1111:4: otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalUsex.g:1115:4: ( (lv_returnParameter_5_0= ruleAttributeType ) )
                    // InternalUsex.g:1116:5: (lv_returnParameter_5_0= ruleAttributeType )
                    {
                    // InternalUsex.g:1116:5: (lv_returnParameter_5_0= ruleAttributeType )
                    // InternalUsex.g:1117:6: lv_returnParameter_5_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getReturnParameterAttributeTypeParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_returnParameter_5_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						set(
                      							current,
                      							"returnParameter",
                      							lv_returnParameter_5_0,
                      							"org.xtext.uma.usex.Usex.AttributeType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalUsex.g:1135:3: ( (lv_operationBody_6_0= ruleMethodBody ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUsex.g:1136:4: (lv_operationBody_6_0= ruleMethodBody )
                    {
                    // InternalUsex.g:1136:4: (lv_operationBody_6_0= ruleMethodBody )
                    // InternalUsex.g:1137:5: lv_operationBody_6_0= ruleMethodBody
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMethodAccess().getOperationBodyMethodBodyParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
                    lv_operationBody_6_0=ruleMethodBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMethodRule());
                      					}
                      					set(
                      						current,
                      						"operationBody",
                      						lv_operationBody_6_0,
                      						"org.xtext.uma.usex.Usex.MethodBody");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUsex.g:1154:3: ( (lv_conditions_7_0= ruleCondition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=36 && LA26_0<=37)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUsex.g:1155:4: (lv_conditions_7_0= ruleCondition )
            	    {
            	    // InternalUsex.g:1155:4: (lv_conditions_7_0= ruleCondition )
            	    // InternalUsex.g:1156:5: lv_conditions_7_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodAccess().getConditionsConditionParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
            	    lv_conditions_7_0=ruleCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMethodRule());
            	      					}
            	      					add(
            	      						current,
            	      						"conditions",
            	      						lv_conditions_7_0,
            	      						"org.xtext.uma.usex.Usex.Condition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleMethodBody"
    // InternalUsex.g:1177:1: entryRuleMethodBody returns [EObject current=null] : iv_ruleMethodBody= ruleMethodBody EOF ;
    public final EObject entryRuleMethodBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodBody = null;


        try {
            // InternalUsex.g:1177:51: (iv_ruleMethodBody= ruleMethodBody EOF )
            // InternalUsex.g:1178:2: iv_ruleMethodBody= ruleMethodBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethodBody=ruleMethodBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodBody"


    // $ANTLR start "ruleMethodBody"
    // InternalUsex.g:1184:1: ruleMethodBody returns [EObject current=null] : (otherlv_0= 'begin' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= 'end' ) ;
    public final EObject ruleMethodBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_code_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUsex.g:1190:2: ( (otherlv_0= 'begin' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= 'end' ) )
            // InternalUsex.g:1191:2: (otherlv_0= 'begin' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= 'end' )
            {
            // InternalUsex.g:1191:2: (otherlv_0= 'begin' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= 'end' )
            // InternalUsex.g:1192:3: otherlv_0= 'begin' ( (lv_code_1_0= RULE_STRING ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMethodBodyAccess().getBeginKeyword_0());
              		
            }
            // InternalUsex.g:1196:3: ( (lv_code_1_0= RULE_STRING ) )
            // InternalUsex.g:1197:4: (lv_code_1_0= RULE_STRING )
            {
            // InternalUsex.g:1197:4: (lv_code_1_0= RULE_STRING )
            // InternalUsex.g:1198:5: lv_code_1_0= RULE_STRING
            {
            lv_code_1_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_code_1_0, grammarAccess.getMethodBodyAccess().getCodeSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodBodyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"code",
              						lv_code_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodBodyAccess().getEndKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMethodBody"


    // $ANTLR start "entryRuleParameter"
    // InternalUsex.g:1222:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUsex.g:1222:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUsex.g:1223:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUsex.g:1229:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1235:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? ) )
            // InternalUsex.g:1236:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? )
            {
            // InternalUsex.g:1236:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? )
            // InternalUsex.g:1237:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )?
            {
            // InternalUsex.g:1237:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:1238:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:1238:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:1239:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParameterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:1259:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalUsex.g:1260:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalUsex.g:1260:4: (lv_type_2_0= ruleAttributeType )
            // InternalUsex.g:1261:5: lv_type_2_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeAttributeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.xtext.uma.usex.Usex.AttributeType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:1278:3: (otherlv_3= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUsex.g:1279:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getCommaKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCondition"
    // InternalUsex.g:1288:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUsex.g:1288:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUsex.g:1289:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUsex.g:1295:1: ruleCondition returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:1301:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUsex.g:1302:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUsex.g:1302:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            else if ( (LA28_0==37) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalUsex.g:1303:3: this_Precondition_0= rulePrecondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionAccess().getPreconditionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Precondition_0=rulePrecondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Precondition_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1315:3: this_Postcondition_1= rulePostcondition
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConditionAccess().getPostconditionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Postcondition_1=rulePostcondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Postcondition_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePrecondition"
    // InternalUsex.g:1330:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUsex.g:1330:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUsex.g:1331:2: iv_rulePrecondition= rulePrecondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreconditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrecondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUsex.g:1337:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_conditionBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1343:2: ( (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:1344:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:1344:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            // InternalUsex.g:1345:3: otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
              		
            }
            // InternalUsex.g:1349:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUsex.g:1350:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsex.g:1350:4: (lv_name_1_0= RULE_ID )
                    // InternalUsex.g:1351:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPreconditionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
              		
            }
            // InternalUsex.g:1371:3: ( (lv_conditionBody_3_0= ruleExpCS ) )
            // InternalUsex.g:1372:4: (lv_conditionBody_3_0= ruleExpCS )
            {
            // InternalUsex.g:1372:4: (lv_conditionBody_3_0= ruleExpCS )
            // InternalUsex.g:1373:5: lv_conditionBody_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreconditionAccess().getConditionBodyExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_conditionBody_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreconditionRule());
              					}
              					set(
              						current,
              						"conditionBody",
              						lv_conditionBody_3_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUsex.g:1394:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUsex.g:1394:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUsex.g:1395:2: iv_rulePostcondition= rulePostcondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostconditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostcondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUsex.g:1401:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_conditionBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1407:2: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:1408:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:1408:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            // InternalUsex.g:1409:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
              		
            }
            // InternalUsex.g:1413:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUsex.g:1414:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsex.g:1414:4: (lv_name_1_0= RULE_ID )
                    // InternalUsex.g:1415:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPostconditionRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
              		
            }
            // InternalUsex.g:1435:3: ( (lv_conditionBody_3_0= ruleExpCS ) )
            // InternalUsex.g:1436:4: (lv_conditionBody_3_0= ruleExpCS )
            {
            // InternalUsex.g:1436:4: (lv_conditionBody_3_0= ruleExpCS )
            // InternalUsex.g:1437:5: lv_conditionBody_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPostconditionAccess().getConditionBodyExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_conditionBody_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPostconditionRule());
              					}
              					set(
              						current,
              						"conditionBody",
              						lv_conditionBody_3_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleConstraint"
    // InternalUsex.g:1458:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalUsex.g:1458:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalUsex.g:1459:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalUsex.g:1465:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_constraintBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1471:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:1472:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:1472:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) )
            // InternalUsex.g:1473:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getInvKeyword_0());
              		
            }
            // InternalUsex.g:1477:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUsex.g:1478:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsex.g:1478:4: (lv_name_1_0= RULE_ID )
                    // InternalUsex.g:1479:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_1_0, grammarAccess.getConstraintAccess().getNameIDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_1_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
              		
            }
            // InternalUsex.g:1499:3: ( (lv_constraintBody_3_0= ruleExpCS ) )
            // InternalUsex.g:1500:4: (lv_constraintBody_3_0= ruleExpCS )
            {
            // InternalUsex.g:1500:4: (lv_constraintBody_3_0= ruleExpCS )
            // InternalUsex.g:1501:5: lv_constraintBody_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstraintAccess().getConstraintBodyExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_constraintBody_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstraintRule());
              					}
              					set(
              						current,
              						"constraintBody",
              						lv_constraintBody_3_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelation"
    // InternalUsex.g:1522:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalUsex.g:1522:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalUsex.g:1523:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalUsex.g:1529:1: ruleRelation returns [EObject current=null] : ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_relationType_0_1=null;
        Token lv_relationType_0_2=null;
        Token lv_relationType_0_3=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_relationBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1535:2: ( ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) )
            // InternalUsex.g:1536:2: ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            {
            // InternalUsex.g:1536:2: ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            // InternalUsex.g:1537:3: ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end'
            {
            // InternalUsex.g:1537:3: ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) )
            // InternalUsex.g:1538:4: ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) )
            {
            // InternalUsex.g:1538:4: ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) )
            // InternalUsex.g:1539:5: (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' )
            {
            // InternalUsex.g:1539:5: (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt32=1;
                }
                break;
            case 39:
                {
                alt32=2;
                }
                break;
            case 40:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalUsex.g:1540:6: lv_relationType_0_1= 'association'
                    {
                    lv_relationType_0_1=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_relationType_0_1, grammarAccess.getRelationAccess().getRelationTypeAssociationKeyword_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationRule());
                      						}
                      						setWithLastConsumed(current, "relationType", lv_relationType_0_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1551:6: lv_relationType_0_2= 'composition'
                    {
                    lv_relationType_0_2=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_relationType_0_2, grammarAccess.getRelationAccess().getRelationTypeCompositionKeyword_0_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationRule());
                      						}
                      						setWithLastConsumed(current, "relationType", lv_relationType_0_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:1562:6: lv_relationType_0_3= 'aggregation'
                    {
                    lv_relationType_0_3=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_relationType_0_3, grammarAccess.getRelationAccess().getRelationTypeAggregationKeyword_0_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationRule());
                      						}
                      						setWithLastConsumed(current, "relationType", lv_relationType_0_3, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalUsex.g:1575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:1576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:1576:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:1577:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getRelationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBetweenKeyword_2());
              		
            }
            // InternalUsex.g:1597:3: ( (lv_relationBody_3_0= ruleRelationBody ) )
            // InternalUsex.g:1598:4: (lv_relationBody_3_0= ruleRelationBody )
            {
            // InternalUsex.g:1598:4: (lv_relationBody_3_0= ruleRelationBody )
            // InternalUsex.g:1599:5: lv_relationBody_3_0= ruleRelationBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationAccess().getRelationBodyRelationBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_relationBody_3_0=ruleRelationBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationRule());
              					}
              					set(
              						current,
              						"relationBody",
              						lv_relationBody_3_0,
              						"org.xtext.uma.usex.Usex.RelationBody");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getEndKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleRelationBody"
    // InternalUsex.g:1624:1: entryRuleRelationBody returns [EObject current=null] : iv_ruleRelationBody= ruleRelationBody EOF ;
    public final EObject entryRuleRelationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBody = null;


        try {
            // InternalUsex.g:1624:53: (iv_ruleRelationBody= ruleRelationBody EOF )
            // InternalUsex.g:1625:2: iv_ruleRelationBody= ruleRelationBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationBodyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationBody=ruleRelationBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationBody; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationBody"


    // $ANTLR start "ruleRelationBody"
    // InternalUsex.g:1631:1: ruleRelationBody returns [EObject current=null] : ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) ) ;
    public final EObject ruleRelationBody() throws RecognitionException {
        EObject current = null;

        EObject lv_originClass_0_0 = null;

        EObject lv_destinyClass_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1637:2: ( ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) ) )
            // InternalUsex.g:1638:2: ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) )
            {
            // InternalUsex.g:1638:2: ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) )
            // InternalUsex.g:1639:3: ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) )
            {
            // InternalUsex.g:1639:3: ( (lv_originClass_0_0= ruleRelationMember ) )
            // InternalUsex.g:1640:4: (lv_originClass_0_0= ruleRelationMember )
            {
            // InternalUsex.g:1640:4: (lv_originClass_0_0= ruleRelationMember )
            // InternalUsex.g:1641:5: lv_originClass_0_0= ruleRelationMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationBodyAccess().getOriginClassRelationMemberParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_originClass_0_0=ruleRelationMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationBodyRule());
              					}
              					set(
              						current,
              						"originClass",
              						lv_originClass_0_0,
              						"org.xtext.uma.usex.Usex.RelationMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:1658:3: ( (lv_destinyClass_1_0= ruleRelationMember ) )
            // InternalUsex.g:1659:4: (lv_destinyClass_1_0= ruleRelationMember )
            {
            // InternalUsex.g:1659:4: (lv_destinyClass_1_0= ruleRelationMember )
            // InternalUsex.g:1660:5: lv_destinyClass_1_0= ruleRelationMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationBodyAccess().getDestinyClassRelationMemberParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_destinyClass_1_0=ruleRelationMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationBodyRule());
              					}
              					set(
              						current,
              						"destinyClass",
              						lv_destinyClass_1_0,
              						"org.xtext.uma.usex.Usex.RelationMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationBody"


    // $ANTLR start "entryRuleRelationMember"
    // InternalUsex.g:1681:1: entryRuleRelationMember returns [EObject current=null] : iv_ruleRelationMember= ruleRelationMember EOF ;
    public final EObject entryRuleRelationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationMember = null;


        try {
            // InternalUsex.g:1681:55: (iv_ruleRelationMember= ruleRelationMember EOF )
            // InternalUsex.g:1682:2: iv_ruleRelationMember= ruleRelationMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationMember=ruleRelationMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationMember"


    // $ANTLR start "ruleRelationMember"
    // InternalUsex.g:1688:1: ruleRelationMember returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) (otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )? ) ;
    public final EObject ruleRelationMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_roleName_3_0=null;
        EObject lv_cardinality_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1694:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) (otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )? ) )
            // InternalUsex.g:1695:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) (otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )? )
            {
            // InternalUsex.g:1695:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) (otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )? )
            // InternalUsex.g:1696:3: ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) (otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )?
            {
            // InternalUsex.g:1696:3: ( (otherlv_0= RULE_ID ) )
            // InternalUsex.g:1697:4: (otherlv_0= RULE_ID )
            {
            // InternalUsex.g:1697:4: (otherlv_0= RULE_ID )
            // InternalUsex.g:1698:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationMemberRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getRelationMemberAccess().getClassUseClassCrossReference_0_0());
              				
            }

            }


            }

            // InternalUsex.g:1712:3: ( (lv_cardinality_1_0= ruleMultiplicityCS ) )
            // InternalUsex.g:1713:4: (lv_cardinality_1_0= ruleMultiplicityCS )
            {
            // InternalUsex.g:1713:4: (lv_cardinality_1_0= ruleMultiplicityCS )
            // InternalUsex.g:1714:5: lv_cardinality_1_0= ruleMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationMemberAccess().getCardinalityMultiplicityCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_34);
            lv_cardinality_1_0=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRelationMemberRule());
              					}
              					set(
              						current,
              						"cardinality",
              						lv_cardinality_1_0,
              						"org.xtext.uma.usex.Usex.MultiplicityCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:1731:3: (otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUsex.g:1732:4: otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRelationMemberAccess().getRoleKeyword_2_0());
                      			
                    }
                    // InternalUsex.g:1736:4: ( (lv_roleName_3_0= RULE_ID ) )
                    // InternalUsex.g:1737:5: (lv_roleName_3_0= RULE_ID )
                    {
                    // InternalUsex.g:1737:5: (lv_roleName_3_0= RULE_ID )
                    // InternalUsex.g:1738:6: lv_roleName_3_0= RULE_ID
                    {
                    lv_roleName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_roleName_3_0, grammarAccess.getRelationMemberAccess().getRoleNameIDTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRelationMemberRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"roleName",
                      							lv_roleName_3_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRelationMember"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalUsex.g:1759:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalUsex.g:1759:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalUsex.g:1760:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalUsex.g:1766:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:1772:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalUsex.g:1773:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalUsex.g:1773:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt34=1;
                }
                break;
            case 30:
                {
                alt34=2;
                }
                break;
            case 29:
                {
                alt34=3;
                }
                break;
            case 28:
                {
                alt34=4;
                }
                break;
            case 43:
                {
                alt34=5;
                }
                break;
            case 44:
                {
                alt34=6;
                }
                break;
            case 45:
                {
                alt34=7;
                }
                break;
            case 46:
                {
                alt34=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalUsex.g:1774:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1780:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:1786:3: kw= 'Real'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:1792:3: kw= 'String'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:1798:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUsex.g:1804:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUsex.g:1810:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUsex.g:1816:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveTypeCS"
    // InternalUsex.g:1825:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalUsex.g:1825:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalUsex.g:1826:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeCS=rulePrimitiveTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveTypeCS"


    // $ANTLR start "rulePrimitiveTypeCS"
    // InternalUsex.g:1832:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1838:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalUsex.g:1839:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalUsex.g:1839:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalUsex.g:1840:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalUsex.g:1840:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalUsex.g:1841:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeCSAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeCSRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.xtext.uma.usex.Usex.PrimitiveTypeIdentifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveTypeCS"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalUsex.g:1861:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalUsex.g:1861:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalUsex.g:1862:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalUsex.g:1868:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:1874:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalUsex.g:1875:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalUsex.g:1875:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt35=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt35=1;
                }
                break;
            case 48:
                {
                alt35=2;
                }
                break;
            case 49:
                {
                alt35=3;
                }
                break;
            case 50:
                {
                alt35=4;
                }
                break;
            case 51:
                {
                alt35=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalUsex.g:1876:3: kw= 'Set'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1882:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:1888:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:1894:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:1900:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleCollectionTypeCS"
    // InternalUsex.g:1909:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalUsex.g:1909:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalUsex.g:1910:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionTypeCS=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionTypeCS"


    // $ANTLR start "ruleCollectionTypeCS"
    // InternalUsex.g:1916:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1922:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalUsex.g:1923:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalUsex.g:1923:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalUsex.g:1924:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalUsex.g:1924:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalUsex.g:1925:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalUsex.g:1925:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalUsex.g:1926:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_name_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.uma.usex.Usex.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:1943:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUsex.g:1944:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:1948:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalUsex.g:1949:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalUsex.g:1949:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalUsex.g:1950:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    lv_ownedType_2_0=ruleTypeExpWithoutMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.xtext.uma.usex.Usex.TypeExpWithoutMultiplicityCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:1967:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==79) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalUsex.g:1968:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalUsex.g:1968:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalUsex.g:1969:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FOLLOW_24);
                            lv_ownedCollectionMultiplicity_3_0=ruleMultiplicityCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCollectionTypeCSRule());
                              						}
                              						set(
                              							current,
                              							"ownedCollectionMultiplicity",
                              							lv_ownedCollectionMultiplicity_3_0,
                              							"org.xtext.uma.usex.Usex.MultiplicityCS");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getCollectionTypeCSAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionTypeCS"


    // $ANTLR start "entryRuleMapTypeCS"
    // InternalUsex.g:1995:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalUsex.g:1995:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalUsex.g:1996:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapTypeCS=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapTypeCS"


    // $ANTLR start "ruleMapTypeCS"
    // InternalUsex.g:2002:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
    public final EObject ruleMapTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedKeyType_2_0 = null;

        EObject lv_ownedValueType_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2008:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalUsex.g:2009:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalUsex.g:2009:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalUsex.g:2010:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalUsex.g:2010:3: ( (lv_name_0_0= 'Map' ) )
            // InternalUsex.g:2011:4: (lv_name_0_0= 'Map' )
            {
            // InternalUsex.g:2011:4: (lv_name_0_0= 'Map' )
            // InternalUsex.g:2012:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,52,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getMapTypeCSAccess().getNameMapKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMapTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Map");
              				
            }

            }


            }

            // InternalUsex.g:2024:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUsex.g:2025:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:2029:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalUsex.g:2030:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:2030:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalUsex.g:2031:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
                    lv_ownedKeyType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedKeyType",
                      							lv_ownedKeyType_2_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalUsex.g:2052:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalUsex.g:2053:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:2053:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalUsex.g:2054:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_ownedValueType_4_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapTypeCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedValueType",
                      							lv_ownedValueType_4_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMapTypeCSAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapTypeCS"


    // $ANTLR start "entryRuleTupleTypeCS"
    // InternalUsex.g:2080:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalUsex.g:2080:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalUsex.g:2081:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleTypeCS=ruleTupleTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleTypeCS"


    // $ANTLR start "ruleTupleTypeCS"
    // InternalUsex.g:2087:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2093:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalUsex.g:2094:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalUsex.g:2094:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalUsex.g:2095:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalUsex.g:2095:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalUsex.g:2096:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalUsex.g:2096:4: (lv_name_0_0= 'Tuple' )
            // InternalUsex.g:2097:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,53,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeCSAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeCSRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            // InternalUsex.g:2109:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==32) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUsex.g:2110:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:2114:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalUsex.g:2115:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalUsex.g:2115:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalUsex.g:2116:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalUsex.g:2116:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalUsex.g:2117:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_39);
                            lv_ownedParts_2_0=ruleTuplePartCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                              							}
                              							add(
                              								current,
                              								"ownedParts",
                              								lv_ownedParts_2_0,
                              								"org.xtext.uma.usex.Usex.TuplePartCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalUsex.g:2134:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop39:
                            do {
                                int alt39=2;
                                int LA39_0 = input.LA(1);

                                if ( (LA39_0==25) ) {
                                    alt39=1;
                                }


                                switch (alt39) {
                            	case 1 :
                            	    // InternalUsex.g:2135:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalUsex.g:2139:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalUsex.g:2140:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalUsex.g:2140:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalUsex.g:2141:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_39);
                            	    lv_ownedParts_4_0=ruleTuplePartCS();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getTupleTypeCSRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ownedParts",
                            	      									lv_ownedParts_4_0,
                            	      									"org.xtext.uma.usex.Usex.TuplePartCS");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop39;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTupleTypeCSAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleTypeCS"


    // $ANTLR start "entryRuleTuplePartCS"
    // InternalUsex.g:2169:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalUsex.g:2169:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalUsex.g:2170:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTuplePartCS=ruleTuplePartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuplePartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuplePartCS"


    // $ANTLR start "ruleTuplePartCS"
    // InternalUsex.g:2176:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2182:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalUsex.g:2183:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalUsex.g:2183:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalUsex.g:2184:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalUsex.g:2184:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:2185:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:2185:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:2186:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.uma.usex.Usex.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:2207:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalUsex.g:2208:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalUsex.g:2208:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalUsex.g:2209:5: lv_ownedType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_2_0,
              						"org.xtext.uma.usex.Usex.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTuplePartCS"


    // $ANTLR start "entryRuleBinaryOperatorName"
    // InternalUsex.g:2230:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalUsex.g:2230:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalUsex.g:2231:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinaryOperatorName=ruleBinaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOperatorName"


    // $ANTLR start "ruleBinaryOperatorName"
    // InternalUsex.g:2237:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:2243:2: ( (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName ) )
            // InternalUsex.g:2244:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName )
            {
            // InternalUsex.g:2244:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==18||LA42_0==34||(LA42_0>=54 && LA42_0<=70)) ) {
                alt42=1;
            }
            else if ( ((LA42_0>=71 && LA42_0<=74)) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalUsex.g:2245:3: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getEssentialOCLInfixOperatorNameParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EssentialOCLInfixOperatorName_0=ruleEssentialOCLInfixOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EssentialOCLInfixOperatorName_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2256:3: this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBinaryOperatorNameAccess().getEssentialOCLNavigationOperatorNameParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EssentialOCLNavigationOperatorName_1=ruleEssentialOCLNavigationOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EssentialOCLNavigationOperatorName_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBinaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLInfixOperatorName"
    // InternalUsex.g:2270:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalUsex.g:2270:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalUsex.g:2271:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLInfixOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLInfixOperatorName=ruleEssentialOCLInfixOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLInfixOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLInfixOperatorName"


    // $ANTLR start "ruleEssentialOCLInfixOperatorName"
    // InternalUsex.g:2277:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:2283:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalUsex.g:2284:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalUsex.g:2284:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt43=19;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt43=1;
                }
                break;
            case 55:
                {
                alt43=2;
                }
                break;
            case 56:
                {
                alt43=3;
                }
                break;
            case 57:
                {
                alt43=4;
                }
                break;
            case 58:
                {
                alt43=5;
                }
                break;
            case 18:
                {
                alt43=6;
                }
                break;
            case 59:
                {
                alt43=7;
                }
                break;
            case 60:
                {
                alt43=8;
                }
                break;
            case 34:
                {
                alt43=9;
                }
                break;
            case 61:
                {
                alt43=10;
                }
                break;
            case 62:
                {
                alt43=11;
                }
                break;
            case 63:
                {
                alt43=12;
                }
                break;
            case 64:
                {
                alt43=13;
                }
                break;
            case 65:
                {
                alt43=14;
                }
                break;
            case 66:
                {
                alt43=15;
                }
                break;
            case 67:
                {
                alt43=16;
                }
                break;
            case 68:
                {
                alt43=17;
                }
                break;
            case 69:
                {
                alt43=18;
                }
                break;
            case 70:
                {
                alt43=19;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalUsex.g:2285:3: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2291:3: kw= '/'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2297:3: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:2303:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:2309:3: kw= '>'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUsex.g:2315:3: kw= '<'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUsex.g:2321:3: kw= '>='
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUsex.g:2327:3: kw= '<='
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUsex.g:2333:3: kw= '='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUsex.g:2339:3: kw= ':='
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getColonEqualsSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalUsex.g:2345:3: kw= '<>'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalUsex.g:2351:3: kw= 'and'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalUsex.g:2357:3: kw= 'and2'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalUsex.g:2363:3: kw= 'implies'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalUsex.g:2369:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalUsex.g:2375:3: kw= 'or'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalUsex.g:2381:3: kw= 'or2'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalUsex.g:2387:3: kw= 'xor'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalUsex.g:2393:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXor2Keyword_18());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLInfixOperatorName"


    // $ANTLR start "entryRuleEssentialOCLNavigationOperatorName"
    // InternalUsex.g:2402:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalUsex.g:2402:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalUsex.g:2403:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLNavigationOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLNavigationOperatorName=ruleEssentialOCLNavigationOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLNavigationOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLNavigationOperatorName"


    // $ANTLR start "ruleEssentialOCLNavigationOperatorName"
    // InternalUsex.g:2409:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:2415:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalUsex.g:2416:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalUsex.g:2416:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt44=1;
                }
                break;
            case 72:
                {
                alt44=2;
                }
                break;
            case 73:
                {
                alt44=3;
                }
                break;
            case 74:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalUsex.g:2417:3: kw= '.'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2423:3: kw= '->'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2429:3: kw= '?.'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:2435:3: kw= '?->'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLNavigationOperatorName"


    // $ANTLR start "entryRuleUnaryOperatorName"
    // InternalUsex.g:2444:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalUsex.g:2444:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalUsex.g:2445:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperatorName=ruleUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryOperatorName"


    // $ANTLR start "ruleUnaryOperatorName"
    // InternalUsex.g:2451:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2457:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalUsex.g:2458:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnaryOperatorNameAccess().getEssentialOCLUnaryOperatorNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EssentialOCLUnaryOperatorName_0=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnaryOperatorName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnaryOperatorName"
    // InternalUsex.g:2471:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalUsex.g:2471:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalUsex.g:2472:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnaryOperatorNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLUnaryOperatorName=ruleEssentialOCLUnaryOperatorName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnaryOperatorName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnaryOperatorName"


    // $ANTLR start "ruleEssentialOCLUnaryOperatorName"
    // InternalUsex.g:2478:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:2484:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalUsex.g:2485:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalUsex.g:2485:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt45=1;
                }
                break;
            case 75:
                {
                alt45=2;
                }
                break;
            case 76:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalUsex.g:2486:3: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2492:3: kw= 'not'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2498:3: kw= 'not2'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNot2Keyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLUnaryOperatorName"


    // $ANTLR start "entryRuleEssentialOCLUnrestrictedName"
    // InternalUsex.g:2507:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalUsex.g:2507:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalUsex.g:2508:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLUnrestrictedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEssentialOCLUnrestrictedName=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLUnrestrictedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEssentialOCLUnrestrictedName"


    // $ANTLR start "ruleEssentialOCLUnrestrictedName"
    // InternalUsex.g:2514:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalUsex.g:2520:2: (this_ID_0= RULE_ID )
            // InternalUsex.g:2521:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getEssentialOCLUnrestrictedNameAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEssentialOCLUnrestrictedName"


    // $ANTLR start "entryRuleUnrestrictedName"
    // InternalUsex.g:2531:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalUsex.g:2531:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalUsex.g:2532:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnrestrictedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnrestrictedName=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnrestrictedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnrestrictedName"


    // $ANTLR start "ruleUnrestrictedName"
    // InternalUsex.g:2538:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2544:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalUsex.g:2545:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getUnrestrictedNameAccess().getEssentialOCLUnrestrictedNameParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EssentialOCLUnrestrictedName_0=ruleEssentialOCLUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLUnrestrictedName_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnrestrictedName"


    // $ANTLR start "entryRuleCollectionPatternCS"
    // InternalUsex.g:2558:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalUsex.g:2558:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalUsex.g:2559:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionPatternCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionPatternCS=ruleCollectionPatternCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionPatternCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionPatternCS"


    // $ANTLR start "ruleCollectionPatternCS"
    // InternalUsex.g:2565:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_restVariableName_6_0=null;
        Token otherlv_7=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2571:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' ) )
            // InternalUsex.g:2572:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' )
            {
            // InternalUsex.g:2572:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' )
            // InternalUsex.g:2573:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}'
            {
            // InternalUsex.g:2573:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalUsex.g:2574:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalUsex.g:2574:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalUsex.g:2575:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.xtext.uma.usex.Usex.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:2596:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUsex.g:2597:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) )
                    {
                    // InternalUsex.g:2597:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalUsex.g:2598:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalUsex.g:2598:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalUsex.g:2599:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
                    lv_ownedParts_2_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.xtext.uma.usex.Usex.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:2616:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==25) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalUsex.g:2617:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:2621:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalUsex.g:2622:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalUsex.g:2622:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalUsex.g:2623:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_ownedParts_4_0=rulePatternExpCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionPatternCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.xtext.uma.usex.Usex.PatternExpCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // InternalUsex.g:2641:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) )
                    // InternalUsex.g:2642:5: otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalUsex.g:2646:5: ( (lv_restVariableName_6_0= RULE_ID ) )
                    // InternalUsex.g:2647:6: (lv_restVariableName_6_0= RULE_ID )
                    {
                    // InternalUsex.g:2647:6: (lv_restVariableName_6_0= RULE_ID )
                    // InternalUsex.g:2648:7: lv_restVariableName_6_0= RULE_ID
                    {
                    lv_restVariableName_6_0=(Token)match(input,RULE_ID,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_restVariableName_6_0, grammarAccess.getCollectionPatternCSAccess().getRestVariableNameIDTerminalRuleCall_2_2_1_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCollectionPatternCSRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"restVariableName",
                      								lv_restVariableName_6_0,
                      								"org.eclipse.xtext.common.Terminals.ID");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getCollectionPatternCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionPatternCS"


    // $ANTLR start "entryRulePatternExpCS"
    // InternalUsex.g:2674:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalUsex.g:2674:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalUsex.g:2675:2: iv_rulePatternExpCS= rulePatternExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePatternExpCS=rulePatternExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternExpCS"


    // $ANTLR start "rulePatternExpCS"
    // InternalUsex.g:2681:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2687:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalUsex.g:2688:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalUsex.g:2688:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalUsex.g:2689:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalUsex.g:2689:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUsex.g:2690:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalUsex.g:2690:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalUsex.g:2691:5: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_patternVariableName_0_0=ruleUnrestrictedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
                      					}
                      					set(
                      						current,
                      						"patternVariableName",
                      						lv_patternVariableName_0_0,
                      						"org.xtext.uma.usex.Usex.UnrestrictedName");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:2712:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalUsex.g:2713:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalUsex.g:2713:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalUsex.g:2714:5: lv_ownedPatternType_2_0= ruleTypeExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPatternExpCSAccess().getOwnedPatternTypeTypeExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedPatternType_2_0=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPatternExpCSRule());
              					}
              					set(
              						current,
              						"ownedPatternType",
              						lv_ownedPatternType_2_0,
              						"org.xtext.uma.usex.Usex.TypeExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePatternExpCS"


    // $ANTLR start "entryRuleTypeExpCS"
    // InternalUsex.g:2735:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalUsex.g:2735:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalUsex.g:2736:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpCS=ruleTypeExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpCS"


    // $ANTLR start "ruleTypeExpCS"
    // InternalUsex.g:2742:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2748:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalUsex.g:2749:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalUsex.g:2749:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalUsex.g:2750:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUsex.g:2761:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==79) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUsex.g:2762:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalUsex.g:2762:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalUsex.g:2763:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeExpCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.xtext.uma.usex.Usex.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeExpCS"


    // $ANTLR start "entryRuleTypeExpWithoutMultiplicityCS"
    // InternalUsex.g:2784:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalUsex.g:2784:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalUsex.g:2785:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeExpWithoutMultiplicityCS=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExpWithoutMultiplicityCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "ruleTypeExpWithoutMultiplicityCS"
    // InternalUsex.g:2791:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalUsex.g:2797:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalUsex.g:2798:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalUsex.g:2798:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt50=3;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // InternalUsex.g:2799:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeNameExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeNameExpCS_0=ruleTypeNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeNameExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2811:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralCS_1=ruleTypeLiteralCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2823:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpWithoutMultiplicityCSAccess().getCollectionPatternCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionPatternCS_2=ruleCollectionPatternCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionPatternCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeExpWithoutMultiplicityCS"


    // $ANTLR start "entryRuleTypeLiteralCS"
    // InternalUsex.g:2838:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalUsex.g:2838:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalUsex.g:2839:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralCS=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralCS"


    // $ANTLR start "ruleTypeLiteralCS"
    // InternalUsex.g:2845:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:2851:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalUsex.g:2852:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalUsex.g:2852:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 30:
            case 31:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt51=1;
                }
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt51=2;
                }
                break;
            case 52:
                {
                alt51=3;
                }
                break;
            case 53:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalUsex.g:2853:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getPrimitiveTypeCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeCS_0=rulePrimitiveTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2865:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getCollectionTypeCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionTypeCS_1=ruleCollectionTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionTypeCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2877:3: this_MapTypeCS_2= ruleMapTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getMapTypeCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapTypeCS_2=ruleMapTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapTypeCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:2889:3: this_TupleTypeCS_3= ruleTupleTypeCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeLiteralCSAccess().getTupleTypeCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleTypeCS_3=ruleTupleTypeCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLiteralCS"


    // $ANTLR start "entryRuleTypeLiteralExpCS"
    // InternalUsex.g:2904:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalUsex.g:2904:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalUsex.g:2905:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralExpCS=ruleTypeLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralExpCS"


    // $ANTLR start "ruleTypeLiteralExpCS"
    // InternalUsex.g:2911:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2917:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalUsex.g:2918:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalUsex.g:2918:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalUsex.g:2919:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalUsex.g:2919:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalUsex.g:2920:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeTypeLiteralWithMultiplicityCSParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_ownedType_0_0=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeLiteralExpCSRule());
              				}
              				set(
              					current,
              					"ownedType",
              					lv_ownedType_0_0,
              					"org.xtext.uma.usex.Usex.TypeLiteralWithMultiplicityCS");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLiteralExpCS"


    // $ANTLR start "entryRuleTypeLiteralWithMultiplicityCS"
    // InternalUsex.g:2940:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalUsex.g:2940:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalUsex.g:2941:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeLiteralWithMultiplicityCS=ruleTypeLiteralWithMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeLiteralWithMultiplicityCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "ruleTypeLiteralWithMultiplicityCS"
    // InternalUsex.g:2947:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2953:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalUsex.g:2954:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalUsex.g:2954:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalUsex.g:2955:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUsex.g:2966:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==79) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUsex.g:2967:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalUsex.g:2967:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalUsex.g:2968:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getOwnedMultiplicityMultiplicityCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedMultiplicity_1_0=ruleMultiplicityCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTypeLiteralWithMultiplicityCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedMultiplicity",
                      						lv_ownedMultiplicity_1_0,
                      						"org.xtext.uma.usex.Usex.MultiplicityCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeLiteralWithMultiplicityCS"


    // $ANTLR start "entryRuleTypeNameExpCS"
    // InternalUsex.g:2989:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalUsex.g:2989:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalUsex.g:2990:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeNameExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeNameExpCS=ruleTypeNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeNameExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeNameExpCS"


    // $ANTLR start "ruleTypeNameExpCS"
    // InternalUsex.g:2996:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:3002:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalUsex.g:3003:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalUsex.g:3003:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalUsex.g:3004:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalUsex.g:3004:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalUsex.g:3005:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalUsex.g:3005:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalUsex.g:3006:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.xtext.uma.usex.Usex.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:3023:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==23) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalUsex.g:3024:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalUsex.g:3024:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalUsex.g:3025:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalUsex.g:3025:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalUsex.g:3026:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_ownedCurlyBracketedClause_1_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCurlyBracketedClause",
                      							lv_ownedCurlyBracketedClause_1_0,
                      							"org.xtext.uma.usex.Usex.CurlyBracketedClauseCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:3043:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==23) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalUsex.g:3044:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalUsex.g:3048:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalUsex.g:3049:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalUsex.g:3049:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalUsex.g:3050:7: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_42);
                            lv_ownedPatternGuard_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypeNameExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedPatternGuard",
                              								lv_ownedPatternGuard_3_0,
                              								"org.xtext.uma.usex.Usex.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getTypeNameExpCSAccess().getRightCurlyBracketKeyword_1_1_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTypeNameExpCS"


    // $ANTLR start "entryRuleCurlyBracketedClauseCS"
    // InternalUsex.g:3077:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalUsex.g:3077:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalUsex.g:3078:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCurlyBracketedClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCurlyBracketedClauseCS=ruleCurlyBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCurlyBracketedClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCurlyBracketedClauseCS"


    // $ANTLR start "ruleCurlyBracketedClauseCS"
    // InternalUsex.g:3084:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:3090:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUsex.g:3091:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUsex.g:3091:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUsex.g:3092:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUsex.g:3092:3: ()
            // InternalUsex.g:3093:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCurlyBracketedClauseCSAccess().getCurlyBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:3106:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUsex.g:3107:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalUsex.g:3107:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalUsex.g:3108:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalUsex.g:3108:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalUsex.g:3109:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_ownedParts_2_0=ruleShadowPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.xtext.uma.usex.Usex.ShadowPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:3126:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==25) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalUsex.g:3127:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_47); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:3131:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalUsex.g:3132:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalUsex.g:3132:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalUsex.g:3133:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_ownedParts_4_0=ruleShadowPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCurlyBracketedClauseCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.xtext.uma.usex.Usex.ShadowPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCurlyBracketedClauseCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCurlyBracketedClauseCS"


    // $ANTLR start "entryRuleShadowPartCS"
    // InternalUsex.g:3160:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalUsex.g:3160:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalUsex.g:3161:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShadowPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShadowPartCS=ruleShadowPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShadowPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShadowPartCS"


    // $ANTLR start "ruleShadowPartCS"
    // InternalUsex.g:3167:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token lv_referredProperty_0_0=null;
        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:3173:2: ( ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalUsex.g:3174:2: ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalUsex.g:3174:2: ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_STRING) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalUsex.g:3175:3: ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalUsex.g:3175:3: ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalUsex.g:3176:4: ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalUsex.g:3176:4: ( (lv_referredProperty_0_0= RULE_ID ) )
                    // InternalUsex.g:3177:5: (lv_referredProperty_0_0= RULE_ID )
                    {
                    // InternalUsex.g:3177:5: (lv_referredProperty_0_0= RULE_ID )
                    // InternalUsex.g:3178:6: lv_referredProperty_0_0= RULE_ID
                    {
                    lv_referredProperty_0_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_referredProperty_0_0, grammarAccess.getShadowPartCSAccess().getReferredPropertyIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShadowPartCSRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"referredProperty",
                      							lv_referredProperty_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalUsex.g:3198:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalUsex.g:3199:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalUsex.g:3199:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalUsex.g:3200:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalUsex.g:3200:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt57=2;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                    case RULE_INT:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 57:
                    case 75:
                    case 76:
                    case 86:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 97:
                        {
                        alt57=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA57_2 = input.LA(2);

                        if ( (LA57_2==EOF||LA57_2==18||(LA57_2>=23 && LA57_2<=25)||LA57_2==32||LA57_2==34||(LA57_2>=54 && LA57_2<=74)||LA57_2==79||(LA57_2>=84 && LA57_2<=85)) ) {
                            alt57=1;
                        }
                        else if ( (LA57_2==15) ) {
                            alt57=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 15:
                        {
                        alt57=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }

                    switch (alt57) {
                        case 1 :
                            // InternalUsex.g:3201:7: lv_ownedInitExpression_2_1= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_2_1=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_1,
                              								"org.xtext.uma.usex.Usex.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUsex.g:3217:7: lv_ownedInitExpression_2_2= rulePatternExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionPatternExpCSParserRuleCall_0_2_0_1());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_2_2=rulePatternExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_2_2,
                              								"org.xtext.uma.usex.Usex.PatternExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:3237:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalUsex.g:3237:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalUsex.g:3238:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalUsex.g:3238:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalUsex.g:3239:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getShadowPartCSAccess().getOwnedInitExpressionStringLiteralExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedInitExpression_3_0=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getShadowPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedInitExpression",
                      						lv_ownedInitExpression_3_0,
                      						"org.xtext.uma.usex.Usex.StringLiteralExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShadowPartCS"


    // $ANTLR start "entryRuleStringLiteralExpCS"
    // InternalUsex.g:3260:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalUsex.g:3260:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalUsex.g:3261:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteralExpCS=ruleStringLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteralExpCS"


    // $ANTLR start "ruleStringLiteralExpCS"
    // InternalUsex.g:3267:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:3273:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalUsex.g:3274:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalUsex.g:3274:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_STRING) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalUsex.g:3275:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalUsex.g:3275:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalUsex.g:3276:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_segments_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStringLiteralExpCSRule());
            	      				}
            	      				add(
            	      					current,
            	      					"segments",
            	      					lv_segments_0_0,
            	      					"org.xtext.uma.usex.Usex.StringLiteral");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteralExpCS"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalUsex.g:3296:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalUsex.g:3296:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalUsex.g:3297:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalUsex.g:3303:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUsex.g:3309:2: (this_STRING_0= RULE_STRING )
            // InternalUsex.g:3310:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleMultiplicityBoundsCS"
    // InternalUsex.g:3320:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalUsex.g:3320:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalUsex.g:3321:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityBoundsCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityBoundsCS=ruleMultiplicityBoundsCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityBoundsCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityBoundsCS"


    // $ANTLR start "ruleMultiplicityBoundsCS"
    // InternalUsex.g:3327:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:3333:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalUsex.g:3334:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalUsex.g:3334:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalUsex.g:3335:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalUsex.g:3335:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalUsex.g:3336:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalUsex.g:3336:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalUsex.g:3337:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_lowerBound_0_0=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
              					}
              					set(
              						current,
              						"lowerBound",
              						lv_lowerBound_0_0,
              						"org.xtext.uma.usex.Usex.LOWER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:3354:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==78) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalUsex.g:3355:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,78,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:3359:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalUsex.g:3360:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalUsex.g:3360:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalUsex.g:3361:6: lv_upperBound_2_0= ruleUPPER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundUPPERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_upperBound_2_0=ruleUPPER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMultiplicityBoundsCSRule());
                      						}
                      						set(
                      							current,
                      							"upperBound",
                      							lv_upperBound_2_0,
                      							"org.xtext.uma.usex.Usex.UPPER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityBoundsCS"


    // $ANTLR start "entryRuleMultiplicityCS"
    // InternalUsex.g:3383:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalUsex.g:3383:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalUsex.g:3384:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityCS=ruleMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityCS"


    // $ANTLR start "ruleMultiplicityCS"
    // InternalUsex.g:3390:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_3_1=null;
        Token lv_symbol_3_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicityBoundsCS_1 = null;

        EObject this_MultiplicityStringCS_2 = null;



        	enterRule();

        try {
            // InternalUsex.g:3396:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' ) )
            // InternalUsex.g:3397:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' )
            {
            // InternalUsex.g:3397:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' )
            // InternalUsex.g:3398:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalUsex.g:3402:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_INT) ) {
                alt61=1;
            }
            else if ( (LA61_0==54||LA61_0==56||LA61_0==83) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalUsex.g:3403:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    this_MultiplicityBoundsCS_1=ruleMultiplicityBoundsCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityBoundsCS_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:3415:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_53);
                    this_MultiplicityStringCS_2=ruleMultiplicityStringCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MultiplicityStringCS_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalUsex.g:3427:3: ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=80 && LA63_0<=81)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalUsex.g:3428:4: ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) )
                    {
                    // InternalUsex.g:3428:4: ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) )
                    // InternalUsex.g:3429:5: (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' )
                    {
                    // InternalUsex.g:3429:5: (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==80) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==81) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalUsex.g:3430:6: lv_symbol_3_1= '|?'
                            {
                            lv_symbol_3_1=(Token)match(input,80,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_symbol_3_1, grammarAccess.getMultiplicityCSAccess().getSymbolVerticalLineQuestionMarkKeyword_2_0_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                              						}
                              						setWithLastConsumed(current, "symbol", lv_symbol_3_1, null);
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalUsex.g:3441:6: lv_symbol_3_2= '|1'
                            {
                            lv_symbol_3_2=(Token)match(input,81,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_symbol_3_2, grammarAccess.getMultiplicityCSAccess().getSymbol1Keyword_2_0_1());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getMultiplicityCSRule());
                              						}
                              						setWithLastConsumed(current, "symbol", lv_symbol_3_2, null);
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMultiplicityCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityCS"


    // $ANTLR start "entryRuleMultiplicityStringCS"
    // InternalUsex.g:3462:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalUsex.g:3462:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalUsex.g:3463:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityStringCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicityStringCS=ruleMultiplicityStringCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityStringCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicityStringCS"


    // $ANTLR start "ruleMultiplicityStringCS"
    // InternalUsex.g:3469:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalUsex.g:3475:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalUsex.g:3476:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalUsex.g:3476:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalUsex.g:3477:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalUsex.g:3477:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalUsex.g:3478:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalUsex.g:3478:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt64=1;
                }
                break;
            case 56:
                {
                alt64=2;
                }
                break;
            case 83:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalUsex.g:3479:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_1, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAsteriskKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:3490:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_2, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsPlusSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:3501:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_stringBounds_0_3, grammarAccess.getMultiplicityStringCSAccess().getStringBoundsQuestionMarkKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMultiplicityStringCSRule());
                      					}
                      					setWithLastConsumed(current, "stringBounds", lv_stringBounds_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMultiplicityStringCS"


    // $ANTLR start "entryRulePathNameCS"
    // InternalUsex.g:3517:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalUsex.g:3517:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalUsex.g:3518:2: iv_rulePathNameCS= rulePathNameCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePathNameCS=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePathNameCS"


    // $ANTLR start "rulePathNameCS"
    // InternalUsex.g:3524:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token lv_ownedPathElements_0_0=null;
        Token otherlv_1=null;
        Token lv_ownedPathElements_2_0=null;


        	enterRule();

        try {
            // InternalUsex.g:3530:2: ( ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* ) )
            // InternalUsex.g:3531:2: ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* )
            {
            // InternalUsex.g:3531:2: ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* )
            // InternalUsex.g:3532:3: ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )*
            {
            // InternalUsex.g:3532:3: ( (lv_ownedPathElements_0_0= RULE_ID ) )
            // InternalUsex.g:3533:4: (lv_ownedPathElements_0_0= RULE_ID )
            {
            // InternalUsex.g:3533:4: (lv_ownedPathElements_0_0= RULE_ID )
            // InternalUsex.g:3534:5: lv_ownedPathElements_0_0= RULE_ID
            {
            lv_ownedPathElements_0_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ownedPathElements_0_0, grammarAccess.getPathNameCSAccess().getOwnedPathElementsIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getPathNameCSRule());
              					}
              					addWithLastConsumed(
              						current,
              						"ownedPathElements",
              						lv_ownedPathElements_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUsex.g:3550:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==84) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalUsex.g:3551:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,84,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalUsex.g:3555:4: ( (lv_ownedPathElements_2_0= RULE_ID ) )
            	    // InternalUsex.g:3556:5: (lv_ownedPathElements_2_0= RULE_ID )
            	    {
            	    // InternalUsex.g:3556:5: (lv_ownedPathElements_2_0= RULE_ID )
            	    // InternalUsex.g:3557:6: lv_ownedPathElements_2_0= RULE_ID
            	    {
            	    lv_ownedPathElements_2_0=(Token)match(input,RULE_ID,FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_ownedPathElements_2_0, grammarAccess.getPathNameCSAccess().getOwnedPathElementsIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getPathNameCSRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"ownedPathElements",
            	      							lv_ownedPathElements_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePathNameCS"


    // $ANTLR start "entryRuleUPPER"
    // InternalUsex.g:3578:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalUsex.g:3578:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalUsex.g:3579:2: iv_ruleUPPER= ruleUPPER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUPPERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUPPER=ruleUPPER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUPPER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUPPER"


    // $ANTLR start "ruleUPPER"
    // InternalUsex.g:3585:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:3591:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalUsex.g:3592:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalUsex.g:3592:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT) ) {
                alt66=1;
            }
            else if ( (LA66_0==54) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalUsex.g:3593:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getUPPERAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:3601:3: kw= '*'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getUPPERAccess().getAsteriskKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUPPER"


    // $ANTLR start "entryRuleLOWER"
    // InternalUsex.g:3610:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalUsex.g:3610:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalUsex.g:3611:2: iv_ruleLOWER= ruleLOWER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOWERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLOWER=ruleLOWER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOWER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLOWER"


    // $ANTLR start "ruleLOWER"
    // InternalUsex.g:3617:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUsex.g:3623:2: (this_INT_0= RULE_INT )
            // InternalUsex.g:3624:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getLOWERAccess().getINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLOWER"


    // $ANTLR start "entryRuleExpCS"
    // InternalUsex.g:3634:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalUsex.g:3634:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalUsex.g:3635:2: iv_ruleExpCS= ruleExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpCS=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpCS"


    // $ANTLR start "ruleExpCS"
    // InternalUsex.g:3641:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalUsex.g:3647:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalUsex.g:3648:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalUsex.g:3648:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // InternalUsex.g:3649:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:3649:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:3650:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalUsex.g:3661:4: ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==18||LA67_0==34||(LA67_0>=54 && LA67_0<=74)) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalUsex.g:3662:5: () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:3662:5: ()
                            // InternalUsex.g:3663:6: 
                            {
                            if ( state.backtracking==0 ) {

                              						/* */
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						current = forceCreateModelElementAndSet(
                              							grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0(),
                              							current);
                              					
                            }

                            }

                            // InternalUsex.g:3672:5: ( (lv_operator_2_0= ruleBinaryOperatorName ) )
                            // InternalUsex.g:3673:6: (lv_operator_2_0= ruleBinaryOperatorName )
                            {
                            // InternalUsex.g:3673:6: (lv_operator_2_0= ruleBinaryOperatorName )
                            // InternalUsex.g:3674:7: lv_operator_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOperatorBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_9);
                            lv_operator_2_0=ruleBinaryOperatorName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"operator",
                              								lv_operator_2_0,
                              								"org.xtext.uma.usex.Usex.BinaryOperatorName");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalUsex.g:3691:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalUsex.g:3692:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalUsex.g:3692:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalUsex.g:3693:7: lv_ownedRight_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedRight_3_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedRight",
                              								lv_ownedRight_3_0,
                              								"org.xtext.uma.usex.Usex.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:3713:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrefixedLetExpCS_4=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrefixedLetExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpCS"


    // $ANTLR start "entryRulePrefixedLetExpCS"
    // InternalUsex.g:3728:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalUsex.g:3728:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalUsex.g:3729:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedLetExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixedLetExpCS=rulePrefixedLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedLetExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedLetExpCS"


    // $ANTLR start "rulePrefixedLetExpCS"
    // InternalUsex.g:3735:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:3741:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalUsex.g:3742:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalUsex.g:3742:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==57||(LA69_0>=75 && LA69_0<=76)) ) {
                alt69=1;
            }
            else if ( (LA69_0==97) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalUsex.g:3743:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalUsex.g:3743:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalUsex.g:3744:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalUsex.g:3744:4: ()
                    // InternalUsex.g:3745:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedLetExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalUsex.g:3754:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalUsex.g:3755:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalUsex.g:3755:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalUsex.g:3756:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.xtext.uma.usex.Usex.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:3773:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalUsex.g:3774:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalUsex.g:3774:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalUsex.g:3775:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getOwnedRightPrefixedLetExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedLetExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.xtext.uma.usex.Usex.PrefixedLetExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:3794:3: this_LetExpCS_3= ruleLetExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getLetExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LetExpCS_3=ruleLetExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrefixedLetExpCS"


    // $ANTLR start "entryRulePrefixedPrimaryExpCS"
    // InternalUsex.g:3809:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalUsex.g:3809:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalUsex.g:3810:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefixedPrimaryExpCS=rulePrefixedPrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefixedPrimaryExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrefixedPrimaryExpCS"


    // $ANTLR start "rulePrefixedPrimaryExpCS"
    // InternalUsex.g:3816:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:3822:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalUsex.g:3823:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalUsex.g:3823:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==57||(LA70_0>=75 && LA70_0<=76)) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_INT)||(LA70_0>=28 && LA70_0<=32)||(LA70_0>=43 && LA70_0<=54)||LA70_0==86||(LA70_0>=88 && LA70_0<=92)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalUsex.g:3824:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalUsex.g:3824:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalUsex.g:3825:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalUsex.g:3825:4: ()
                    // InternalUsex.g:3826:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrefixedPrimaryExpCSAccess().getPrefixExpCSAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalUsex.g:3835:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalUsex.g:3836:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalUsex.g:3836:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalUsex.g:3837:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_36);
                    lv_name_1_0=ruleUnaryOperatorName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.xtext.uma.usex.Usex.UnaryOperatorName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:3854:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalUsex.g:3855:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalUsex.g:3855:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalUsex.g:3856:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getOwnedRightPrefixedPrimaryExpCSParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedRight_2_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrefixedPrimaryExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedRight",
                      							lv_ownedRight_2_0,
                      							"org.xtext.uma.usex.Usex.PrefixedPrimaryExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:3875:3: this_PrimaryExpCS_3= rulePrimaryExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getPrimaryExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpCS_3=rulePrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimaryExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrefixedPrimaryExpCS"


    // $ANTLR start "entryRulePrimaryExpCS"
    // InternalUsex.g:3890:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalUsex.g:3890:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalUsex.g:3891:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpCS=rulePrimaryExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpCS"


    // $ANTLR start "rulePrimaryExpCS"
    // InternalUsex.g:3897:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS ) ;
    public final EObject rulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NestedExpCS_0 = null;

        EObject this_IfExpCS_1 = null;

        EObject this_PrimitiveLiteralExpCS_2 = null;

        EObject this_TupleLiteralExpCS_3 = null;

        EObject this_MapLiteralExpCS_4 = null;

        EObject this_CollectionLiteralExpCS_5 = null;

        EObject this_LambdaLiteralExpCS_6 = null;

        EObject this_TypeLiteralExpCS_7 = null;

        EObject this_NameExpCS_8 = null;



        	enterRule();

        try {
            // InternalUsex.g:3903:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS ) )
            // InternalUsex.g:3904:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )
            {
            // InternalUsex.g:3904:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )
            int alt71=9;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // InternalUsex.g:3905:3: this_NestedExpCS_0= ruleNestedExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNestedExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NestedExpCS_0=ruleNestedExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:3917:3: this_IfExpCS_1= ruleIfExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getIfExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfExpCS_1=ruleIfExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:3929:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getPrimitiveLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveLiteralExpCS_2=rulePrimitiveLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:3941:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTupleLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:3953:3: this_MapLiteralExpCS_4= ruleMapLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getMapLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MapLiteralExpCS_4=ruleMapLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MapLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUsex.g:3965:3: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getCollectionLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUsex.g:3977:3: this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getLambdaLiteralExpCSParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LambdaLiteralExpCS_6=ruleLambdaLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LambdaLiteralExpCS_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUsex.g:3989:3: this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getTypeLiteralExpCSParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeLiteralExpCS_7=ruleTypeLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeLiteralExpCS_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUsex.g:4001:3: this_NameExpCS_8= ruleNameExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExpCSAccess().getNameExpCSParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NameExpCS_8=ruleNameExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExpCS_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimaryExpCS"


    // $ANTLR start "entryRulePrimitiveLiteralExpCS"
    // InternalUsex.g:4016:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalUsex.g:4016:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalUsex.g:4017:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveLiteralExpCS=rulePrimitiveLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimitiveLiteralExpCS"


    // $ANTLR start "rulePrimitiveLiteralExpCS"
    // InternalUsex.g:4023:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
    public final EObject rulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExpCS_0 = null;

        EObject this_StringLiteralExpCS_1 = null;

        EObject this_BooleanLiteralExpCS_2 = null;

        EObject this_UnlimitedNaturalLiteralExpCS_3 = null;

        EObject this_InvalidLiteralExpCS_4 = null;

        EObject this_NullLiteralExpCS_5 = null;



        	enterRule();

        try {
            // InternalUsex.g:4029:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalUsex.g:4030:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalUsex.g:4030:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt72=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt72=1;
                }
                break;
            case RULE_STRING:
                {
                alt72=2;
                }
                break;
            case 88:
            case 89:
                {
                alt72=3;
                }
                break;
            case 54:
                {
                alt72=4;
                }
                break;
            case 90:
                {
                alt72=5;
                }
                break;
            case 91:
                {
                alt72=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalUsex.g:4031:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNumberLiteralExpCSParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NumberLiteralExpCS_0=ruleNumberLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExpCS_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:4043:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getStringLiteralExpCSParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_StringLiteralExpCS_1=ruleStringLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExpCS_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:4055:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getBooleanLiteralExpCSParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteralExpCS_2=ruleBooleanLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExpCS_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:4067:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UnlimitedNaturalLiteralExpCS_3=ruleUnlimitedNaturalLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UnlimitedNaturalLiteralExpCS_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:4079:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getInvalidLiteralExpCSParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvalidLiteralExpCS_4=ruleInvalidLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExpCS_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUsex.g:4091:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpCSAccess().getNullLiteralExpCSParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NullLiteralExpCS_5=ruleNullLiteralExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExpCS_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimitiveLiteralExpCS"


    // $ANTLR start "entryRuleNameExpCS"
    // InternalUsex.g:4106:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalUsex.g:4106:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalUsex.g:4107:2: iv_ruleNameExpCS= ruleNameExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameExpCS=ruleNameExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNameExpCS"


    // $ANTLR start "ruleNameExpCS"
    // InternalUsex.g:4113:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? ) ;
    public final EObject ruleNameExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_isPre_4_0=null;
        Token lv_pre_5_0=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedSquareBracketedClauses_1_0 = null;

        EObject lv_ownedRoundBracketedClause_2_0 = null;

        EObject lv_ownedCurlyBracketedClause_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4119:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? ) )
            // InternalUsex.g:4120:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? )
            {
            // InternalUsex.g:4120:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? )
            // InternalUsex.g:4121:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )?
            {
            // InternalUsex.g:4121:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalUsex.g:4122:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalUsex.g:4122:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalUsex.g:4123:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_57);
            lv_ownedPathName_0_0=rulePathNameCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
              					}
              					set(
              						current,
              						"ownedPathName",
              						lv_ownedPathName_0_0,
              						"org.xtext.uma.usex.Usex.PathNameCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:4140:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==79) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalUsex.g:4141:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalUsex.g:4141:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalUsex.g:4142:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_ownedSquareBracketedClauses_1_0=ruleSquareBracketedClauseCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedSquareBracketedClauses",
            	      						lv_ownedSquareBracketedClauses_1_0,
            	      						"org.xtext.uma.usex.Usex.SquareBracketedClauseCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            // InternalUsex.g:4159:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==32) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalUsex.g:4160:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalUsex.g:4160:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalUsex.g:4161:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_58);
                    lv_ownedRoundBracketedClause_2_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_2_0,
                      						"org.xtext.uma.usex.Usex.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUsex.g:4178:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==23) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUsex.g:4179:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalUsex.g:4179:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalUsex.g:4180:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_59);
                    lv_ownedCurlyBracketedClause_3_0=ruleCurlyBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getNameExpCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedCurlyBracketedClause",
                      						lv_ownedCurlyBracketedClause_3_0,
                      						"org.xtext.uma.usex.Usex.CurlyBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUsex.g:4197:3: ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==85) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalUsex.g:4198:4: ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) )
                    {
                    // InternalUsex.g:4198:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalUsex.g:4199:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalUsex.g:4199:5: (lv_isPre_4_0= '@' )
                    // InternalUsex.g:4200:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,85,FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isPre_4_0, grammarAccess.getNameExpCSAccess().getIsPreCommercialAtKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "isPre", lv_isPre_4_0 != null, "@");
                      					
                    }

                    }


                    }

                    // InternalUsex.g:4212:4: ( (lv_pre_5_0= 'pre' ) )
                    // InternalUsex.g:4213:5: (lv_pre_5_0= 'pre' )
                    {
                    // InternalUsex.g:4213:5: (lv_pre_5_0= 'pre' )
                    // InternalUsex.g:4214:6: lv_pre_5_0= 'pre'
                    {
                    lv_pre_5_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_pre_5_0, grammarAccess.getNameExpCSAccess().getPrePreKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNameExpCSRule());
                      						}
                      						setWithLastConsumed(current, "pre", lv_pre_5_0 != null, "pre");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameExpCS"


    // $ANTLR start "entryRuleSquareBracketedClauseCS"
    // InternalUsex.g:4231:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalUsex.g:4231:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalUsex.g:4232:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketedClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSquareBracketedClauseCS=ruleSquareBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketedClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSquareBracketedClauseCS"


    // $ANTLR start "ruleSquareBracketedClauseCS"
    // InternalUsex.g:4238:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4244:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalUsex.g:4245:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalUsex.g:4245:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalUsex.g:4246:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalUsex.g:4250:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalUsex.g:4251:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalUsex.g:4251:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalUsex.g:4252:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_ownedTerms_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
              					}
              					add(
              						current,
              						"ownedTerms",
              						lv_ownedTerms_1_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:4269:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==25) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalUsex.g:4270:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUsex.g:4274:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalUsex.g:4275:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalUsex.g:4275:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalUsex.g:4276:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_ownedTerms_3_0=ruleExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSquareBracketedClauseCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedTerms",
            	      							lv_ownedTerms_3_0,
            	      							"org.xtext.uma.usex.Usex.ExpCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_4=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSquareBracketedClauseCSAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSquareBracketedClauseCS"


    // $ANTLR start "entryRuleCollectionLiteralExpCS"
    // InternalUsex.g:4302:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalUsex.g:4302:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalUsex.g:4303:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralExpCS=ruleCollectionLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralExpCS"


    // $ANTLR start "ruleCollectionLiteralExpCS"
    // InternalUsex.g:4309:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4315:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUsex.g:4316:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUsex.g:4316:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUsex.g:4317:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUsex.g:4317:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalUsex.g:4318:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalUsex.g:4318:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalUsex.g:4319:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_ownedType_0_0=ruleCollectionTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.xtext.uma.usex.Usex.CollectionTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4340:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_INT)||LA79_0==15||(LA79_0>=28 && LA79_0<=32)||(LA79_0>=43 && LA79_0<=54)||LA79_0==57||(LA79_0>=75 && LA79_0<=76)||LA79_0==86||(LA79_0>=88 && LA79_0<=92)||LA79_0==97) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalUsex.g:4341:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalUsex.g:4341:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalUsex.g:4342:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalUsex.g:4342:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalUsex.g:4343:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_ownedParts_2_0=ruleCollectionLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.xtext.uma.usex.Usex.CollectionLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:4360:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==25) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalUsex.g:4361:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_48); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:4365:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalUsex.g:4366:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalUsex.g:4366:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalUsex.g:4367:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_ownedParts_4_0=ruleCollectionLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.xtext.uma.usex.Usex.CollectionLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getCollectionLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionLiteralExpCS"


    // $ANTLR start "entryRuleCollectionLiteralPartCS"
    // InternalUsex.g:4394:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalUsex.g:4394:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalUsex.g:4395:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCollectionLiteralPartCS=ruleCollectionLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollectionLiteralPartCS"


    // $ANTLR start "ruleCollectionLiteralPartCS"
    // InternalUsex.g:4401:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4407:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalUsex.g:4408:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalUsex.g:4408:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt81=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 57:
            case 75:
            case 76:
            case 86:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 97:
                {
                alt81=1;
                }
                break;
            case RULE_ID:
                {
                int LA81_2 = input.LA(2);

                if ( (LA81_2==15) ) {
                    alt81=2;
                }
                else if ( (LA81_2==EOF||LA81_2==18||(LA81_2>=23 && LA81_2<=25)||LA81_2==32||LA81_2==34||(LA81_2>=54 && LA81_2<=74)||(LA81_2>=78 && LA81_2<=79)||(LA81_2>=84 && LA81_2<=85)) ) {
                    alt81=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt81=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalUsex.g:4409:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:4409:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:4410:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:4410:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalUsex.g:4411:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalUsex.g:4411:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalUsex.g:4412:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_ownedExpression_0_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedExpression",
                      							lv_ownedExpression_0_0,
                      							"org.xtext.uma.usex.Usex.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:4429:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==78) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalUsex.g:4430:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,78,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalUsex.g:4434:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalUsex.g:4435:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalUsex.g:4435:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalUsex.g:4436:7: lv_ownedLastExpression_2_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedLastExpressionExpCSParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedLastExpression_2_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedLastExpression",
                              								lv_ownedLastExpression_2_0,
                              								"org.xtext.uma.usex.Usex.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:4456:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalUsex.g:4456:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalUsex.g:4457:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalUsex.g:4457:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalUsex.g:4458:5: lv_ownedExpression_3_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionPatternExpCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedExpression_3_0=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedExpression",
                      						lv_ownedExpression_3_0,
                      						"org.xtext.uma.usex.Usex.PatternExpCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCollectionLiteralPartCS"


    // $ANTLR start "entryRuleLambdaLiteralExpCS"
    // InternalUsex.g:4479:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalUsex.g:4479:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalUsex.g:4480:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLambdaLiteralExpCS=ruleLambdaLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambdaLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLambdaLiteralExpCS"


    // $ANTLR start "ruleLambdaLiteralExpCS"
    // InternalUsex.g:4486:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4492:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalUsex.g:4493:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalUsex.g:4493:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalUsex.g:4494:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4502:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalUsex.g:4503:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalUsex.g:4503:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalUsex.g:4504:5: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_42);
            lv_ownedExpressionCS_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLambdaLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpressionCS",
              						lv_ownedExpressionCS_2_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLambdaLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLambdaLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralExpCS"
    // InternalUsex.g:4529:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalUsex.g:4529:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalUsex.g:4530:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteralExpCS=ruleMapLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralExpCS"


    // $ANTLR start "ruleMapLiteralExpCS"
    // InternalUsex.g:4536:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedType_0_0 = null;

        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4542:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUsex.g:4543:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUsex.g:4543:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUsex.g:4544:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUsex.g:4544:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalUsex.g:4545:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalUsex.g:4545:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalUsex.g:4546:5: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_ownedType_0_0=ruleMapTypeCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
              					}
              					set(
              						current,
              						"ownedType",
              						lv_ownedType_0_0,
              						"org.xtext.uma.usex.Usex.MapTypeCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4567:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_ID && LA83_0<=RULE_INT)||(LA83_0>=28 && LA83_0<=32)||(LA83_0>=43 && LA83_0<=54)||LA83_0==57||(LA83_0>=75 && LA83_0<=76)||LA83_0==86||(LA83_0>=88 && LA83_0<=92)||LA83_0==97) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalUsex.g:4568:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalUsex.g:4568:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalUsex.g:4569:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalUsex.g:4569:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalUsex.g:4570:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
                    lv_ownedParts_2_0=ruleMapLiteralPartCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedParts",
                      							lv_ownedParts_2_0,
                      							"org.xtext.uma.usex.Usex.MapLiteralPartCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:4587:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==25) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalUsex.g:4588:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:4592:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalUsex.g:4593:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalUsex.g:4593:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalUsex.g:4594:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_ownedParts_4_0=ruleMapLiteralPartCS();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMapLiteralExpCSRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"ownedParts",
                    	      								lv_ownedParts_4_0,
                    	      								"org.xtext.uma.usex.Usex.MapLiteralPartCS");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMapLiteralExpCSAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapLiteralExpCS"


    // $ANTLR start "entryRuleMapLiteralPartCS"
    // InternalUsex.g:4621:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalUsex.g:4621:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalUsex.g:4622:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMapLiteralPartCS=ruleMapLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMapLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMapLiteralPartCS"


    // $ANTLR start "ruleMapLiteralPartCS"
    // InternalUsex.g:4628:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4634:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4635:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4635:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalUsex.g:4636:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalUsex.g:4636:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalUsex.g:4637:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalUsex.g:4637:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalUsex.g:4638:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_64);
            lv_ownedKey_0_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedKey",
              						lv_ownedKey_0_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,87,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalUsex.g:4659:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalUsex.g:4660:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalUsex.g:4660:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalUsex.g:4661:5: lv_ownedValue_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedValueExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedValue_2_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMapLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedValue",
              						lv_ownedValue_2_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMapLiteralPartCS"


    // $ANTLR start "entryRuleTupleLiteralExpCS"
    // InternalUsex.g:4682:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalUsex.g:4682:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalUsex.g:4683:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralExpCS=ruleTupleLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralExpCS"


    // $ANTLR start "ruleTupleLiteralExpCS"
    // InternalUsex.g:4689:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4695:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalUsex.g:4696:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalUsex.g:4696:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalUsex.g:4697:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4705:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalUsex.g:4706:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalUsex.g:4706:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalUsex.g:4707:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_ownedParts_2_0=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
              					}
              					add(
              						current,
              						"ownedParts",
              						lv_ownedParts_2_0,
              						"org.xtext.uma.usex.Usex.TupleLiteralPartCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:4724:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==25) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalUsex.g:4725:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUsex.g:4729:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalUsex.g:4730:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalUsex.g:4730:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalUsex.g:4731:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_ownedParts_4_0=ruleTupleLiteralPartCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedParts",
            	      							lv_ownedParts_4_0,
            	      							"org.xtext.uma.usex.Usex.TupleLiteralPartCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleLiteralExpCSAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleLiteralExpCS"


    // $ANTLR start "entryRuleTupleLiteralPartCS"
    // InternalUsex.g:4757:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalUsex.g:4757:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalUsex.g:4758:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleLiteralPartCS=ruleTupleLiteralPartCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPartCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTupleLiteralPartCS"


    // $ANTLR start "ruleTupleLiteralPartCS"
    // InternalUsex.g:4764:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4770:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4771:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4771:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalUsex.g:4772:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalUsex.g:4772:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:4773:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:4773:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:4774:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.uma.usex.Usex.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:4791:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==15) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalUsex.g:4792:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:4796:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalUsex.g:4797:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:4797:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalUsex.g:4798:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUsex.g:4820:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalUsex.g:4821:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalUsex.g:4821:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalUsex.g:4822:5: lv_ownedInitExpression_4_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedInitExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedInitExpression_4_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_4_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTupleLiteralPartCS"


    // $ANTLR start "entryRuleNumberLiteralExpCS"
    // InternalUsex.g:4843:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalUsex.g:4843:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalUsex.g:4844:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteralExpCS=ruleNumberLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteralExpCS"


    // $ANTLR start "ruleNumberLiteralExpCS"
    // InternalUsex.g:4850:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:4856:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalUsex.g:4857:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalUsex.g:4857:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalUsex.g:4858:3: (lv_value_0_0= RULE_INT )
            {
            // InternalUsex.g:4858:3: (lv_value_0_0= RULE_INT )
            // InternalUsex.g:4859:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralExpCSAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNumberLiteralExpCSRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumberLiteralExpCS"


    // $ANTLR start "entryRuleBooleanLiteralExpCS"
    // InternalUsex.g:4878:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalUsex.g:4878:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalUsex.g:4879:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteralExpCS=ruleBooleanLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteralExpCS"


    // $ANTLR start "ruleBooleanLiteralExpCS"
    // InternalUsex.g:4885:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalUsex.g:4891:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalUsex.g:4892:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalUsex.g:4892:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==88) ) {
                alt86=1;
            }
            else if ( (LA86_0==89) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalUsex.g:4893:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalUsex.g:4893:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalUsex.g:4894:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalUsex.g:4894:4: (lv_symbol_0_0= 'true' )
                    // InternalUsex.g:4895:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_0_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolTrueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_0_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:4908:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalUsex.g:4908:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalUsex.g:4909:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalUsex.g:4909:4: (lv_symbol_1_0= 'false' )
                    // InternalUsex.g:4910:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_symbol_1_0, grammarAccess.getBooleanLiteralExpCSAccess().getSymbolFalseKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBooleanLiteralExpCSRule());
                      					}
                      					setWithLastConsumed(current, "symbol", lv_symbol_1_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBooleanLiteralExpCS"


    // $ANTLR start "entryRuleUnlimitedNaturalLiteralExpCS"
    // InternalUsex.g:4926:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalUsex.g:4926:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalUsex.g:4927:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedNaturalLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnlimitedNaturalLiteralExpCS=ruleUnlimitedNaturalLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedNaturalLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "ruleUnlimitedNaturalLiteralExpCS"
    // InternalUsex.g:4933:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:4939:2: ( ( () otherlv_1= '*' ) )
            // InternalUsex.g:4940:2: ( () otherlv_1= '*' )
            {
            // InternalUsex.g:4940:2: ( () otherlv_1= '*' )
            // InternalUsex.g:4941:3: () otherlv_1= '*'
            {
            // InternalUsex.g:4941:3: ()
            // InternalUsex.g:4942:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getUnlimitedNaturalLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnlimitedNaturalLiteralExpCS"


    // $ANTLR start "entryRuleInvalidLiteralExpCS"
    // InternalUsex.g:4959:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalUsex.g:4959:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalUsex.g:4960:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvalidLiteralExpCS=ruleInvalidLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvalidLiteralExpCS"


    // $ANTLR start "ruleInvalidLiteralExpCS"
    // InternalUsex.g:4966:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:4972:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalUsex.g:4973:2: ( () otherlv_1= 'invalid' )
            {
            // InternalUsex.g:4973:2: ( () otherlv_1= 'invalid' )
            // InternalUsex.g:4974:3: () otherlv_1= 'invalid'
            {
            // InternalUsex.g:4974:3: ()
            // InternalUsex.g:4975:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInvalidLiteralExpCSAccess().getInvalidLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpCSAccess().getInvalidKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInvalidLiteralExpCS"


    // $ANTLR start "entryRuleNullLiteralExpCS"
    // InternalUsex.g:4992:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalUsex.g:4992:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalUsex.g:4993:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNullLiteralExpCS=ruleNullLiteralExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteralExpCS"


    // $ANTLR start "ruleNullLiteralExpCS"
    // InternalUsex.g:4999:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:5005:2: ( ( () otherlv_1= 'null' ) )
            // InternalUsex.g:5006:2: ( () otherlv_1= 'null' )
            {
            // InternalUsex.g:5006:2: ( () otherlv_1= 'null' )
            // InternalUsex.g:5007:3: () otherlv_1= 'null'
            {
            // InternalUsex.g:5007:3: ()
            // InternalUsex.g:5008:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullLiteralExpCSAccess().getNullLiteralExpCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpCSAccess().getNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNullLiteralExpCS"


    // $ANTLR start "entryRuleNestedExpCS"
    // InternalUsex.g:5025:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalUsex.g:5025:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalUsex.g:5026:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNestedExpCS=ruleNestedExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNestedExpCS"


    // $ANTLR start "ruleNestedExpCS"
    // InternalUsex.g:5032:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5038:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalUsex.g:5039:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalUsex.g:5039:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalUsex.g:5040:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUsex.g:5044:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalUsex.g:5045:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalUsex.g:5045:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalUsex.g:5046:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_ownedExpression_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpCSRule());
              					}
              					set(
              						current,
              						"ownedExpression",
              						lv_ownedExpression_1_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getNestedExpCSAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNestedExpCS"


    // $ANTLR start "entryRuleIfExpCS"
    // InternalUsex.g:5071:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalUsex.g:5071:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalUsex.g:5072:2: iv_ruleIfExpCS= ruleIfExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfExpCS=ruleIfExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfExpCS"


    // $ANTLR start "ruleIfExpCS"
    // InternalUsex.g:5078:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
    public final EObject ruleIfExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedCondition_1_1 = null;

        EObject lv_ownedCondition_1_2 = null;

        EObject lv_ownedThenExpression_3_0 = null;

        EObject lv_ownedIfThenExpressions_4_0 = null;

        EObject lv_ownedElseExpression_6_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5084:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalUsex.g:5085:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalUsex.g:5085:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalUsex.g:5086:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalUsex.g:5090:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalUsex.g:5091:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalUsex.g:5091:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalUsex.g:5092:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalUsex.g:5092:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt87=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 57:
            case 75:
            case 76:
            case 86:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 97:
                {
                alt87=1;
                }
                break;
            case RULE_ID:
                {
                int LA87_2 = input.LA(2);

                if ( (LA87_2==15) ) {
                    alt87=2;
                }
                else if ( (LA87_2==18||LA87_2==23||LA87_2==32||LA87_2==34||(LA87_2>=54 && LA87_2<=74)||LA87_2==79||(LA87_2>=84 && LA87_2<=85)||LA87_2==93) ) {
                    alt87=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt87=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalUsex.g:5093:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
                    lv_ownedCondition_1_1=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_1,
                      							"org.xtext.uma.usex.Usex.ExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:5109:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_66);
                    lv_ownedCondition_1_2=rulePatternExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfExpCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedCondition",
                      							lv_ownedCondition_1_2,
                      							"org.xtext.uma.usex.Usex.PatternExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,93,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalUsex.g:5131:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalUsex.g:5132:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalUsex.g:5132:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalUsex.g:5133:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_67);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:5150:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==96) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalUsex.g:5151:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalUsex.g:5151:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalUsex.g:5152:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_67);
            	    lv_ownedIfThenExpressions_4_0=ruleElseIfThenExpCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ownedIfThenExpressions",
            	      						lv_ownedIfThenExpressions_4_0,
            	      						"org.xtext.uma.usex.Usex.ElseIfThenExpCS");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_5=(Token)match(input,94,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalUsex.g:5173:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalUsex.g:5174:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalUsex.g:5174:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalUsex.g:5175:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_68);
            lv_ownedElseExpression_6_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpCSRule());
              					}
              					set(
              						current,
              						"ownedElseExpression",
              						lv_ownedElseExpression_6_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getIfExpCSAccess().getEndifKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIfExpCS"


    // $ANTLR start "entryRuleElseIfThenExpCS"
    // InternalUsex.g:5200:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalUsex.g:5200:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalUsex.g:5201:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElseIfThenExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleElseIfThenExpCS=ruleElseIfThenExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElseIfThenExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleElseIfThenExpCS"


    // $ANTLR start "ruleElseIfThenExpCS"
    // InternalUsex.g:5207:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5213:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:5214:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:5214:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalUsex.g:5215:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,96,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalUsex.g:5219:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalUsex.g:5220:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalUsex.g:5220:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalUsex.g:5221:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_66);
            lv_ownedCondition_1_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedCondition",
              						lv_ownedCondition_1_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,93,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalUsex.g:5242:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalUsex.g:5243:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalUsex.g:5243:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalUsex.g:5244:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedThenExpression_3_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getElseIfThenExpCSRule());
              					}
              					set(
              						current,
              						"ownedThenExpression",
              						lv_ownedThenExpression_3_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElseIfThenExpCS"


    // $ANTLR start "entryRuleLetExpCS"
    // InternalUsex.g:5265:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalUsex.g:5265:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalUsex.g:5266:2: iv_ruleLetExpCS= ruleLetExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetExpCS=ruleLetExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetExpCS"


    // $ANTLR start "ruleLetExpCS"
    // InternalUsex.g:5272:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedVariables_1_0 = null;

        EObject lv_ownedVariables_3_0 = null;

        EObject lv_ownedInExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5278:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalUsex.g:5279:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:5279:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalUsex.g:5280:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalUsex.g:5284:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalUsex.g:5285:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalUsex.g:5285:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalUsex.g:5286:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_69);
            lv_ownedVariables_1_0=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					add(
              						current,
              						"ownedVariables",
              						lv_ownedVariables_1_0,
              						"org.xtext.uma.usex.Usex.LetVariableCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:5303:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==25) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalUsex.g:5304:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUsex.g:5308:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalUsex.g:5309:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalUsex.g:5309:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalUsex.g:5310:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_69);
            	    lv_ownedVariables_3_0=ruleLetVariableCS();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpCSRule());
            	      						}
            	      						add(
            	      							current,
            	      							"ownedVariables",
            	      							lv_ownedVariables_3_0,
            	      							"org.xtext.uma.usex.Usex.LetVariableCS");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,98,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalUsex.g:5332:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalUsex.g:5333:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalUsex.g:5333:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalUsex.g:5334:5: lv_ownedInExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedInExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedInExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpCSRule());
              					}
              					set(
              						current,
              						"ownedInExpression",
              						lv_ownedInExpression_5_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetExpCS"


    // $ANTLR start "entryRuleLetVariableCS"
    // InternalUsex.g:5355:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalUsex.g:5355:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalUsex.g:5356:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLetVariableCS=ruleLetVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariableCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLetVariableCS"


    // $ANTLR start "ruleLetVariableCS"
    // InternalUsex.g:5362:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
    public final EObject ruleLetVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedRoundBracketedClause_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5368:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalUsex.g:5369:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:5369:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalUsex.g:5370:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalUsex.g:5370:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:5371:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:5371:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:5372:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.uma.usex.Usex.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:5389:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==32) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalUsex.g:5390:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalUsex.g:5390:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalUsex.g:5391:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_65);
                    lv_ownedRoundBracketedClause_1_0=ruleRoundBracketedClauseCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      					}
                      					set(
                      						current,
                      						"ownedRoundBracketedClause",
                      						lv_ownedRoundBracketedClause_1_0,
                      						"org.xtext.uma.usex.Usex.RoundBracketedClauseCS");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUsex.g:5408:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==15) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalUsex.g:5409:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalUsex.g:5413:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5414:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5414:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUsex.g:5415:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalUsex.g:5437:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalUsex.g:5438:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalUsex.g:5438:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalUsex.g:5439:5: lv_ownedInitExpression_5_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedInitExpressionExpCSParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_ownedInitExpression_5_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableCSRule());
              					}
              					set(
              						current,
              						"ownedInitExpression",
              						lv_ownedInitExpression_5_0,
              						"org.xtext.uma.usex.Usex.ExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLetVariableCS"


    // $ANTLR start "entryRuleRoundBracketedClauseCS"
    // InternalUsex.g:5460:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalUsex.g:5460:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalUsex.g:5461:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketedClauseCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoundBracketedClauseCS=ruleRoundBracketedClauseCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketedClauseCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRoundBracketedClauseCS"


    // $ANTLR start "ruleRoundBracketedClauseCS"
    // InternalUsex.g:5467:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_ownedArguments_2_0 = null;

        EObject lv_ownedArguments_3_1 = null;

        EObject lv_ownedArguments_3_2 = null;

        EObject lv_ownedArguments_3_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:5473:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalUsex.g:5474:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalUsex.g:5474:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalUsex.g:5475:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalUsex.g:5475:3: ()
            // InternalUsex.g:5476:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRoundBracketedClauseCSAccess().getRoundBracketedClauseCSAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:5489:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( ((LA94_0>=RULE_ID && LA94_0<=RULE_INT)||LA94_0==15||(LA94_0>=28 && LA94_0<=32)||(LA94_0>=43 && LA94_0<=54)||LA94_0==57||(LA94_0>=75 && LA94_0<=76)||LA94_0==86||(LA94_0>=88 && LA94_0<=92)||LA94_0==97) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalUsex.g:5490:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalUsex.g:5490:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalUsex.g:5491:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalUsex.g:5491:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalUsex.g:5492:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_ownedArguments_2_0=ruleNavigatingArgCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                      						}
                      						add(
                      							current,
                      							"ownedArguments",
                      							lv_ownedArguments_2_0,
                      							"org.xtext.uma.usex.Usex.NavigatingArgCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:5509:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==25||(LA93_0>=99 && LA93_0<=100)) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalUsex.g:5510:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalUsex.g:5510:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalUsex.g:5511:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalUsex.g:5511:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt92=3;
                    	    switch ( input.LA(1) ) {
                    	    case 25:
                    	        {
                    	        alt92=1;
                    	        }
                    	        break;
                    	    case 100:
                    	        {
                    	        alt92=2;
                    	        }
                    	        break;
                    	    case 99:
                    	        {
                    	        alt92=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 92, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt92) {
                    	        case 1 :
                    	            // InternalUsex.g:5512:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_72);
                    	            lv_ownedArguments_3_1=ruleNavigatingCommaArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_1,
                    	              								"org.xtext.uma.usex.Usex.NavigatingCommaArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalUsex.g:5528:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_72);
                    	            lv_ownedArguments_3_2=ruleNavigatingSemiArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_2,
                    	              								"org.xtext.uma.usex.Usex.NavigatingSemiArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalUsex.g:5544:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_72);
                    	            lv_ownedArguments_3_3=ruleNavigatingBarArgCS();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              							if (current==null) {
                    	              								current = createModelElementForParent(grammarAccess.getRoundBracketedClauseCSRule());
                    	              							}
                    	              							add(
                    	              								current,
                    	              								"ownedArguments",
                    	              								lv_ownedArguments_3_3,
                    	              								"org.xtext.uma.usex.Usex.NavigatingBarArgCS");
                    	              							afterParserOrEnumRuleCall();
                    	              						
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRoundBracketedClauseCSAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRoundBracketedClauseCS"


    // $ANTLR start "entryRuleNavigatingBarArgCS"
    // InternalUsex.g:5571:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalUsex.g:5571:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalUsex.g:5572:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingBarArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingBarArgCS=ruleNavigatingBarArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingBarArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingBarArgCS"


    // $ANTLR start "ruleNavigatingBarArgCS"
    // InternalUsex.g:5578:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_symbolT_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5584:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalUsex.g:5585:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalUsex.g:5585:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalUsex.g:5586:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalUsex.g:5586:3: ( (lv_prefix_0_0= '|' ) )
            // InternalUsex.g:5587:4: (lv_prefix_0_0= '|' )
            {
            // InternalUsex.g:5587:4: (lv_prefix_0_0= '|' )
            // InternalUsex.g:5588:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,99,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingBarArgCSAccess().getPrefixVerticalLineKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, "|");
              				
            }

            }


            }

            // InternalUsex.g:5600:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUsex.g:5601:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUsex.g:5601:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUsex.g:5602:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_73);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.xtext.uma.usex.Usex.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:5619:3: ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==15) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUsex.g:5620:4: ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5620:4: ( (lv_symbolT_2_0= ':' ) )
                    // InternalUsex.g:5621:5: (lv_symbolT_2_0= ':' )
                    {
                    // InternalUsex.g:5621:5: (lv_symbolT_2_0= ':' )
                    // InternalUsex.g:5622:6: lv_symbolT_2_0= ':'
                    {
                    lv_symbolT_2_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbolT_2_0, grammarAccess.getNavigatingBarArgCSAccess().getSymbolTColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						setWithLastConsumed(current, "symbolT", lv_symbolT_2_0, ":");
                      					
                    }

                    }


                    }

                    // InternalUsex.g:5634:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5635:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5635:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUsex.g:5636:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:5653:4: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==34) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalUsex.g:5654:5: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5654:5: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUsex.g:5655:6: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUsex.g:5655:6: (lv_symbolIE_4_0= '=' )
                            // InternalUsex.g:5656:7: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_symbolIE_4_0, grammarAccess.getNavigatingBarArgCSAccess().getSymbolIEEqualsSignKeyword_2_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							setWithLastConsumed(current, "symbolIE", lv_symbolIE_4_0, "=");
                              						
                            }

                            }


                            }

                            // InternalUsex.g:5668:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUsex.g:5669:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUsex.g:5669:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUsex.g:5670:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingBarArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.xtext.uma.usex.Usex.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingBarArgCS"


    // $ANTLR start "entryRuleNavigatingCommaArgCS"
    // InternalUsex.g:5693:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalUsex.g:5693:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalUsex.g:5694:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingCommaArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingCommaArgCS=ruleNavigatingCommaArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingCommaArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingCommaArgCS"


    // $ANTLR start "ruleNavigatingCommaArgCS"
    // InternalUsex.g:5700:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
    public final EObject ruleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_symbolCI_2_0=null;
        Token lv_symbolIE_4_0=null;
        Token lv_symbolT_6_0=null;
        Token lv_symbolCI_8_0=null;
        Token lv_symbolIE_10_0=null;
        Token lv_symbolT_12_0=null;
        Token lv_symbolCI_14_0=null;
        Token lv_symbolIE_16_0=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;

        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;

        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:5706:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalUsex.g:5707:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalUsex.g:5707:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalUsex.g:5708:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalUsex.g:5708:3: ( (lv_prefix_0_0= ',' ) )
            // InternalUsex.g:5709:4: (lv_prefix_0_0= ',' )
            {
            // InternalUsex.g:5709:4: (lv_prefix_0_0= ',' )
            // InternalUsex.g:5710:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingCommaArgCSAccess().getPrefixCommaKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ",");
              				
            }

            }


            }

            // InternalUsex.g:5722:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUsex.g:5723:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUsex.g:5723:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUsex.g:5724:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_75);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.xtext.uma.usex.Usex.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:5741:3: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt102=4;
            alt102 = dfa102.predict(input);
            switch (alt102) {
                case 1 :
                    // InternalUsex.g:5742:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:5742:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:5743:5: ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5743:5: ( (lv_symbolCI_2_0= '<-' ) )
                    // InternalUsex.g:5744:6: (lv_symbolCI_2_0= '<-' )
                    {
                    // InternalUsex.g:5744:6: (lv_symbolCI_2_0= '<-' )
                    // InternalUsex.g:5745:7: lv_symbolCI_2_0= '<-'
                    {
                    lv_symbolCI_2_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_symbolCI_2_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_2_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							setWithLastConsumed(current, "symbolCI", lv_symbolCI_2_0, "<-");
                      						
                    }

                    }


                    }

                    // InternalUsex.g:5757:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalUsex.g:5758:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalUsex.g:5758:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalUsex.g:5759:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_74);
                    lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedCoIterator",
                      								lv_ownedCoIterator_3_0,
                      								"org.xtext.uma.usex.Usex.CoIteratorVariableCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalUsex.g:5776:5: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==34) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // InternalUsex.g:5777:6: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5777:6: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUsex.g:5778:7: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUsex.g:5778:7: (lv_symbolIE_4_0= '=' )
                            // InternalUsex.g:5779:8: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolIE_4_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolIEEqualsSignKeyword_2_0_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolIE", lv_symbolIE_4_0, "=");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:5791:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUsex.g:5792:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUsex.g:5792:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUsex.g:5793:8: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_5_0,
                              									"org.xtext.uma.usex.Usex.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:5813:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:5813:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:5814:5: ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5814:5: ( (lv_symbolT_6_0= ':' ) )
                    // InternalUsex.g:5815:6: (lv_symbolT_6_0= ':' )
                    {
                    // InternalUsex.g:5815:6: (lv_symbolT_6_0= ':' )
                    // InternalUsex.g:5816:7: lv_symbolT_6_0= ':'
                    {
                    lv_symbolT_6_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_symbolT_6_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolTColonKeyword_2_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							setWithLastConsumed(current, "symbolT", lv_symbolT_6_0, ":");
                      						
                    }

                    }


                    }

                    // InternalUsex.g:5828:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5829:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5829:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalUsex.g:5830:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_76);
                    lv_ownedType_7_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedType",
                      								lv_ownedType_7_0,
                      								"org.xtext.uma.usex.Usex.TypeExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalUsex.g:5847:5: ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==87) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalUsex.g:5848:6: ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            // InternalUsex.g:5848:6: ( (lv_symbolCI_8_0= '<-' ) )
                            // InternalUsex.g:5849:7: (lv_symbolCI_8_0= '<-' )
                            {
                            // InternalUsex.g:5849:7: (lv_symbolCI_8_0= '<-' )
                            // InternalUsex.g:5850:8: lv_symbolCI_8_0= '<-'
                            {
                            lv_symbolCI_8_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolCI_8_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_2_1_2_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolCI", lv_symbolCI_8_0, "<-");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:5862:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalUsex.g:5863:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUsex.g:5863:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalUsex.g:5864:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_74);
                            lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_9_0,
                              									"org.xtext.uma.usex.Usex.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalUsex.g:5882:5: ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==34) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // InternalUsex.g:5883:6: ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5883:6: ( (lv_symbolIE_10_0= '=' ) )
                            // InternalUsex.g:5884:7: (lv_symbolIE_10_0= '=' )
                            {
                            // InternalUsex.g:5884:7: (lv_symbolIE_10_0= '=' )
                            // InternalUsex.g:5885:8: lv_symbolIE_10_0= '='
                            {
                            lv_symbolIE_10_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolIE_10_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolIEEqualsSignKeyword_2_1_3_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolIE", lv_symbolIE_10_0, "=");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:5897:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalUsex.g:5898:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalUsex.g:5898:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalUsex.g:5899:8: lv_ownedInitExpression_11_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_11_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_11_0,
                              									"org.xtext.uma.usex.Usex.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUsex.g:5919:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalUsex.g:5919:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalUsex.g:5920:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalUsex.g:5920:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==15) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalUsex.g:5921:6: ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            // InternalUsex.g:5921:6: ( (lv_symbolT_12_0= ':' ) )
                            // InternalUsex.g:5922:7: (lv_symbolT_12_0= ':' )
                            {
                            // InternalUsex.g:5922:7: (lv_symbolT_12_0= ':' )
                            // InternalUsex.g:5923:8: lv_symbolT_12_0= ':'
                            {
                            lv_symbolT_12_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolT_12_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolTColonKeyword_2_2_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolT", lv_symbolT_12_0, ":");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:5935:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalUsex.g:5936:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalUsex.g:5936:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalUsex.g:5937:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_77);
                            lv_ownedType_13_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_13_0,
                              									"org.xtext.uma.usex.Usex.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalUsex.g:5955:5: ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==87) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // InternalUsex.g:5956:6: ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            // InternalUsex.g:5956:6: ( (lv_symbolCI_14_0= '<-' ) )
                            // InternalUsex.g:5957:7: (lv_symbolCI_14_0= '<-' )
                            {
                            // InternalUsex.g:5957:7: (lv_symbolCI_14_0= '<-' )
                            // InternalUsex.g:5958:8: lv_symbolCI_14_0= '<-'
                            {
                            lv_symbolCI_14_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolCI_14_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_2_2_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolCI", lv_symbolCI_14_0, "<-");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:5970:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalUsex.g:5971:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUsex.g:5971:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalUsex.g:5972:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_78);
                            lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_15_0,
                              									"org.xtext.uma.usex.Usex.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalUsex.g:5990:5: ( (lv_symbolIE_16_0= 'in' ) )
                    // InternalUsex.g:5991:6: (lv_symbolIE_16_0= 'in' )
                    {
                    // InternalUsex.g:5991:6: (lv_symbolIE_16_0= 'in' )
                    // InternalUsex.g:5992:7: lv_symbolIE_16_0= 'in'
                    {
                    lv_symbolIE_16_0=(Token)match(input,98,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_symbolIE_16_0, grammarAccess.getNavigatingCommaArgCSAccess().getSymbolIEInKeyword_2_2_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							setWithLastConsumed(current, "symbolIE", lv_symbolIE_16_0, "in");
                      						
                    }

                    }


                    }

                    // InternalUsex.g:6004:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalUsex.g:6005:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalUsex.g:6005:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalUsex.g:6006:7: lv_ownedInitExpression_17_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedInitExpression_17_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingCommaArgCSRule());
                      							}
                      							set(
                      								current,
                      								"ownedInitExpression",
                      								lv_ownedInitExpression_17_0,
                      								"org.xtext.uma.usex.Usex.ExpCS");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingCommaArgCS"


    // $ANTLR start "entryRuleNavigatingSemiArgCS"
    // InternalUsex.g:6029:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalUsex.g:6029:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalUsex.g:6030:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingSemiArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingSemiArgCS=ruleNavigatingSemiArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingSemiArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingSemiArgCS"


    // $ANTLR start "ruleNavigatingSemiArgCS"
    // InternalUsex.g:6036:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
    public final EObject ruleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_prefix_0_0=null;
        Token lv_symbolT_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedNameExpression_1_0 = null;

        EObject lv_ownedType_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:6042:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalUsex.g:6043:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalUsex.g:6043:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalUsex.g:6044:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalUsex.g:6044:3: ( (lv_prefix_0_0= ';' ) )
            // InternalUsex.g:6045:4: (lv_prefix_0_0= ';' )
            {
            // InternalUsex.g:6045:4: (lv_prefix_0_0= ';' )
            // InternalUsex.g:6046:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,100,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_prefix_0_0, grammarAccess.getNavigatingSemiArgCSAccess().getPrefixSemicolonKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					setWithLastConsumed(current, "prefix", lv_prefix_0_0, ";");
              				
            }

            }


            }

            // InternalUsex.g:6058:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUsex.g:6059:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUsex.g:6059:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUsex.g:6060:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_73);
            lv_ownedNameExpression_1_0=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
              					}
              					set(
              						current,
              						"ownedNameExpression",
              						lv_ownedNameExpression_1_0,
              						"org.xtext.uma.usex.Usex.NavigatingArgExpCS");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:6077:3: ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==15) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalUsex.g:6078:4: ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:6078:4: ( (lv_symbolT_2_0= ':' ) )
                    // InternalUsex.g:6079:5: (lv_symbolT_2_0= ':' )
                    {
                    // InternalUsex.g:6079:5: (lv_symbolT_2_0= ':' )
                    // InternalUsex.g:6080:6: lv_symbolT_2_0= ':'
                    {
                    lv_symbolT_2_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbolT_2_0, grammarAccess.getNavigatingSemiArgCSAccess().getSymbolTColonKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						setWithLastConsumed(current, "symbolT", lv_symbolT_2_0, ":");
                      					
                    }

                    }


                    }

                    // InternalUsex.g:6092:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUsex.g:6093:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:6093:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUsex.g:6094:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_74);
                    lv_ownedType_3_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_3_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:6111:4: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==34) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // InternalUsex.g:6112:5: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:6112:5: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUsex.g:6113:6: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUsex.g:6113:6: (lv_symbolIE_4_0= '=' )
                            // InternalUsex.g:6114:7: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_symbolIE_4_0, grammarAccess.getNavigatingSemiArgCSAccess().getSymbolIEEqualsSignKeyword_2_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							setWithLastConsumed(current, "symbolIE", lv_symbolIE_4_0, "=");
                              						
                            }

                            }


                            }

                            // InternalUsex.g:6126:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUsex.g:6127:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUsex.g:6127:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUsex.g:6128:7: lv_ownedInitExpression_5_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_5_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getNavigatingSemiArgCSRule());
                              							}
                              							set(
                              								current,
                              								"ownedInitExpression",
                              								lv_ownedInitExpression_5_0,
                              								"org.xtext.uma.usex.Usex.ExpCS");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingSemiArgCS"


    // $ANTLR start "entryRuleNavigatingArgCS"
    // InternalUsex.g:6151:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalUsex.g:6151:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalUsex.g:6152:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingArgCS=ruleNavigatingArgCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgCS"


    // $ANTLR start "ruleNavigatingArgCS"
    // InternalUsex.g:6158:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
    public final EObject ruleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbolCI_1_0=null;
        Token lv_symbolIE_3_0=null;
        Token lv_symbolT_5_0=null;
        Token lv_symbolCI_7_0=null;
        Token lv_symbolIE_9_0=null;
        Token lv_symbolT_11_0=null;
        Token lv_symbolCI_13_0=null;
        Token lv_symbolIE_15_0=null;
        Token lv_symbolT_17_0=null;
        EObject lv_ownedNameExpression_0_0 = null;

        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;

        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;

        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;

        EObject lv_ownedType_18_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:6164:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalUsex.g:6165:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalUsex.g:6165:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( ((LA111_0>=RULE_ID && LA111_0<=RULE_INT)||(LA111_0>=28 && LA111_0<=32)||(LA111_0>=43 && LA111_0<=54)||LA111_0==57||(LA111_0>=75 && LA111_0<=76)||LA111_0==86||(LA111_0>=88 && LA111_0<=92)||LA111_0==97) ) {
                alt111=1;
            }
            else if ( (LA111_0==15) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalUsex.g:6166:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalUsex.g:6166:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalUsex.g:6167:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalUsex.g:6167:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalUsex.g:6168:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalUsex.g:6168:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalUsex.g:6169:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_75);
                    lv_ownedNameExpression_0_0=ruleNavigatingArgExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedNameExpression",
                      							lv_ownedNameExpression_0_0,
                      							"org.xtext.uma.usex.Usex.NavigatingArgExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUsex.g:6186:4: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt110=4;
                    alt110 = dfa110.predict(input);
                    switch (alt110) {
                        case 1 :
                            // InternalUsex.g:6187:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalUsex.g:6187:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalUsex.g:6188:6: ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            // InternalUsex.g:6188:6: ( (lv_symbolCI_1_0= '<-' ) )
                            // InternalUsex.g:6189:7: (lv_symbolCI_1_0= '<-' )
                            {
                            // InternalUsex.g:6189:7: (lv_symbolCI_1_0= '<-' )
                            // InternalUsex.g:6190:8: lv_symbolCI_1_0= '<-'
                            {
                            lv_symbolCI_1_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolCI_1_0, grammarAccess.getNavigatingArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_0_1_0_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolCI", lv_symbolCI_1_0, "<-");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:6202:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalUsex.g:6203:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUsex.g:6203:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalUsex.g:6204:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_74);
                            lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedCoIterator",
                              									lv_ownedCoIterator_2_0,
                              									"org.xtext.uma.usex.Usex.CoIteratorVariableCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUsex.g:6221:6: ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt105=2;
                            int LA105_0 = input.LA(1);

                            if ( (LA105_0==34) ) {
                                alt105=1;
                            }
                            switch (alt105) {
                                case 1 :
                                    // InternalUsex.g:6222:7: ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    // InternalUsex.g:6222:7: ( (lv_symbolIE_3_0= '=' ) )
                                    // InternalUsex.g:6223:8: (lv_symbolIE_3_0= '=' )
                                    {
                                    // InternalUsex.g:6223:8: (lv_symbolIE_3_0= '=' )
                                    // InternalUsex.g:6224:9: lv_symbolIE_3_0= '='
                                    {
                                    lv_symbolIE_3_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolIE_3_0, grammarAccess.getNavigatingArgCSAccess().getSymbolIEEqualsSignKeyword_0_1_0_2_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolIE", lv_symbolIE_3_0, "=");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUsex.g:6236:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalUsex.g:6237:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalUsex.g:6237:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalUsex.g:6238:9: lv_ownedInitExpression_4_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_ownedInitExpression_4_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_4_0,
                                      										"org.xtext.uma.usex.Usex.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUsex.g:6258:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalUsex.g:6258:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalUsex.g:6259:6: ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            // InternalUsex.g:6259:6: ( (lv_symbolT_5_0= ':' ) )
                            // InternalUsex.g:6260:7: (lv_symbolT_5_0= ':' )
                            {
                            // InternalUsex.g:6260:7: (lv_symbolT_5_0= ':' )
                            // InternalUsex.g:6261:8: lv_symbolT_5_0= ':'
                            {
                            lv_symbolT_5_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolT_5_0, grammarAccess.getNavigatingArgCSAccess().getSymbolTColonKeyword_0_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolT", lv_symbolT_5_0, ":");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:6273:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalUsex.g:6274:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalUsex.g:6274:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalUsex.g:6275:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_76);
                            lv_ownedType_6_0=ruleTypeExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedType",
                              									lv_ownedType_6_0,
                              									"org.xtext.uma.usex.Usex.TypeExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUsex.g:6292:6: ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt106=2;
                            int LA106_0 = input.LA(1);

                            if ( (LA106_0==87) ) {
                                alt106=1;
                            }
                            switch (alt106) {
                                case 1 :
                                    // InternalUsex.g:6293:7: ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    // InternalUsex.g:6293:7: ( (lv_symbolCI_7_0= '<-' ) )
                                    // InternalUsex.g:6294:8: (lv_symbolCI_7_0= '<-' )
                                    {
                                    // InternalUsex.g:6294:8: (lv_symbolCI_7_0= '<-' )
                                    // InternalUsex.g:6295:9: lv_symbolCI_7_0= '<-'
                                    {
                                    lv_symbolCI_7_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolCI_7_0, grammarAccess.getNavigatingArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_0_1_1_2_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolCI", lv_symbolCI_7_0, "<-");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUsex.g:6307:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalUsex.g:6308:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalUsex.g:6308:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalUsex.g:6309:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_74);
                                    lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_8_0,
                                      										"org.xtext.uma.usex.Usex.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalUsex.g:6327:6: ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==34) ) {
                                alt107=1;
                            }
                            switch (alt107) {
                                case 1 :
                                    // InternalUsex.g:6328:7: ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    // InternalUsex.g:6328:7: ( (lv_symbolIE_9_0= '=' ) )
                                    // InternalUsex.g:6329:8: (lv_symbolIE_9_0= '=' )
                                    {
                                    // InternalUsex.g:6329:8: (lv_symbolIE_9_0= '=' )
                                    // InternalUsex.g:6330:9: lv_symbolIE_9_0= '='
                                    {
                                    lv_symbolIE_9_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolIE_9_0, grammarAccess.getNavigatingArgCSAccess().getSymbolIEEqualsSignKeyword_0_1_1_3_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolIE", lv_symbolIE_9_0, "=");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUsex.g:6342:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalUsex.g:6343:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalUsex.g:6343:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalUsex.g:6344:9: lv_ownedInitExpression_10_0= ruleExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_2);
                                    lv_ownedInitExpression_10_0=ruleExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedInitExpression",
                                      										lv_ownedInitExpression_10_0,
                                      										"org.xtext.uma.usex.Usex.ExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalUsex.g:6364:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalUsex.g:6364:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalUsex.g:6365:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:6365:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt108=2;
                            int LA108_0 = input.LA(1);

                            if ( (LA108_0==15) ) {
                                alt108=1;
                            }
                            switch (alt108) {
                                case 1 :
                                    // InternalUsex.g:6366:7: ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    // InternalUsex.g:6366:7: ( (lv_symbolT_11_0= ':' ) )
                                    // InternalUsex.g:6367:8: (lv_symbolT_11_0= ':' )
                                    {
                                    // InternalUsex.g:6367:8: (lv_symbolT_11_0= ':' )
                                    // InternalUsex.g:6368:9: lv_symbolT_11_0= ':'
                                    {
                                    lv_symbolT_11_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolT_11_0, grammarAccess.getNavigatingArgCSAccess().getSymbolTColonKeyword_0_1_2_0_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolT", lv_symbolT_11_0, ":");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUsex.g:6380:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalUsex.g:6381:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalUsex.g:6381:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalUsex.g:6382:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_77);
                                    lv_ownedType_12_0=ruleTypeExpCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedType",
                                      										lv_ownedType_12_0,
                                      										"org.xtext.uma.usex.Usex.TypeExpCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalUsex.g:6400:6: ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt109=2;
                            int LA109_0 = input.LA(1);

                            if ( (LA109_0==87) ) {
                                alt109=1;
                            }
                            switch (alt109) {
                                case 1 :
                                    // InternalUsex.g:6401:7: ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    // InternalUsex.g:6401:7: ( (lv_symbolCI_13_0= '<-' ) )
                                    // InternalUsex.g:6402:8: (lv_symbolCI_13_0= '<-' )
                                    {
                                    // InternalUsex.g:6402:8: (lv_symbolCI_13_0= '<-' )
                                    // InternalUsex.g:6403:9: lv_symbolCI_13_0= '<-'
                                    {
                                    lv_symbolCI_13_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									newLeafNode(lv_symbolCI_13_0, grammarAccess.getNavigatingArgCSAccess().getSymbolCILessThanSignHyphenMinusKeyword_0_1_2_1_0_0());
                                      								
                                    }
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									setWithLastConsumed(current, "symbolCI", lv_symbolCI_13_0, "<-");
                                      								
                                    }

                                    }


                                    }

                                    // InternalUsex.g:6415:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalUsex.g:6416:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalUsex.g:6416:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalUsex.g:6417:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_78);
                                    lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      									if (current==null) {
                                      										current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                                      									}
                                      									set(
                                      										current,
                                      										"ownedCoIterator",
                                      										lv_ownedCoIterator_14_0,
                                      										"org.xtext.uma.usex.Usex.CoIteratorVariableCS");
                                      									afterParserOrEnumRuleCall();
                                      								
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }

                            // InternalUsex.g:6435:6: ( (lv_symbolIE_15_0= 'in' ) )
                            // InternalUsex.g:6436:7: (lv_symbolIE_15_0= 'in' )
                            {
                            // InternalUsex.g:6436:7: (lv_symbolIE_15_0= 'in' )
                            // InternalUsex.g:6437:8: lv_symbolIE_15_0= 'in'
                            {
                            lv_symbolIE_15_0=(Token)match(input,98,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_symbolIE_15_0, grammarAccess.getNavigatingArgCSAccess().getSymbolIEInKeyword_0_1_2_2_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								setWithLastConsumed(current, "symbolIE", lv_symbolIE_15_0, "in");
                              							
                            }

                            }


                            }

                            // InternalUsex.g:6449:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalUsex.g:6450:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalUsex.g:6450:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalUsex.g:6451:8: lv_ownedInitExpression_16_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
                              							
                            }
                            pushFollow(FOLLOW_2);
                            lv_ownedInitExpression_16_0=ruleExpCS();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                              								}
                              								set(
                              									current,
                              									"ownedInitExpression",
                              									lv_ownedInitExpression_16_0,
                              									"org.xtext.uma.usex.Usex.ExpCS");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:6472:3: ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalUsex.g:6472:3: ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalUsex.g:6473:4: ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    // InternalUsex.g:6473:4: ( (lv_symbolT_17_0= ':' ) )
                    // InternalUsex.g:6474:5: (lv_symbolT_17_0= ':' )
                    {
                    // InternalUsex.g:6474:5: (lv_symbolT_17_0= ':' )
                    // InternalUsex.g:6475:6: lv_symbolT_17_0= ':'
                    {
                    lv_symbolT_17_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbolT_17_0, grammarAccess.getNavigatingArgCSAccess().getSymbolTColonKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						setWithLastConsumed(current, "symbolT", lv_symbolT_17_0, ":");
                      					
                    }

                    }


                    }

                    // InternalUsex.g:6487:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalUsex.g:6488:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:6488:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalUsex.g:6489:6: lv_ownedType_18_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedType_18_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getNavigatingArgCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_18_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingArgCS"


    // $ANTLR start "entryRuleNavigatingArgExpCS"
    // InternalUsex.g:6511:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalUsex.g:6511:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalUsex.g:6512:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingArgExpCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNavigatingArgExpCS=ruleNavigatingArgExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingArgExpCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNavigatingArgExpCS"


    // $ANTLR start "ruleNavigatingArgExpCS"
    // InternalUsex.g:6518:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:6524:2: (this_ExpCS_0= ruleExpCS )
            // InternalUsex.g:6525:2: this_ExpCS_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNavigatingArgExpCSAccess().getExpCSParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpCS_0=ruleExpCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpCS_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNavigatingArgExpCS"


    // $ANTLR start "entryRuleCoIteratorVariableCS"
    // InternalUsex.g:6539:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalUsex.g:6539:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalUsex.g:6540:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCoIteratorVariableCSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCoIteratorVariableCS=ruleCoIteratorVariableCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCoIteratorVariableCS; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCoIteratorVariableCS"


    // $ANTLR start "ruleCoIteratorVariableCS"
    // InternalUsex.g:6546:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:6552:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalUsex.g:6553:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalUsex.g:6553:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalUsex.g:6554:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalUsex.g:6554:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:6555:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:6555:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:6556:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_73);
            lv_name_0_0=ruleUnrestrictedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.uma.usex.Usex.UnrestrictedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUsex.g:6573:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==15) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalUsex.g:6574:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:6578:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalUsex.g:6579:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:6579:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalUsex.g:6580:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ownedType_2_0=ruleTypeExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCoIteratorVariableCSRule());
                      						}
                      						set(
                      							current,
                      							"ownedType",
                      							lv_ownedType_2_0,
                      							"org.xtext.uma.usex.Usex.TypeExpCS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCoIteratorVariableCS"

    // $ANTLR start synpred25_InternalUsex
    public final void synpred25_InternalUsex_fragment() throws RecognitionException {   
        EObject this_Query_0 = null;


        // InternalUsex.g:913:3: (this_Query_0= ruleQuery )
        // InternalUsex.g:913:3: this_Query_0= ruleQuery
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Query_0=ruleQuery();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalUsex

    // $ANTLR start synpred85_InternalUsex
    public final void synpred85_InternalUsex_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalUsex.g:2811:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalUsex.g:2811:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TypeLiteralCS_1=ruleTypeLiteralCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred85_InternalUsex

    // $ANTLR start synpred106_InternalUsex
    public final void synpred106_InternalUsex_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalUsex.g:3649:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:3649:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:3649:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalUsex.g:3650:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_56);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalUsex.g:3661:4: ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==18||LA126_0==34||(LA126_0>=54 && LA126_0<=74)) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // InternalUsex.g:3662:5: () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalUsex.g:3662:5: ()
                // InternalUsex.g:3663:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalUsex.g:3672:5: ( (lv_operator_2_0= ruleBinaryOperatorName ) )
                // InternalUsex.g:3673:6: (lv_operator_2_0= ruleBinaryOperatorName )
                {
                // InternalUsex.g:3673:6: (lv_operator_2_0= ruleBinaryOperatorName )
                // InternalUsex.g:3674:7: lv_operator_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOperatorBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_9);
                lv_operator_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalUsex.g:3691:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalUsex.g:3692:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalUsex.g:3692:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalUsex.g:3693:7: lv_ownedRight_3_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOwnedRightExpCSParserRuleCall_0_1_2_0());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_ownedRight_3_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred106_InternalUsex

    // $ANTLR start synpred112_InternalUsex
    public final void synpred112_InternalUsex_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_3 = null;


        // InternalUsex.g:3941:3: (this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS )
        // InternalUsex.g:3941:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TupleLiteralExpCS_3=ruleTupleLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalUsex

    // $ANTLR start synpred113_InternalUsex
    public final void synpred113_InternalUsex_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_4 = null;


        // InternalUsex.g:3953:3: (this_MapLiteralExpCS_4= ruleMapLiteralExpCS )
        // InternalUsex.g:3953:3: this_MapLiteralExpCS_4= ruleMapLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_MapLiteralExpCS_4=ruleMapLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_InternalUsex

    // $ANTLR start synpred114_InternalUsex
    public final void synpred114_InternalUsex_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_5 = null;


        // InternalUsex.g:3965:3: (this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS )
        // InternalUsex.g:3965:3: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_CollectionLiteralExpCS_5=ruleCollectionLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_InternalUsex

    // $ANTLR start synpred116_InternalUsex
    public final void synpred116_InternalUsex_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_7 = null;


        // InternalUsex.g:3989:3: (this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS )
        // InternalUsex.g:3989:3: this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_TypeLiteralExpCS_7=ruleTypeLiteralExpCS();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_InternalUsex

    // $ANTLR start synpred148_InternalUsex
    public final void synpred148_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolCI_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalUsex.g:5742:4: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:5742:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:5742:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalUsex.g:5743:5: ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:5743:5: ( (lv_symbolCI_2_0= '<-' ) )
        // InternalUsex.g:5744:6: (lv_symbolCI_2_0= '<-' )
        {
        // InternalUsex.g:5744:6: (lv_symbolCI_2_0= '<-' )
        // InternalUsex.g:5745:7: lv_symbolCI_2_0= '<-'
        {
        lv_symbolCI_2_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5757:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalUsex.g:5758:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalUsex.g:5758:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalUsex.g:5759:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FOLLOW_74);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:5776:5: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==34) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // InternalUsex.g:5777:6: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                // InternalUsex.g:5777:6: ( (lv_symbolIE_4_0= '=' ) )
                // InternalUsex.g:5778:7: (lv_symbolIE_4_0= '=' )
                {
                // InternalUsex.g:5778:7: (lv_symbolIE_4_0= '=' )
                // InternalUsex.g:5779:8: lv_symbolIE_4_0= '='
                {
                lv_symbolIE_4_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5791:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalUsex.g:5792:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalUsex.g:5792:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalUsex.g:5793:8: lv_ownedInitExpression_5_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_0_2_1_0());
                  							
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_5_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred148_InternalUsex

    // $ANTLR start synpred151_InternalUsex
    public final void synpred151_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_6_0=null;
        Token lv_symbolCI_8_0=null;
        Token lv_symbolIE_10_0=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalUsex.g:5813:4: ( ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:5813:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:5813:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalUsex.g:5814:5: ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:5814:5: ( (lv_symbolT_6_0= ':' ) )
        // InternalUsex.g:5815:6: (lv_symbolT_6_0= ':' )
        {
        // InternalUsex.g:5815:6: (lv_symbolT_6_0= ':' )
        // InternalUsex.g:5816:7: lv_symbolT_6_0= ':'
        {
        lv_symbolT_6_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5828:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalUsex.g:5829:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalUsex.g:5829:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalUsex.g:5830:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FOLLOW_76);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:5847:5: ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==87) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // InternalUsex.g:5848:6: ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:5848:6: ( (lv_symbolCI_8_0= '<-' ) )
                // InternalUsex.g:5849:7: (lv_symbolCI_8_0= '<-' )
                {
                // InternalUsex.g:5849:7: (lv_symbolCI_8_0= '<-' )
                // InternalUsex.g:5850:8: lv_symbolCI_8_0= '<-'
                {
                lv_symbolCI_8_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5862:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:5863:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:5863:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:5864:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_74);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5882:5: ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt136=2;
        int LA136_0 = input.LA(1);

        if ( (LA136_0==34) ) {
            alt136=1;
        }
        switch (alt136) {
            case 1 :
                // InternalUsex.g:5883:6: ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                // InternalUsex.g:5883:6: ( (lv_symbolIE_10_0= '=' ) )
                // InternalUsex.g:5884:7: (lv_symbolIE_10_0= '=' )
                {
                // InternalUsex.g:5884:7: (lv_symbolIE_10_0= '=' )
                // InternalUsex.g:5885:8: lv_symbolIE_10_0= '='
                {
                lv_symbolIE_10_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5897:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalUsex.g:5898:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalUsex.g:5898:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalUsex.g:5899:8: lv_ownedInitExpression_11_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_1_3_1_0());
                  							
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_11_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred151_InternalUsex

    // $ANTLR start synpred154_InternalUsex
    public final void synpred154_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_12_0=null;
        Token lv_symbolCI_14_0=null;
        Token lv_symbolIE_16_0=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalUsex.g:5919:4: ( ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalUsex.g:5919:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalUsex.g:5919:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalUsex.g:5920:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalUsex.g:5920:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt137=2;
        int LA137_0 = input.LA(1);

        if ( (LA137_0==15) ) {
            alt137=1;
        }
        switch (alt137) {
            case 1 :
                // InternalUsex.g:5921:6: ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                // InternalUsex.g:5921:6: ( (lv_symbolT_12_0= ':' ) )
                // InternalUsex.g:5922:7: (lv_symbolT_12_0= ':' )
                {
                // InternalUsex.g:5922:7: (lv_symbolT_12_0= ':' )
                // InternalUsex.g:5923:8: lv_symbolT_12_0= ':'
                {
                lv_symbolT_12_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5935:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalUsex.g:5936:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalUsex.g:5936:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalUsex.g:5937:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FOLLOW_77);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5955:5: ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt138=2;
        int LA138_0 = input.LA(1);

        if ( (LA138_0==87) ) {
            alt138=1;
        }
        switch (alt138) {
            case 1 :
                // InternalUsex.g:5956:6: ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:5956:6: ( (lv_symbolCI_14_0= '<-' ) )
                // InternalUsex.g:5957:7: (lv_symbolCI_14_0= '<-' )
                {
                // InternalUsex.g:5957:7: (lv_symbolCI_14_0= '<-' )
                // InternalUsex.g:5958:8: lv_symbolCI_14_0= '<-'
                {
                lv_symbolCI_14_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5970:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:5971:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:5971:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:5972:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FOLLOW_78);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5990:5: ( (lv_symbolIE_16_0= 'in' ) )
        // InternalUsex.g:5991:6: (lv_symbolIE_16_0= 'in' )
        {
        // InternalUsex.g:5991:6: (lv_symbolIE_16_0= 'in' )
        // InternalUsex.g:5992:7: lv_symbolIE_16_0= 'in'
        {
        lv_symbolIE_16_0=(Token)match(input,98,FOLLOW_9); if (state.failed) return ;

        }


        }

        // InternalUsex.g:6004:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalUsex.g:6005:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalUsex.g:6005:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalUsex.g:6006:7: lv_ownedInitExpression_17_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_2_2_3_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_ownedInitExpression_17_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred154_InternalUsex

    // $ANTLR start synpred158_InternalUsex
    public final void synpred158_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolCI_1_0=null;
        Token lv_symbolIE_3_0=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalUsex.g:6187:5: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:6187:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:6187:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalUsex.g:6188:6: ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:6188:6: ( (lv_symbolCI_1_0= '<-' ) )
        // InternalUsex.g:6189:7: (lv_symbolCI_1_0= '<-' )
        {
        // InternalUsex.g:6189:7: (lv_symbolCI_1_0= '<-' )
        // InternalUsex.g:6190:8: lv_symbolCI_1_0= '<-'
        {
        lv_symbolCI_1_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return ;

        }


        }

        // InternalUsex.g:6202:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalUsex.g:6203:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalUsex.g:6203:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalUsex.g:6204:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FOLLOW_74);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:6221:6: ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt140=2;
        int LA140_0 = input.LA(1);

        if ( (LA140_0==34) ) {
            alt140=1;
        }
        switch (alt140) {
            case 1 :
                // InternalUsex.g:6222:7: ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                // InternalUsex.g:6222:7: ( (lv_symbolIE_3_0= '=' ) )
                // InternalUsex.g:6223:8: (lv_symbolIE_3_0= '=' )
                {
                // InternalUsex.g:6223:8: (lv_symbolIE_3_0= '=' )
                // InternalUsex.g:6224:9: lv_symbolIE_3_0= '='
                {
                lv_symbolIE_3_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6236:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalUsex.g:6237:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalUsex.g:6237:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalUsex.g:6238:9: lv_ownedInitExpression_4_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_0_2_1_0());
                  								
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_4_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred158_InternalUsex

    // $ANTLR start synpred161_InternalUsex
    public final void synpred161_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_5_0=null;
        Token lv_symbolCI_7_0=null;
        Token lv_symbolIE_9_0=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalUsex.g:6258:5: ( ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:6258:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:6258:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalUsex.g:6259:6: ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:6259:6: ( (lv_symbolT_5_0= ':' ) )
        // InternalUsex.g:6260:7: (lv_symbolT_5_0= ':' )
        {
        // InternalUsex.g:6260:7: (lv_symbolT_5_0= ':' )
        // InternalUsex.g:6261:8: lv_symbolT_5_0= ':'
        {
        lv_symbolT_5_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return ;

        }


        }

        // InternalUsex.g:6273:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalUsex.g:6274:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalUsex.g:6274:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalUsex.g:6275:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FOLLOW_76);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:6292:6: ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt141=2;
        int LA141_0 = input.LA(1);

        if ( (LA141_0==87) ) {
            alt141=1;
        }
        switch (alt141) {
            case 1 :
                // InternalUsex.g:6293:7: ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:6293:7: ( (lv_symbolCI_7_0= '<-' ) )
                // InternalUsex.g:6294:8: (lv_symbolCI_7_0= '<-' )
                {
                // InternalUsex.g:6294:8: (lv_symbolCI_7_0= '<-' )
                // InternalUsex.g:6295:9: lv_symbolCI_7_0= '<-'
                {
                lv_symbolCI_7_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6307:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:6308:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:6308:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:6309:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FOLLOW_74);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:6327:6: ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt142=2;
        int LA142_0 = input.LA(1);

        if ( (LA142_0==34) ) {
            alt142=1;
        }
        switch (alt142) {
            case 1 :
                // InternalUsex.g:6328:7: ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                // InternalUsex.g:6328:7: ( (lv_symbolIE_9_0= '=' ) )
                // InternalUsex.g:6329:8: (lv_symbolIE_9_0= '=' )
                {
                // InternalUsex.g:6329:8: (lv_symbolIE_9_0= '=' )
                // InternalUsex.g:6330:9: lv_symbolIE_9_0= '='
                {
                lv_symbolIE_9_0=(Token)match(input,34,FOLLOW_9); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6342:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalUsex.g:6343:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalUsex.g:6343:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalUsex.g:6344:9: lv_ownedInitExpression_10_0= ruleExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_1_3_1_0());
                  								
                }
                pushFollow(FOLLOW_2);
                lv_ownedInitExpression_10_0=ruleExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred161_InternalUsex

    // $ANTLR start synpred164_InternalUsex
    public final void synpred164_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_11_0=null;
        Token lv_symbolCI_13_0=null;
        Token lv_symbolIE_15_0=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalUsex.g:6364:5: ( ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalUsex.g:6364:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalUsex.g:6364:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalUsex.g:6365:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalUsex.g:6365:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt143=2;
        int LA143_0 = input.LA(1);

        if ( (LA143_0==15) ) {
            alt143=1;
        }
        switch (alt143) {
            case 1 :
                // InternalUsex.g:6366:7: ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                // InternalUsex.g:6366:7: ( (lv_symbolT_11_0= ':' ) )
                // InternalUsex.g:6367:8: (lv_symbolT_11_0= ':' )
                {
                // InternalUsex.g:6367:8: (lv_symbolT_11_0= ':' )
                // InternalUsex.g:6368:9: lv_symbolT_11_0= ':'
                {
                lv_symbolT_11_0=(Token)match(input,15,FOLLOW_36); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6380:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalUsex.g:6381:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalUsex.g:6381:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalUsex.g:6382:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FOLLOW_77);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:6400:6: ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt144=2;
        int LA144_0 = input.LA(1);

        if ( (LA144_0==87) ) {
            alt144=1;
        }
        switch (alt144) {
            case 1 :
                // InternalUsex.g:6401:7: ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:6401:7: ( (lv_symbolCI_13_0= '<-' ) )
                // InternalUsex.g:6402:8: (lv_symbolCI_13_0= '<-' )
                {
                // InternalUsex.g:6402:8: (lv_symbolCI_13_0= '<-' )
                // InternalUsex.g:6403:9: lv_symbolCI_13_0= '<-'
                {
                lv_symbolCI_13_0=(Token)match(input,87,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6415:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:6416:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:6416:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:6417:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FOLLOW_78);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:6435:6: ( (lv_symbolIE_15_0= 'in' ) )
        // InternalUsex.g:6436:7: (lv_symbolIE_15_0= 'in' )
        {
        // InternalUsex.g:6436:7: (lv_symbolIE_15_0= 'in' )
        // InternalUsex.g:6437:8: lv_symbolIE_15_0= 'in'
        {
        lv_symbolIE_15_0=(Token)match(input,98,FOLLOW_9); if (state.failed) return ;

        }


        }

        // InternalUsex.g:6449:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalUsex.g:6450:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalUsex.g:6450:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalUsex.g:6451:8: lv_ownedInitExpression_16_0= ruleExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedInitExpressionExpCSParserRuleCall_0_1_2_3_0());
          							
        }
        pushFollow(FOLLOW_2);
        lv_ownedInitExpression_16_0=ruleExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred164_InternalUsex

    // Delegated rules

    public final boolean synpred116_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred151_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred161_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred161_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred158_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred158_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred164_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred164_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred148_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred148_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred154_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred154_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA50 dfa50 = new DFA50(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA102 dfa102 = new DFA102(this);
    protected DFA110 dfa110 = new DFA110(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\11\uffff\5\0\3\uffff";
    static final String dfa_3s = "\1\65\11\uffff\5\0\3\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\16\uffff\1\3";
    static final String dfa_5s = "\12\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\27\uffff\4\2\13\uffff\4\2\1\12\1\13\1\14\1\15\1\16\2\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "2798:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred85_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index50_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\37\uffff";
    static final String dfa_8s = "\1\4\3\0\33\uffff";
    static final String dfa_9s = "\1\141\3\0\33\uffff";
    static final String dfa_10s = "\4\uffff\1\1\31\uffff\1\2";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\33\uffff}>";
    static final String[] dfa_12s = {
            "\3\4\25\uffff\5\4\12\uffff\14\4\2\uffff\1\1\21\uffff\1\2\1\3\11\uffff\1\4\1\uffff\5\4\4\uffff\1\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "3648:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalUsex()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalUsex()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_3 = input.LA(1);

                         
                        int index68_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalUsex()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index68_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\36\uffff";
    static final String dfa_14s = "\1\4\11\uffff\7\0\15\uffff";
    static final String dfa_15s = "\1\134\11\uffff\7\0\15\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\15\uffff\1\7\1\10\7\uffff\1\11\1\4\1\5\1\6";
    static final String dfa_17s = "\12\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff}>";
    static final String[] dfa_18s = {
            "\1\32\2\3\25\uffff\4\22\1\1\12\uffff\4\22\1\14\1\15\1\16\1\17\1\20\1\13\1\12\1\3\37\uffff\1\21\1\uffff\4\3\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "3904:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_10 = input.LA(1);

                         
                        int index71_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_InternalUsex()) ) {s = 27;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_11 = input.LA(1);

                         
                        int index71_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_InternalUsex()) ) {s = 28;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_12 = input.LA(1);

                         
                        int index71_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalUsex()) ) {s = 29;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_13 = input.LA(1);

                         
                        int index71_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalUsex()) ) {s = 29;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_14 = input.LA(1);

                         
                        int index71_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalUsex()) ) {s = 29;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA71_15 = input.LA(1);

                         
                        int index71_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalUsex()) ) {s = 29;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA71_16 = input.LA(1);

                         
                        int index71_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalUsex()) ) {s = 29;}

                        else if ( (synpred116_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index71_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\1\4\12\uffff";
    static final String dfa_21s = "\1\17\2\0\10\uffff";
    static final String dfa_22s = "\1\144\2\0\10\uffff";
    static final String dfa_23s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_24s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_25s = {
            "\1\2\11\uffff\1\4\7\uffff\1\4\65\uffff\1\1\12\uffff\1\3\2\4",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "5741:3: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA102_1 = input.LA(1);

                         
                        int index102_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred148_InternalUsex()) ) {s = 9;}

                        else if ( (synpred154_InternalUsex()) ) {s = 3;}

                         
                        input.seek(index102_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA102_2 = input.LA(1);

                         
                        int index102_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred151_InternalUsex()) ) {s = 10;}

                        else if ( (synpred154_InternalUsex()) ) {s = 3;}

                         
                        input.seek(index102_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 102, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA110 extends DFA {

        public DFA110(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 110;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "6186:4: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA110_1 = input.LA(1);

                         
                        int index110_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred158_InternalUsex()) ) {s = 9;}

                        else if ( (synpred164_InternalUsex()) ) {s = 3;}

                         
                        input.seek(index110_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA110_2 = input.LA(1);

                         
                        int index110_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred161_InternalUsex()) ) {s = 10;}

                        else if ( (synpred164_InternalUsex()) ) {s = 3;}

                         
                        input.seek(index110_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 110, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001C000431002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x027FF801F0000070L,0x000000021F401800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C1000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000381000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000301010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000201010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000F8000F0000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000F8002F0000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003800008002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003800000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x027FF801F0000070L,0x000000001F401800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001008010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x027FF801F0008070L,0x000000021F401800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0140000000000040L,0x0000000000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xFFC0000400040002L,0x00000000000007FFL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000100800002L,0x0000000000208000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000800002L,0x0000000000200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000002000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x027FF801F1008070L,0x000000021F401800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x027FF801F1000070L,0x000000021F401800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000400008000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000140000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000002000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000500008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x027FF803F0008070L,0x000000021F401800L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000202000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000008002L,0x0000000400800000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000400000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000400800000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});

}