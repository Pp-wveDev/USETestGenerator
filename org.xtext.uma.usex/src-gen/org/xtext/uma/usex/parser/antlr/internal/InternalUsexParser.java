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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'abstract'", "'class'", "'attributes'", "'operations'", "'constraints'", "'end'", "':'", "'init'", "'derived'", "'String'", "'Real'", "'Integer'", "'Boolean'", "'('", "')'", "'begin'", "'='", "','", "'pre'", "'post'", "'inv'", "'association'", "'composition'", "'aggregation'", "'between'", "'role'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'Map'", "'Tuple'", "'*'", "'/'", "'+'", "'-'", "'>'", "'<'", "'>='", "'<='", "':='", "'<>'", "'and'", "'and2'", "'implies'", "'implies2'", "'or'", "'or2'", "'xor'", "'xor2'", "'.'", "'->'", "'?.'", "'?->'", "'not'", "'not2'", "'{'", "'++'", "'}'", "'..'", "'['", "'|?'", "'|1'", "']'", "'?'", "'::'", "'@'", "'Lambda'", "'<-'", "'true'", "'false'", "'invalid'", "'null'", "'if'", "'then'", "'else'", "'endif'", "'elseif'", "'let'", "'in'", "'|'", "';'"
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
    // InternalUsex.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:83:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* ) )
            // InternalUsex.g:84:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* )
            {
            // InternalUsex.g:84:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* )
            // InternalUsex.g:85:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )*
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

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=33 && LA1_0<=35)) ) {
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalUsex.g:130:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalUsex.g:130:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalUsex.g:131:2: iv_ruleAbstractElement= ruleAbstractElement EOF
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
    // InternalUsex.g:137:1: ruleAbstractElement returns [EObject current=null] : (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_0 = null;

        EObject this_UseClass_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:143:2: ( (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass ) )
            // InternalUsex.g:144:2: (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass )
            {
            // InternalUsex.g:144:2: (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=33 && LA2_0<=35)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUsex.g:145:3: this_Relation_0= ruleRelation
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Relation_0=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Relation_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:157:3: this_UseClass_1= ruleUseClass
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractElementAccess().getUseClassParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UseClass_1=ruleUseClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UseClass_1;
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
    // InternalUsex.g:172:1: entryRuleUseClass returns [EObject current=null] : iv_ruleUseClass= ruleUseClass EOF ;
    public final EObject entryRuleUseClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseClass = null;


        try {
            // InternalUsex.g:172:49: (iv_ruleUseClass= ruleUseClass EOF )
            // InternalUsex.g:173:2: iv_ruleUseClass= ruleUseClass EOF
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
    // InternalUsex.g:179:1: ruleUseClass returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )* )? (otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )* )? (otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )* )? otherlv_9= 'end' ) ;
    public final EObject ruleUseClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_attributes_4_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_constraints_8_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:185:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )* )? (otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )* )? (otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )* )? otherlv_9= 'end' ) )
            // InternalUsex.g:186:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )* )? (otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )* )? (otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )* )? otherlv_9= 'end' )
            {
            // InternalUsex.g:186:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )* )? (otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )* )? (otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )* )? otherlv_9= 'end' )
            // InternalUsex.g:187:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )* )? (otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )* )? (otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )* )? otherlv_9= 'end'
            {
            // InternalUsex.g:187:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUsex.g:188:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalUsex.g:188:4: (lv_abstract_0_0= 'abstract' )
                    // InternalUsex.g:189:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUseClassAccess().getClassKeyword_1());
              		
            }
            // InternalUsex.g:205:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUsex.g:206:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUsex.g:206:4: (lv_name_2_0= RULE_ID )
            // InternalUsex.g:207:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
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

            // InternalUsex.g:223:3: (otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUsex.g:224:4: otherlv_3= 'attributes' ( (lv_attributes_4_0= ruleAttribute ) )*
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getUseClassAccess().getAttributesKeyword_3_0());
                      			
                    }
                    // InternalUsex.g:228:4: ( (lv_attributes_4_0= ruleAttribute ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUsex.g:229:5: (lv_attributes_4_0= ruleAttribute )
                    	    {
                    	    // InternalUsex.g:229:5: (lv_attributes_4_0= ruleAttribute )
                    	    // InternalUsex.g:230:6: lv_attributes_4_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getUseClassAccess().getAttributesAttributeParserRuleCall_3_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributes_4_0=ruleAttribute();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"attributes",
                    	      							lv_attributes_4_0,
                    	      							"org.xtext.uma.usex.Usex.Attribute");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUsex.g:248:3: (otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUsex.g:249:4: otherlv_5= 'operations' ( (lv_operations_6_0= ruleOperation ) )*
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getUseClassAccess().getOperationsKeyword_4_0());
                      			
                    }
                    // InternalUsex.g:253:4: ( (lv_operations_6_0= ruleOperation ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalUsex.g:254:5: (lv_operations_6_0= ruleOperation )
                    	    {
                    	    // InternalUsex.g:254:5: (lv_operations_6_0= ruleOperation )
                    	    // InternalUsex.g:255:6: lv_operations_6_0= ruleOperation
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getUseClassAccess().getOperationsOperationParserRuleCall_4_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_operations_6_0=ruleOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"operations",
                    	      							lv_operations_6_0,
                    	      							"org.xtext.uma.usex.Usex.Operation");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUsex.g:273:3: (otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsex.g:274:4: otherlv_7= 'constraints' ( (lv_constraints_8_0= ruleConstraint ) )*
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getUseClassAccess().getConstraintsKeyword_5_0());
                      			
                    }
                    // InternalUsex.g:278:4: ( (lv_constraints_8_0= ruleConstraint ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==32) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalUsex.g:279:5: (lv_constraints_8_0= ruleConstraint )
                    	    {
                    	    // InternalUsex.g:279:5: (lv_constraints_8_0= ruleConstraint )
                    	    // InternalUsex.g:280:6: lv_constraints_8_0= ruleConstraint
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getUseClassAccess().getConstraintsConstraintParserRuleCall_5_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_9);
                    	    lv_constraints_8_0=ruleConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"constraints",
                    	      							lv_constraints_8_0,
                    	      							"org.xtext.uma.usex.Usex.Constraint");
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

            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getUseClassAccess().getEndKeyword_6());
              		
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


    // $ANTLR start "entryRuleAttribute"
    // InternalUsex.g:306:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUsex.g:306:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUsex.g:307:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUsex.g:313:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? ) ;
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
            // InternalUsex.g:319:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? ) )
            // InternalUsex.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? )
            {
            // InternalUsex.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )? )
            // InternalUsex.g:321:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )?
            {
            // InternalUsex.g:321:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:322:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:322:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:323:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:343:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalUsex.g:344:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalUsex.g:344:4: (lv_type_2_0= ruleAttributeType )
            // InternalUsex.g:345:5: lv_type_2_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
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

            // InternalUsex.g:362:3: (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUsex.g:363:4: otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleExpCS ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getInitKeyword_3_0());
                      			
                    }
                    otherlv_4=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_3_1());
                      			
                    }
                    // InternalUsex.g:371:4: ( (lv_initialization_5_0= ruleExpCS ) )
                    // InternalUsex.g:372:5: (lv_initialization_5_0= ruleExpCS )
                    {
                    // InternalUsex.g:372:5: (lv_initialization_5_0= ruleExpCS )
                    // InternalUsex.g:373:6: lv_initialization_5_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAttributeAccess().getInitializationExpCSParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
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

            // InternalUsex.g:391:3: (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUsex.g:392:4: otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= ruleExpCS ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDerivedKeyword_4_0());
                      			
                    }
                    otherlv_7=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getColonKeyword_4_1());
                      			
                    }
                    // InternalUsex.g:400:4: ( (lv_derivedFrom_8_0= ruleExpCS ) )
                    // InternalUsex.g:401:5: (lv_derivedFrom_8_0= ruleExpCS )
                    {
                    // InternalUsex.g:401:5: (lv_derivedFrom_8_0= ruleExpCS )
                    // InternalUsex.g:402:6: lv_derivedFrom_8_0= ruleExpCS
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
    // InternalUsex.g:424:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUsex.g:424:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUsex.g:425:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUsex.g:431:1: ruleAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ClassType_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:437:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType ) )
            // InternalUsex.g:438:2: (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType )
            {
            // InternalUsex.g:438:2: (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=21 && LA12_0<=24)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUsex.g:439:3: this_PrimitiveType_0= rulePrimitiveType
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
                    // InternalUsex.g:451:3: this_ClassType_1= ruleClassType
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
    // InternalUsex.g:466:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalUsex.g:466:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalUsex.g:467:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalUsex.g:473:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalUsex.g:479:2: ( ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) ) )
            // InternalUsex.g:480:2: ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) )
            {
            // InternalUsex.g:480:2: ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) )
            // InternalUsex.g:481:3: ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) )
            {
            // InternalUsex.g:481:3: ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) )
            // InternalUsex.g:482:4: (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' )
            {
            // InternalUsex.g:482:4: (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt13=1;
                }
                break;
            case 22:
                {
                alt13=2;
                }
                break;
            case 23:
                {
                alt13=3;
                }
                break;
            case 24:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUsex.g:483:5: lv_type_0_1= 'String'
                    {
                    lv_type_0_1=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUsex.g:494:5: lv_type_0_2= 'Real'
                    {
                    lv_type_0_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUsex.g:505:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUsex.g:516:5: lv_type_0_4= 'Boolean'
                    {
                    lv_type_0_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:532:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalUsex.g:532:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalUsex.g:533:2: iv_ruleClassType= ruleClassType EOF
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
    // InternalUsex.g:539:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUsex.g:545:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUsex.g:546:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUsex.g:546:2: ( (otherlv_0= RULE_ID ) )
            // InternalUsex.g:547:3: (otherlv_0= RULE_ID )
            {
            // InternalUsex.g:547:3: (otherlv_0= RULE_ID )
            // InternalUsex.g:548:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleOperation"
    // InternalUsex.g:565:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalUsex.g:565:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalUsex.g:566:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalUsex.g:572:1: ruleOperation returns [EObject current=null] : (this_Method_0= ruleMethod | this_Query_1= ruleQuery ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Query_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:578:2: ( (this_Method_0= ruleMethod | this_Query_1= ruleQuery ) )
            // InternalUsex.g:579:2: (this_Method_0= ruleMethod | this_Query_1= ruleQuery )
            {
            // InternalUsex.g:579:2: (this_Method_0= ruleMethod | this_Query_1= ruleQuery )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalUsex.g:580:3: this_Method_0= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getMethodParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_0=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:592:3: this_Query_1= ruleQuery
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationAccess().getQueryParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Query_1=ruleQuery();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Query_1;
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


    // $ANTLR start "entryRuleMethod"
    // InternalUsex.g:607:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUsex.g:607:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUsex.g:608:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalUsex.g:614:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_inputParameters_2_0 = null;

        EObject lv_returnParameter_5_0 = null;

        EObject lv_operationBody_7_0 = null;

        EObject lv_conditions_9_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:620:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* ) )
            // InternalUsex.g:621:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* )
            {
            // InternalUsex.g:621:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* )
            // InternalUsex.g:622:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )*
            {
            // InternalUsex.g:622:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:623:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:623:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:624:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:644:3: ( (lv_inputParameters_2_0= ruleParameter ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUsex.g:645:4: (lv_inputParameters_2_0= ruleParameter )
            	    {
            	    // InternalUsex.g:645:4: (lv_inputParameters_2_0= ruleParameter )
            	    // InternalUsex.g:646:5: lv_inputParameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodAccess().getInputParametersParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUsex.g:667:3: (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUsex.g:668:4: otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_4_0());
                      			
                    }
                    // InternalUsex.g:672:4: ( (lv_returnParameter_5_0= ruleAttributeType ) )
                    // InternalUsex.g:673:5: (lv_returnParameter_5_0= ruleAttributeType )
                    {
                    // InternalUsex.g:673:5: (lv_returnParameter_5_0= ruleAttributeType )
                    // InternalUsex.g:674:6: lv_returnParameter_5_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getReturnParameterAttributeTypeParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
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

            // InternalUsex.g:692:3: (otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUsex.g:693:4: otherlv_6= 'begin' ( (lv_operationBody_7_0= ruleExpCS ) ) otherlv_8= 'end'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getBeginKeyword_5_0());
                      			
                    }
                    // InternalUsex.g:697:4: ( (lv_operationBody_7_0= ruleExpCS ) )
                    // InternalUsex.g:698:5: (lv_operationBody_7_0= ruleExpCS )
                    {
                    // InternalUsex.g:698:5: (lv_operationBody_7_0= ruleExpCS )
                    // InternalUsex.g:699:6: lv_operationBody_7_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getOperationBodyExpCSParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_operationBody_7_0=ruleExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
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

                    otherlv_8=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getEndKeyword_5_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUsex.g:721:3: ( (lv_conditions_9_0= ruleCondition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=30 && LA18_0<=31)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUsex.g:722:4: (lv_conditions_9_0= ruleCondition )
            	    {
            	    // InternalUsex.g:722:4: (lv_conditions_9_0= ruleCondition )
            	    // InternalUsex.g:723:5: lv_conditions_9_0= ruleCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMethodAccess().getConditionsConditionParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_conditions_9_0=ruleCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMethodRule());
            	      					}
            	      					add(
            	      						current,
            	      						"conditions",
            	      						lv_conditions_9_0,
            	      						"org.xtext.uma.usex.Usex.Condition");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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


    // $ANTLR start "entryRuleQuery"
    // InternalUsex.g:744:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalUsex.g:744:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalUsex.g:745:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalUsex.g:751:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) ) ;
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
            // InternalUsex.g:757:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) ) )
            // InternalUsex.g:758:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:758:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) ) )
            // InternalUsex.g:759:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= ruleExpCS ) )
            {
            // InternalUsex.g:759:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:760:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:760:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:761:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:781:3: ( (lv_inputParameters_2_0= ruleParameter ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUsex.g:782:4: (lv_inputParameters_2_0= ruleParameter )
            	    {
            	    // InternalUsex.g:782:4: (lv_inputParameters_2_0= ruleParameter )
            	    // InternalUsex.g:783:5: lv_inputParameters_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getQueryAccess().getInputParametersParameterParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
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
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,26,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getColonKeyword_4());
              		
            }
            // InternalUsex.g:808:3: ( (lv_returnParameter_5_0= ruleAttributeType ) )
            // InternalUsex.g:809:4: (lv_returnParameter_5_0= ruleAttributeType )
            {
            // InternalUsex.g:809:4: (lv_returnParameter_5_0= ruleAttributeType )
            // InternalUsex.g:810:5: lv_returnParameter_5_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQueryAccess().getReturnParameterAttributeTypeParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_21);
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

            otherlv_6=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getEqualsSignKeyword_6());
              		
            }
            // InternalUsex.g:831:3: ( (lv_operationBody_7_0= ruleExpCS ) )
            // InternalUsex.g:832:4: (lv_operationBody_7_0= ruleExpCS )
            {
            // InternalUsex.g:832:4: (lv_operationBody_7_0= ruleExpCS )
            // InternalUsex.g:833:5: lv_operationBody_7_0= ruleExpCS
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


    // $ANTLR start "entryRuleParameter"
    // InternalUsex.g:854:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUsex.g:854:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUsex.g:855:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalUsex.g:861:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:867:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? ) )
            // InternalUsex.g:868:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? )
            {
            // InternalUsex.g:868:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? )
            // InternalUsex.g:869:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )?
            {
            // InternalUsex.g:869:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:870:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:870:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:871:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:891:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalUsex.g:892:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalUsex.g:892:4: (lv_type_2_0= ruleAttributeType )
            // InternalUsex.g:893:5: lv_type_2_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeAttributeTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
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

            // InternalUsex.g:910:3: (otherlv_3= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUsex.g:911:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:920:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUsex.g:920:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUsex.g:921:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUsex.g:927:1: ruleCondition returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:933:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUsex.g:934:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUsex.g:934:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            else if ( (LA21_0==31) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUsex.g:935:3: this_Precondition_0= rulePrecondition
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
                    // InternalUsex.g:947:3: this_Postcondition_1= rulePostcondition
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
    // InternalUsex.g:962:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUsex.g:962:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUsex.g:963:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUsex.g:969:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_conditionBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:975:2: ( (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:976:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:976:2: (otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            // InternalUsex.g:977:3: otherlv_0= 'pre' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
              		
            }
            // InternalUsex.g:981:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUsex.g:982:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsex.g:982:4: (lv_name_1_0= RULE_ID )
                    // InternalUsex.g:983:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
              		
            }
            // InternalUsex.g:1003:3: ( (lv_conditionBody_3_0= ruleExpCS ) )
            // InternalUsex.g:1004:4: (lv_conditionBody_3_0= ruleExpCS )
            {
            // InternalUsex.g:1004:4: (lv_conditionBody_3_0= ruleExpCS )
            // InternalUsex.g:1005:5: lv_conditionBody_3_0= ruleExpCS
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
    // InternalUsex.g:1026:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUsex.g:1026:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUsex.g:1027:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUsex.g:1033:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_conditionBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1039:2: ( (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:1040:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:1040:2: (otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) ) )
            // InternalUsex.g:1041:3: otherlv_0= 'post' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_conditionBody_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
              		
            }
            // InternalUsex.g:1045:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUsex.g:1046:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsex.g:1046:4: (lv_name_1_0= RULE_ID )
                    // InternalUsex.g:1047:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
              		
            }
            // InternalUsex.g:1067:3: ( (lv_conditionBody_3_0= ruleExpCS ) )
            // InternalUsex.g:1068:4: (lv_conditionBody_3_0= ruleExpCS )
            {
            // InternalUsex.g:1068:4: (lv_conditionBody_3_0= ruleExpCS )
            // InternalUsex.g:1069:5: lv_conditionBody_3_0= ruleExpCS
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
    // InternalUsex.g:1090:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalUsex.g:1090:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalUsex.g:1091:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalUsex.g:1097:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_constraintBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1103:2: ( (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:1104:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:1104:2: (otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) ) )
            // InternalUsex.g:1105:3: otherlv_0= 'inv' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= ':' ( (lv_constraintBody_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getInvKeyword_0());
              		
            }
            // InternalUsex.g:1109:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUsex.g:1110:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUsex.g:1110:4: (lv_name_1_0= RULE_ID )
                    // InternalUsex.g:1111:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getColonKeyword_2());
              		
            }
            // InternalUsex.g:1131:3: ( (lv_constraintBody_3_0= ruleExpCS ) )
            // InternalUsex.g:1132:4: (lv_constraintBody_3_0= ruleExpCS )
            {
            // InternalUsex.g:1132:4: (lv_constraintBody_3_0= ruleExpCS )
            // InternalUsex.g:1133:5: lv_constraintBody_3_0= ruleExpCS
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
    // InternalUsex.g:1154:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalUsex.g:1154:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalUsex.g:1155:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalUsex.g:1161:1: ruleRelation returns [EObject current=null] : ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) ;
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
            // InternalUsex.g:1167:2: ( ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) )
            // InternalUsex.g:1168:2: ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            {
            // InternalUsex.g:1168:2: ( ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            // InternalUsex.g:1169:3: ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end'
            {
            // InternalUsex.g:1169:3: ( ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) ) )
            // InternalUsex.g:1170:4: ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) )
            {
            // InternalUsex.g:1170:4: ( (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' ) )
            // InternalUsex.g:1171:5: (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' )
            {
            // InternalUsex.g:1171:5: (lv_relationType_0_1= 'association' | lv_relationType_0_2= 'composition' | lv_relationType_0_3= 'aggregation' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt25=1;
                }
                break;
            case 34:
                {
                alt25=2;
                }
                break;
            case 35:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalUsex.g:1172:6: lv_relationType_0_1= 'association'
                    {
                    lv_relationType_0_1=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
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
                    // InternalUsex.g:1183:6: lv_relationType_0_2= 'composition'
                    {
                    lv_relationType_0_2=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
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
                    // InternalUsex.g:1194:6: lv_relationType_0_3= 'aggregation'
                    {
                    lv_relationType_0_3=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
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

            // InternalUsex.g:1207:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:1208:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:1208:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:1209:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBetweenKeyword_2());
              		
            }
            // InternalUsex.g:1229:3: ( (lv_relationBody_3_0= ruleRelationBody ) )
            // InternalUsex.g:1230:4: (lv_relationBody_3_0= ruleRelationBody )
            {
            // InternalUsex.g:1230:4: (lv_relationBody_3_0= ruleRelationBody )
            // InternalUsex.g:1231:5: lv_relationBody_3_0= ruleRelationBody
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationAccess().getRelationBodyRelationBodyParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:1256:1: entryRuleRelationBody returns [EObject current=null] : iv_ruleRelationBody= ruleRelationBody EOF ;
    public final EObject entryRuleRelationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBody = null;


        try {
            // InternalUsex.g:1256:53: (iv_ruleRelationBody= ruleRelationBody EOF )
            // InternalUsex.g:1257:2: iv_ruleRelationBody= ruleRelationBody EOF
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
    // InternalUsex.g:1263:1: ruleRelationBody returns [EObject current=null] : ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) ) ;
    public final EObject ruleRelationBody() throws RecognitionException {
        EObject current = null;

        EObject lv_originClass_0_0 = null;

        EObject lv_destinyClass_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1269:2: ( ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) ) )
            // InternalUsex.g:1270:2: ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) )
            {
            // InternalUsex.g:1270:2: ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) )
            // InternalUsex.g:1271:3: ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) )
            {
            // InternalUsex.g:1271:3: ( (lv_originClass_0_0= ruleRelationMember ) )
            // InternalUsex.g:1272:4: (lv_originClass_0_0= ruleRelationMember )
            {
            // InternalUsex.g:1272:4: (lv_originClass_0_0= ruleRelationMember )
            // InternalUsex.g:1273:5: lv_originClass_0_0= ruleRelationMember
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

            // InternalUsex.g:1290:3: ( (lv_destinyClass_1_0= ruleRelationMember ) )
            // InternalUsex.g:1291:4: (lv_destinyClass_1_0= ruleRelationMember )
            {
            // InternalUsex.g:1291:4: (lv_destinyClass_1_0= ruleRelationMember )
            // InternalUsex.g:1292:5: lv_destinyClass_1_0= ruleRelationMember
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
    // InternalUsex.g:1313:1: entryRuleRelationMember returns [EObject current=null] : iv_ruleRelationMember= ruleRelationMember EOF ;
    public final EObject entryRuleRelationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationMember = null;


        try {
            // InternalUsex.g:1313:55: (iv_ruleRelationMember= ruleRelationMember EOF )
            // InternalUsex.g:1314:2: iv_ruleRelationMember= ruleRelationMember EOF
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
    // InternalUsex.g:1320:1: ruleRelationMember returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRelationMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_roleName_3_0=null;
        EObject lv_cardinality_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1326:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) ) )
            // InternalUsex.g:1327:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )
            {
            // InternalUsex.g:1327:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) ) )
            // InternalUsex.g:1328:3: ( (otherlv_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleMultiplicityCS ) ) otherlv_2= 'role' ( (lv_roleName_3_0= RULE_ID ) )
            {
            // InternalUsex.g:1328:3: ( (otherlv_0= RULE_ID ) )
            // InternalUsex.g:1329:4: (otherlv_0= RULE_ID )
            {
            // InternalUsex.g:1329:4: (otherlv_0= RULE_ID )
            // InternalUsex.g:1330:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRelationMemberRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getRelationMemberAccess().getClassUseClassCrossReference_0_0());
              				
            }

            }


            }

            // InternalUsex.g:1344:3: ( (lv_cardinality_1_0= ruleMultiplicityCS ) )
            // InternalUsex.g:1345:4: (lv_cardinality_1_0= ruleMultiplicityCS )
            {
            // InternalUsex.g:1345:4: (lv_cardinality_1_0= ruleMultiplicityCS )
            // InternalUsex.g:1346:5: lv_cardinality_1_0= ruleMultiplicityCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRelationMemberAccess().getCardinalityMultiplicityCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            otherlv_2=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRelationMemberAccess().getRoleKeyword_2());
              		
            }
            // InternalUsex.g:1367:3: ( (lv_roleName_3_0= RULE_ID ) )
            // InternalUsex.g:1368:4: (lv_roleName_3_0= RULE_ID )
            {
            // InternalUsex.g:1368:4: (lv_roleName_3_0= RULE_ID )
            // InternalUsex.g:1369:5: lv_roleName_3_0= RULE_ID
            {
            lv_roleName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_roleName_3_0, grammarAccess.getRelationMemberAccess().getRoleNameIDTerminalRuleCall_3_0());
              				
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
    // InternalUsex.g:1389:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalUsex.g:1389:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalUsex.g:1390:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
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
    // InternalUsex.g:1396:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:1402:2: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalUsex.g:1403:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalUsex.g:1403:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt26=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt26=1;
                }
                break;
            case 23:
                {
                alt26=2;
                }
                break;
            case 22:
                {
                alt26=3;
                }
                break;
            case 21:
                {
                alt26=4;
                }
                break;
            case 38:
                {
                alt26=5;
                }
                break;
            case 39:
                {
                alt26=6;
                }
                break;
            case 40:
                {
                alt26=7;
                }
                break;
            case 41:
                {
                alt26=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalUsex.g:1404:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1410:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:1416:3: kw= 'Real'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:1422:3: kw= 'String'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:1428:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUsex.g:1434:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUsex.g:1440:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUsex.g:1446:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:1455:1: entryRulePrimitiveTypeCS returns [EObject current=null] : iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF ;
    public final EObject entryRulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeCS = null;


        try {
            // InternalUsex.g:1455:56: (iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF )
            // InternalUsex.g:1456:2: iv_rulePrimitiveTypeCS= rulePrimitiveTypeCS EOF
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
    // InternalUsex.g:1462:1: rulePrimitiveTypeCS returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveTypeCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1468:2: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalUsex.g:1469:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalUsex.g:1469:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalUsex.g:1470:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalUsex.g:1470:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalUsex.g:1471:4: lv_name_0_0= rulePrimitiveTypeIdentifier
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
    // InternalUsex.g:1491:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalUsex.g:1491:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalUsex.g:1492:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
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
    // InternalUsex.g:1498:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:1504:2: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalUsex.g:1505:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalUsex.g:1505:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            case 45:
                {
                alt27=4;
                }
                break;
            case 46:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalUsex.g:1506:3: kw= 'Set'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1512:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:1518:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:1524:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:1530:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:1539:1: entryRuleCollectionTypeCS returns [EObject current=null] : iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF ;
    public final EObject entryRuleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionTypeCS = null;


        try {
            // InternalUsex.g:1539:57: (iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF )
            // InternalUsex.g:1540:2: iv_ruleCollectionTypeCS= ruleCollectionTypeCS EOF
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
    // InternalUsex.g:1546:1: ruleCollectionTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) ;
    public final EObject ruleCollectionTypeCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedCollectionMultiplicity_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1552:2: ( ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? ) )
            // InternalUsex.g:1553:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            {
            // InternalUsex.g:1553:2: ( ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )? )
            // InternalUsex.g:1554:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            {
            // InternalUsex.g:1554:3: ( (lv_name_0_0= ruleCollectionTypeIdentifier ) )
            // InternalUsex.g:1555:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalUsex.g:1555:4: (lv_name_0_0= ruleCollectionTypeIdentifier )
            // InternalUsex.g:1556:5: lv_name_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getNameCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            // InternalUsex.g:1573:3: (otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUsex.g:1574:4: otherlv_1= '(' ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) ) ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )? otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:1578:4: ( (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS ) )
                    // InternalUsex.g:1579:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    {
                    // InternalUsex.g:1579:5: (lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS )
                    // InternalUsex.g:1580:6: lv_ownedType_2_0= ruleTypeExpWithoutMultiplicityCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeTypeExpWithoutMultiplicityCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_29);
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

                    // InternalUsex.g:1597:4: ( (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==77) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalUsex.g:1598:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            {
                            // InternalUsex.g:1598:5: (lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS )
                            // InternalUsex.g:1599:6: lv_ownedCollectionMultiplicity_3_0= ruleMultiplicityCS
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCollectionTypeCSAccess().getOwnedCollectionMultiplicityMultiplicityCSParserRuleCall_1_2_0());
                              					
                            }
                            pushFollow(FOLLOW_30);
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

                    otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:1625:1: entryRuleMapTypeCS returns [EObject current=null] : iv_ruleMapTypeCS= ruleMapTypeCS EOF ;
    public final EObject entryRuleMapTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapTypeCS = null;


        try {
            // InternalUsex.g:1625:50: (iv_ruleMapTypeCS= ruleMapTypeCS EOF )
            // InternalUsex.g:1626:2: iv_ruleMapTypeCS= ruleMapTypeCS EOF
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
    // InternalUsex.g:1632:1: ruleMapTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) ;
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
            // InternalUsex.g:1638:2: ( ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? ) )
            // InternalUsex.g:1639:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            {
            // InternalUsex.g:1639:2: ( ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )? )
            // InternalUsex.g:1640:3: ( (lv_name_0_0= 'Map' ) ) (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            {
            // InternalUsex.g:1640:3: ( (lv_name_0_0= 'Map' ) )
            // InternalUsex.g:1641:4: (lv_name_0_0= 'Map' )
            {
            // InternalUsex.g:1641:4: (lv_name_0_0= 'Map' )
            // InternalUsex.g:1642:5: lv_name_0_0= 'Map'
            {
            lv_name_0_0=(Token)match(input,47,FOLLOW_27); if (state.failed) return current;
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

            // InternalUsex.g:1654:3: (otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUsex.g:1655:4: otherlv_1= '(' ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) ) otherlv_3= ',' ( (lv_ownedValueType_4_0= ruleTypeExpCS ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMapTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:1659:4: ( (lv_ownedKeyType_2_0= ruleTypeExpCS ) )
                    // InternalUsex.g:1660:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:1660:5: (lv_ownedKeyType_2_0= ruleTypeExpCS )
                    // InternalUsex.g:1661:6: lv_ownedKeyType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedKeyTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
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

                    otherlv_3=(Token)match(input,29,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMapTypeCSAccess().getCommaKeyword_1_2());
                      			
                    }
                    // InternalUsex.g:1682:4: ( (lv_ownedValueType_4_0= ruleTypeExpCS ) )
                    // InternalUsex.g:1683:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:1683:5: (lv_ownedValueType_4_0= ruleTypeExpCS )
                    // InternalUsex.g:1684:6: lv_ownedValueType_4_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapTypeCSAccess().getOwnedValueTypeTypeExpCSParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
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

                    otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:1710:1: entryRuleTupleTypeCS returns [EObject current=null] : iv_ruleTupleTypeCS= ruleTupleTypeCS EOF ;
    public final EObject entryRuleTupleTypeCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeCS = null;


        try {
            // InternalUsex.g:1710:52: (iv_ruleTupleTypeCS= ruleTupleTypeCS EOF )
            // InternalUsex.g:1711:2: iv_ruleTupleTypeCS= ruleTupleTypeCS EOF
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
    // InternalUsex.g:1717:1: ruleTupleTypeCS returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) ;
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
            // InternalUsex.g:1723:2: ( ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? ) )
            // InternalUsex.g:1724:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalUsex.g:1724:2: ( ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )? )
            // InternalUsex.g:1725:3: ( (lv_name_0_0= 'Tuple' ) ) (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            {
            // InternalUsex.g:1725:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalUsex.g:1726:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalUsex.g:1726:4: (lv_name_0_0= 'Tuple' )
            // InternalUsex.g:1727:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,48,FOLLOW_27); if (state.failed) return current;
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

            // InternalUsex.g:1739:3: (otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==25) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUsex.g:1740:4: otherlv_1= '(' ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleTypeCSAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:1744:4: ( ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalUsex.g:1745:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            {
                            // InternalUsex.g:1745:5: ( (lv_ownedParts_2_0= ruleTuplePartCS ) )
                            // InternalUsex.g:1746:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            {
                            // InternalUsex.g:1746:6: (lv_ownedParts_2_0= ruleTuplePartCS )
                            // InternalUsex.g:1747:7: lv_ownedParts_2_0= ruleTuplePartCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_32);
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

                            // InternalUsex.g:1764:5: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==29) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // InternalUsex.g:1765:6: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    {
                            	    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_3, grammarAccess.getTupleTypeCSAccess().getCommaKeyword_1_1_1_0());
                            	      					
                            	    }
                            	    // InternalUsex.g:1769:6: ( (lv_ownedParts_4_0= ruleTuplePartCS ) )
                            	    // InternalUsex.g:1770:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    {
                            	    // InternalUsex.g:1770:7: (lv_ownedParts_4_0= ruleTuplePartCS )
                            	    // InternalUsex.g:1771:8: lv_ownedParts_4_0= ruleTuplePartCS
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getTupleTypeCSAccess().getOwnedPartsTuplePartCSParserRuleCall_1_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_32);
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
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:1799:1: entryRuleTuplePartCS returns [EObject current=null] : iv_ruleTuplePartCS= ruleTuplePartCS EOF ;
    public final EObject entryRuleTuplePartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuplePartCS = null;


        try {
            // InternalUsex.g:1799:52: (iv_ruleTuplePartCS= ruleTuplePartCS EOF )
            // InternalUsex.g:1800:2: iv_ruleTuplePartCS= ruleTuplePartCS EOF
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
    // InternalUsex.g:1806:1: ruleTuplePartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject ruleTuplePartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1812:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) ) )
            // InternalUsex.g:1813:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalUsex.g:1813:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )
            // InternalUsex.g:1814:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            {
            // InternalUsex.g:1814:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:1815:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:1815:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:1816:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartCSAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:1837:3: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
            // InternalUsex.g:1838:4: (lv_ownedType_2_0= ruleTypeExpCS )
            {
            // InternalUsex.g:1838:4: (lv_ownedType_2_0= ruleTypeExpCS )
            // InternalUsex.g:1839:5: lv_ownedType_2_0= ruleTypeExpCS
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
    // InternalUsex.g:1860:1: entryRuleBinaryOperatorName returns [String current=null] : iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF ;
    public final String entryRuleBinaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOperatorName = null;


        try {
            // InternalUsex.g:1860:58: (iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF )
            // InternalUsex.g:1861:2: iv_ruleBinaryOperatorName= ruleBinaryOperatorName EOF
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
    // InternalUsex.g:1867:1: ruleBinaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLInfixOperatorName_0 = null;

        AntlrDatatypeRuleToken this_EssentialOCLNavigationOperatorName_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:1873:2: ( (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName ) )
            // InternalUsex.g:1874:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName )
            {
            // InternalUsex.g:1874:2: (this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName | this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28||(LA34_0>=49 && LA34_0<=66)) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=67 && LA34_0<=70)) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalUsex.g:1875:3: this_EssentialOCLInfixOperatorName_0= ruleEssentialOCLInfixOperatorName
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
                    // InternalUsex.g:1886:3: this_EssentialOCLNavigationOperatorName_1= ruleEssentialOCLNavigationOperatorName
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
    // InternalUsex.g:1900:1: entryRuleEssentialOCLInfixOperatorName returns [String current=null] : iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF ;
    public final String entryRuleEssentialOCLInfixOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLInfixOperatorName = null;


        try {
            // InternalUsex.g:1900:69: (iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF )
            // InternalUsex.g:1901:2: iv_ruleEssentialOCLInfixOperatorName= ruleEssentialOCLInfixOperatorName EOF
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
    // InternalUsex.g:1907:1: ruleEssentialOCLInfixOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLInfixOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:1913:2: ( (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' ) )
            // InternalUsex.g:1914:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            {
            // InternalUsex.g:1914:2: (kw= '*' | kw= '/' | kw= '+' | kw= '-' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '=' | kw= ':=' | kw= '<>' | kw= 'and' | kw= 'and2' | kw= 'implies' | kw= 'implies2' | kw= 'or' | kw= 'or2' | kw= 'xor' | kw= 'xor2' )
            int alt35=19;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 51:
                {
                alt35=3;
                }
                break;
            case 52:
                {
                alt35=4;
                }
                break;
            case 53:
                {
                alt35=5;
                }
                break;
            case 54:
                {
                alt35=6;
                }
                break;
            case 55:
                {
                alt35=7;
                }
                break;
            case 56:
                {
                alt35=8;
                }
                break;
            case 28:
                {
                alt35=9;
                }
                break;
            case 57:
                {
                alt35=10;
                }
                break;
            case 58:
                {
                alt35=11;
                }
                break;
            case 59:
                {
                alt35=12;
                }
                break;
            case 60:
                {
                alt35=13;
                }
                break;
            case 61:
                {
                alt35=14;
                }
                break;
            case 62:
                {
                alt35=15;
                }
                break;
            case 63:
                {
                alt35=16;
                }
                break;
            case 64:
                {
                alt35=17;
                }
                break;
            case 65:
                {
                alt35=18;
                }
                break;
            case 66:
                {
                alt35=19;
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
                    // InternalUsex.g:1915:3: kw= '*'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAsteriskKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1921:3: kw= '/'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getSolidusKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:1927:3: kw= '+'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getPlusSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:1933:3: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getHyphenMinusKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUsex.g:1939:3: kw= '>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUsex.g:1945:3: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUsex.g:1951:3: kw= '>='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getGreaterThanSignEqualsSignKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUsex.g:1957:3: kw= '<='
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignEqualsSignKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUsex.g:1963:3: kw= '='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getEqualsSignKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUsex.g:1969:3: kw= ':='
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getColonEqualsSignKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalUsex.g:1975:3: kw= '<>'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getLessThanSignGreaterThanSignKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalUsex.g:1981:3: kw= 'and'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAndKeyword_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalUsex.g:1987:3: kw= 'and2'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getAnd2Keyword_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalUsex.g:1993:3: kw= 'implies'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImpliesKeyword_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalUsex.g:1999:3: kw= 'implies2'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getImplies2Keyword_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalUsex.g:2005:3: kw= 'or'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOrKeyword_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalUsex.g:2011:3: kw= 'or2'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getOr2Keyword_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalUsex.g:2017:3: kw= 'xor'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLInfixOperatorNameAccess().getXorKeyword_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalUsex.g:2023:3: kw= 'xor2'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:2032:1: entryRuleEssentialOCLNavigationOperatorName returns [String current=null] : iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF ;
    public final String entryRuleEssentialOCLNavigationOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLNavigationOperatorName = null;


        try {
            // InternalUsex.g:2032:74: (iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF )
            // InternalUsex.g:2033:2: iv_ruleEssentialOCLNavigationOperatorName= ruleEssentialOCLNavigationOperatorName EOF
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
    // InternalUsex.g:2039:1: ruleEssentialOCLNavigationOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLNavigationOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:2045:2: ( (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' ) )
            // InternalUsex.g:2046:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            {
            // InternalUsex.g:2046:2: (kw= '.' | kw= '->' | kw= '?.' | kw= '?->' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt36=1;
                }
                break;
            case 68:
                {
                alt36=2;
                }
                break;
            case 69:
                {
                alt36=3;
                }
                break;
            case 70:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalUsex.g:2047:3: kw= '.'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2053:3: kw= '->'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getHyphenMinusGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2059:3: kw= '?.'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLNavigationOperatorNameAccess().getQuestionMarkFullStopKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUsex.g:2065:3: kw= '?->'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:2074:1: entryRuleUnaryOperatorName returns [String current=null] : iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF ;
    public final String entryRuleUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperatorName = null;


        try {
            // InternalUsex.g:2074:57: (iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF )
            // InternalUsex.g:2075:2: iv_ruleUnaryOperatorName= ruleUnaryOperatorName EOF
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
    // InternalUsex.g:2081:1: ruleUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName ;
    public final AntlrDatatypeRuleToken ruleUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnaryOperatorName_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2087:2: (this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName )
            // InternalUsex.g:2088:2: this_EssentialOCLUnaryOperatorName_0= ruleEssentialOCLUnaryOperatorName
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
    // InternalUsex.g:2101:1: entryRuleEssentialOCLUnaryOperatorName returns [String current=null] : iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF ;
    public final String entryRuleEssentialOCLUnaryOperatorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnaryOperatorName = null;


        try {
            // InternalUsex.g:2101:69: (iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF )
            // InternalUsex.g:2102:2: iv_ruleEssentialOCLUnaryOperatorName= ruleEssentialOCLUnaryOperatorName EOF
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
    // InternalUsex.g:2108:1: ruleEssentialOCLUnaryOperatorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= 'not' | kw= 'not2' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnaryOperatorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:2114:2: ( (kw= '-' | kw= 'not' | kw= 'not2' ) )
            // InternalUsex.g:2115:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            {
            // InternalUsex.g:2115:2: (kw= '-' | kw= 'not' | kw= 'not2' )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt37=1;
                }
                break;
            case 71:
                {
                alt37=2;
                }
                break;
            case 72:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalUsex.g:2116:3: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getHyphenMinusKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUsex.g:2122:3: kw= 'not'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLUnaryOperatorNameAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUsex.g:2128:3: kw= 'not2'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:2137:1: entryRuleEssentialOCLUnrestrictedName returns [String current=null] : iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF ;
    public final String entryRuleEssentialOCLUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLUnrestrictedName = null;


        try {
            // InternalUsex.g:2137:68: (iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF )
            // InternalUsex.g:2138:2: iv_ruleEssentialOCLUnrestrictedName= ruleEssentialOCLUnrestrictedName EOF
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
    // InternalUsex.g:2144:1: ruleEssentialOCLUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalUsex.g:2150:2: (this_ID_0= RULE_ID )
            // InternalUsex.g:2151:2: this_ID_0= RULE_ID
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
    // InternalUsex.g:2161:1: entryRuleUnrestrictedName returns [String current=null] : iv_ruleUnrestrictedName= ruleUnrestrictedName EOF ;
    public final String entryRuleUnrestrictedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnrestrictedName = null;


        try {
            // InternalUsex.g:2161:56: (iv_ruleUnrestrictedName= ruleUnrestrictedName EOF )
            // InternalUsex.g:2162:2: iv_ruleUnrestrictedName= ruleUnrestrictedName EOF
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
    // InternalUsex.g:2168:1: ruleUnrestrictedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName ;
    public final AntlrDatatypeRuleToken ruleUnrestrictedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLUnrestrictedName_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2174:2: (this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName )
            // InternalUsex.g:2175:2: this_EssentialOCLUnrestrictedName_0= ruleEssentialOCLUnrestrictedName
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
    // InternalUsex.g:2188:1: entryRuleCollectionPatternCS returns [EObject current=null] : iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF ;
    public final EObject entryRuleCollectionPatternCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionPatternCS = null;


        try {
            // InternalUsex.g:2188:60: (iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF )
            // InternalUsex.g:2189:2: iv_ruleCollectionPatternCS= ruleCollectionPatternCS EOF
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
    // InternalUsex.g:2195:1: ruleCollectionPatternCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' ) ;
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
            // InternalUsex.g:2201:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' ) )
            // InternalUsex.g:2202:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' )
            {
            // InternalUsex.g:2202:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}' )
            // InternalUsex.g:2203:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )? otherlv_7= '}'
            {
            // InternalUsex.g:2203:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalUsex.g:2204:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalUsex.g:2204:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalUsex.g:2205:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_1=(Token)match(input,73,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionPatternCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:2226:3: ( ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID||LA39_0==18) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUsex.g:2227:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )* (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) )
                    {
                    // InternalUsex.g:2227:4: ( (lv_ownedParts_2_0= rulePatternExpCS ) )
                    // InternalUsex.g:2228:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    {
                    // InternalUsex.g:2228:5: (lv_ownedParts_2_0= rulePatternExpCS )
                    // InternalUsex.g:2229:6: lv_ownedParts_2_0= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
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

                    // InternalUsex.g:2246:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==29) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalUsex.g:2247:5: otherlv_3= ',' ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionPatternCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:2251:5: ( (lv_ownedParts_4_0= rulePatternExpCS ) )
                    	    // InternalUsex.g:2252:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    {
                    	    // InternalUsex.g:2252:6: (lv_ownedParts_4_0= rulePatternExpCS )
                    	    // InternalUsex.g:2253:7: lv_ownedParts_4_0= rulePatternExpCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionPatternCSAccess().getOwnedPartsPatternExpCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_35);
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
                    	    break loop38;
                        }
                    } while (true);

                    // InternalUsex.g:2271:4: (otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) ) )
                    // InternalUsex.g:2272:5: otherlv_5= '++' ( (lv_restVariableName_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,74,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getCollectionPatternCSAccess().getPlusSignPlusSignKeyword_2_2_0());
                      				
                    }
                    // InternalUsex.g:2276:5: ( (lv_restVariableName_6_0= RULE_ID ) )
                    // InternalUsex.g:2277:6: (lv_restVariableName_6_0= RULE_ID )
                    {
                    // InternalUsex.g:2277:6: (lv_restVariableName_6_0= RULE_ID )
                    // InternalUsex.g:2278:7: lv_restVariableName_6_0= RULE_ID
                    {
                    lv_restVariableName_6_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
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

            otherlv_7=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:2304:1: entryRulePatternExpCS returns [EObject current=null] : iv_rulePatternExpCS= rulePatternExpCS EOF ;
    public final EObject entryRulePatternExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternExpCS = null;


        try {
            // InternalUsex.g:2304:53: (iv_rulePatternExpCS= rulePatternExpCS EOF )
            // InternalUsex.g:2305:2: iv_rulePatternExpCS= rulePatternExpCS EOF
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
    // InternalUsex.g:2311:1: rulePatternExpCS returns [EObject current=null] : ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) ;
    public final EObject rulePatternExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_patternVariableName_0_0 = null;

        EObject lv_ownedPatternType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2317:2: ( ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) ) )
            // InternalUsex.g:2318:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            {
            // InternalUsex.g:2318:2: ( ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) ) )
            // InternalUsex.g:2319:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )? otherlv_1= ':' ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            {
            // InternalUsex.g:2319:3: ( (lv_patternVariableName_0_0= ruleUnrestrictedName ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUsex.g:2320:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    {
                    // InternalUsex.g:2320:4: (lv_patternVariableName_0_0= ruleUnrestrictedName )
                    // InternalUsex.g:2321:5: lv_patternVariableName_0_0= ruleUnrestrictedName
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPatternExpCSAccess().getPatternVariableNameUnrestrictedNameParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPatternExpCSAccess().getColonKeyword_1());
              		
            }
            // InternalUsex.g:2342:3: ( (lv_ownedPatternType_2_0= ruleTypeExpCS ) )
            // InternalUsex.g:2343:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            {
            // InternalUsex.g:2343:4: (lv_ownedPatternType_2_0= ruleTypeExpCS )
            // InternalUsex.g:2344:5: lv_ownedPatternType_2_0= ruleTypeExpCS
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
    // InternalUsex.g:2365:1: entryRuleTypeExpCS returns [EObject current=null] : iv_ruleTypeExpCS= ruleTypeExpCS EOF ;
    public final EObject entryRuleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpCS = null;


        try {
            // InternalUsex.g:2365:50: (iv_ruleTypeExpCS= ruleTypeExpCS EOF )
            // InternalUsex.g:2366:2: iv_ruleTypeExpCS= ruleTypeExpCS EOF
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
    // InternalUsex.g:2372:1: ruleTypeExpCS returns [EObject current=null] : (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeExpWithoutMultiplicityCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2378:2: ( (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalUsex.g:2379:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalUsex.g:2379:2: (this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalUsex.g:2380:3: this_TypeExpWithoutMultiplicityCS_0= ruleTypeExpWithoutMultiplicityCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeExpCSAccess().getTypeExpWithoutMultiplicityCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_TypeExpWithoutMultiplicityCS_0=ruleTypeExpWithoutMultiplicityCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeExpWithoutMultiplicityCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUsex.g:2391:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==77) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUsex.g:2392:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalUsex.g:2392:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalUsex.g:2393:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
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
    // InternalUsex.g:2414:1: entryRuleTypeExpWithoutMultiplicityCS returns [EObject current=null] : iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF ;
    public final EObject entryRuleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExpWithoutMultiplicityCS = null;


        try {
            // InternalUsex.g:2414:69: (iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF )
            // InternalUsex.g:2415:2: iv_ruleTypeExpWithoutMultiplicityCS= ruleTypeExpWithoutMultiplicityCS EOF
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
    // InternalUsex.g:2421:1: ruleTypeExpWithoutMultiplicityCS returns [EObject current=null] : (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) ;
    public final EObject ruleTypeExpWithoutMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeNameExpCS_0 = null;

        EObject this_TypeLiteralCS_1 = null;

        EObject this_CollectionPatternCS_2 = null;



        	enterRule();

        try {
            // InternalUsex.g:2427:2: ( (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS ) )
            // InternalUsex.g:2428:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            {
            // InternalUsex.g:2428:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )
            int alt42=3;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalUsex.g:2429:3: this_TypeNameExpCS_0= ruleTypeNameExpCS
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
                    // InternalUsex.g:2441:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
                    // InternalUsex.g:2453:3: this_CollectionPatternCS_2= ruleCollectionPatternCS
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
    // InternalUsex.g:2468:1: entryRuleTypeLiteralCS returns [EObject current=null] : iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF ;
    public final EObject entryRuleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralCS = null;


        try {
            // InternalUsex.g:2468:54: (iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF )
            // InternalUsex.g:2469:2: iv_ruleTypeLiteralCS= ruleTypeLiteralCS EOF
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
    // InternalUsex.g:2475:1: ruleTypeLiteralCS returns [EObject current=null] : (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) ;
    public final EObject ruleTypeLiteralCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeCS_0 = null;

        EObject this_CollectionTypeCS_1 = null;

        EObject this_MapTypeCS_2 = null;

        EObject this_TupleTypeCS_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:2481:2: ( (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS ) )
            // InternalUsex.g:2482:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            {
            // InternalUsex.g:2482:2: (this_PrimitiveTypeCS_0= rulePrimitiveTypeCS | this_CollectionTypeCS_1= ruleCollectionTypeCS | this_MapTypeCS_2= ruleMapTypeCS | this_TupleTypeCS_3= ruleTupleTypeCS )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 21:
            case 22:
            case 23:
            case 24:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt43=1;
                }
                break;
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt43=2;
                }
                break;
            case 47:
                {
                alt43=3;
                }
                break;
            case 48:
                {
                alt43=4;
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
                    // InternalUsex.g:2483:3: this_PrimitiveTypeCS_0= rulePrimitiveTypeCS
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
                    // InternalUsex.g:2495:3: this_CollectionTypeCS_1= ruleCollectionTypeCS
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
                    // InternalUsex.g:2507:3: this_MapTypeCS_2= ruleMapTypeCS
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
                    // InternalUsex.g:2519:3: this_TupleTypeCS_3= ruleTupleTypeCS
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
    // InternalUsex.g:2534:1: entryRuleTypeLiteralExpCS returns [EObject current=null] : iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF ;
    public final EObject entryRuleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralExpCS = null;


        try {
            // InternalUsex.g:2534:57: (iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF )
            // InternalUsex.g:2535:2: iv_ruleTypeLiteralExpCS= ruleTypeLiteralExpCS EOF
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
    // InternalUsex.g:2541:1: ruleTypeLiteralExpCS returns [EObject current=null] : ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) ;
    public final EObject ruleTypeLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedType_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2547:2: ( ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) ) )
            // InternalUsex.g:2548:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            {
            // InternalUsex.g:2548:2: ( (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS ) )
            // InternalUsex.g:2549:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            {
            // InternalUsex.g:2549:3: (lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS )
            // InternalUsex.g:2550:4: lv_ownedType_0_0= ruleTypeLiteralWithMultiplicityCS
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
    // InternalUsex.g:2570:1: entryRuleTypeLiteralWithMultiplicityCS returns [EObject current=null] : iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF ;
    public final EObject entryRuleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeLiteralWithMultiplicityCS = null;


        try {
            // InternalUsex.g:2570:70: (iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF )
            // InternalUsex.g:2571:2: iv_ruleTypeLiteralWithMultiplicityCS= ruleTypeLiteralWithMultiplicityCS EOF
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
    // InternalUsex.g:2577:1: ruleTypeLiteralWithMultiplicityCS returns [EObject current=null] : (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) ;
    public final EObject ruleTypeLiteralWithMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject this_TypeLiteralCS_0 = null;

        EObject lv_ownedMultiplicity_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2583:2: ( (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? ) )
            // InternalUsex.g:2584:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            {
            // InternalUsex.g:2584:2: (this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )? )
            // InternalUsex.g:2585:3: this_TypeLiteralCS_0= ruleTypeLiteralCS ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getTypeLiteralCSParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_TypeLiteralCS_0=ruleTypeLiteralCS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_TypeLiteralCS_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUsex.g:2596:3: ( (lv_ownedMultiplicity_1_0= ruleMultiplicityCS ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==77) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUsex.g:2597:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    {
                    // InternalUsex.g:2597:4: (lv_ownedMultiplicity_1_0= ruleMultiplicityCS )
                    // InternalUsex.g:2598:5: lv_ownedMultiplicity_1_0= ruleMultiplicityCS
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
    // InternalUsex.g:2619:1: entryRuleTypeNameExpCS returns [EObject current=null] : iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF ;
    public final EObject entryRuleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeNameExpCS = null;


        try {
            // InternalUsex.g:2619:54: (iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF )
            // InternalUsex.g:2620:2: iv_ruleTypeNameExpCS= ruleTypeNameExpCS EOF
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
    // InternalUsex.g:2626:1: ruleTypeNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) ;
    public final EObject ruleTypeNameExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedPathName_0_0 = null;

        EObject lv_ownedCurlyBracketedClause_1_0 = null;

        EObject lv_ownedPatternGuard_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2632:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? ) )
            // InternalUsex.g:2633:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            {
            // InternalUsex.g:2633:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )? )
            // InternalUsex.g:2634:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            {
            // InternalUsex.g:2634:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalUsex.g:2635:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalUsex.g:2635:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalUsex.g:2636:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_38);
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

            // InternalUsex.g:2653:3: ( ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )? )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==73) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUsex.g:2654:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) ) (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    {
                    // InternalUsex.g:2654:4: ( (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS ) )
                    // InternalUsex.g:2655:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalUsex.g:2655:5: (lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS )
                    // InternalUsex.g:2656:6: lv_ownedCurlyBracketedClause_1_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_38);
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

                    // InternalUsex.g:2673:4: (otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==73) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalUsex.g:2674:5: otherlv_2= '{' ( (lv_ownedPatternGuard_3_0= ruleExpCS ) ) otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,73,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeNameExpCSAccess().getLeftCurlyBracketKeyword_1_1_0());
                              				
                            }
                            // InternalUsex.g:2678:5: ( (lv_ownedPatternGuard_3_0= ruleExpCS ) )
                            // InternalUsex.g:2679:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            {
                            // InternalUsex.g:2679:6: (lv_ownedPatternGuard_3_0= ruleExpCS )
                            // InternalUsex.g:2680:7: lv_ownedPatternGuard_3_0= ruleExpCS
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypeNameExpCSAccess().getOwnedPatternGuardExpCSParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_36);
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

                            otherlv_4=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:2707:1: entryRuleCurlyBracketedClauseCS returns [EObject current=null] : iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF ;
    public final EObject entryRuleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurlyBracketedClauseCS = null;


        try {
            // InternalUsex.g:2707:63: (iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF )
            // InternalUsex.g:2708:2: iv_ruleCurlyBracketedClauseCS= ruleCurlyBracketedClauseCS EOF
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
    // InternalUsex.g:2714:1: ruleCurlyBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleCurlyBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedParts_2_0 = null;

        EObject lv_ownedParts_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2720:2: ( ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUsex.g:2721:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUsex.g:2721:2: ( () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUsex.g:2722:3: () otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUsex.g:2722:3: ()
            // InternalUsex.g:2723:4: 
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

            otherlv_1=(Token)match(input,73,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCurlyBracketedClauseCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:2736:3: ( ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUsex.g:2737:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    {
                    // InternalUsex.g:2737:4: ( (lv_ownedParts_2_0= ruleShadowPartCS ) )
                    // InternalUsex.g:2738:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    {
                    // InternalUsex.g:2738:5: (lv_ownedParts_2_0= ruleShadowPartCS )
                    // InternalUsex.g:2739:6: lv_ownedParts_2_0= ruleShadowPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalUsex.g:2756:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==29) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalUsex.g:2757:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_41); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCurlyBracketedClauseCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:2761:5: ( (lv_ownedParts_4_0= ruleShadowPartCS ) )
                    	    // InternalUsex.g:2762:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    {
                    	    // InternalUsex.g:2762:6: (lv_ownedParts_4_0= ruleShadowPartCS )
                    	    // InternalUsex.g:2763:7: lv_ownedParts_4_0= ruleShadowPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCurlyBracketedClauseCSAccess().getOwnedPartsShadowPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:2790:1: entryRuleShadowPartCS returns [EObject current=null] : iv_ruleShadowPartCS= ruleShadowPartCS EOF ;
    public final EObject entryRuleShadowPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShadowPartCS = null;


        try {
            // InternalUsex.g:2790:53: (iv_ruleShadowPartCS= ruleShadowPartCS EOF )
            // InternalUsex.g:2791:2: iv_ruleShadowPartCS= ruleShadowPartCS EOF
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
    // InternalUsex.g:2797:1: ruleShadowPartCS returns [EObject current=null] : ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) ;
    public final EObject ruleShadowPartCS() throws RecognitionException {
        EObject current = null;

        Token lv_referredProperty_0_0=null;
        Token otherlv_1=null;
        EObject lv_ownedInitExpression_2_1 = null;

        EObject lv_ownedInitExpression_2_2 = null;

        EObject lv_ownedInitExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2803:2: ( ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) ) )
            // InternalUsex.g:2804:2: ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            {
            // InternalUsex.g:2804:2: ( ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) ) | ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_STRING) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalUsex.g:2805:3: ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    {
                    // InternalUsex.g:2805:3: ( ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) ) )
                    // InternalUsex.g:2806:4: ( (lv_referredProperty_0_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    {
                    // InternalUsex.g:2806:4: ( (lv_referredProperty_0_0= RULE_ID ) )
                    // InternalUsex.g:2807:5: (lv_referredProperty_0_0= RULE_ID )
                    {
                    // InternalUsex.g:2807:5: (lv_referredProperty_0_0= RULE_ID )
                    // InternalUsex.g:2808:6: lv_referredProperty_0_0= RULE_ID
                    {
                    lv_referredProperty_0_0=(Token)match(input,RULE_ID,FOLLOW_21); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,28,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getShadowPartCSAccess().getEqualsSignKeyword_0_1());
                      			
                    }
                    // InternalUsex.g:2828:4: ( ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) ) )
                    // InternalUsex.g:2829:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    {
                    // InternalUsex.g:2829:5: ( (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS ) )
                    // InternalUsex.g:2830:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    {
                    // InternalUsex.g:2830:6: (lv_ownedInitExpression_2_1= ruleExpCS | lv_ownedInitExpression_2_2= rulePatternExpCS )
                    int alt49=2;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                    case RULE_INT:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 52:
                    case 71:
                    case 72:
                    case 84:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 95:
                        {
                        alt49=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA49_2 = input.LA(2);

                        if ( (LA49_2==EOF||LA49_2==25||(LA49_2>=28 && LA49_2<=29)||(LA49_2>=49 && LA49_2<=70)||LA49_2==73||LA49_2==75||LA49_2==77||(LA49_2>=82 && LA49_2<=83)) ) {
                            alt49=1;
                        }
                        else if ( (LA49_2==18) ) {
                            alt49=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 49, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 18:
                        {
                        alt49=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }

                    switch (alt49) {
                        case 1 :
                            // InternalUsex.g:2831:7: lv_ownedInitExpression_2_1= ruleExpCS
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
                            // InternalUsex.g:2847:7: lv_ownedInitExpression_2_2= rulePatternExpCS
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
                    // InternalUsex.g:2867:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    {
                    // InternalUsex.g:2867:3: ( (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS ) )
                    // InternalUsex.g:2868:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    {
                    // InternalUsex.g:2868:4: (lv_ownedInitExpression_3_0= ruleStringLiteralExpCS )
                    // InternalUsex.g:2869:5: lv_ownedInitExpression_3_0= ruleStringLiteralExpCS
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
    // InternalUsex.g:2890:1: entryRuleStringLiteralExpCS returns [EObject current=null] : iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF ;
    public final EObject entryRuleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExpCS = null;


        try {
            // InternalUsex.g:2890:59: (iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF )
            // InternalUsex.g:2891:2: iv_ruleStringLiteralExpCS= ruleStringLiteralExpCS EOF
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
    // InternalUsex.g:2897:1: ruleStringLiteralExpCS returns [EObject current=null] : ( (lv_segments_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_segments_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2903:2: ( ( (lv_segments_0_0= ruleStringLiteral ) )+ )
            // InternalUsex.g:2904:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            {
            // InternalUsex.g:2904:2: ( (lv_segments_0_0= ruleStringLiteral ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_STRING) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUsex.g:2905:3: (lv_segments_0_0= ruleStringLiteral )
            	    {
            	    // InternalUsex.g:2905:3: (lv_segments_0_0= ruleStringLiteral )
            	    // InternalUsex.g:2906:4: lv_segments_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpCSAccess().getSegmentsStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_43);
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
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // InternalUsex.g:2926:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalUsex.g:2926:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalUsex.g:2927:2: iv_ruleStringLiteral= ruleStringLiteral EOF
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
    // InternalUsex.g:2933:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUsex.g:2939:2: (this_STRING_0= RULE_STRING )
            // InternalUsex.g:2940:2: this_STRING_0= RULE_STRING
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
    // InternalUsex.g:2950:1: entryRuleMultiplicityBoundsCS returns [EObject current=null] : iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF ;
    public final EObject entryRuleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityBoundsCS = null;


        try {
            // InternalUsex.g:2950:61: (iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF )
            // InternalUsex.g:2951:2: iv_ruleMultiplicityBoundsCS= ruleMultiplicityBoundsCS EOF
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
    // InternalUsex.g:2957:1: ruleMultiplicityBoundsCS returns [EObject current=null] : ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) ;
    public final EObject ruleMultiplicityBoundsCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lowerBound_0_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:2963:2: ( ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? ) )
            // InternalUsex.g:2964:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            {
            // InternalUsex.g:2964:2: ( ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )? )
            // InternalUsex.g:2965:3: ( (lv_lowerBound_0_0= ruleLOWER ) ) (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            {
            // InternalUsex.g:2965:3: ( (lv_lowerBound_0_0= ruleLOWER ) )
            // InternalUsex.g:2966:4: (lv_lowerBound_0_0= ruleLOWER )
            {
            // InternalUsex.g:2966:4: (lv_lowerBound_0_0= ruleLOWER )
            // InternalUsex.g:2967:5: lv_lowerBound_0_0= ruleLOWER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundLOWERParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
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

            // InternalUsex.g:2984:3: (otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUsex.g:2985:4: otherlv_1= '..' ( (lv_upperBound_2_0= ruleUPPER ) )
                    {
                    otherlv_1=(Token)match(input,76,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMultiplicityBoundsCSAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:2989:4: ( (lv_upperBound_2_0= ruleUPPER ) )
                    // InternalUsex.g:2990:5: (lv_upperBound_2_0= ruleUPPER )
                    {
                    // InternalUsex.g:2990:5: (lv_upperBound_2_0= ruleUPPER )
                    // InternalUsex.g:2991:6: lv_upperBound_2_0= ruleUPPER
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
    // InternalUsex.g:3013:1: entryRuleMultiplicityCS returns [EObject current=null] : iv_ruleMultiplicityCS= ruleMultiplicityCS EOF ;
    public final EObject entryRuleMultiplicityCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityCS = null;


        try {
            // InternalUsex.g:3013:55: (iv_ruleMultiplicityCS= ruleMultiplicityCS EOF )
            // InternalUsex.g:3014:2: iv_ruleMultiplicityCS= ruleMultiplicityCS EOF
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
    // InternalUsex.g:3020:1: ruleMultiplicityCS returns [EObject current=null] : (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' ) ;
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
            // InternalUsex.g:3026:2: ( (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' ) )
            // InternalUsex.g:3027:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' )
            {
            // InternalUsex.g:3027:2: (otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']' )
            // InternalUsex.g:3028:3: otherlv_0= '[' (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS ) ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMultiplicityCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalUsex.g:3032:3: (this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS | this_MultiplicityStringCS_2= ruleMultiplicityStringCS )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            else if ( (LA53_0==49||LA53_0==51||LA53_0==81) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalUsex.g:3033:4: this_MultiplicityBoundsCS_1= ruleMultiplicityBoundsCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityBoundsCSParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FOLLOW_47);
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
                    // InternalUsex.g:3045:4: this_MultiplicityStringCS_2= ruleMultiplicityStringCS
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMultiplicityCSAccess().getMultiplicityStringCSParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_47);
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

            // InternalUsex.g:3057:3: ( ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=78 && LA55_0<=79)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalUsex.g:3058:4: ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) )
                    {
                    // InternalUsex.g:3058:4: ( (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' ) )
                    // InternalUsex.g:3059:5: (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' )
                    {
                    // InternalUsex.g:3059:5: (lv_symbol_3_1= '|?' | lv_symbol_3_2= '|1' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==78) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==79) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalUsex.g:3060:6: lv_symbol_3_1= '|?'
                            {
                            lv_symbol_3_1=(Token)match(input,78,FOLLOW_48); if (state.failed) return current;
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
                            // InternalUsex.g:3071:6: lv_symbol_3_2= '|1'
                            {
                            lv_symbol_3_2=(Token)match(input,79,FOLLOW_48); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:3092:1: entryRuleMultiplicityStringCS returns [EObject current=null] : iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF ;
    public final EObject entryRuleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicityStringCS = null;


        try {
            // InternalUsex.g:3092:61: (iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF )
            // InternalUsex.g:3093:2: iv_ruleMultiplicityStringCS= ruleMultiplicityStringCS EOF
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
    // InternalUsex.g:3099:1: ruleMultiplicityStringCS returns [EObject current=null] : ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) ;
    public final EObject ruleMultiplicityStringCS() throws RecognitionException {
        EObject current = null;

        Token lv_stringBounds_0_1=null;
        Token lv_stringBounds_0_2=null;
        Token lv_stringBounds_0_3=null;


        	enterRule();

        try {
            // InternalUsex.g:3105:2: ( ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) ) )
            // InternalUsex.g:3106:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            {
            // InternalUsex.g:3106:2: ( ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) ) )
            // InternalUsex.g:3107:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            {
            // InternalUsex.g:3107:3: ( (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' ) )
            // InternalUsex.g:3108:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            {
            // InternalUsex.g:3108:4: (lv_stringBounds_0_1= '*' | lv_stringBounds_0_2= '+' | lv_stringBounds_0_3= '?' )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt56=1;
                }
                break;
            case 51:
                {
                alt56=2;
                }
                break;
            case 81:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalUsex.g:3109:5: lv_stringBounds_0_1= '*'
                    {
                    lv_stringBounds_0_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUsex.g:3120:5: lv_stringBounds_0_2= '+'
                    {
                    lv_stringBounds_0_2=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUsex.g:3131:5: lv_stringBounds_0_3= '?'
                    {
                    lv_stringBounds_0_3=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:3147:1: entryRulePathNameCS returns [EObject current=null] : iv_rulePathNameCS= rulePathNameCS EOF ;
    public final EObject entryRulePathNameCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameCS = null;


        try {
            // InternalUsex.g:3147:51: (iv_rulePathNameCS= rulePathNameCS EOF )
            // InternalUsex.g:3148:2: iv_rulePathNameCS= rulePathNameCS EOF
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
    // InternalUsex.g:3154:1: rulePathNameCS returns [EObject current=null] : ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* ) ;
    public final EObject rulePathNameCS() throws RecognitionException {
        EObject current = null;

        Token lv_ownedPathElements_0_0=null;
        Token otherlv_1=null;
        Token lv_ownedPathElements_2_0=null;


        	enterRule();

        try {
            // InternalUsex.g:3160:2: ( ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* ) )
            // InternalUsex.g:3161:2: ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* )
            {
            // InternalUsex.g:3161:2: ( ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )* )
            // InternalUsex.g:3162:3: ( (lv_ownedPathElements_0_0= RULE_ID ) ) (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )*
            {
            // InternalUsex.g:3162:3: ( (lv_ownedPathElements_0_0= RULE_ID ) )
            // InternalUsex.g:3163:4: (lv_ownedPathElements_0_0= RULE_ID )
            {
            // InternalUsex.g:3163:4: (lv_ownedPathElements_0_0= RULE_ID )
            // InternalUsex.g:3164:5: lv_ownedPathElements_0_0= RULE_ID
            {
            lv_ownedPathElements_0_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
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

            // InternalUsex.g:3180:3: (otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==82) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUsex.g:3181:4: otherlv_1= '::' ( (lv_ownedPathElements_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,82,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getPathNameCSAccess().getColonColonKeyword_1_0());
            	      			
            	    }
            	    // InternalUsex.g:3185:4: ( (lv_ownedPathElements_2_0= RULE_ID ) )
            	    // InternalUsex.g:3186:5: (lv_ownedPathElements_2_0= RULE_ID )
            	    {
            	    // InternalUsex.g:3186:5: (lv_ownedPathElements_2_0= RULE_ID )
            	    // InternalUsex.g:3187:6: lv_ownedPathElements_2_0= RULE_ID
            	    {
            	    lv_ownedPathElements_2_0=(Token)match(input,RULE_ID,FOLLOW_49); if (state.failed) return current;
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
            	    break loop57;
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
    // InternalUsex.g:3208:1: entryRuleUPPER returns [String current=null] : iv_ruleUPPER= ruleUPPER EOF ;
    public final String entryRuleUPPER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUPPER = null;


        try {
            // InternalUsex.g:3208:45: (iv_ruleUPPER= ruleUPPER EOF )
            // InternalUsex.g:3209:2: iv_ruleUPPER= ruleUPPER EOF
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
    // InternalUsex.g:3215:1: ruleUPPER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleUPPER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUsex.g:3221:2: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // InternalUsex.g:3222:2: (this_INT_0= RULE_INT | kw= '*' )
            {
            // InternalUsex.g:3222:2: (this_INT_0= RULE_INT | kw= '*' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT) ) {
                alt58=1;
            }
            else if ( (LA58_0==49) ) {
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
                    // InternalUsex.g:3223:3: this_INT_0= RULE_INT
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
                    // InternalUsex.g:3231:3: kw= '*'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:3240:1: entryRuleLOWER returns [String current=null] : iv_ruleLOWER= ruleLOWER EOF ;
    public final String entryRuleLOWER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOWER = null;


        try {
            // InternalUsex.g:3240:45: (iv_ruleLOWER= ruleLOWER EOF )
            // InternalUsex.g:3241:2: iv_ruleLOWER= ruleLOWER EOF
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
    // InternalUsex.g:3247:1: ruleLOWER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLOWER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUsex.g:3253:2: (this_INT_0= RULE_INT )
            // InternalUsex.g:3254:2: this_INT_0= RULE_INT
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
    // InternalUsex.g:3264:1: entryRuleExpCS returns [EObject current=null] : iv_ruleExpCS= ruleExpCS EOF ;
    public final EObject entryRuleExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpCS = null;


        try {
            // InternalUsex.g:3264:46: (iv_ruleExpCS= ruleExpCS EOF )
            // InternalUsex.g:3265:2: iv_ruleExpCS= ruleExpCS EOF
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
    // InternalUsex.g:3271:1: ruleExpCS returns [EObject current=null] : ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) ;
    public final EObject ruleExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRight_3_0 = null;

        EObject this_PrefixedLetExpCS_4 = null;



        	enterRule();

        try {
            // InternalUsex.g:3277:2: ( ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS ) )
            // InternalUsex.g:3278:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            {
            // InternalUsex.g:3278:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalUsex.g:3279:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:3279:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:3280:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpCSAccess().getPrefixedPrimaryExpCSParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_50);
                    this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_PrefixedPrimaryExpCS_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalUsex.g:3291:4: ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==28||(LA59_0>=49 && LA59_0<=70)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalUsex.g:3292:5: () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:3292:5: ()
                            // InternalUsex.g:3293:6: 
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

                            // InternalUsex.g:3302:5: ( (lv_operator_2_0= ruleBinaryOperatorName ) )
                            // InternalUsex.g:3303:6: (lv_operator_2_0= ruleBinaryOperatorName )
                            {
                            // InternalUsex.g:3303:6: (lv_operator_2_0= ruleBinaryOperatorName )
                            // InternalUsex.g:3304:7: lv_operator_2_0= ruleBinaryOperatorName
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpCSAccess().getOperatorBinaryOperatorNameParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_13);
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

                            // InternalUsex.g:3321:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                            // InternalUsex.g:3322:6: (lv_ownedRight_3_0= ruleExpCS )
                            {
                            // InternalUsex.g:3322:6: (lv_ownedRight_3_0= ruleExpCS )
                            // InternalUsex.g:3323:7: lv_ownedRight_3_0= ruleExpCS
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
                    // InternalUsex.g:3343:3: this_PrefixedLetExpCS_4= rulePrefixedLetExpCS
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
    // InternalUsex.g:3358:1: entryRulePrefixedLetExpCS returns [EObject current=null] : iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF ;
    public final EObject entryRulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedLetExpCS = null;


        try {
            // InternalUsex.g:3358:57: (iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF )
            // InternalUsex.g:3359:2: iv_rulePrefixedLetExpCS= rulePrefixedLetExpCS EOF
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
    // InternalUsex.g:3365:1: rulePrefixedLetExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) ;
    public final EObject rulePrefixedLetExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_LetExpCS_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:3371:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS ) )
            // InternalUsex.g:3372:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            {
            // InternalUsex.g:3372:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) ) | this_LetExpCS_3= ruleLetExpCS )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52||(LA61_0>=71 && LA61_0<=72)) ) {
                alt61=1;
            }
            else if ( (LA61_0==95) ) {
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
                    // InternalUsex.g:3373:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    {
                    // InternalUsex.g:3373:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) ) )
                    // InternalUsex.g:3374:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    {
                    // InternalUsex.g:3374:4: ()
                    // InternalUsex.g:3375:5: 
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

                    // InternalUsex.g:3384:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalUsex.g:3385:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalUsex.g:3385:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalUsex.g:3386:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedLetExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
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

                    // InternalUsex.g:3403:4: ( (lv_ownedRight_2_0= rulePrefixedLetExpCS ) )
                    // InternalUsex.g:3404:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    {
                    // InternalUsex.g:3404:5: (lv_ownedRight_2_0= rulePrefixedLetExpCS )
                    // InternalUsex.g:3405:6: lv_ownedRight_2_0= rulePrefixedLetExpCS
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
                    // InternalUsex.g:3424:3: this_LetExpCS_3= ruleLetExpCS
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
    // InternalUsex.g:3439:1: entryRulePrefixedPrimaryExpCS returns [EObject current=null] : iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF ;
    public final EObject entryRulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedPrimaryExpCS = null;


        try {
            // InternalUsex.g:3439:61: (iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF )
            // InternalUsex.g:3440:2: iv_rulePrefixedPrimaryExpCS= rulePrefixedPrimaryExpCS EOF
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
    // InternalUsex.g:3446:1: rulePrefixedPrimaryExpCS returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) ;
    public final EObject rulePrefixedPrimaryExpCS() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ownedRight_2_0 = null;

        EObject this_PrimaryExpCS_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:3452:2: ( ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS ) )
            // InternalUsex.g:3453:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            {
            // InternalUsex.g:3453:2: ( ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) ) | this_PrimaryExpCS_3= rulePrimaryExpCS )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==52||(LA62_0>=71 && LA62_0<=72)) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=RULE_ID && LA62_0<=RULE_INT)||(LA62_0>=21 && LA62_0<=25)||(LA62_0>=38 && LA62_0<=49)||LA62_0==84||(LA62_0>=86 && LA62_0<=90)) ) {
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
                    // InternalUsex.g:3454:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    {
                    // InternalUsex.g:3454:3: ( () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) ) )
                    // InternalUsex.g:3455:4: () ( (lv_name_1_0= ruleUnaryOperatorName ) ) ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    {
                    // InternalUsex.g:3455:4: ()
                    // InternalUsex.g:3456:5: 
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

                    // InternalUsex.g:3465:4: ( (lv_name_1_0= ruleUnaryOperatorName ) )
                    // InternalUsex.g:3466:5: (lv_name_1_0= ruleUnaryOperatorName )
                    {
                    // InternalUsex.g:3466:5: (lv_name_1_0= ruleUnaryOperatorName )
                    // InternalUsex.g:3467:6: lv_name_1_0= ruleUnaryOperatorName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrefixedPrimaryExpCSAccess().getNameUnaryOperatorNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
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

                    // InternalUsex.g:3484:4: ( (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS ) )
                    // InternalUsex.g:3485:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    {
                    // InternalUsex.g:3485:5: (lv_ownedRight_2_0= rulePrefixedPrimaryExpCS )
                    // InternalUsex.g:3486:6: lv_ownedRight_2_0= rulePrefixedPrimaryExpCS
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
                    // InternalUsex.g:3505:3: this_PrimaryExpCS_3= rulePrimaryExpCS
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
    // InternalUsex.g:3520:1: entryRulePrimaryExpCS returns [EObject current=null] : iv_rulePrimaryExpCS= rulePrimaryExpCS EOF ;
    public final EObject entryRulePrimaryExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpCS = null;


        try {
            // InternalUsex.g:3520:53: (iv_rulePrimaryExpCS= rulePrimaryExpCS EOF )
            // InternalUsex.g:3521:2: iv_rulePrimaryExpCS= rulePrimaryExpCS EOF
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
    // InternalUsex.g:3527:1: rulePrimaryExpCS returns [EObject current=null] : (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS ) ;
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
            // InternalUsex.g:3533:2: ( (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS ) )
            // InternalUsex.g:3534:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )
            {
            // InternalUsex.g:3534:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )
            int alt63=9;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalUsex.g:3535:3: this_NestedExpCS_0= ruleNestedExpCS
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
                    // InternalUsex.g:3547:3: this_IfExpCS_1= ruleIfExpCS
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
                    // InternalUsex.g:3559:3: this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS
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
                    // InternalUsex.g:3571:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
                    // InternalUsex.g:3583:3: this_MapLiteralExpCS_4= ruleMapLiteralExpCS
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
                    // InternalUsex.g:3595:3: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
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
                    // InternalUsex.g:3607:3: this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS
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
                    // InternalUsex.g:3619:3: this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS
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
                    // InternalUsex.g:3631:3: this_NameExpCS_8= ruleNameExpCS
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
    // InternalUsex.g:3646:1: entryRulePrimitiveLiteralExpCS returns [EObject current=null] : iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF ;
    public final EObject entryRulePrimitiveLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExpCS = null;


        try {
            // InternalUsex.g:3646:62: (iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF )
            // InternalUsex.g:3647:2: iv_rulePrimitiveLiteralExpCS= rulePrimitiveLiteralExpCS EOF
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
    // InternalUsex.g:3653:1: rulePrimitiveLiteralExpCS returns [EObject current=null] : (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) ;
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
            // InternalUsex.g:3659:2: ( (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS ) )
            // InternalUsex.g:3660:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            {
            // InternalUsex.g:3660:2: (this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS | this_StringLiteralExpCS_1= ruleStringLiteralExpCS | this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS | this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS | this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS | this_NullLiteralExpCS_5= ruleNullLiteralExpCS )
            int alt64=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt64=1;
                }
                break;
            case RULE_STRING:
                {
                alt64=2;
                }
                break;
            case 86:
            case 87:
                {
                alt64=3;
                }
                break;
            case 49:
                {
                alt64=4;
                }
                break;
            case 88:
                {
                alt64=5;
                }
                break;
            case 89:
                {
                alt64=6;
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
                    // InternalUsex.g:3661:3: this_NumberLiteralExpCS_0= ruleNumberLiteralExpCS
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
                    // InternalUsex.g:3673:3: this_StringLiteralExpCS_1= ruleStringLiteralExpCS
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
                    // InternalUsex.g:3685:3: this_BooleanLiteralExpCS_2= ruleBooleanLiteralExpCS
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
                    // InternalUsex.g:3697:3: this_UnlimitedNaturalLiteralExpCS_3= ruleUnlimitedNaturalLiteralExpCS
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
                    // InternalUsex.g:3709:3: this_InvalidLiteralExpCS_4= ruleInvalidLiteralExpCS
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
                    // InternalUsex.g:3721:3: this_NullLiteralExpCS_5= ruleNullLiteralExpCS
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
    // InternalUsex.g:3736:1: entryRuleNameExpCS returns [EObject current=null] : iv_ruleNameExpCS= ruleNameExpCS EOF ;
    public final EObject entryRuleNameExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExpCS = null;


        try {
            // InternalUsex.g:3736:50: (iv_ruleNameExpCS= ruleNameExpCS EOF )
            // InternalUsex.g:3737:2: iv_ruleNameExpCS= ruleNameExpCS EOF
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
    // InternalUsex.g:3743:1: ruleNameExpCS returns [EObject current=null] : ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? ) ;
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
            // InternalUsex.g:3749:2: ( ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? ) )
            // InternalUsex.g:3750:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? )
            {
            // InternalUsex.g:3750:2: ( ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )? )
            // InternalUsex.g:3751:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) ) ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )* ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )? ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )? ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )?
            {
            // InternalUsex.g:3751:3: ( (lv_ownedPathName_0_0= rulePathNameCS ) )
            // InternalUsex.g:3752:4: (lv_ownedPathName_0_0= rulePathNameCS )
            {
            // InternalUsex.g:3752:4: (lv_ownedPathName_0_0= rulePathNameCS )
            // InternalUsex.g:3753:5: lv_ownedPathName_0_0= rulePathNameCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedPathNamePathNameCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalUsex.g:3770:3: ( (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==77) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalUsex.g:3771:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    {
            	    // InternalUsex.g:3771:4: (lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS )
            	    // InternalUsex.g:3772:5: lv_ownedSquareBracketedClauses_1_0= ruleSquareBracketedClauseCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedSquareBracketedClausesSquareBracketedClauseCSParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop65;
                }
            } while (true);

            // InternalUsex.g:3789:3: ( (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==25) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalUsex.g:3790:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalUsex.g:3790:4: (lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS )
                    // InternalUsex.g:3791:5: lv_ownedRoundBracketedClause_2_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_52);
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

            // InternalUsex.g:3808:3: ( (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==73) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalUsex.g:3809:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    {
                    // InternalUsex.g:3809:4: (lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS )
                    // InternalUsex.g:3810:5: lv_ownedCurlyBracketedClause_3_0= ruleCurlyBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getNameExpCSAccess().getOwnedCurlyBracketedClauseCurlyBracketedClauseCSParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_53);
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

            // InternalUsex.g:3827:3: ( ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==83) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalUsex.g:3828:4: ( (lv_isPre_4_0= '@' ) ) ( (lv_pre_5_0= 'pre' ) )
                    {
                    // InternalUsex.g:3828:4: ( (lv_isPre_4_0= '@' ) )
                    // InternalUsex.g:3829:5: (lv_isPre_4_0= '@' )
                    {
                    // InternalUsex.g:3829:5: (lv_isPre_4_0= '@' )
                    // InternalUsex.g:3830:6: lv_isPre_4_0= '@'
                    {
                    lv_isPre_4_0=(Token)match(input,83,FOLLOW_54); if (state.failed) return current;
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

                    // InternalUsex.g:3842:4: ( (lv_pre_5_0= 'pre' ) )
                    // InternalUsex.g:3843:5: (lv_pre_5_0= 'pre' )
                    {
                    // InternalUsex.g:3843:5: (lv_pre_5_0= 'pre' )
                    // InternalUsex.g:3844:6: lv_pre_5_0= 'pre'
                    {
                    lv_pre_5_0=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:3861:1: entryRuleSquareBracketedClauseCS returns [EObject current=null] : iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF ;
    public final EObject entryRuleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketedClauseCS = null;


        try {
            // InternalUsex.g:3861:64: (iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF )
            // InternalUsex.g:3862:2: iv_ruleSquareBracketedClauseCS= ruleSquareBracketedClauseCS EOF
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
    // InternalUsex.g:3868:1: ruleSquareBracketedClauseCS returns [EObject current=null] : (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleSquareBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedTerms_1_0 = null;

        EObject lv_ownedTerms_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:3874:2: ( (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' ) )
            // InternalUsex.g:3875:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            {
            // InternalUsex.g:3875:2: (otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']' )
            // InternalUsex.g:3876:3: otherlv_0= '[' ( (lv_ownedTerms_1_0= ruleExpCS ) ) (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSquareBracketedClauseCSAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalUsex.g:3880:3: ( (lv_ownedTerms_1_0= ruleExpCS ) )
            // InternalUsex.g:3881:4: (lv_ownedTerms_1_0= ruleExpCS )
            {
            // InternalUsex.g:3881:4: (lv_ownedTerms_1_0= ruleExpCS )
            // InternalUsex.g:3882:5: lv_ownedTerms_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            // InternalUsex.g:3899:3: (otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==29) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalUsex.g:3900:4: otherlv_2= ',' ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getSquareBracketedClauseCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUsex.g:3904:4: ( (lv_ownedTerms_3_0= ruleExpCS ) )
            	    // InternalUsex.g:3905:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    {
            	    // InternalUsex.g:3905:5: (lv_ownedTerms_3_0= ruleExpCS )
            	    // InternalUsex.g:3906:6: lv_ownedTerms_3_0= ruleExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketedClauseCSAccess().getOwnedTermsExpCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop69;
                }
            } while (true);

            otherlv_4=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:3932:1: entryRuleCollectionLiteralExpCS returns [EObject current=null] : iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF ;
    public final EObject entryRuleCollectionLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExpCS = null;


        try {
            // InternalUsex.g:3932:63: (iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF )
            // InternalUsex.g:3933:2: iv_ruleCollectionLiteralExpCS= ruleCollectionLiteralExpCS EOF
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
    // InternalUsex.g:3939:1: ruleCollectionLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalUsex.g:3945:2: ( ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUsex.g:3946:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUsex.g:3946:2: ( ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUsex.g:3947:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUsex.g:3947:3: ( (lv_ownedType_0_0= ruleCollectionTypeCS ) )
            // InternalUsex.g:3948:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            {
            // InternalUsex.g:3948:4: (lv_ownedType_0_0= ruleCollectionTypeCS )
            // InternalUsex.g:3949:5: lv_ownedType_0_0= ruleCollectionTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeCollectionTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_1=(Token)match(input,73,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:3970:3: ( ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_ID && LA71_0<=RULE_INT)||LA71_0==18||(LA71_0>=21 && LA71_0<=25)||(LA71_0>=38 && LA71_0<=49)||LA71_0==52||(LA71_0>=71 && LA71_0<=72)||LA71_0==84||(LA71_0>=86 && LA71_0<=90)||LA71_0==95) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalUsex.g:3971:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    {
                    // InternalUsex.g:3971:4: ( (lv_ownedParts_2_0= ruleCollectionLiteralPartCS ) )
                    // InternalUsex.g:3972:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    {
                    // InternalUsex.g:3972:5: (lv_ownedParts_2_0= ruleCollectionLiteralPartCS )
                    // InternalUsex.g:3973:6: lv_ownedParts_2_0= ruleCollectionLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalUsex.g:3990:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==29) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalUsex.g:3991:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getCollectionLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:3995:5: ( (lv_ownedParts_4_0= ruleCollectionLiteralPartCS ) )
                    	    // InternalUsex.g:3996:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    {
                    	    // InternalUsex.g:3996:6: (lv_ownedParts_4_0= ruleCollectionLiteralPartCS )
                    	    // InternalUsex.g:3997:7: lv_ownedParts_4_0= ruleCollectionLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsCollectionLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4024:1: entryRuleCollectionLiteralPartCS returns [EObject current=null] : iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF ;
    public final EObject entryRuleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPartCS = null;


        try {
            // InternalUsex.g:4024:64: (iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF )
            // InternalUsex.g:4025:2: iv_ruleCollectionLiteralPartCS= ruleCollectionLiteralPartCS EOF
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
    // InternalUsex.g:4031:1: ruleCollectionLiteralPartCS returns [EObject current=null] : ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) ;
    public final EObject ruleCollectionLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedLastExpression_2_0 = null;

        EObject lv_ownedExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4037:2: ( ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) ) )
            // InternalUsex.g:4038:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            {
            // InternalUsex.g:4038:2: ( ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? ) | ( (lv_ownedExpression_3_0= rulePatternExpCS ) ) )
            int alt73=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 52:
            case 71:
            case 72:
            case 84:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 95:
                {
                alt73=1;
                }
                break;
            case RULE_ID:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==18) ) {
                    alt73=2;
                }
                else if ( (LA73_2==EOF||LA73_2==25||(LA73_2>=28 && LA73_2<=29)||(LA73_2>=49 && LA73_2<=70)||LA73_2==73||(LA73_2>=75 && LA73_2<=77)||(LA73_2>=82 && LA73_2<=83)) ) {
                    alt73=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt73=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalUsex.g:4039:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:4039:3: ( ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:4040:4: ( (lv_ownedExpression_0_0= ruleExpCS ) ) (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:4040:4: ( (lv_ownedExpression_0_0= ruleExpCS ) )
                    // InternalUsex.g:4041:5: (lv_ownedExpression_0_0= ruleExpCS )
                    {
                    // InternalUsex.g:4041:5: (lv_ownedExpression_0_0= ruleExpCS )
                    // InternalUsex.g:4042:6: lv_ownedExpression_0_0= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartCSAccess().getOwnedExpressionExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
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

                    // InternalUsex.g:4059:4: (otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==76) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalUsex.g:4060:5: otherlv_1= '..' ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            {
                            otherlv_1=(Token)match(input,76,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartCSAccess().getFullStopFullStopKeyword_0_1_0());
                              				
                            }
                            // InternalUsex.g:4064:5: ( (lv_ownedLastExpression_2_0= ruleExpCS ) )
                            // InternalUsex.g:4065:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            {
                            // InternalUsex.g:4065:6: (lv_ownedLastExpression_2_0= ruleExpCS )
                            // InternalUsex.g:4066:7: lv_ownedLastExpression_2_0= ruleExpCS
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
                    // InternalUsex.g:4086:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    {
                    // InternalUsex.g:4086:3: ( (lv_ownedExpression_3_0= rulePatternExpCS ) )
                    // InternalUsex.g:4087:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    {
                    // InternalUsex.g:4087:4: (lv_ownedExpression_3_0= rulePatternExpCS )
                    // InternalUsex.g:4088:5: lv_ownedExpression_3_0= rulePatternExpCS
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
    // InternalUsex.g:4109:1: entryRuleLambdaLiteralExpCS returns [EObject current=null] : iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF ;
    public final EObject entryRuleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambdaLiteralExpCS = null;


        try {
            // InternalUsex.g:4109:59: (iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF )
            // InternalUsex.g:4110:2: iv_ruleLambdaLiteralExpCS= ruleLambdaLiteralExpCS EOF
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
    // InternalUsex.g:4116:1: ruleLambdaLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) ;
    public final EObject ruleLambdaLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedExpressionCS_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4122:2: ( (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' ) )
            // InternalUsex.g:4123:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            {
            // InternalUsex.g:4123:2: (otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}' )
            // InternalUsex.g:4124:3: otherlv_0= 'Lambda' otherlv_1= '{' ( (lv_ownedExpressionCS_2_0= ruleExpCS ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLambdaLiteralExpCSAccess().getLambdaKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,73,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLambdaLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4132:3: ( (lv_ownedExpressionCS_2_0= ruleExpCS ) )
            // InternalUsex.g:4133:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            {
            // InternalUsex.g:4133:4: (lv_ownedExpressionCS_2_0= ruleExpCS )
            // InternalUsex.g:4134:5: lv_ownedExpressionCS_2_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLambdaLiteralExpCSAccess().getOwnedExpressionCSExpCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_36);
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

            otherlv_3=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4159:1: entryRuleMapLiteralExpCS returns [EObject current=null] : iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF ;
    public final EObject entryRuleMapLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralExpCS = null;


        try {
            // InternalUsex.g:4159:56: (iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF )
            // InternalUsex.g:4160:2: iv_ruleMapLiteralExpCS= ruleMapLiteralExpCS EOF
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
    // InternalUsex.g:4166:1: ruleMapLiteralExpCS returns [EObject current=null] : ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) ;
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
            // InternalUsex.g:4172:2: ( ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' ) )
            // InternalUsex.g:4173:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            {
            // InternalUsex.g:4173:2: ( ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}' )
            // InternalUsex.g:4174:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) ) otherlv_1= '{' ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )? otherlv_5= '}'
            {
            // InternalUsex.g:4174:3: ( (lv_ownedType_0_0= ruleMapTypeCS ) )
            // InternalUsex.g:4175:4: (lv_ownedType_0_0= ruleMapTypeCS )
            {
            // InternalUsex.g:4175:4: (lv_ownedType_0_0= ruleMapTypeCS )
            // InternalUsex.g:4176:5: lv_ownedType_0_0= ruleMapTypeCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedTypeMapTypeCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_1=(Token)match(input,73,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4197:3: ( ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ID && LA75_0<=RULE_INT)||(LA75_0>=21 && LA75_0<=25)||(LA75_0>=38 && LA75_0<=49)||LA75_0==52||(LA75_0>=71 && LA75_0<=72)||LA75_0==84||(LA75_0>=86 && LA75_0<=90)||LA75_0==95) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalUsex.g:4198:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    {
                    // InternalUsex.g:4198:4: ( (lv_ownedParts_2_0= ruleMapLiteralPartCS ) )
                    // InternalUsex.g:4199:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    {
                    // InternalUsex.g:4199:5: (lv_ownedParts_2_0= ruleMapLiteralPartCS )
                    // InternalUsex.g:4200:6: lv_ownedParts_2_0= ruleMapLiteralPartCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_40);
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

                    // InternalUsex.g:4217:4: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==29) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalUsex.g:4218:5: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    {
                    	    otherlv_3=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMapLiteralExpCSAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUsex.g:4222:5: ( (lv_ownedParts_4_0= ruleMapLiteralPartCS ) )
                    	    // InternalUsex.g:4223:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    {
                    	    // InternalUsex.g:4223:6: (lv_ownedParts_4_0= ruleMapLiteralPartCS )
                    	    // InternalUsex.g:4224:7: lv_ownedParts_4_0= ruleMapLiteralPartCS
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMapLiteralExpCSAccess().getOwnedPartsMapLiteralPartCSParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_40);
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
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4251:1: entryRuleMapLiteralPartCS returns [EObject current=null] : iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF ;
    public final EObject entryRuleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapLiteralPartCS = null;


        try {
            // InternalUsex.g:4251:57: (iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF )
            // InternalUsex.g:4252:2: iv_ruleMapLiteralPartCS= ruleMapLiteralPartCS EOF
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
    // InternalUsex.g:4258:1: ruleMapLiteralPartCS returns [EObject current=null] : ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) ;
    public final EObject ruleMapLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedKey_0_0 = null;

        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4264:2: ( ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4265:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4265:2: ( ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) ) )
            // InternalUsex.g:4266:3: ( (lv_ownedKey_0_0= ruleExpCS ) ) otherlv_1= '<-' ( (lv_ownedValue_2_0= ruleExpCS ) )
            {
            // InternalUsex.g:4266:3: ( (lv_ownedKey_0_0= ruleExpCS ) )
            // InternalUsex.g:4267:4: (lv_ownedKey_0_0= ruleExpCS )
            {
            // InternalUsex.g:4267:4: (lv_ownedKey_0_0= ruleExpCS )
            // InternalUsex.g:4268:5: lv_ownedKey_0_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMapLiteralPartCSAccess().getOwnedKeyExpCSParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_58);
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

            otherlv_1=(Token)match(input,85,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMapLiteralPartCSAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalUsex.g:4289:3: ( (lv_ownedValue_2_0= ruleExpCS ) )
            // InternalUsex.g:4290:4: (lv_ownedValue_2_0= ruleExpCS )
            {
            // InternalUsex.g:4290:4: (lv_ownedValue_2_0= ruleExpCS )
            // InternalUsex.g:4291:5: lv_ownedValue_2_0= ruleExpCS
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
    // InternalUsex.g:4312:1: entryRuleTupleLiteralExpCS returns [EObject current=null] : iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF ;
    public final EObject entryRuleTupleLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpCS = null;


        try {
            // InternalUsex.g:4312:58: (iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF )
            // InternalUsex.g:4313:2: iv_ruleTupleLiteralExpCS= ruleTupleLiteralExpCS EOF
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
    // InternalUsex.g:4319:1: ruleTupleLiteralExpCS returns [EObject current=null] : (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) ;
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
            // InternalUsex.g:4325:2: ( (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' ) )
            // InternalUsex.g:4326:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            {
            // InternalUsex.g:4326:2: (otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}' )
            // InternalUsex.g:4327:3: otherlv_0= 'Tuple' otherlv_1= '{' ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) ) (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpCSAccess().getTupleKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,73,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpCSAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUsex.g:4335:3: ( (lv_ownedParts_2_0= ruleTupleLiteralPartCS ) )
            // InternalUsex.g:4336:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            {
            // InternalUsex.g:4336:4: (lv_ownedParts_2_0= ruleTupleLiteralPartCS )
            // InternalUsex.g:4337:5: lv_ownedParts_2_0= ruleTupleLiteralPartCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_40);
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

            // InternalUsex.g:4354:3: (otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==29) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalUsex.g:4355:4: otherlv_3= ',' ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleLiteralExpCSAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUsex.g:4359:4: ( (lv_ownedParts_4_0= ruleTupleLiteralPartCS ) )
            	    // InternalUsex.g:4360:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    {
            	    // InternalUsex.g:4360:5: (lv_ownedParts_4_0= ruleTupleLiteralPartCS )
            	    // InternalUsex.g:4361:6: lv_ownedParts_4_0= ruleTupleLiteralPartCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsTupleLiteralPartCSParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop76;
                }
            } while (true);

            otherlv_5=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4387:1: entryRuleTupleLiteralPartCS returns [EObject current=null] : iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF ;
    public final EObject entryRuleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPartCS = null;


        try {
            // InternalUsex.g:4387:59: (iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF )
            // InternalUsex.g:4388:2: iv_ruleTupleLiteralPartCS= ruleTupleLiteralPartCS EOF
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
    // InternalUsex.g:4394:1: ruleTupleLiteralPartCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) ;
    public final EObject ruleTupleLiteralPartCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4400:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4401:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4401:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )
            // InternalUsex.g:4402:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? otherlv_3= '=' ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            {
            // InternalUsex.g:4402:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:4403:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:4403:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:4404:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            // InternalUsex.g:4421:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==18) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalUsex.g:4422:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:4426:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalUsex.g:4427:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:4427:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalUsex.g:4428:6: lv_ownedType_2_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeTypeExpCSParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartCSAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUsex.g:4450:3: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
            // InternalUsex.g:4451:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            {
            // InternalUsex.g:4451:4: (lv_ownedInitExpression_4_0= ruleExpCS )
            // InternalUsex.g:4452:5: lv_ownedInitExpression_4_0= ruleExpCS
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
    // InternalUsex.g:4473:1: entryRuleNumberLiteralExpCS returns [EObject current=null] : iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF ;
    public final EObject entryRuleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExpCS = null;


        try {
            // InternalUsex.g:4473:59: (iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF )
            // InternalUsex.g:4474:2: iv_ruleNumberLiteralExpCS= ruleNumberLiteralExpCS EOF
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
    // InternalUsex.g:4480:1: ruleNumberLiteralExpCS returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:4486:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalUsex.g:4487:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalUsex.g:4487:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalUsex.g:4488:3: (lv_value_0_0= RULE_INT )
            {
            // InternalUsex.g:4488:3: (lv_value_0_0= RULE_INT )
            // InternalUsex.g:4489:4: lv_value_0_0= RULE_INT
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
    // InternalUsex.g:4508:1: entryRuleBooleanLiteralExpCS returns [EObject current=null] : iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF ;
    public final EObject entryRuleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpCS = null;


        try {
            // InternalUsex.g:4508:60: (iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF )
            // InternalUsex.g:4509:2: iv_ruleBooleanLiteralExpCS= ruleBooleanLiteralExpCS EOF
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
    // InternalUsex.g:4515:1: ruleBooleanLiteralExpCS returns [EObject current=null] : ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token lv_symbol_0_0=null;
        Token lv_symbol_1_0=null;


        	enterRule();

        try {
            // InternalUsex.g:4521:2: ( ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) ) )
            // InternalUsex.g:4522:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            {
            // InternalUsex.g:4522:2: ( ( (lv_symbol_0_0= 'true' ) ) | ( (lv_symbol_1_0= 'false' ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==86) ) {
                alt78=1;
            }
            else if ( (LA78_0==87) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalUsex.g:4523:3: ( (lv_symbol_0_0= 'true' ) )
                    {
                    // InternalUsex.g:4523:3: ( (lv_symbol_0_0= 'true' ) )
                    // InternalUsex.g:4524:4: (lv_symbol_0_0= 'true' )
                    {
                    // InternalUsex.g:4524:4: (lv_symbol_0_0= 'true' )
                    // InternalUsex.g:4525:5: lv_symbol_0_0= 'true'
                    {
                    lv_symbol_0_0=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUsex.g:4538:3: ( (lv_symbol_1_0= 'false' ) )
                    {
                    // InternalUsex.g:4538:3: ( (lv_symbol_1_0= 'false' ) )
                    // InternalUsex.g:4539:4: (lv_symbol_1_0= 'false' )
                    {
                    // InternalUsex.g:4539:4: (lv_symbol_1_0= 'false' )
                    // InternalUsex.g:4540:5: lv_symbol_1_0= 'false'
                    {
                    lv_symbol_1_0=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4556:1: entryRuleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF ;
    public final EObject entryRuleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedNaturalLiteralExpCS = null;


        try {
            // InternalUsex.g:4556:69: (iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF )
            // InternalUsex.g:4557:2: iv_ruleUnlimitedNaturalLiteralExpCS= ruleUnlimitedNaturalLiteralExpCS EOF
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
    // InternalUsex.g:4563:1: ruleUnlimitedNaturalLiteralExpCS returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleUnlimitedNaturalLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:4569:2: ( ( () otherlv_1= '*' ) )
            // InternalUsex.g:4570:2: ( () otherlv_1= '*' )
            {
            // InternalUsex.g:4570:2: ( () otherlv_1= '*' )
            // InternalUsex.g:4571:3: () otherlv_1= '*'
            {
            // InternalUsex.g:4571:3: ()
            // InternalUsex.g:4572:4: 
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

            otherlv_1=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4589:1: entryRuleInvalidLiteralExpCS returns [EObject current=null] : iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF ;
    public final EObject entryRuleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExpCS = null;


        try {
            // InternalUsex.g:4589:60: (iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF )
            // InternalUsex.g:4590:2: iv_ruleInvalidLiteralExpCS= ruleInvalidLiteralExpCS EOF
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
    // InternalUsex.g:4596:1: ruleInvalidLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:4602:2: ( ( () otherlv_1= 'invalid' ) )
            // InternalUsex.g:4603:2: ( () otherlv_1= 'invalid' )
            {
            // InternalUsex.g:4603:2: ( () otherlv_1= 'invalid' )
            // InternalUsex.g:4604:3: () otherlv_1= 'invalid'
            {
            // InternalUsex.g:4604:3: ()
            // InternalUsex.g:4605:4: 
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

            otherlv_1=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4622:1: entryRuleNullLiteralExpCS returns [EObject current=null] : iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF ;
    public final EObject entryRuleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExpCS = null;


        try {
            // InternalUsex.g:4622:57: (iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF )
            // InternalUsex.g:4623:2: iv_ruleNullLiteralExpCS= ruleNullLiteralExpCS EOF
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
    // InternalUsex.g:4629:1: ruleNullLiteralExpCS returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUsex.g:4635:2: ( ( () otherlv_1= 'null' ) )
            // InternalUsex.g:4636:2: ( () otherlv_1= 'null' )
            {
            // InternalUsex.g:4636:2: ( () otherlv_1= 'null' )
            // InternalUsex.g:4637:3: () otherlv_1= 'null'
            {
            // InternalUsex.g:4637:3: ()
            // InternalUsex.g:4638:4: 
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

            otherlv_1=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4655:1: entryRuleNestedExpCS returns [EObject current=null] : iv_ruleNestedExpCS= ruleNestedExpCS EOF ;
    public final EObject entryRuleNestedExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpCS = null;


        try {
            // InternalUsex.g:4655:52: (iv_ruleNestedExpCS= ruleNestedExpCS EOF )
            // InternalUsex.g:4656:2: iv_ruleNestedExpCS= ruleNestedExpCS EOF
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
    // InternalUsex.g:4662:1: ruleNestedExpCS returns [EObject current=null] : (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) ;
    public final EObject ruleNestedExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedExpression_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4668:2: ( (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' ) )
            // InternalUsex.g:4669:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            {
            // InternalUsex.g:4669:2: (otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')' )
            // InternalUsex.g:4670:3: otherlv_0= '(' ( (lv_ownedExpression_1_0= ruleExpCS ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNestedExpCSAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalUsex.g:4674:3: ( (lv_ownedExpression_1_0= ruleExpCS ) )
            // InternalUsex.g:4675:4: (lv_ownedExpression_1_0= ruleExpCS )
            {
            // InternalUsex.g:4675:4: (lv_ownedExpression_1_0= ruleExpCS )
            // InternalUsex.g:4676:5: lv_ownedExpression_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpCSAccess().getOwnedExpressionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4701:1: entryRuleIfExpCS returns [EObject current=null] : iv_ruleIfExpCS= ruleIfExpCS EOF ;
    public final EObject entryRuleIfExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpCS = null;


        try {
            // InternalUsex.g:4701:48: (iv_ruleIfExpCS= ruleIfExpCS EOF )
            // InternalUsex.g:4702:2: iv_ruleIfExpCS= ruleIfExpCS EOF
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
    // InternalUsex.g:4708:1: ruleIfExpCS returns [EObject current=null] : (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) ;
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
            // InternalUsex.g:4714:2: ( (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' ) )
            // InternalUsex.g:4715:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            {
            // InternalUsex.g:4715:2: (otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif' )
            // InternalUsex.g:4716:3: otherlv_0= 'if' ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )* otherlv_5= 'else' ( (lv_ownedElseExpression_6_0= ruleExpCS ) ) otherlv_7= 'endif'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpCSAccess().getIfKeyword_0());
              		
            }
            // InternalUsex.g:4720:3: ( ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) ) )
            // InternalUsex.g:4721:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            {
            // InternalUsex.g:4721:4: ( (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS ) )
            // InternalUsex.g:4722:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            {
            // InternalUsex.g:4722:5: (lv_ownedCondition_1_1= ruleExpCS | lv_ownedCondition_1_2= rulePatternExpCS )
            int alt79=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 52:
            case 71:
            case 72:
            case 84:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 95:
                {
                alt79=1;
                }
                break;
            case RULE_ID:
                {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==25||LA79_2==28||(LA79_2>=49 && LA79_2<=70)||LA79_2==73||LA79_2==77||(LA79_2>=82 && LA79_2<=83)||LA79_2==91) ) {
                    alt79=1;
                }
                else if ( (LA79_2==18) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt79=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalUsex.g:4723:6: lv_ownedCondition_1_1= ruleExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_60);
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
                    // InternalUsex.g:4739:6: lv_ownedCondition_1_2= rulePatternExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedConditionPatternExpCSParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FOLLOW_60);
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

            otherlv_2=(Token)match(input,91,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalUsex.g:4761:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalUsex.g:4762:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalUsex.g:4762:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalUsex.g:4763:5: lv_ownedThenExpression_3_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedThenExpressionExpCSParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_61);
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

            // InternalUsex.g:4780:3: ( (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==94) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalUsex.g:4781:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    {
            	    // InternalUsex.g:4781:4: (lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS )
            	    // InternalUsex.g:4782:5: lv_ownedIfThenExpressions_4_0= ruleElseIfThenExpCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedIfThenExpressionsElseIfThenExpCSParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_61);
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
            	    break loop80;
                }
            } while (true);

            otherlv_5=(Token)match(input,92,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfExpCSAccess().getElseKeyword_5());
              		
            }
            // InternalUsex.g:4803:3: ( (lv_ownedElseExpression_6_0= ruleExpCS ) )
            // InternalUsex.g:4804:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            {
            // InternalUsex.g:4804:4: (lv_ownedElseExpression_6_0= ruleExpCS )
            // InternalUsex.g:4805:5: lv_ownedElseExpression_6_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpCSAccess().getOwnedElseExpressionExpCSParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_62);
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

            otherlv_7=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:4830:1: entryRuleElseIfThenExpCS returns [EObject current=null] : iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF ;
    public final EObject entryRuleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfThenExpCS = null;


        try {
            // InternalUsex.g:4830:56: (iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF )
            // InternalUsex.g:4831:2: iv_ruleElseIfThenExpCS= ruleElseIfThenExpCS EOF
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
    // InternalUsex.g:4837:1: ruleElseIfThenExpCS returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) ;
    public final EObject ruleElseIfThenExpCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedCondition_1_0 = null;

        EObject lv_ownedThenExpression_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:4843:2: ( (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4844:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4844:2: (otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) ) )
            // InternalUsex.g:4845:3: otherlv_0= 'elseif' ( (lv_ownedCondition_1_0= ruleExpCS ) ) otherlv_2= 'then' ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,94,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getElseIfThenExpCSAccess().getElseifKeyword_0());
              		
            }
            // InternalUsex.g:4849:3: ( (lv_ownedCondition_1_0= ruleExpCS ) )
            // InternalUsex.g:4850:4: (lv_ownedCondition_1_0= ruleExpCS )
            {
            // InternalUsex.g:4850:4: (lv_ownedCondition_1_0= ruleExpCS )
            // InternalUsex.g:4851:5: lv_ownedCondition_1_0= ruleExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getElseIfThenExpCSAccess().getOwnedConditionExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_60);
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

            otherlv_2=(Token)match(input,91,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getElseIfThenExpCSAccess().getThenKeyword_2());
              		
            }
            // InternalUsex.g:4872:3: ( (lv_ownedThenExpression_3_0= ruleExpCS ) )
            // InternalUsex.g:4873:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            {
            // InternalUsex.g:4873:4: (lv_ownedThenExpression_3_0= ruleExpCS )
            // InternalUsex.g:4874:5: lv_ownedThenExpression_3_0= ruleExpCS
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
    // InternalUsex.g:4895:1: entryRuleLetExpCS returns [EObject current=null] : iv_ruleLetExpCS= ruleLetExpCS EOF ;
    public final EObject entryRuleLetExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpCS = null;


        try {
            // InternalUsex.g:4895:49: (iv_ruleLetExpCS= ruleLetExpCS EOF )
            // InternalUsex.g:4896:2: iv_ruleLetExpCS= ruleLetExpCS EOF
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
    // InternalUsex.g:4902:1: ruleLetExpCS returns [EObject current=null] : (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) ;
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
            // InternalUsex.g:4908:2: ( (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4909:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4909:2: (otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) ) )
            // InternalUsex.g:4910:3: otherlv_0= 'let' ( (lv_ownedVariables_1_0= ruleLetVariableCS ) ) (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )* otherlv_4= 'in' ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpCSAccess().getLetKeyword_0());
              		
            }
            // InternalUsex.g:4914:3: ( (lv_ownedVariables_1_0= ruleLetVariableCS ) )
            // InternalUsex.g:4915:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            {
            // InternalUsex.g:4915:4: (lv_ownedVariables_1_0= ruleLetVariableCS )
            // InternalUsex.g:4916:5: lv_ownedVariables_1_0= ruleLetVariableCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalUsex.g:4933:3: (otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==29) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalUsex.g:4934:4: otherlv_2= ',' ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpCSAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUsex.g:4938:4: ( (lv_ownedVariables_3_0= ruleLetVariableCS ) )
            	    // InternalUsex.g:4939:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    {
            	    // InternalUsex.g:4939:5: (lv_ownedVariables_3_0= ruleLetVariableCS )
            	    // InternalUsex.g:4940:6: lv_ownedVariables_3_0= ruleLetVariableCS
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpCSAccess().getOwnedVariablesLetVariableCSParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop81;
                }
            } while (true);

            otherlv_4=(Token)match(input,96,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpCSAccess().getInKeyword_3());
              		
            }
            // InternalUsex.g:4962:3: ( (lv_ownedInExpression_5_0= ruleExpCS ) )
            // InternalUsex.g:4963:4: (lv_ownedInExpression_5_0= ruleExpCS )
            {
            // InternalUsex.g:4963:4: (lv_ownedInExpression_5_0= ruleExpCS )
            // InternalUsex.g:4964:5: lv_ownedInExpression_5_0= ruleExpCS
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
    // InternalUsex.g:4985:1: entryRuleLetVariableCS returns [EObject current=null] : iv_ruleLetVariableCS= ruleLetVariableCS EOF ;
    public final EObject entryRuleLetVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariableCS = null;


        try {
            // InternalUsex.g:4985:54: (iv_ruleLetVariableCS= ruleLetVariableCS EOF )
            // InternalUsex.g:4986:2: iv_ruleLetVariableCS= ruleLetVariableCS EOF
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
    // InternalUsex.g:4992:1: ruleLetVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) ;
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
            // InternalUsex.g:4998:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) ) )
            // InternalUsex.g:4999:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            {
            // InternalUsex.g:4999:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )
            // InternalUsex.g:5000:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )? (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )? otherlv_4= '=' ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            {
            // InternalUsex.g:5000:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:5001:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:5001:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:5002:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_64);
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

            // InternalUsex.g:5019:3: ( (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==25) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalUsex.g:5020:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    {
                    // InternalUsex.g:5020:4: (lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS )
                    // InternalUsex.g:5021:5: lv_ownedRoundBracketedClause_1_0= ruleRoundBracketedClauseCS
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedRoundBracketedClauseRoundBracketedClauseCSParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_59);
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

            // InternalUsex.g:5038:3: (otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==18) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalUsex.g:5039:4: otherlv_2= ':' ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLetVariableCSAccess().getColonKeyword_2_0());
                      			
                    }
                    // InternalUsex.g:5043:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5044:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5044:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUsex.g:5045:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLetVariableCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
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

            otherlv_4=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetVariableCSAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalUsex.g:5067:3: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
            // InternalUsex.g:5068:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            {
            // InternalUsex.g:5068:4: (lv_ownedInitExpression_5_0= ruleExpCS )
            // InternalUsex.g:5069:5: lv_ownedInitExpression_5_0= ruleExpCS
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
    // InternalUsex.g:5090:1: entryRuleRoundBracketedClauseCS returns [EObject current=null] : iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF ;
    public final EObject entryRuleRoundBracketedClauseCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketedClauseCS = null;


        try {
            // InternalUsex.g:5090:63: (iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF )
            // InternalUsex.g:5091:2: iv_ruleRoundBracketedClauseCS= ruleRoundBracketedClauseCS EOF
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
    // InternalUsex.g:5097:1: ruleRoundBracketedClauseCS returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) ;
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
            // InternalUsex.g:5103:2: ( ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' ) )
            // InternalUsex.g:5104:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            {
            // InternalUsex.g:5104:2: ( () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')' )
            // InternalUsex.g:5105:3: () otherlv_1= '(' ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )? otherlv_4= ')'
            {
            // InternalUsex.g:5105:3: ()
            // InternalUsex.g:5106:4: 
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

            otherlv_1=(Token)match(input,25,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRoundBracketedClauseCSAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUsex.g:5119:3: ( ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )* )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_INT)||LA86_0==18||(LA86_0>=21 && LA86_0<=25)||(LA86_0>=38 && LA86_0<=49)||LA86_0==52||(LA86_0>=71 && LA86_0<=72)||LA86_0==84||(LA86_0>=86 && LA86_0<=90)||LA86_0==95) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalUsex.g:5120:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) ) ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    {
                    // InternalUsex.g:5120:4: ( (lv_ownedArguments_2_0= ruleNavigatingArgCS ) )
                    // InternalUsex.g:5121:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    {
                    // InternalUsex.g:5121:5: (lv_ownedArguments_2_0= ruleNavigatingArgCS )
                    // InternalUsex.g:5122:6: lv_ownedArguments_2_0= ruleNavigatingArgCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingArgCSParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_66);
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

                    // InternalUsex.g:5139:4: ( ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==29||(LA85_0>=97 && LA85_0<=98)) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // InternalUsex.g:5140:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    {
                    	    // InternalUsex.g:5140:5: ( (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS ) )
                    	    // InternalUsex.g:5141:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    {
                    	    // InternalUsex.g:5141:6: (lv_ownedArguments_3_1= ruleNavigatingCommaArgCS | lv_ownedArguments_3_2= ruleNavigatingSemiArgCS | lv_ownedArguments_3_3= ruleNavigatingBarArgCS )
                    	    int alt84=3;
                    	    switch ( input.LA(1) ) {
                    	    case 29:
                    	        {
                    	        alt84=1;
                    	        }
                    	        break;
                    	    case 98:
                    	        {
                    	        alt84=2;
                    	        }
                    	        break;
                    	    case 97:
                    	        {
                    	        alt84=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 84, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt84) {
                    	        case 1 :
                    	            // InternalUsex.g:5142:7: lv_ownedArguments_3_1= ruleNavigatingCommaArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingCommaArgCSParserRuleCall_2_1_0_0());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_66);
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
                    	            // InternalUsex.g:5158:7: lv_ownedArguments_3_2= ruleNavigatingSemiArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingSemiArgCSParserRuleCall_2_1_0_1());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_66);
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
                    	            // InternalUsex.g:5174:7: lv_ownedArguments_3_3= ruleNavigatingBarArgCS
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              							newCompositeNode(grammarAccess.getRoundBracketedClauseCSAccess().getOwnedArgumentsNavigatingBarArgCSParserRuleCall_2_1_0_2());
                    	              						
                    	            }
                    	            pushFollow(FOLLOW_66);
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
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalUsex.g:5201:1: entryRuleNavigatingBarArgCS returns [EObject current=null] : iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF ;
    public final EObject entryRuleNavigatingBarArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingBarArgCS = null;


        try {
            // InternalUsex.g:5201:59: (iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF )
            // InternalUsex.g:5202:2: iv_ruleNavigatingBarArgCS= ruleNavigatingBarArgCS EOF
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
    // InternalUsex.g:5208:1: ruleNavigatingBarArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // InternalUsex.g:5214:2: ( ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalUsex.g:5215:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalUsex.g:5215:2: ( ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalUsex.g:5216:3: ( (lv_prefix_0_0= '|' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalUsex.g:5216:3: ( (lv_prefix_0_0= '|' ) )
            // InternalUsex.g:5217:4: (lv_prefix_0_0= '|' )
            {
            // InternalUsex.g:5217:4: (lv_prefix_0_0= '|' )
            // InternalUsex.g:5218:5: lv_prefix_0_0= '|'
            {
            lv_prefix_0_0=(Token)match(input,97,FOLLOW_13); if (state.failed) return current;
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

            // InternalUsex.g:5230:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUsex.g:5231:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUsex.g:5231:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUsex.g:5232:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_67);
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

            // InternalUsex.g:5249:3: ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==18) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalUsex.g:5250:4: ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5250:4: ( (lv_symbolT_2_0= ':' ) )
                    // InternalUsex.g:5251:5: (lv_symbolT_2_0= ':' )
                    {
                    // InternalUsex.g:5251:5: (lv_symbolT_2_0= ':' )
                    // InternalUsex.g:5252:6: lv_symbolT_2_0= ':'
                    {
                    lv_symbolT_2_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                    // InternalUsex.g:5264:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5265:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5265:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUsex.g:5266:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_68);
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

                    // InternalUsex.g:5283:4: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==28) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalUsex.g:5284:5: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5284:5: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUsex.g:5285:6: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUsex.g:5285:6: (lv_symbolIE_4_0= '=' )
                            // InternalUsex.g:5286:7: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
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

                            // InternalUsex.g:5298:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUsex.g:5299:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUsex.g:5299:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUsex.g:5300:7: lv_ownedInitExpression_5_0= ruleExpCS
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
    // InternalUsex.g:5323:1: entryRuleNavigatingCommaArgCS returns [EObject current=null] : iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF ;
    public final EObject entryRuleNavigatingCommaArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingCommaArgCS = null;


        try {
            // InternalUsex.g:5323:61: (iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF )
            // InternalUsex.g:5324:2: iv_ruleNavigatingCommaArgCS= ruleNavigatingCommaArgCS EOF
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
    // InternalUsex.g:5330:1: ruleNavigatingCommaArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) ;
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
            // InternalUsex.g:5336:2: ( ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? ) )
            // InternalUsex.g:5337:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            {
            // InternalUsex.g:5337:2: ( ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )? )
            // InternalUsex.g:5338:3: ( (lv_prefix_0_0= ',' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            {
            // InternalUsex.g:5338:3: ( (lv_prefix_0_0= ',' ) )
            // InternalUsex.g:5339:4: (lv_prefix_0_0= ',' )
            {
            // InternalUsex.g:5339:4: (lv_prefix_0_0= ',' )
            // InternalUsex.g:5340:5: lv_prefix_0_0= ','
            {
            lv_prefix_0_0=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
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

            // InternalUsex.g:5352:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUsex.g:5353:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUsex.g:5353:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUsex.g:5354:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_69);
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

            // InternalUsex.g:5371:3: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?
            int alt94=4;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // InternalUsex.g:5372:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:5372:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:5373:5: ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5373:5: ( (lv_symbolCI_2_0= '<-' ) )
                    // InternalUsex.g:5374:6: (lv_symbolCI_2_0= '<-' )
                    {
                    // InternalUsex.g:5374:6: (lv_symbolCI_2_0= '<-' )
                    // InternalUsex.g:5375:7: lv_symbolCI_2_0= '<-'
                    {
                    lv_symbolCI_2_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
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

                    // InternalUsex.g:5387:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
                    // InternalUsex.g:5388:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    {
                    // InternalUsex.g:5388:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
                    // InternalUsex.g:5389:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_68);
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

                    // InternalUsex.g:5406:5: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==28) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalUsex.g:5407:6: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5407:6: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUsex.g:5408:7: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUsex.g:5408:7: (lv_symbolIE_4_0= '=' )
                            // InternalUsex.g:5409:8: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
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

                            // InternalUsex.g:5421:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUsex.g:5422:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUsex.g:5422:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUsex.g:5423:8: lv_ownedInitExpression_5_0= ruleExpCS
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
                    // InternalUsex.g:5443:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    {
                    // InternalUsex.g:5443:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
                    // InternalUsex.g:5444:5: ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5444:5: ( (lv_symbolT_6_0= ':' ) )
                    // InternalUsex.g:5445:6: (lv_symbolT_6_0= ':' )
                    {
                    // InternalUsex.g:5445:6: (lv_symbolT_6_0= ':' )
                    // InternalUsex.g:5446:7: lv_symbolT_6_0= ':'
                    {
                    lv_symbolT_6_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                    // InternalUsex.g:5458:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5459:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5459:6: (lv_ownedType_7_0= ruleTypeExpCS )
                    // InternalUsex.g:5460:7: lv_ownedType_7_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_70);
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

                    // InternalUsex.g:5477:5: ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==85) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalUsex.g:5478:6: ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            {
                            // InternalUsex.g:5478:6: ( (lv_symbolCI_8_0= '<-' ) )
                            // InternalUsex.g:5479:7: (lv_symbolCI_8_0= '<-' )
                            {
                            // InternalUsex.g:5479:7: (lv_symbolCI_8_0= '<-' )
                            // InternalUsex.g:5480:8: lv_symbolCI_8_0= '<-'
                            {
                            lv_symbolCI_8_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
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

                            // InternalUsex.g:5492:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                            // InternalUsex.g:5493:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUsex.g:5493:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                            // InternalUsex.g:5494:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_68);
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

                    // InternalUsex.g:5512:5: ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==28) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalUsex.g:5513:6: ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5513:6: ( (lv_symbolIE_10_0= '=' ) )
                            // InternalUsex.g:5514:7: (lv_symbolIE_10_0= '=' )
                            {
                            // InternalUsex.g:5514:7: (lv_symbolIE_10_0= '=' )
                            // InternalUsex.g:5515:8: lv_symbolIE_10_0= '='
                            {
                            lv_symbolIE_10_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
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

                            // InternalUsex.g:5527:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                            // InternalUsex.g:5528:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            {
                            // InternalUsex.g:5528:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                            // InternalUsex.g:5529:8: lv_ownedInitExpression_11_0= ruleExpCS
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
                    // InternalUsex.g:5549:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    {
                    // InternalUsex.g:5549:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
                    // InternalUsex.g:5550:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    {
                    // InternalUsex.g:5550:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==18) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalUsex.g:5551:6: ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            {
                            // InternalUsex.g:5551:6: ( (lv_symbolT_12_0= ':' ) )
                            // InternalUsex.g:5552:7: (lv_symbolT_12_0= ':' )
                            {
                            // InternalUsex.g:5552:7: (lv_symbolT_12_0= ':' )
                            // InternalUsex.g:5553:8: lv_symbolT_12_0= ':'
                            {
                            lv_symbolT_12_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                            // InternalUsex.g:5565:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                            // InternalUsex.g:5566:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            {
                            // InternalUsex.g:5566:7: (lv_ownedType_13_0= ruleTypeExpCS )
                            // InternalUsex.g:5567:8: lv_ownedType_13_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_71);
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

                    // InternalUsex.g:5585:5: ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==85) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalUsex.g:5586:6: ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            {
                            // InternalUsex.g:5586:6: ( (lv_symbolCI_14_0= '<-' ) )
                            // InternalUsex.g:5587:7: (lv_symbolCI_14_0= '<-' )
                            {
                            // InternalUsex.g:5587:7: (lv_symbolCI_14_0= '<-' )
                            // InternalUsex.g:5588:8: lv_symbolCI_14_0= '<-'
                            {
                            lv_symbolCI_14_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
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

                            // InternalUsex.g:5600:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                            // InternalUsex.g:5601:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUsex.g:5601:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                            // InternalUsex.g:5602:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_72);
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

                    // InternalUsex.g:5620:5: ( (lv_symbolIE_16_0= 'in' ) )
                    // InternalUsex.g:5621:6: (lv_symbolIE_16_0= 'in' )
                    {
                    // InternalUsex.g:5621:6: (lv_symbolIE_16_0= 'in' )
                    // InternalUsex.g:5622:7: lv_symbolIE_16_0= 'in'
                    {
                    lv_symbolIE_16_0=(Token)match(input,96,FOLLOW_13); if (state.failed) return current;
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

                    // InternalUsex.g:5634:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
                    // InternalUsex.g:5635:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    {
                    // InternalUsex.g:5635:6: (lv_ownedInitExpression_17_0= ruleExpCS )
                    // InternalUsex.g:5636:7: lv_ownedInitExpression_17_0= ruleExpCS
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
    // InternalUsex.g:5659:1: entryRuleNavigatingSemiArgCS returns [EObject current=null] : iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF ;
    public final EObject entryRuleNavigatingSemiArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingSemiArgCS = null;


        try {
            // InternalUsex.g:5659:60: (iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF )
            // InternalUsex.g:5660:2: iv_ruleNavigatingSemiArgCS= ruleNavigatingSemiArgCS EOF
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
    // InternalUsex.g:5666:1: ruleNavigatingSemiArgCS returns [EObject current=null] : ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) ;
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
            // InternalUsex.g:5672:2: ( ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? ) )
            // InternalUsex.g:5673:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            {
            // InternalUsex.g:5673:2: ( ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )? )
            // InternalUsex.g:5674:3: ( (lv_prefix_0_0= ';' ) ) ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) ) ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            {
            // InternalUsex.g:5674:3: ( (lv_prefix_0_0= ';' ) )
            // InternalUsex.g:5675:4: (lv_prefix_0_0= ';' )
            {
            // InternalUsex.g:5675:4: (lv_prefix_0_0= ';' )
            // InternalUsex.g:5676:5: lv_prefix_0_0= ';'
            {
            lv_prefix_0_0=(Token)match(input,98,FOLLOW_13); if (state.failed) return current;
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

            // InternalUsex.g:5688:3: ( (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS ) )
            // InternalUsex.g:5689:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            {
            // InternalUsex.g:5689:4: (lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS )
            // InternalUsex.g:5690:5: lv_ownedNameExpression_1_0= ruleNavigatingArgExpCS
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_67);
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

            // InternalUsex.g:5707:3: ( ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==18) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUsex.g:5708:4: ( (lv_symbolT_2_0= ':' ) ) ( (lv_ownedType_3_0= ruleTypeExpCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    {
                    // InternalUsex.g:5708:4: ( (lv_symbolT_2_0= ':' ) )
                    // InternalUsex.g:5709:5: (lv_symbolT_2_0= ':' )
                    {
                    // InternalUsex.g:5709:5: (lv_symbolT_2_0= ':' )
                    // InternalUsex.g:5710:6: lv_symbolT_2_0= ':'
                    {
                    lv_symbolT_2_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                    // InternalUsex.g:5722:4: ( (lv_ownedType_3_0= ruleTypeExpCS ) )
                    // InternalUsex.g:5723:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:5723:5: (lv_ownedType_3_0= ruleTypeExpCS )
                    // InternalUsex.g:5724:6: lv_ownedType_3_0= ruleTypeExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_68);
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

                    // InternalUsex.g:5741:4: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==28) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalUsex.g:5742:5: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5742:5: ( (lv_symbolIE_4_0= '=' ) )
                            // InternalUsex.g:5743:6: (lv_symbolIE_4_0= '=' )
                            {
                            // InternalUsex.g:5743:6: (lv_symbolIE_4_0= '=' )
                            // InternalUsex.g:5744:7: lv_symbolIE_4_0= '='
                            {
                            lv_symbolIE_4_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
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

                            // InternalUsex.g:5756:5: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                            // InternalUsex.g:5757:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            {
                            // InternalUsex.g:5757:6: (lv_ownedInitExpression_5_0= ruleExpCS )
                            // InternalUsex.g:5758:7: lv_ownedInitExpression_5_0= ruleExpCS
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
    // InternalUsex.g:5781:1: entryRuleNavigatingArgCS returns [EObject current=null] : iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF ;
    public final EObject entryRuleNavigatingArgCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgCS = null;


        try {
            // InternalUsex.g:5781:56: (iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF )
            // InternalUsex.g:5782:2: iv_ruleNavigatingArgCS= ruleNavigatingArgCS EOF
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
    // InternalUsex.g:5788:1: ruleNavigatingArgCS returns [EObject current=null] : ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) ;
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
            // InternalUsex.g:5794:2: ( ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) ) )
            // InternalUsex.g:5795:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            {
            // InternalUsex.g:5795:2: ( ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? ) | ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( ((LA103_0>=RULE_ID && LA103_0<=RULE_INT)||(LA103_0>=21 && LA103_0<=25)||(LA103_0>=38 && LA103_0<=49)||LA103_0==52||(LA103_0>=71 && LA103_0<=72)||LA103_0==84||(LA103_0>=86 && LA103_0<=90)||LA103_0==95) ) {
                alt103=1;
            }
            else if ( (LA103_0==18) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalUsex.g:5796:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    {
                    // InternalUsex.g:5796:3: ( ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )? )
                    // InternalUsex.g:5797:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) ) ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    {
                    // InternalUsex.g:5797:4: ( (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS ) )
                    // InternalUsex.g:5798:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    {
                    // InternalUsex.g:5798:5: (lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS )
                    // InternalUsex.g:5799:6: lv_ownedNameExpression_0_0= ruleNavigatingArgExpCS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedNameExpressionNavigatingArgExpCSParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
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

                    // InternalUsex.g:5816:4: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?
                    int alt102=4;
                    alt102 = dfa102.predict(input);
                    switch (alt102) {
                        case 1 :
                            // InternalUsex.g:5817:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            {
                            // InternalUsex.g:5817:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
                            // InternalUsex.g:5818:6: ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            {
                            // InternalUsex.g:5818:6: ( (lv_symbolCI_1_0= '<-' ) )
                            // InternalUsex.g:5819:7: (lv_symbolCI_1_0= '<-' )
                            {
                            // InternalUsex.g:5819:7: (lv_symbolCI_1_0= '<-' )
                            // InternalUsex.g:5820:8: lv_symbolCI_1_0= '<-'
                            {
                            lv_symbolCI_1_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
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

                            // InternalUsex.g:5832:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
                            // InternalUsex.g:5833:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            {
                            // InternalUsex.g:5833:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
                            // InternalUsex.g:5834:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_68);
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

                            // InternalUsex.g:5851:6: ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
                            int alt97=2;
                            int LA97_0 = input.LA(1);

                            if ( (LA97_0==28) ) {
                                alt97=1;
                            }
                            switch (alt97) {
                                case 1 :
                                    // InternalUsex.g:5852:7: ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    {
                                    // InternalUsex.g:5852:7: ( (lv_symbolIE_3_0= '=' ) )
                                    // InternalUsex.g:5853:8: (lv_symbolIE_3_0= '=' )
                                    {
                                    // InternalUsex.g:5853:8: (lv_symbolIE_3_0= '=' )
                                    // InternalUsex.g:5854:9: lv_symbolIE_3_0= '='
                                    {
                                    lv_symbolIE_3_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
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

                                    // InternalUsex.g:5866:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                                    // InternalUsex.g:5867:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    {
                                    // InternalUsex.g:5867:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                                    // InternalUsex.g:5868:9: lv_ownedInitExpression_4_0= ruleExpCS
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
                            // InternalUsex.g:5888:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            {
                            // InternalUsex.g:5888:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
                            // InternalUsex.g:5889:6: ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            {
                            // InternalUsex.g:5889:6: ( (lv_symbolT_5_0= ':' ) )
                            // InternalUsex.g:5890:7: (lv_symbolT_5_0= ':' )
                            {
                            // InternalUsex.g:5890:7: (lv_symbolT_5_0= ':' )
                            // InternalUsex.g:5891:8: lv_symbolT_5_0= ':'
                            {
                            lv_symbolT_5_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                            // InternalUsex.g:5903:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
                            // InternalUsex.g:5904:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            {
                            // InternalUsex.g:5904:7: (lv_ownedType_6_0= ruleTypeExpCS )
                            // InternalUsex.g:5905:8: lv_ownedType_6_0= ruleTypeExpCS
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_70);
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

                            // InternalUsex.g:5922:6: ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
                            int alt98=2;
                            int LA98_0 = input.LA(1);

                            if ( (LA98_0==85) ) {
                                alt98=1;
                            }
                            switch (alt98) {
                                case 1 :
                                    // InternalUsex.g:5923:7: ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    {
                                    // InternalUsex.g:5923:7: ( (lv_symbolCI_7_0= '<-' ) )
                                    // InternalUsex.g:5924:8: (lv_symbolCI_7_0= '<-' )
                                    {
                                    // InternalUsex.g:5924:8: (lv_symbolCI_7_0= '<-' )
                                    // InternalUsex.g:5925:9: lv_symbolCI_7_0= '<-'
                                    {
                                    lv_symbolCI_7_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
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

                                    // InternalUsex.g:5937:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                                    // InternalUsex.g:5938:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalUsex.g:5938:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                                    // InternalUsex.g:5939:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_68);
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

                            // InternalUsex.g:5957:6: ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
                            int alt99=2;
                            int LA99_0 = input.LA(1);

                            if ( (LA99_0==28) ) {
                                alt99=1;
                            }
                            switch (alt99) {
                                case 1 :
                                    // InternalUsex.g:5958:7: ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    {
                                    // InternalUsex.g:5958:7: ( (lv_symbolIE_9_0= '=' ) )
                                    // InternalUsex.g:5959:8: (lv_symbolIE_9_0= '=' )
                                    {
                                    // InternalUsex.g:5959:8: (lv_symbolIE_9_0= '=' )
                                    // InternalUsex.g:5960:9: lv_symbolIE_9_0= '='
                                    {
                                    lv_symbolIE_9_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return current;
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

                                    // InternalUsex.g:5972:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                                    // InternalUsex.g:5973:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    {
                                    // InternalUsex.g:5973:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                                    // InternalUsex.g:5974:9: lv_ownedInitExpression_10_0= ruleExpCS
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
                            // InternalUsex.g:5994:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            {
                            // InternalUsex.g:5994:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
                            // InternalUsex.g:5995:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            {
                            // InternalUsex.g:5995:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
                            int alt100=2;
                            int LA100_0 = input.LA(1);

                            if ( (LA100_0==18) ) {
                                alt100=1;
                            }
                            switch (alt100) {
                                case 1 :
                                    // InternalUsex.g:5996:7: ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    {
                                    // InternalUsex.g:5996:7: ( (lv_symbolT_11_0= ':' ) )
                                    // InternalUsex.g:5997:8: (lv_symbolT_11_0= ':' )
                                    {
                                    // InternalUsex.g:5997:8: (lv_symbolT_11_0= ':' )
                                    // InternalUsex.g:5998:9: lv_symbolT_11_0= ':'
                                    {
                                    lv_symbolT_11_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                                    // InternalUsex.g:6010:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                                    // InternalUsex.g:6011:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    {
                                    // InternalUsex.g:6011:8: (lv_ownedType_12_0= ruleTypeExpCS )
                                    // InternalUsex.g:6012:9: lv_ownedType_12_0= ruleTypeExpCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_71);
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

                            // InternalUsex.g:6030:6: ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==85) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // InternalUsex.g:6031:7: ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    {
                                    // InternalUsex.g:6031:7: ( (lv_symbolCI_13_0= '<-' ) )
                                    // InternalUsex.g:6032:8: (lv_symbolCI_13_0= '<-' )
                                    {
                                    // InternalUsex.g:6032:8: (lv_symbolCI_13_0= '<-' )
                                    // InternalUsex.g:6033:9: lv_symbolCI_13_0= '<-'
                                    {
                                    lv_symbolCI_13_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return current;
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

                                    // InternalUsex.g:6045:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                                    // InternalUsex.g:6046:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    {
                                    // InternalUsex.g:6046:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                                    // InternalUsex.g:6047:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                                    {
                                    if ( state.backtracking==0 ) {

                                      									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                                      								
                                    }
                                    pushFollow(FOLLOW_72);
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

                            // InternalUsex.g:6065:6: ( (lv_symbolIE_15_0= 'in' ) )
                            // InternalUsex.g:6066:7: (lv_symbolIE_15_0= 'in' )
                            {
                            // InternalUsex.g:6066:7: (lv_symbolIE_15_0= 'in' )
                            // InternalUsex.g:6067:8: lv_symbolIE_15_0= 'in'
                            {
                            lv_symbolIE_15_0=(Token)match(input,96,FOLLOW_13); if (state.failed) return current;
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

                            // InternalUsex.g:6079:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
                            // InternalUsex.g:6080:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            {
                            // InternalUsex.g:6080:7: (lv_ownedInitExpression_16_0= ruleExpCS )
                            // InternalUsex.g:6081:8: lv_ownedInitExpression_16_0= ruleExpCS
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
                    // InternalUsex.g:6102:3: ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    {
                    // InternalUsex.g:6102:3: ( ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) ) )
                    // InternalUsex.g:6103:4: ( (lv_symbolT_17_0= ':' ) ) ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    {
                    // InternalUsex.g:6103:4: ( (lv_symbolT_17_0= ':' ) )
                    // InternalUsex.g:6104:5: (lv_symbolT_17_0= ':' )
                    {
                    // InternalUsex.g:6104:5: (lv_symbolT_17_0= ':' )
                    // InternalUsex.g:6105:6: lv_symbolT_17_0= ':'
                    {
                    lv_symbolT_17_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
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

                    // InternalUsex.g:6117:4: ( (lv_ownedType_18_0= ruleTypeExpCS ) )
                    // InternalUsex.g:6118:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:6118:5: (lv_ownedType_18_0= ruleTypeExpCS )
                    // InternalUsex.g:6119:6: lv_ownedType_18_0= ruleTypeExpCS
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
    // InternalUsex.g:6141:1: entryRuleNavigatingArgExpCS returns [EObject current=null] : iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF ;
    public final EObject entryRuleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingArgExpCS = null;


        try {
            // InternalUsex.g:6141:59: (iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF )
            // InternalUsex.g:6142:2: iv_ruleNavigatingArgExpCS= ruleNavigatingArgExpCS EOF
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
    // InternalUsex.g:6148:1: ruleNavigatingArgExpCS returns [EObject current=null] : this_ExpCS_0= ruleExpCS ;
    public final EObject ruleNavigatingArgExpCS() throws RecognitionException {
        EObject current = null;

        EObject this_ExpCS_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:6154:2: (this_ExpCS_0= ruleExpCS )
            // InternalUsex.g:6155:2: this_ExpCS_0= ruleExpCS
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
    // InternalUsex.g:6169:1: entryRuleCoIteratorVariableCS returns [EObject current=null] : iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF ;
    public final EObject entryRuleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoIteratorVariableCS = null;


        try {
            // InternalUsex.g:6169:61: (iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF )
            // InternalUsex.g:6170:2: iv_ruleCoIteratorVariableCS= ruleCoIteratorVariableCS EOF
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
    // InternalUsex.g:6176:1: ruleCoIteratorVariableCS returns [EObject current=null] : ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) ;
    public final EObject ruleCoIteratorVariableCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ownedType_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:6182:2: ( ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? ) )
            // InternalUsex.g:6183:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            {
            // InternalUsex.g:6183:2: ( ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )? )
            // InternalUsex.g:6184:3: ( (lv_name_0_0= ruleUnrestrictedName ) ) (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            {
            // InternalUsex.g:6184:3: ( (lv_name_0_0= ruleUnrestrictedName ) )
            // InternalUsex.g:6185:4: (lv_name_0_0= ruleUnrestrictedName )
            {
            // InternalUsex.g:6185:4: (lv_name_0_0= ruleUnrestrictedName )
            // InternalUsex.g:6186:5: lv_name_0_0= ruleUnrestrictedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCoIteratorVariableCSAccess().getNameUnrestrictedNameParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_67);
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

            // InternalUsex.g:6203:3: (otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==18) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalUsex.g:6204:4: otherlv_1= ':' ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCoIteratorVariableCSAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalUsex.g:6208:4: ( (lv_ownedType_2_0= ruleTypeExpCS ) )
                    // InternalUsex.g:6209:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    {
                    // InternalUsex.g:6209:5: (lv_ownedType_2_0= ruleTypeExpCS )
                    // InternalUsex.g:6210:6: lv_ownedType_2_0= ruleTypeExpCS
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

    // $ANTLR start synpred75_InternalUsex
    public final void synpred75_InternalUsex_fragment() throws RecognitionException {   
        EObject this_TypeLiteralCS_1 = null;


        // InternalUsex.g:2441:3: (this_TypeLiteralCS_1= ruleTypeLiteralCS )
        // InternalUsex.g:2441:3: this_TypeLiteralCS_1= ruleTypeLiteralCS
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
    // $ANTLR end synpred75_InternalUsex

    // $ANTLR start synpred96_InternalUsex
    public final void synpred96_InternalUsex_fragment() throws RecognitionException {   
        EObject this_PrefixedPrimaryExpCS_0 = null;

        AntlrDatatypeRuleToken lv_operator_2_0 = null;

        EObject lv_ownedRight_3_0 = null;


        // InternalUsex.g:3279:3: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:3279:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:3279:3: (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? )
        // InternalUsex.g:3280:4: this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_50);
        this_PrefixedPrimaryExpCS_0=rulePrefixedPrimaryExpCS();

        state._fsp--;
        if (state.failed) return ;
        // InternalUsex.g:3291:4: ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )?
        int alt117=2;
        int LA117_0 = input.LA(1);

        if ( (LA117_0==28||(LA117_0>=49 && LA117_0<=70)) ) {
            alt117=1;
        }
        switch (alt117) {
            case 1 :
                // InternalUsex.g:3292:5: () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) )
                {
                // InternalUsex.g:3292:5: ()
                // InternalUsex.g:3293:6: 
                {
                if ( state.backtracking==0 ) {

                  						/* */
                  					
                }

                }

                // InternalUsex.g:3302:5: ( (lv_operator_2_0= ruleBinaryOperatorName ) )
                // InternalUsex.g:3303:6: (lv_operator_2_0= ruleBinaryOperatorName )
                {
                // InternalUsex.g:3303:6: (lv_operator_2_0= ruleBinaryOperatorName )
                // InternalUsex.g:3304:7: lv_operator_2_0= ruleBinaryOperatorName
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getExpCSAccess().getOperatorBinaryOperatorNameParserRuleCall_0_1_1_0());
                  						
                }
                pushFollow(FOLLOW_13);
                lv_operator_2_0=ruleBinaryOperatorName();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // InternalUsex.g:3321:5: ( (lv_ownedRight_3_0= ruleExpCS ) )
                // InternalUsex.g:3322:6: (lv_ownedRight_3_0= ruleExpCS )
                {
                // InternalUsex.g:3322:6: (lv_ownedRight_3_0= ruleExpCS )
                // InternalUsex.g:3323:7: lv_ownedRight_3_0= ruleExpCS
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
    // $ANTLR end synpred96_InternalUsex

    // $ANTLR start synpred102_InternalUsex
    public final void synpred102_InternalUsex_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExpCS_3 = null;


        // InternalUsex.g:3571:3: (this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS )
        // InternalUsex.g:3571:3: this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS
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
    // $ANTLR end synpred102_InternalUsex

    // $ANTLR start synpred103_InternalUsex
    public final void synpred103_InternalUsex_fragment() throws RecognitionException {   
        EObject this_MapLiteralExpCS_4 = null;


        // InternalUsex.g:3583:3: (this_MapLiteralExpCS_4= ruleMapLiteralExpCS )
        // InternalUsex.g:3583:3: this_MapLiteralExpCS_4= ruleMapLiteralExpCS
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
    // $ANTLR end synpred103_InternalUsex

    // $ANTLR start synpred104_InternalUsex
    public final void synpred104_InternalUsex_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExpCS_5 = null;


        // InternalUsex.g:3595:3: (this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS )
        // InternalUsex.g:3595:3: this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS
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
    // $ANTLR end synpred104_InternalUsex

    // $ANTLR start synpred106_InternalUsex
    public final void synpred106_InternalUsex_fragment() throws RecognitionException {   
        EObject this_TypeLiteralExpCS_7 = null;


        // InternalUsex.g:3619:3: (this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS )
        // InternalUsex.g:3619:3: this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS
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
    // $ANTLR end synpred106_InternalUsex

    // $ANTLR start synpred138_InternalUsex
    public final void synpred138_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolCI_2_0=null;
        Token lv_symbolIE_4_0=null;
        EObject lv_ownedCoIterator_3_0 = null;

        EObject lv_ownedInitExpression_5_0 = null;


        // InternalUsex.g:5372:4: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:5372:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:5372:4: ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? )
        // InternalUsex.g:5373:5: ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:5373:5: ( (lv_symbolCI_2_0= '<-' ) )
        // InternalUsex.g:5374:6: (lv_symbolCI_2_0= '<-' )
        {
        // InternalUsex.g:5374:6: (lv_symbolCI_2_0= '<-' )
        // InternalUsex.g:5375:7: lv_symbolCI_2_0= '<-'
        {
        lv_symbolCI_2_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5387:5: ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) )
        // InternalUsex.g:5388:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        {
        // InternalUsex.g:5388:6: (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS )
        // InternalUsex.g:5389:7: lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_0_1_0());
          						
        }
        pushFollow(FOLLOW_68);
        lv_ownedCoIterator_3_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:5406:5: ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( (LA125_0==28) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // InternalUsex.g:5407:6: ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                {
                // InternalUsex.g:5407:6: ( (lv_symbolIE_4_0= '=' ) )
                // InternalUsex.g:5408:7: (lv_symbolIE_4_0= '=' )
                {
                // InternalUsex.g:5408:7: (lv_symbolIE_4_0= '=' )
                // InternalUsex.g:5409:8: lv_symbolIE_4_0= '='
                {
                lv_symbolIE_4_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5421:6: ( (lv_ownedInitExpression_5_0= ruleExpCS ) )
                // InternalUsex.g:5422:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                {
                // InternalUsex.g:5422:7: (lv_ownedInitExpression_5_0= ruleExpCS )
                // InternalUsex.g:5423:8: lv_ownedInitExpression_5_0= ruleExpCS
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
    // $ANTLR end synpred138_InternalUsex

    // $ANTLR start synpred141_InternalUsex
    public final void synpred141_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_6_0=null;
        Token lv_symbolCI_8_0=null;
        Token lv_symbolIE_10_0=null;
        EObject lv_ownedType_7_0 = null;

        EObject lv_ownedCoIterator_9_0 = null;

        EObject lv_ownedInitExpression_11_0 = null;


        // InternalUsex.g:5443:4: ( ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:5443:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:5443:4: ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? )
        // InternalUsex.g:5444:5: ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:5444:5: ( (lv_symbolT_6_0= ':' ) )
        // InternalUsex.g:5445:6: (lv_symbolT_6_0= ':' )
        {
        // InternalUsex.g:5445:6: (lv_symbolT_6_0= ':' )
        // InternalUsex.g:5446:7: lv_symbolT_6_0= ':'
        {
        lv_symbolT_6_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5458:5: ( (lv_ownedType_7_0= ruleTypeExpCS ) )
        // InternalUsex.g:5459:6: (lv_ownedType_7_0= ruleTypeExpCS )
        {
        // InternalUsex.g:5459:6: (lv_ownedType_7_0= ruleTypeExpCS )
        // InternalUsex.g:5460:7: lv_ownedType_7_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_1_1_0());
          						
        }
        pushFollow(FOLLOW_70);
        lv_ownedType_7_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:5477:5: ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==85) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // InternalUsex.g:5478:6: ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:5478:6: ( (lv_symbolCI_8_0= '<-' ) )
                // InternalUsex.g:5479:7: (lv_symbolCI_8_0= '<-' )
                {
                // InternalUsex.g:5479:7: (lv_symbolCI_8_0= '<-' )
                // InternalUsex.g:5480:8: lv_symbolCI_8_0= '<-'
                {
                lv_symbolCI_8_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5492:6: ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:5493:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:5493:7: (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:5494:8: lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_1_2_1_0());
                  							
                }
                pushFollow(FOLLOW_68);
                lv_ownedCoIterator_9_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5512:5: ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==28) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // InternalUsex.g:5513:6: ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                {
                // InternalUsex.g:5513:6: ( (lv_symbolIE_10_0= '=' ) )
                // InternalUsex.g:5514:7: (lv_symbolIE_10_0= '=' )
                {
                // InternalUsex.g:5514:7: (lv_symbolIE_10_0= '=' )
                // InternalUsex.g:5515:8: lv_symbolIE_10_0= '='
                {
                lv_symbolIE_10_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5527:6: ( (lv_ownedInitExpression_11_0= ruleExpCS ) )
                // InternalUsex.g:5528:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                {
                // InternalUsex.g:5528:7: (lv_ownedInitExpression_11_0= ruleExpCS )
                // InternalUsex.g:5529:8: lv_ownedInitExpression_11_0= ruleExpCS
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
    // $ANTLR end synpred141_InternalUsex

    // $ANTLR start synpred144_InternalUsex
    public final void synpred144_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_12_0=null;
        Token lv_symbolCI_14_0=null;
        Token lv_symbolIE_16_0=null;
        EObject lv_ownedType_13_0 = null;

        EObject lv_ownedCoIterator_15_0 = null;

        EObject lv_ownedInitExpression_17_0 = null;


        // InternalUsex.g:5549:4: ( ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )
        // InternalUsex.g:5549:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        {
        // InternalUsex.g:5549:4: ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) )
        // InternalUsex.g:5550:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        {
        // InternalUsex.g:5550:5: ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==18) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // InternalUsex.g:5551:6: ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                {
                // InternalUsex.g:5551:6: ( (lv_symbolT_12_0= ':' ) )
                // InternalUsex.g:5552:7: (lv_symbolT_12_0= ':' )
                {
                // InternalUsex.g:5552:7: (lv_symbolT_12_0= ':' )
                // InternalUsex.g:5553:8: lv_symbolT_12_0= ':'
                {
                lv_symbolT_12_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5565:6: ( (lv_ownedType_13_0= ruleTypeExpCS ) )
                // InternalUsex.g:5566:7: (lv_ownedType_13_0= ruleTypeExpCS )
                {
                // InternalUsex.g:5566:7: (lv_ownedType_13_0= ruleTypeExpCS )
                // InternalUsex.g:5567:8: lv_ownedType_13_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_2_2_0_1_0());
                  							
                }
                pushFollow(FOLLOW_71);
                lv_ownedType_13_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5585:5: ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==85) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // InternalUsex.g:5586:6: ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:5586:6: ( (lv_symbolCI_14_0= '<-' ) )
                // InternalUsex.g:5587:7: (lv_symbolCI_14_0= '<-' )
                {
                // InternalUsex.g:5587:7: (lv_symbolCI_14_0= '<-' )
                // InternalUsex.g:5588:8: lv_symbolCI_14_0= '<-'
                {
                lv_symbolCI_14_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5600:6: ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:5601:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:5601:7: (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:5602:8: lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_2_2_1_1_0());
                  							
                }
                pushFollow(FOLLOW_72);
                lv_ownedCoIterator_15_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5620:5: ( (lv_symbolIE_16_0= 'in' ) )
        // InternalUsex.g:5621:6: (lv_symbolIE_16_0= 'in' )
        {
        // InternalUsex.g:5621:6: (lv_symbolIE_16_0= 'in' )
        // InternalUsex.g:5622:7: lv_symbolIE_16_0= 'in'
        {
        lv_symbolIE_16_0=(Token)match(input,96,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5634:5: ( (lv_ownedInitExpression_17_0= ruleExpCS ) )
        // InternalUsex.g:5635:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        {
        // InternalUsex.g:5635:6: (lv_ownedInitExpression_17_0= ruleExpCS )
        // InternalUsex.g:5636:7: lv_ownedInitExpression_17_0= ruleExpCS
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
    // $ANTLR end synpred144_InternalUsex

    // $ANTLR start synpred148_InternalUsex
    public final void synpred148_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolCI_1_0=null;
        Token lv_symbolIE_3_0=null;
        EObject lv_ownedCoIterator_2_0 = null;

        EObject lv_ownedInitExpression_4_0 = null;


        // InternalUsex.g:5817:5: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:5817:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:5817:5: ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? )
        // InternalUsex.g:5818:6: ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:5818:6: ( (lv_symbolCI_1_0= '<-' ) )
        // InternalUsex.g:5819:7: (lv_symbolCI_1_0= '<-' )
        {
        // InternalUsex.g:5819:7: (lv_symbolCI_1_0= '<-' )
        // InternalUsex.g:5820:8: lv_symbolCI_1_0= '<-'
        {
        lv_symbolCI_1_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5832:6: ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) )
        // InternalUsex.g:5833:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        {
        // InternalUsex.g:5833:7: (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS )
        // InternalUsex.g:5834:8: lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_0_1_0());
          							
        }
        pushFollow(FOLLOW_68);
        lv_ownedCoIterator_2_0=ruleCoIteratorVariableCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:5851:6: ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )?
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==28) ) {
            alt131=1;
        }
        switch (alt131) {
            case 1 :
                // InternalUsex.g:5852:7: ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                {
                // InternalUsex.g:5852:7: ( (lv_symbolIE_3_0= '=' ) )
                // InternalUsex.g:5853:8: (lv_symbolIE_3_0= '=' )
                {
                // InternalUsex.g:5853:8: (lv_symbolIE_3_0= '=' )
                // InternalUsex.g:5854:9: lv_symbolIE_3_0= '='
                {
                lv_symbolIE_3_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5866:7: ( (lv_ownedInitExpression_4_0= ruleExpCS ) )
                // InternalUsex.g:5867:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                {
                // InternalUsex.g:5867:8: (lv_ownedInitExpression_4_0= ruleExpCS )
                // InternalUsex.g:5868:9: lv_ownedInitExpression_4_0= ruleExpCS
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
    // $ANTLR end synpred148_InternalUsex

    // $ANTLR start synpred151_InternalUsex
    public final void synpred151_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_5_0=null;
        Token lv_symbolCI_7_0=null;
        Token lv_symbolIE_9_0=null;
        EObject lv_ownedType_6_0 = null;

        EObject lv_ownedCoIterator_8_0 = null;

        EObject lv_ownedInitExpression_10_0 = null;


        // InternalUsex.g:5888:5: ( ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) )
        // InternalUsex.g:5888:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        {
        // InternalUsex.g:5888:5: ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? )
        // InternalUsex.g:5889:6: ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        {
        // InternalUsex.g:5889:6: ( (lv_symbolT_5_0= ':' ) )
        // InternalUsex.g:5890:7: (lv_symbolT_5_0= ':' )
        {
        // InternalUsex.g:5890:7: (lv_symbolT_5_0= ':' )
        // InternalUsex.g:5891:8: lv_symbolT_5_0= ':'
        {
        lv_symbolT_5_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return ;

        }


        }

        // InternalUsex.g:5903:6: ( (lv_ownedType_6_0= ruleTypeExpCS ) )
        // InternalUsex.g:5904:7: (lv_ownedType_6_0= ruleTypeExpCS )
        {
        // InternalUsex.g:5904:7: (lv_ownedType_6_0= ruleTypeExpCS )
        // InternalUsex.g:5905:8: lv_ownedType_6_0= ruleTypeExpCS
        {
        if ( state.backtracking==0 ) {

          								newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_1_1_0());
          							
        }
        pushFollow(FOLLOW_70);
        lv_ownedType_6_0=ruleTypeExpCS();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUsex.g:5922:6: ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==85) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // InternalUsex.g:5923:7: ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:5923:7: ( (lv_symbolCI_7_0= '<-' ) )
                // InternalUsex.g:5924:8: (lv_symbolCI_7_0= '<-' )
                {
                // InternalUsex.g:5924:8: (lv_symbolCI_7_0= '<-' )
                // InternalUsex.g:5925:9: lv_symbolCI_7_0= '<-'
                {
                lv_symbolCI_7_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5937:7: ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:5938:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:5938:8: (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:5939:9: lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_1_2_1_0());
                  								
                }
                pushFollow(FOLLOW_68);
                lv_ownedCoIterator_8_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:5957:6: ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==28) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // InternalUsex.g:5958:7: ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                {
                // InternalUsex.g:5958:7: ( (lv_symbolIE_9_0= '=' ) )
                // InternalUsex.g:5959:8: (lv_symbolIE_9_0= '=' )
                {
                // InternalUsex.g:5959:8: (lv_symbolIE_9_0= '=' )
                // InternalUsex.g:5960:9: lv_symbolIE_9_0= '='
                {
                lv_symbolIE_9_0=(Token)match(input,28,FOLLOW_13); if (state.failed) return ;

                }


                }

                // InternalUsex.g:5972:7: ( (lv_ownedInitExpression_10_0= ruleExpCS ) )
                // InternalUsex.g:5973:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                {
                // InternalUsex.g:5973:8: (lv_ownedInitExpression_10_0= ruleExpCS )
                // InternalUsex.g:5974:9: lv_ownedInitExpression_10_0= ruleExpCS
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
    // $ANTLR end synpred151_InternalUsex

    // $ANTLR start synpred154_InternalUsex
    public final void synpred154_InternalUsex_fragment() throws RecognitionException {   
        Token lv_symbolT_11_0=null;
        Token lv_symbolCI_13_0=null;
        Token lv_symbolIE_15_0=null;
        EObject lv_ownedType_12_0 = null;

        EObject lv_ownedCoIterator_14_0 = null;

        EObject lv_ownedInitExpression_16_0 = null;


        // InternalUsex.g:5994:5: ( ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )
        // InternalUsex.g:5994:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        {
        // InternalUsex.g:5994:5: ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) )
        // InternalUsex.g:5995:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        {
        // InternalUsex.g:5995:6: ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==18) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // InternalUsex.g:5996:7: ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                {
                // InternalUsex.g:5996:7: ( (lv_symbolT_11_0= ':' ) )
                // InternalUsex.g:5997:8: (lv_symbolT_11_0= ':' )
                {
                // InternalUsex.g:5997:8: (lv_symbolT_11_0= ':' )
                // InternalUsex.g:5998:9: lv_symbolT_11_0= ':'
                {
                lv_symbolT_11_0=(Token)match(input,18,FOLLOW_28); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6010:7: ( (lv_ownedType_12_0= ruleTypeExpCS ) )
                // InternalUsex.g:6011:8: (lv_ownedType_12_0= ruleTypeExpCS )
                {
                // InternalUsex.g:6011:8: (lv_ownedType_12_0= ruleTypeExpCS )
                // InternalUsex.g:6012:9: lv_ownedType_12_0= ruleTypeExpCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeTypeExpCSParserRuleCall_0_1_2_0_1_0());
                  								
                }
                pushFollow(FOLLOW_71);
                lv_ownedType_12_0=ruleTypeExpCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:6030:6: ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==85) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // InternalUsex.g:6031:7: ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                {
                // InternalUsex.g:6031:7: ( (lv_symbolCI_13_0= '<-' ) )
                // InternalUsex.g:6032:8: (lv_symbolCI_13_0= '<-' )
                {
                // InternalUsex.g:6032:8: (lv_symbolCI_13_0= '<-' )
                // InternalUsex.g:6033:9: lv_symbolCI_13_0= '<-'
                {
                lv_symbolCI_13_0=(Token)match(input,85,FOLLOW_3); if (state.failed) return ;

                }


                }

                // InternalUsex.g:6045:7: ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) )
                // InternalUsex.g:6046:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                {
                // InternalUsex.g:6046:8: (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS )
                // InternalUsex.g:6047:9: lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS
                {
                if ( state.backtracking==0 ) {

                  									newCompositeNode(grammarAccess.getNavigatingArgCSAccess().getOwnedCoIteratorCoIteratorVariableCSParserRuleCall_0_1_2_1_1_0());
                  								
                }
                pushFollow(FOLLOW_72);
                lv_ownedCoIterator_14_0=ruleCoIteratorVariableCS();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }
                break;

        }

        // InternalUsex.g:6065:6: ( (lv_symbolIE_15_0= 'in' ) )
        // InternalUsex.g:6066:7: (lv_symbolIE_15_0= 'in' )
        {
        // InternalUsex.g:6066:7: (lv_symbolIE_15_0= 'in' )
        // InternalUsex.g:6067:8: lv_symbolIE_15_0= 'in'
        {
        lv_symbolIE_15_0=(Token)match(input,96,FOLLOW_13); if (state.failed) return ;

        }


        }

        // InternalUsex.g:6079:6: ( (lv_ownedInitExpression_16_0= ruleExpCS ) )
        // InternalUsex.g:6080:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        {
        // InternalUsex.g:6080:7: (lv_ownedInitExpression_16_0= ruleExpCS )
        // InternalUsex.g:6081:8: lv_ownedInitExpression_16_0= ruleExpCS
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
    // $ANTLR end synpred154_InternalUsex

    // Delegated rules

    public final boolean synpred103_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalUsex_fragment(); // can never throw exception
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
    public final boolean synpred102_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalUsex_fragment(); // can never throw exception
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
    public final boolean synpred144_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_InternalUsex_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred141_InternalUsex() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalUsex_fragment(); // can never throw exception
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


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA102 dfa102 = new DFA102(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\4\uffff\1\7\10\uffff\5\7\2\uffff";
    static final String dfa_3s = "\1\4\1\31\1\4\1\22\3\4\1\uffff\13\4\1\uffff";
    static final String dfa_4s = "\1\4\1\31\1\32\1\22\1\37\2\30\1\uffff\5\35\5\37\1\32\1\uffff";
    static final String dfa_5s = "\7\uffff\1\1\13\uffff\1\2";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\25\uffff\1\4",
            "\1\5",
            "\1\7\13\uffff\2\7\1\6\10\uffff\1\7\2\uffff\2\7",
            "\1\14\20\uffff\1\10\1\11\1\12\1\13",
            "\1\21\20\uffff\1\15\1\16\1\17\1\20",
            "",
            "\1\3\25\uffff\1\4\2\uffff\1\22",
            "\1\3\25\uffff\1\4\2\uffff\1\22",
            "\1\3\25\uffff\1\4\2\uffff\1\22",
            "\1\3\25\uffff\1\4\2\uffff\1\22",
            "\1\3\25\uffff\1\4\2\uffff\1\22",
            "\1\7\13\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\13\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\13\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\13\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\13\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\3\25\uffff\1\4",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "579:2: (this_Method_0= ruleMethod | this_Query_1= ruleQuery )";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\4\11\uffff\5\0\3\uffff";
    static final String dfa_10s = "\1\60\11\uffff\5\0\3\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\16\uffff\1\3";
    static final String dfa_12s = "\12\uffff\1\0\1\1\1\2\1\3\1\4\3\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\20\uffff\4\2\15\uffff\4\2\1\12\1\13\1\14\1\15\1\16\2\2",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2428:2: (this_TypeNameExpCS_0= ruleTypeNameExpCS | this_TypeLiteralCS_1= ruleTypeLiteralCS | this_CollectionPatternCS_2= ruleCollectionPatternCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_11 = input.LA(1);

                         
                        int index42_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index42_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_12 = input.LA(1);

                         
                        int index42_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index42_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_13 = input.LA(1);

                         
                        int index42_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index42_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_14 = input.LA(1);

                         
                        int index42_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalUsex()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index42_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\37\uffff";
    static final String dfa_15s = "\1\4\3\0\33\uffff";
    static final String dfa_16s = "\1\137\3\0\33\uffff";
    static final String dfa_17s = "\4\uffff\1\1\31\uffff\1\2";
    static final String dfa_18s = "\1\uffff\1\0\1\1\1\2\33\uffff}>";
    static final String[] dfa_19s = {
            "\3\4\16\uffff\5\4\14\uffff\14\4\2\uffff\1\1\22\uffff\1\2\1\3\13\uffff\1\4\1\uffff\5\4\4\uffff\1\36",
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

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "3278:2: ( (this_PrefixedPrimaryExpCS_0= rulePrefixedPrimaryExpCS ( () ( (lv_operator_2_0= ruleBinaryOperatorName ) ) ( (lv_ownedRight_3_0= ruleExpCS ) ) )? ) | this_PrefixedLetExpCS_4= rulePrefixedLetExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalUsex()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalUsex()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalUsex()) ) {s = 4;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\36\uffff";
    static final String dfa_21s = "\1\4\11\uffff\7\0\15\uffff";
    static final String dfa_22s = "\1\132\11\uffff\7\0\15\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\3\15\uffff\1\7\1\10\7\uffff\1\11\1\4\1\5\1\6";
    static final String dfa_24s = "\12\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff}>";
    static final String[] dfa_25s = {
            "\1\32\2\3\16\uffff\4\22\1\1\14\uffff\4\22\1\14\1\15\1\16\1\17\1\20\1\13\1\12\1\3\42\uffff\1\21\1\uffff\4\3\1\2",
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

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3534:2: (this_NestedExpCS_0= ruleNestedExpCS | this_IfExpCS_1= ruleIfExpCS | this_PrimitiveLiteralExpCS_2= rulePrimitiveLiteralExpCS | this_TupleLiteralExpCS_3= ruleTupleLiteralExpCS | this_MapLiteralExpCS_4= ruleMapLiteralExpCS | this_CollectionLiteralExpCS_5= ruleCollectionLiteralExpCS | this_LambdaLiteralExpCS_6= ruleLambdaLiteralExpCS | this_TypeLiteralExpCS_7= ruleTypeLiteralExpCS | this_NameExpCS_8= ruleNameExpCS )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred102_InternalUsex()) ) {s = 27;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_11 = input.LA(1);

                         
                        int index63_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_InternalUsex()) ) {s = 28;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_12 = input.LA(1);

                         
                        int index63_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalUsex()) ) {s = 29;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_13 = input.LA(1);

                         
                        int index63_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalUsex()) ) {s = 29;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_14 = input.LA(1);

                         
                        int index63_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalUsex()) ) {s = 29;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_15 = input.LA(1);

                         
                        int index63_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalUsex()) ) {s = 29;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_16 = input.LA(1);

                         
                        int index63_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred104_InternalUsex()) ) {s = 29;}

                        else if ( (synpred106_InternalUsex()) ) {s = 18;}

                         
                        input.seek(index63_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\13\uffff";
    static final String dfa_27s = "\1\4\12\uffff";
    static final String dfa_28s = "\1\22\2\0\10\uffff";
    static final String dfa_29s = "\1\142\2\0\10\uffff";
    static final String dfa_30s = "\3\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String dfa_31s = "\1\uffff\1\0\1\1\10\uffff}>";
    static final String[] dfa_32s = {
            "\1\2\7\uffff\1\4\2\uffff\1\4\67\uffff\1\1\12\uffff\1\3\2\4",
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

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5371:3: ( ( ( (lv_symbolCI_2_0= '<-' ) ) ( (lv_ownedCoIterator_3_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_4_0= '=' ) ) ( (lv_ownedInitExpression_5_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_6_0= ':' ) ) ( (lv_ownedType_7_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_8_0= '<-' ) ) ( (lv_ownedCoIterator_9_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_10_0= '=' ) ) ( (lv_ownedInitExpression_11_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_12_0= ':' ) ) ( (lv_ownedType_13_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_14_0= '<-' ) ) ( (lv_ownedCoIterator_15_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_16_0= 'in' ) ) ( (lv_ownedInitExpression_17_0= ruleExpCS ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalUsex()) ) {s = 9;}

                        else if ( (synpred144_InternalUsex()) ) {s = 3;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA94_2 = input.LA(1);

                         
                        int index94_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalUsex()) ) {s = 10;}

                        else if ( (synpred144_InternalUsex()) ) {s = 3;}

                         
                        input.seek(index94_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA102 extends DFA {

        public DFA102(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 102;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "5816:4: ( ( ( (lv_symbolCI_1_0= '<-' ) ) ( (lv_ownedCoIterator_2_0= ruleCoIteratorVariableCS ) ) ( ( (lv_symbolIE_3_0= '=' ) ) ( (lv_ownedInitExpression_4_0= ruleExpCS ) ) )? ) | ( ( (lv_symbolT_5_0= ':' ) ) ( (lv_ownedType_6_0= ruleTypeExpCS ) ) ( ( (lv_symbolCI_7_0= '<-' ) ) ( (lv_ownedCoIterator_8_0= ruleCoIteratorVariableCS ) ) )? ( ( (lv_symbolIE_9_0= '=' ) ) ( (lv_ownedInitExpression_10_0= ruleExpCS ) ) )? ) | ( ( ( (lv_symbolT_11_0= ':' ) ) ( (lv_ownedType_12_0= ruleTypeExpCS ) ) )? ( ( (lv_symbolCI_13_0= '<-' ) ) ( (lv_ownedCoIterator_14_0= ruleCoIteratorVariableCS ) ) )? ( (lv_symbolIE_15_0= 'in' ) ) ( (lv_ownedInitExpression_16_0= ruleExpCS ) ) ) )?";
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
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000E00003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001E00010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0013FFC003E00070L,0x0000000087D00180L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C8040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0013FFC003E00070L,0x0000000007D00180L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040010L,0x0000000000000800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0013FFC003E40070L,0x0000000087D00180L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000A000000000040L,0x0000000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xFFFE000010000002L,0x000000000000007FL});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000002000002L,0x0000000000082200L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0013FFC003E40070L,0x0000000087D00980L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0013FFC003E00070L,0x0000000087D00980L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000050000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000020000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000012040000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0013FFC007E40070L,0x0000000087D00180L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000024000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000040002L,0x0000000100200000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000010000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000100200000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});

}