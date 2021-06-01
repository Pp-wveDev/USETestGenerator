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

@SuppressWarnings("all")
public class InternalUsexParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ASTERISK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'class'", "'attributes'", "'operations'", "'constraints'", "'end'", "':'", "'init'", "'derived'", "'String'", "'Real'", "'Integer'", "'Boolean'", "'('", "')'", "'begin'", "'='", "','", "'pre'", "'post'", "'inv'", "'association'", "'between'", "'composition'", "'['", "']'", "'role'", "'..'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_ASTERISK=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalUsex.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUsex.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUsex.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalUsex.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:77:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* ) )
            // InternalUsex.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* )
            {
            // InternalUsex.g:78:2: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )* )
            // InternalUsex.g:79:3: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleAbstractElement ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalUsex.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalUsex.g:101:3: ( (lv_elements_2_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==35||LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUsex.g:102:4: (lv_elements_2_0= ruleAbstractElement )
            	    {
            	    // InternalUsex.g:102:4: (lv_elements_2_0= ruleAbstractElement )
            	    // InternalUsex.g:103:5: lv_elements_2_0= ruleAbstractElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleAbstractElement();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalUsex.g:124:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalUsex.g:124:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalUsex.g:125:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalUsex.g:131:1: ruleAbstractElement returns [EObject current=null] : (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_0 = null;

        EObject this_UseClass_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:137:2: ( (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass ) )
            // InternalUsex.g:138:2: (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass )
            {
            // InternalUsex.g:138:2: (this_Relation_0= ruleRelation | this_UseClass_1= ruleUseClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==35||LA2_0==37) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUsex.g:139:3: this_Relation_0= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_0=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:148:3: this_UseClass_1= ruleUseClass
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getUseClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UseClass_1=ruleUseClass();

                    state._fsp--;


                    			current = this_UseClass_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUseClass"
    // InternalUsex.g:160:1: entryRuleUseClass returns [EObject current=null] : iv_ruleUseClass= ruleUseClass EOF ;
    public final EObject entryRuleUseClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseClass = null;


        try {
            // InternalUsex.g:160:49: (iv_ruleUseClass= ruleUseClass EOF )
            // InternalUsex.g:161:2: iv_ruleUseClass= ruleUseClass EOF
            {
             newCompositeNode(grammarAccess.getUseClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseClass=ruleUseClass();

            state._fsp--;

             current =iv_ruleUseClass; 
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
    // $ANTLR end "entryRuleUseClass"


    // $ANTLR start "ruleUseClass"
    // InternalUsex.g:167:1: ruleUseClass returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )* )? (otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )* )? (otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )* )? otherlv_8= 'end' ) ;
    public final EObject ruleUseClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_operations_5_0 = null;

        EObject lv_constraints_7_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:173:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )* )? (otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )* )? (otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )* )? otherlv_8= 'end' ) )
            // InternalUsex.g:174:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )* )? (otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )* )? (otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )* )? otherlv_8= 'end' )
            {
            // InternalUsex.g:174:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )* )? (otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )* )? (otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )* )? otherlv_8= 'end' )
            // InternalUsex.g:175:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )* )? (otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )* )? (otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )* )? otherlv_8= 'end'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUseClassAccess().getClassKeyword_0());
            		
            // InternalUsex.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUseClassAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUsex.g:197:3: (otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUsex.g:198:4: otherlv_2= 'attributes' ( (lv_attributes_3_0= ruleAttribute ) )*
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseClassAccess().getAttributesKeyword_2_0());
                    			
                    // InternalUsex.g:202:4: ( (lv_attributes_3_0= ruleAttribute ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUsex.g:203:5: (lv_attributes_3_0= ruleAttribute )
                    	    {
                    	    // InternalUsex.g:203:5: (lv_attributes_3_0= ruleAttribute )
                    	    // InternalUsex.g:204:6: lv_attributes_3_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseClassAccess().getAttributesAttributeParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_attributes_3_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_3_0,
                    	    							"org.xtext.uma.usex.Usex.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUsex.g:222:3: (otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUsex.g:223:4: otherlv_4= 'operations' ( (lv_operations_5_0= ruleOperation ) )*
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseClassAccess().getOperationsKeyword_3_0());
                    			
                    // InternalUsex.g:227:4: ( (lv_operations_5_0= ruleOperation ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUsex.g:228:5: (lv_operations_5_0= ruleOperation )
                    	    {
                    	    // InternalUsex.g:228:5: (lv_operations_5_0= ruleOperation )
                    	    // InternalUsex.g:229:6: lv_operations_5_0= ruleOperation
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseClassAccess().getOperationsOperationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_operations_5_0=ruleOperation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"operations",
                    	    							lv_operations_5_0,
                    	    							"org.xtext.uma.usex.Usex.Operation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUsex.g:247:3: (otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUsex.g:248:4: otherlv_6= 'constraints' ( (lv_constraints_7_0= ruleConstraint ) )*
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getUseClassAccess().getConstraintsKeyword_4_0());
                    			
                    // InternalUsex.g:252:4: ( (lv_constraints_7_0= ruleConstraint ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==34) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUsex.g:253:5: (lv_constraints_7_0= ruleConstraint )
                    	    {
                    	    // InternalUsex.g:253:5: (lv_constraints_7_0= ruleConstraint )
                    	    // InternalUsex.g:254:6: lv_constraints_7_0= ruleConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseClassAccess().getConstraintsConstraintParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_constraints_7_0=ruleConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseClassRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"constraints",
                    	    							lv_constraints_7_0,
                    	    							"org.xtext.uma.usex.Usex.Constraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getUseClassAccess().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleUseClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalUsex.g:280:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUsex.g:280:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUsex.g:281:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUsex.g:287:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_derivedFrom_8_0=null;
        EObject lv_type_2_0 = null;

        EObject lv_initialization_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:293:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) ) )? ) )
            // InternalUsex.g:294:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) ) )? )
            {
            // InternalUsex.g:294:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) ) )? )
            // InternalUsex.g:295:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) ) )? (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) ) )?
            {
            // InternalUsex.g:295:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:296:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:296:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:297:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalUsex.g:317:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalUsex.g:318:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalUsex.g:318:4: (lv_type_2_0= ruleAttributeType )
            // InternalUsex.g:319:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


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

            // InternalUsex.g:336:3: (otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsex.g:337:4: otherlv_3= 'init' otherlv_4= ':' ( (lv_initialization_5_0= ruleAttributeInitialization ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getInitKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_3_1());
                    			
                    // InternalUsex.g:345:4: ( (lv_initialization_5_0= ruleAttributeInitialization ) )
                    // InternalUsex.g:346:5: (lv_initialization_5_0= ruleAttributeInitialization )
                    {
                    // InternalUsex.g:346:5: (lv_initialization_5_0= ruleAttributeInitialization )
                    // InternalUsex.g:347:6: lv_initialization_5_0= ruleAttributeInitialization
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getInitializationAttributeInitializationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_initialization_5_0=ruleAttributeInitialization();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"initialization",
                    							lv_initialization_5_0,
                    							"org.xtext.uma.usex.Usex.AttributeInitialization");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUsex.g:365:3: (otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUsex.g:366:4: otherlv_6= 'derived' otherlv_7= ':' ( (lv_derivedFrom_8_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getDerivedKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getColonKeyword_4_1());
                    			
                    // InternalUsex.g:374:4: ( (lv_derivedFrom_8_0= RULE_ID ) )
                    // InternalUsex.g:375:5: (lv_derivedFrom_8_0= RULE_ID )
                    {
                    // InternalUsex.g:375:5: (lv_derivedFrom_8_0= RULE_ID )
                    // InternalUsex.g:376:6: lv_derivedFrom_8_0= RULE_ID
                    {
                    lv_derivedFrom_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_derivedFrom_8_0, grammarAccess.getAttributeAccess().getDerivedFromIDTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"derivedFrom",
                    							lv_derivedFrom_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUsex.g:397:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUsex.g:397:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUsex.g:398:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUsex.g:404:1: ruleAttributeType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_ClassType_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:410:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType ) )
            // InternalUsex.g:411:2: (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType )
            {
            // InternalUsex.g:411:2: (this_PrimitiveType_0= rulePrimitiveType | this_ClassType_1= ruleClassType )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=23 && LA11_0<=26)) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUsex.g:412:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:421:3: this_ClassType_1= ruleClassType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getClassTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassType_1=ruleClassType();

                    state._fsp--;


                    			current = this_ClassType_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalUsex.g:433:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalUsex.g:433:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalUsex.g:434:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalUsex.g:440:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalUsex.g:446:2: ( ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) ) )
            // InternalUsex.g:447:2: ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) )
            {
            // InternalUsex.g:447:2: ( ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) ) )
            // InternalUsex.g:448:3: ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) )
            {
            // InternalUsex.g:448:3: ( (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' ) )
            // InternalUsex.g:449:4: (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' )
            {
            // InternalUsex.g:449:4: (lv_type_0_1= 'String' | lv_type_0_2= 'Real' | lv_type_0_3= 'Integer' | lv_type_0_4= 'Boolean' )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 24:
                {
                alt12=2;
                }
                break;
            case 25:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUsex.g:450:5: lv_type_0_1= 'String'
                    {
                    lv_type_0_1=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getPrimitiveTypeAccess().getTypeStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalUsex.g:461:5: lv_type_0_2= 'Real'
                    {
                    lv_type_0_2=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getPrimitiveTypeAccess().getTypeRealKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalUsex.g:472:5: lv_type_0_3= 'Integer'
                    {
                    lv_type_0_3=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getPrimitiveTypeAccess().getTypeIntegerKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalUsex.g:483:5: lv_type_0_4= 'Boolean'
                    {
                    lv_type_0_4=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_0_4, grammarAccess.getPrimitiveTypeAccess().getTypeBooleanKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_4, null);
                    				

                    }
                    break;

            }


            }


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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleClassType"
    // InternalUsex.g:499:1: entryRuleClassType returns [EObject current=null] : iv_ruleClassType= ruleClassType EOF ;
    public final EObject entryRuleClassType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassType = null;


        try {
            // InternalUsex.g:499:50: (iv_ruleClassType= ruleClassType EOF )
            // InternalUsex.g:500:2: iv_ruleClassType= ruleClassType EOF
            {
             newCompositeNode(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassType=ruleClassType();

            state._fsp--;

             current =iv_ruleClassType; 
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
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalUsex.g:506:1: ruleClassType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleClassType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUsex.g:512:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalUsex.g:513:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalUsex.g:513:2: ( (otherlv_0= RULE_ID ) )
            // InternalUsex.g:514:3: (otherlv_0= RULE_ID )
            {
            // InternalUsex.g:514:3: (otherlv_0= RULE_ID )
            // InternalUsex.g:515:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getClassTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeUseClassCrossReference_0());
            			

            }


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
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleAttributeInitialization"
    // InternalUsex.g:529:1: entryRuleAttributeInitialization returns [EObject current=null] : iv_ruleAttributeInitialization= ruleAttributeInitialization EOF ;
    public final EObject entryRuleAttributeInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeInitialization = null;


        try {
            // InternalUsex.g:529:64: (iv_ruleAttributeInitialization= ruleAttributeInitialization EOF )
            // InternalUsex.g:530:2: iv_ruleAttributeInitialization= ruleAttributeInitialization EOF
            {
             newCompositeNode(grammarAccess.getAttributeInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeInitialization=ruleAttributeInitialization();

            state._fsp--;

             current =iv_ruleAttributeInitialization; 
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
    // $ANTLR end "entryRuleAttributeInitialization"


    // $ANTLR start "ruleAttributeInitialization"
    // InternalUsex.g:536:1: ruleAttributeInitialization returns [EObject current=null] : (this_DoubleInitialization_0= ruleDoubleInitialization | this_BooleanInitialization_1= ruleBooleanInitialization | this_IntegerInitialization_2= ruleIntegerInitialization | this_StringInitialization_3= ruleStringInitialization ) ;
    public final EObject ruleAttributeInitialization() throws RecognitionException {
        EObject current = null;

        EObject this_DoubleInitialization_0 = null;

        EObject this_BooleanInitialization_1 = null;

        EObject this_IntegerInitialization_2 = null;

        EObject this_StringInitialization_3 = null;



        	enterRule();

        try {
            // InternalUsex.g:542:2: ( (this_DoubleInitialization_0= ruleDoubleInitialization | this_BooleanInitialization_1= ruleBooleanInitialization | this_IntegerInitialization_2= ruleIntegerInitialization | this_StringInitialization_3= ruleStringInitialization ) )
            // InternalUsex.g:543:2: (this_DoubleInitialization_0= ruleDoubleInitialization | this_BooleanInitialization_1= ruleBooleanInitialization | this_IntegerInitialization_2= ruleIntegerInitialization | this_StringInitialization_3= ruleStringInitialization )
            {
            // InternalUsex.g:543:2: (this_DoubleInitialization_0= ruleDoubleInitialization | this_BooleanInitialization_1= ruleBooleanInitialization | this_IntegerInitialization_2= ruleIntegerInitialization | this_StringInitialization_3= ruleStringInitialization )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt13=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt13=2;
                }
                break;
            case RULE_INT:
                {
                alt13=3;
                }
                break;
            case RULE_STRING:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUsex.g:544:3: this_DoubleInitialization_0= ruleDoubleInitialization
                    {

                    			newCompositeNode(grammarAccess.getAttributeInitializationAccess().getDoubleInitializationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleInitialization_0=ruleDoubleInitialization();

                    state._fsp--;


                    			current = this_DoubleInitialization_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:553:3: this_BooleanInitialization_1= ruleBooleanInitialization
                    {

                    			newCompositeNode(grammarAccess.getAttributeInitializationAccess().getBooleanInitializationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanInitialization_1=ruleBooleanInitialization();

                    state._fsp--;


                    			current = this_BooleanInitialization_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUsex.g:562:3: this_IntegerInitialization_2= ruleIntegerInitialization
                    {

                    			newCompositeNode(grammarAccess.getAttributeInitializationAccess().getIntegerInitializationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerInitialization_2=ruleIntegerInitialization();

                    state._fsp--;


                    			current = this_IntegerInitialization_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUsex.g:571:3: this_StringInitialization_3= ruleStringInitialization
                    {

                    			newCompositeNode(grammarAccess.getAttributeInitializationAccess().getStringInitializationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringInitialization_3=ruleStringInitialization();

                    state._fsp--;


                    			current = this_StringInitialization_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAttributeInitialization"


    // $ANTLR start "entryRuleDoubleInitialization"
    // InternalUsex.g:583:1: entryRuleDoubleInitialization returns [EObject current=null] : iv_ruleDoubleInitialization= ruleDoubleInitialization EOF ;
    public final EObject entryRuleDoubleInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleInitialization = null;


        try {
            // InternalUsex.g:583:61: (iv_ruleDoubleInitialization= ruleDoubleInitialization EOF )
            // InternalUsex.g:584:2: iv_ruleDoubleInitialization= ruleDoubleInitialization EOF
            {
             newCompositeNode(grammarAccess.getDoubleInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleInitialization=ruleDoubleInitialization();

            state._fsp--;

             current =iv_ruleDoubleInitialization; 
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
    // $ANTLR end "entryRuleDoubleInitialization"


    // $ANTLR start "ruleDoubleInitialization"
    // InternalUsex.g:590:1: ruleDoubleInitialization returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleDoubleInitialization() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:596:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalUsex.g:597:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalUsex.g:597:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalUsex.g:598:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalUsex.g:598:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalUsex.g:599:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDoubleInitializationAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDoubleInitializationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.uma.usex.Usex.DOUBLE");
            			

            }


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
    // $ANTLR end "ruleDoubleInitialization"


    // $ANTLR start "entryRuleBooleanInitialization"
    // InternalUsex.g:618:1: entryRuleBooleanInitialization returns [EObject current=null] : iv_ruleBooleanInitialization= ruleBooleanInitialization EOF ;
    public final EObject entryRuleBooleanInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanInitialization = null;


        try {
            // InternalUsex.g:618:62: (iv_ruleBooleanInitialization= ruleBooleanInitialization EOF )
            // InternalUsex.g:619:2: iv_ruleBooleanInitialization= ruleBooleanInitialization EOF
            {
             newCompositeNode(grammarAccess.getBooleanInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanInitialization=ruleBooleanInitialization();

            state._fsp--;

             current =iv_ruleBooleanInitialization; 
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
    // $ANTLR end "entryRuleBooleanInitialization"


    // $ANTLR start "ruleBooleanInitialization"
    // InternalUsex.g:625:1: ruleBooleanInitialization returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanInitialization() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:631:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalUsex.g:632:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalUsex.g:632:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalUsex.g:633:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalUsex.g:633:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalUsex.g:634:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBooleanInitializationAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanInitializationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.uma.usex.Usex.BOOLEAN");
            			

            }


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
    // $ANTLR end "ruleBooleanInitialization"


    // $ANTLR start "entryRuleIntegerInitialization"
    // InternalUsex.g:653:1: entryRuleIntegerInitialization returns [EObject current=null] : iv_ruleIntegerInitialization= ruleIntegerInitialization EOF ;
    public final EObject entryRuleIntegerInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerInitialization = null;


        try {
            // InternalUsex.g:653:62: (iv_ruleIntegerInitialization= ruleIntegerInitialization EOF )
            // InternalUsex.g:654:2: iv_ruleIntegerInitialization= ruleIntegerInitialization EOF
            {
             newCompositeNode(grammarAccess.getIntegerInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerInitialization=ruleIntegerInitialization();

            state._fsp--;

             current =iv_ruleIntegerInitialization; 
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
    // $ANTLR end "entryRuleIntegerInitialization"


    // $ANTLR start "ruleIntegerInitialization"
    // InternalUsex.g:660:1: ruleIntegerInitialization returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerInitialization() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:666:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalUsex.g:667:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalUsex.g:667:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalUsex.g:668:3: (lv_value_0_0= RULE_INT )
            {
            // InternalUsex.g:668:3: (lv_value_0_0= RULE_INT )
            // InternalUsex.g:669:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntegerInitializationAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntegerInitializationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.uma.usex.Usex.INT");
            			

            }


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
    // $ANTLR end "ruleIntegerInitialization"


    // $ANTLR start "entryRuleStringInitialization"
    // InternalUsex.g:688:1: entryRuleStringInitialization returns [EObject current=null] : iv_ruleStringInitialization= ruleStringInitialization EOF ;
    public final EObject entryRuleStringInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringInitialization = null;


        try {
            // InternalUsex.g:688:61: (iv_ruleStringInitialization= ruleStringInitialization EOF )
            // InternalUsex.g:689:2: iv_ruleStringInitialization= ruleStringInitialization EOF
            {
             newCompositeNode(grammarAccess.getStringInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringInitialization=ruleStringInitialization();

            state._fsp--;

             current =iv_ruleStringInitialization; 
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
    // $ANTLR end "entryRuleStringInitialization"


    // $ANTLR start "ruleStringInitialization"
    // InternalUsex.g:695:1: ruleStringInitialization returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringInitialization() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:701:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalUsex.g:702:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalUsex.g:702:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalUsex.g:703:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalUsex.g:703:3: (lv_value_0_0= RULE_STRING )
            // InternalUsex.g:704:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringInitializationAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringInitializationRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


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
    // $ANTLR end "ruleStringInitialization"


    // $ANTLR start "entryRuleOperation"
    // InternalUsex.g:723:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalUsex.g:723:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalUsex.g:724:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalUsex.g:730:1: ruleOperation returns [EObject current=null] : (this_Method_0= ruleMethod | this_Query_1= ruleQuery ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Method_0 = null;

        EObject this_Query_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:736:2: ( (this_Method_0= ruleMethod | this_Query_1= ruleQuery ) )
            // InternalUsex.g:737:2: (this_Method_0= ruleMethod | this_Query_1= ruleQuery )
            {
            // InternalUsex.g:737:2: (this_Method_0= ruleMethod | this_Query_1= ruleQuery )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalUsex.g:738:3: this_Method_0= ruleMethod
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getMethodParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Method_0=ruleMethod();

                    state._fsp--;


                    			current = this_Method_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:747:3: this_Query_1= ruleQuery
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getQueryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query_1=ruleQuery();

                    state._fsp--;


                    			current = this_Query_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleMethod"
    // InternalUsex.g:759:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUsex.g:759:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUsex.g:760:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUsex.g:766:1: ruleMethod returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_operationBody_7_0=null;
        Token otherlv_8=null;
        EObject lv_inputParameters_2_0 = null;

        EObject lv_returnParameter_5_0 = null;

        EObject lv_conditions_9_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:772:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* ) )
            // InternalUsex.g:773:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* )
            {
            // InternalUsex.g:773:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )* )
            // InternalUsex.g:774:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )? (otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end' )? ( (lv_conditions_9_0= ruleCondition ) )*
            {
            // InternalUsex.g:774:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:775:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:775:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:776:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsex.g:796:3: ( (lv_inputParameters_2_0= ruleParameter ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUsex.g:797:4: (lv_inputParameters_2_0= ruleParameter )
            	    {
            	    // InternalUsex.g:797:4: (lv_inputParameters_2_0= ruleParameter )
            	    // InternalUsex.g:798:5: lv_inputParameters_2_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getMethodAccess().getInputParametersParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_inputParameters_2_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getRightParenthesisKeyword_3());
            		
            // InternalUsex.g:819:3: (otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUsex.g:820:4: otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getColonKeyword_4_0());
                    			
                    // InternalUsex.g:824:4: ( (lv_returnParameter_5_0= ruleAttributeType ) )
                    // InternalUsex.g:825:5: (lv_returnParameter_5_0= ruleAttributeType )
                    {
                    // InternalUsex.g:825:5: (lv_returnParameter_5_0= ruleAttributeType )
                    // InternalUsex.g:826:6: lv_returnParameter_5_0= ruleAttributeType
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getReturnParameterAttributeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_returnParameter_5_0=ruleAttributeType();

                    state._fsp--;


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
                    break;

            }

            // InternalUsex.g:844:3: (otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUsex.g:845:4: otherlv_6= 'begin' ( (lv_operationBody_7_0= RULE_ID ) ) otherlv_8= 'end'
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getBeginKeyword_5_0());
                    			
                    // InternalUsex.g:849:4: ( (lv_operationBody_7_0= RULE_ID ) )
                    // InternalUsex.g:850:5: (lv_operationBody_7_0= RULE_ID )
                    {
                    // InternalUsex.g:850:5: (lv_operationBody_7_0= RULE_ID )
                    // InternalUsex.g:851:6: lv_operationBody_7_0= RULE_ID
                    {
                    lv_operationBody_7_0=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(lv_operationBody_7_0, grammarAccess.getMethodAccess().getOperationBodyIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMethodRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operationBody",
                    							lv_operationBody_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getMethodAccess().getEndKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalUsex.g:872:3: ( (lv_conditions_9_0= ruleCondition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUsex.g:873:4: (lv_conditions_9_0= ruleCondition )
            	    {
            	    // InternalUsex.g:873:4: (lv_conditions_9_0= ruleCondition )
            	    // InternalUsex.g:874:5: lv_conditions_9_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getMethodAccess().getConditionsConditionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_conditions_9_0=ruleCondition();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleQuery"
    // InternalUsex.g:895:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalUsex.g:895:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalUsex.g:896:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalUsex.g:902:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= RULE_ID ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_operationBody_7_0=null;
        EObject lv_inputParameters_2_0 = null;

        EObject lv_returnParameter_5_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:908:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= RULE_ID ) ) ) )
            // InternalUsex.g:909:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= RULE_ID ) ) )
            {
            // InternalUsex.g:909:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= RULE_ID ) ) )
            // InternalUsex.g:910:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_inputParameters_2_0= ruleParameter ) )* otherlv_3= ')' otherlv_4= ':' ( (lv_returnParameter_5_0= ruleAttributeType ) ) otherlv_6= '=' ( (lv_operationBody_7_0= RULE_ID ) )
            {
            // InternalUsex.g:910:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:911:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:911:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:912:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1());
            		
            // InternalUsex.g:932:3: ( (lv_inputParameters_2_0= ruleParameter ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUsex.g:933:4: (lv_inputParameters_2_0= ruleParameter )
            	    {
            	    // InternalUsex.g:933:4: (lv_inputParameters_2_0= ruleParameter )
            	    // InternalUsex.g:934:5: lv_inputParameters_2_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getInputParametersParameterParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_inputParameters_2_0=ruleParameter();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getColonKeyword_4());
            		
            // InternalUsex.g:959:3: ( (lv_returnParameter_5_0= ruleAttributeType ) )
            // InternalUsex.g:960:4: (lv_returnParameter_5_0= ruleAttributeType )
            {
            // InternalUsex.g:960:4: (lv_returnParameter_5_0= ruleAttributeType )
            // InternalUsex.g:961:5: lv_returnParameter_5_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getReturnParameterAttributeTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_returnParameter_5_0=ruleAttributeType();

            state._fsp--;


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

            otherlv_6=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getQueryAccess().getEqualsSignKeyword_6());
            		
            // InternalUsex.g:982:3: ( (lv_operationBody_7_0= RULE_ID ) )
            // InternalUsex.g:983:4: (lv_operationBody_7_0= RULE_ID )
            {
            // InternalUsex.g:983:4: (lv_operationBody_7_0= RULE_ID )
            // InternalUsex.g:984:5: lv_operationBody_7_0= RULE_ID
            {
            lv_operationBody_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_operationBody_7_0, grammarAccess.getQueryAccess().getOperationBodyIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operationBody",
            						lv_operationBody_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParameter"
    // InternalUsex.g:1004:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUsex.g:1004:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUsex.g:1005:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUsex.g:1011:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1017:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? ) )
            // InternalUsex.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? )
            {
            // InternalUsex.g:1018:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )? )
            // InternalUsex.g:1019:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAttributeType ) ) (otherlv_3= ',' )?
            {
            // InternalUsex.g:1019:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUsex.g:1020:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUsex.g:1020:4: (lv_name_0_0= RULE_ID )
            // InternalUsex.g:1021:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalUsex.g:1041:3: ( (lv_type_2_0= ruleAttributeType ) )
            // InternalUsex.g:1042:4: (lv_type_2_0= ruleAttributeType )
            {
            // InternalUsex.g:1042:4: (lv_type_2_0= ruleAttributeType )
            // InternalUsex.g:1043:5: lv_type_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_type_2_0=ruleAttributeType();

            state._fsp--;


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

            // InternalUsex.g:1060:3: (otherlv_3= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUsex.g:1061:4: otherlv_3= ','
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getCommaKeyword_3());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCondition"
    // InternalUsex.g:1070:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalUsex.g:1070:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalUsex.g:1071:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUsex.g:1077:1: ruleCondition returns [EObject current=null] : (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Precondition_0 = null;

        EObject this_Postcondition_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:1083:2: ( (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition ) )
            // InternalUsex.g:1084:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            {
            // InternalUsex.g:1084:2: (this_Precondition_0= rulePrecondition | this_Postcondition_1= rulePostcondition )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            else if ( (LA21_0==33) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUsex.g:1085:3: this_Precondition_0= rulePrecondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getPreconditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Precondition_0=rulePrecondition();

                    state._fsp--;


                    			current = this_Precondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1094:3: this_Postcondition_1= rulePostcondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getPostconditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Postcondition_1=rulePostcondition();

                    state._fsp--;


                    			current = this_Postcondition_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePrecondition"
    // InternalUsex.g:1106:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUsex.g:1106:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUsex.g:1107:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
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
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUsex.g:1113:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_conditionBody_1_0= ruleConditionBody ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditionBody_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1119:2: ( (otherlv_0= 'pre' ( (lv_conditionBody_1_0= ruleConditionBody ) ) ) )
            // InternalUsex.g:1120:2: (otherlv_0= 'pre' ( (lv_conditionBody_1_0= ruleConditionBody ) ) )
            {
            // InternalUsex.g:1120:2: (otherlv_0= 'pre' ( (lv_conditionBody_1_0= ruleConditionBody ) ) )
            // InternalUsex.g:1121:3: otherlv_0= 'pre' ( (lv_conditionBody_1_0= ruleConditionBody ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreKeyword_0());
            		
            // InternalUsex.g:1125:3: ( (lv_conditionBody_1_0= ruleConditionBody ) )
            // InternalUsex.g:1126:4: (lv_conditionBody_1_0= ruleConditionBody )
            {
            // InternalUsex.g:1126:4: (lv_conditionBody_1_0= ruleConditionBody )
            // InternalUsex.g:1127:5: lv_conditionBody_1_0= ruleConditionBody
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getConditionBodyConditionBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditionBody_1_0=ruleConditionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"conditionBody",
            						lv_conditionBody_1_0,
            						"org.xtext.uma.usex.Usex.ConditionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUsex.g:1148:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUsex.g:1148:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUsex.g:1149:2: iv_rulePostcondition= rulePostcondition EOF
            {
             newCompositeNode(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;

             current =iv_rulePostcondition; 
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
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUsex.g:1155:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'post' ( (lv_conditionBody_1_0= ruleConditionBody ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditionBody_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1161:2: ( (otherlv_0= 'post' ( (lv_conditionBody_1_0= ruleConditionBody ) ) ) )
            // InternalUsex.g:1162:2: (otherlv_0= 'post' ( (lv_conditionBody_1_0= ruleConditionBody ) ) )
            {
            // InternalUsex.g:1162:2: (otherlv_0= 'post' ( (lv_conditionBody_1_0= ruleConditionBody ) ) )
            // InternalUsex.g:1163:3: otherlv_0= 'post' ( (lv_conditionBody_1_0= ruleConditionBody ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostKeyword_0());
            		
            // InternalUsex.g:1167:3: ( (lv_conditionBody_1_0= ruleConditionBody ) )
            // InternalUsex.g:1168:4: (lv_conditionBody_1_0= ruleConditionBody )
            {
            // InternalUsex.g:1168:4: (lv_conditionBody_1_0= ruleConditionBody )
            // InternalUsex.g:1169:5: lv_conditionBody_1_0= ruleConditionBody
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getConditionBodyConditionBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditionBody_1_0=ruleConditionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"conditionBody",
            						lv_conditionBody_1_0,
            						"org.xtext.uma.usex.Usex.ConditionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleConditionBody"
    // InternalUsex.g:1190:1: entryRuleConditionBody returns [EObject current=null] : iv_ruleConditionBody= ruleConditionBody EOF ;
    public final EObject entryRuleConditionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionBody = null;


        try {
            // InternalUsex.g:1190:54: (iv_ruleConditionBody= ruleConditionBody EOF )
            // InternalUsex.g:1191:2: iv_ruleConditionBody= ruleConditionBody EOF
            {
             newCompositeNode(grammarAccess.getConditionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionBody=ruleConditionBody();

            state._fsp--;

             current =iv_ruleConditionBody; 
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
    // $ANTLR end "entryRuleConditionBody"


    // $ANTLR start "ruleConditionBody"
    // InternalUsex.g:1197:1: ruleConditionBody returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_condition_2_0= RULE_ID ) ) ) ;
    public final EObject ruleConditionBody() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_condition_2_0=null;


        	enterRule();

        try {
            // InternalUsex.g:1203:2: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_condition_2_0= RULE_ID ) ) ) )
            // InternalUsex.g:1204:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_condition_2_0= RULE_ID ) ) )
            {
            // InternalUsex.g:1204:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_condition_2_0= RULE_ID ) ) )
            // InternalUsex.g:1205:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= ':' ( (lv_condition_2_0= RULE_ID ) )
            {
            // InternalUsex.g:1205:3: ( (lv_name_0_0= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUsex.g:1206:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalUsex.g:1206:4: (lv_name_0_0= RULE_ID )
                    // InternalUsex.g:1207:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getConditionBodyAccess().getNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConditionBodyRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionBodyAccess().getColonKeyword_1());
            		
            // InternalUsex.g:1227:3: ( (lv_condition_2_0= RULE_ID ) )
            // InternalUsex.g:1228:4: (lv_condition_2_0= RULE_ID )
            {
            // InternalUsex.g:1228:4: (lv_condition_2_0= RULE_ID )
            // InternalUsex.g:1229:5: lv_condition_2_0= RULE_ID
            {
            lv_condition_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_condition_2_0, grammarAccess.getConditionBodyAccess().getConditionIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleConditionBody"


    // $ANTLR start "entryRuleConstraint"
    // InternalUsex.g:1249:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalUsex.g:1249:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalUsex.g:1250:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalUsex.g:1256:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_conditionBody_1_0= ruleConditionBody ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_conditionBody_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1262:2: ( (otherlv_0= 'inv' ( (lv_conditionBody_1_0= ruleConditionBody ) ) ) )
            // InternalUsex.g:1263:2: (otherlv_0= 'inv' ( (lv_conditionBody_1_0= ruleConditionBody ) ) )
            {
            // InternalUsex.g:1263:2: (otherlv_0= 'inv' ( (lv_conditionBody_1_0= ruleConditionBody ) ) )
            // InternalUsex.g:1264:3: otherlv_0= 'inv' ( (lv_conditionBody_1_0= ruleConditionBody ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getInvKeyword_0());
            		
            // InternalUsex.g:1268:3: ( (lv_conditionBody_1_0= ruleConditionBody ) )
            // InternalUsex.g:1269:4: (lv_conditionBody_1_0= ruleConditionBody )
            {
            // InternalUsex.g:1269:4: (lv_conditionBody_1_0= ruleConditionBody )
            // InternalUsex.g:1270:5: lv_conditionBody_1_0= ruleConditionBody
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getConditionBodyConditionBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditionBody_1_0=ruleConditionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"conditionBody",
            						lv_conditionBody_1_0,
            						"org.xtext.uma.usex.Usex.ConditionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelation"
    // InternalUsex.g:1291:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalUsex.g:1291:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalUsex.g:1292:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalUsex.g:1298:1: ruleRelation returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Composition_1= ruleComposition ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Composition_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:1304:2: ( (this_Association_0= ruleAssociation | this_Composition_1= ruleComposition ) )
            // InternalUsex.g:1305:2: (this_Association_0= ruleAssociation | this_Composition_1= ruleComposition )
            {
            // InternalUsex.g:1305:2: (this_Association_0= ruleAssociation | this_Composition_1= ruleComposition )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            else if ( (LA23_0==37) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalUsex.g:1306:3: this_Association_0= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_0=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1315:3: this_Composition_1= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getRelationAccess().getCompositionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_1=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAssociation"
    // InternalUsex.g:1327:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUsex.g:1327:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUsex.g:1328:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUsex.g:1334:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_relationBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1340:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) )
            // InternalUsex.g:1341:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            {
            // InternalUsex.g:1341:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            // InternalUsex.g:1342:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalUsex.g:1346:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:1347:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:1347:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:1348:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getBetweenKeyword_2());
            		
            // InternalUsex.g:1368:3: ( (lv_relationBody_3_0= ruleRelationBody ) )
            // InternalUsex.g:1369:4: (lv_relationBody_3_0= ruleRelationBody )
            {
            // InternalUsex.g:1369:4: (lv_relationBody_3_0= ruleRelationBody )
            // InternalUsex.g:1370:5: lv_relationBody_3_0= ruleRelationBody
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getRelationBodyRelationBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_relationBody_3_0=ruleRelationBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"relationBody",
            						lv_relationBody_3_0,
            						"org.xtext.uma.usex.Usex.RelationBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleComposition"
    // InternalUsex.g:1395:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalUsex.g:1395:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalUsex.g:1396:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalUsex.g:1402:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_relationBody_3_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1408:2: ( (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' ) )
            // InternalUsex.g:1409:2: (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            {
            // InternalUsex.g:1409:2: (otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end' )
            // InternalUsex.g:1410:3: otherlv_0= 'composition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'between' ( (lv_relationBody_3_0= ruleRelationBody ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		
            // InternalUsex.g:1414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUsex.g:1415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUsex.g:1415:4: (lv_name_1_0= RULE_ID )
            // InternalUsex.g:1416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getBetweenKeyword_2());
            		
            // InternalUsex.g:1436:3: ( (lv_relationBody_3_0= ruleRelationBody ) )
            // InternalUsex.g:1437:4: (lv_relationBody_3_0= ruleRelationBody )
            {
            // InternalUsex.g:1437:4: (lv_relationBody_3_0= ruleRelationBody )
            // InternalUsex.g:1438:5: lv_relationBody_3_0= ruleRelationBody
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getRelationBodyRelationBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_relationBody_3_0=ruleRelationBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"relationBody",
            						lv_relationBody_3_0,
            						"org.xtext.uma.usex.Usex.RelationBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getEndKeyword_4());
            		

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleRelationBody"
    // InternalUsex.g:1463:1: entryRuleRelationBody returns [EObject current=null] : iv_ruleRelationBody= ruleRelationBody EOF ;
    public final EObject entryRuleRelationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationBody = null;


        try {
            // InternalUsex.g:1463:53: (iv_ruleRelationBody= ruleRelationBody EOF )
            // InternalUsex.g:1464:2: iv_ruleRelationBody= ruleRelationBody EOF
            {
             newCompositeNode(grammarAccess.getRelationBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationBody=ruleRelationBody();

            state._fsp--;

             current =iv_ruleRelationBody; 
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
    // $ANTLR end "entryRuleRelationBody"


    // $ANTLR start "ruleRelationBody"
    // InternalUsex.g:1470:1: ruleRelationBody returns [EObject current=null] : ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) ) ;
    public final EObject ruleRelationBody() throws RecognitionException {
        EObject current = null;

        EObject lv_originClass_0_0 = null;

        EObject lv_destinyClass_1_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1476:2: ( ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) ) )
            // InternalUsex.g:1477:2: ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) )
            {
            // InternalUsex.g:1477:2: ( ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) ) )
            // InternalUsex.g:1478:3: ( (lv_originClass_0_0= ruleRelationMember ) ) ( (lv_destinyClass_1_0= ruleRelationMember ) )
            {
            // InternalUsex.g:1478:3: ( (lv_originClass_0_0= ruleRelationMember ) )
            // InternalUsex.g:1479:4: (lv_originClass_0_0= ruleRelationMember )
            {
            // InternalUsex.g:1479:4: (lv_originClass_0_0= ruleRelationMember )
            // InternalUsex.g:1480:5: lv_originClass_0_0= ruleRelationMember
            {

            					newCompositeNode(grammarAccess.getRelationBodyAccess().getOriginClassRelationMemberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_originClass_0_0=ruleRelationMember();

            state._fsp--;


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

            // InternalUsex.g:1497:3: ( (lv_destinyClass_1_0= ruleRelationMember ) )
            // InternalUsex.g:1498:4: (lv_destinyClass_1_0= ruleRelationMember )
            {
            // InternalUsex.g:1498:4: (lv_destinyClass_1_0= ruleRelationMember )
            // InternalUsex.g:1499:5: lv_destinyClass_1_0= ruleRelationMember
            {

            					newCompositeNode(grammarAccess.getRelationBodyAccess().getDestinyClassRelationMemberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_destinyClass_1_0=ruleRelationMember();

            state._fsp--;


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
    // $ANTLR end "ruleRelationBody"


    // $ANTLR start "entryRuleRelationMember"
    // InternalUsex.g:1520:1: entryRuleRelationMember returns [EObject current=null] : iv_ruleRelationMember= ruleRelationMember EOF ;
    public final EObject entryRuleRelationMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationMember = null;


        try {
            // InternalUsex.g:1520:55: (iv_ruleRelationMember= ruleRelationMember EOF )
            // InternalUsex.g:1521:2: iv_ruleRelationMember= ruleRelationMember EOF
            {
             newCompositeNode(grammarAccess.getRelationMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationMember=ruleRelationMember();

            state._fsp--;

             current =iv_ruleRelationMember; 
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
    // $ANTLR end "entryRuleRelationMember"


    // $ANTLR start "ruleRelationMember"
    // InternalUsex.g:1527:1: ruleRelationMember returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_cardinality_2_0= ruleCardinalityType ) ) otherlv_3= ']' otherlv_4= 'role' ( (lv_roleName_5_0= RULE_ID ) ) ) ;
    public final EObject ruleRelationMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_roleName_5_0=null;
        EObject lv_cardinality_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1533:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_cardinality_2_0= ruleCardinalityType ) ) otherlv_3= ']' otherlv_4= 'role' ( (lv_roleName_5_0= RULE_ID ) ) ) )
            // InternalUsex.g:1534:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_cardinality_2_0= ruleCardinalityType ) ) otherlv_3= ']' otherlv_4= 'role' ( (lv_roleName_5_0= RULE_ID ) ) )
            {
            // InternalUsex.g:1534:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_cardinality_2_0= ruleCardinalityType ) ) otherlv_3= ']' otherlv_4= 'role' ( (lv_roleName_5_0= RULE_ID ) ) )
            // InternalUsex.g:1535:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (lv_cardinality_2_0= ruleCardinalityType ) ) otherlv_3= ']' otherlv_4= 'role' ( (lv_roleName_5_0= RULE_ID ) )
            {
            // InternalUsex.g:1535:3: ( (otherlv_0= RULE_ID ) )
            // InternalUsex.g:1536:4: (otherlv_0= RULE_ID )
            {
            // InternalUsex.g:1536:4: (otherlv_0= RULE_ID )
            // InternalUsex.g:1537:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationMemberRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_0, grammarAccess.getRelationMemberAccess().getClassUseClassCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationMemberAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalUsex.g:1552:3: ( (lv_cardinality_2_0= ruleCardinalityType ) )
            // InternalUsex.g:1553:4: (lv_cardinality_2_0= ruleCardinalityType )
            {
            // InternalUsex.g:1553:4: (lv_cardinality_2_0= ruleCardinalityType )
            // InternalUsex.g:1554:5: lv_cardinality_2_0= ruleCardinalityType
            {

            					newCompositeNode(grammarAccess.getRelationMemberAccess().getCardinalityCardinalityTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_cardinality_2_0=ruleCardinalityType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationMemberRule());
            					}
            					set(
            						current,
            						"cardinality",
            						lv_cardinality_2_0,
            						"org.xtext.uma.usex.Usex.CardinalityType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationMemberAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRelationMemberAccess().getRoleKeyword_4());
            		
            // InternalUsex.g:1579:3: ( (lv_roleName_5_0= RULE_ID ) )
            // InternalUsex.g:1580:4: (lv_roleName_5_0= RULE_ID )
            {
            // InternalUsex.g:1580:4: (lv_roleName_5_0= RULE_ID )
            // InternalUsex.g:1581:5: lv_roleName_5_0= RULE_ID
            {
            lv_roleName_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_roleName_5_0, grammarAccess.getRelationMemberAccess().getRoleNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationMemberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"roleName",
            						lv_roleName_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleRelationMember"


    // $ANTLR start "entryRuleCardinalityType"
    // InternalUsex.g:1601:1: entryRuleCardinalityType returns [EObject current=null] : iv_ruleCardinalityType= ruleCardinalityType EOF ;
    public final EObject entryRuleCardinalityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityType = null;


        try {
            // InternalUsex.g:1601:56: (iv_ruleCardinalityType= ruleCardinalityType EOF )
            // InternalUsex.g:1602:2: iv_ruleCardinalityType= ruleCardinalityType EOF
            {
             newCompositeNode(grammarAccess.getCardinalityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityType=ruleCardinalityType();

            state._fsp--;

             current =iv_ruleCardinalityType; 
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
    // $ANTLR end "entryRuleCardinalityType"


    // $ANTLR start "ruleCardinalityType"
    // InternalUsex.g:1608:1: ruleCardinalityType returns [EObject current=null] : (this_SimpleCardinality_0= ruleSimpleCardinality | this_DoubleCardinality_1= ruleDoubleCardinality ) ;
    public final EObject ruleCardinalityType() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleCardinality_0 = null;

        EObject this_DoubleCardinality_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:1614:2: ( (this_SimpleCardinality_0= ruleSimpleCardinality | this_DoubleCardinality_1= ruleDoubleCardinality ) )
            // InternalUsex.g:1615:2: (this_SimpleCardinality_0= ruleSimpleCardinality | this_DoubleCardinality_1= ruleDoubleCardinality )
            {
            // InternalUsex.g:1615:2: (this_SimpleCardinality_0= ruleSimpleCardinality | this_DoubleCardinality_1= ruleDoubleCardinality )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==EOF||LA24_1==39) ) {
                    alt24=1;
                }
                else if ( (LA24_1==41) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_ASTERISK) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==41) ) {
                    alt24=2;
                }
                else if ( (LA24_2==EOF||LA24_2==39) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUsex.g:1616:3: this_SimpleCardinality_0= ruleSimpleCardinality
                    {

                    			newCompositeNode(grammarAccess.getCardinalityTypeAccess().getSimpleCardinalityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleCardinality_0=ruleSimpleCardinality();

                    state._fsp--;


                    			current = this_SimpleCardinality_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1625:3: this_DoubleCardinality_1= ruleDoubleCardinality
                    {

                    			newCompositeNode(grammarAccess.getCardinalityTypeAccess().getDoubleCardinalityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleCardinality_1=ruleDoubleCardinality();

                    state._fsp--;


                    			current = this_DoubleCardinality_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCardinalityType"


    // $ANTLR start "entryRuleSimpleCardinality"
    // InternalUsex.g:1637:1: entryRuleSimpleCardinality returns [EObject current=null] : iv_ruleSimpleCardinality= ruleSimpleCardinality EOF ;
    public final EObject entryRuleSimpleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleCardinality = null;


        try {
            // InternalUsex.g:1637:58: (iv_ruleSimpleCardinality= ruleSimpleCardinality EOF )
            // InternalUsex.g:1638:2: iv_ruleSimpleCardinality= ruleSimpleCardinality EOF
            {
             newCompositeNode(grammarAccess.getSimpleCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleCardinality=ruleSimpleCardinality();

            state._fsp--;

             current =iv_ruleSimpleCardinality; 
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
    // $ANTLR end "entryRuleSimpleCardinality"


    // $ANTLR start "ruleSimpleCardinality"
    // InternalUsex.g:1644:1: ruleSimpleCardinality returns [EObject current=null] : ( (lv_cardinality_0_0= ruleCardinalityValue ) ) ;
    public final EObject ruleSimpleCardinality() throws RecognitionException {
        EObject current = null;

        EObject lv_cardinality_0_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1650:2: ( ( (lv_cardinality_0_0= ruleCardinalityValue ) ) )
            // InternalUsex.g:1651:2: ( (lv_cardinality_0_0= ruleCardinalityValue ) )
            {
            // InternalUsex.g:1651:2: ( (lv_cardinality_0_0= ruleCardinalityValue ) )
            // InternalUsex.g:1652:3: (lv_cardinality_0_0= ruleCardinalityValue )
            {
            // InternalUsex.g:1652:3: (lv_cardinality_0_0= ruleCardinalityValue )
            // InternalUsex.g:1653:4: lv_cardinality_0_0= ruleCardinalityValue
            {

            				newCompositeNode(grammarAccess.getSimpleCardinalityAccess().getCardinalityCardinalityValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_cardinality_0_0=ruleCardinalityValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSimpleCardinalityRule());
            				}
            				set(
            					current,
            					"cardinality",
            					lv_cardinality_0_0,
            					"org.xtext.uma.usex.Usex.CardinalityValue");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // $ANTLR end "ruleSimpleCardinality"


    // $ANTLR start "entryRuleDoubleCardinality"
    // InternalUsex.g:1673:1: entryRuleDoubleCardinality returns [EObject current=null] : iv_ruleDoubleCardinality= ruleDoubleCardinality EOF ;
    public final EObject entryRuleDoubleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleCardinality = null;


        try {
            // InternalUsex.g:1673:58: (iv_ruleDoubleCardinality= ruleDoubleCardinality EOF )
            // InternalUsex.g:1674:2: iv_ruleDoubleCardinality= ruleDoubleCardinality EOF
            {
             newCompositeNode(grammarAccess.getDoubleCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleCardinality=ruleDoubleCardinality();

            state._fsp--;

             current =iv_ruleDoubleCardinality; 
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
    // $ANTLR end "entryRuleDoubleCardinality"


    // $ANTLR start "ruleDoubleCardinality"
    // InternalUsex.g:1680:1: ruleDoubleCardinality returns [EObject current=null] : ( ( (lv_originCardinality_0_0= ruleCardinalityValue ) ) otherlv_1= '..' ( (lv_destinyCardinality_2_0= ruleCardinalityValue ) ) ) ;
    public final EObject ruleDoubleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_originCardinality_0_0 = null;

        EObject lv_destinyCardinality_2_0 = null;



        	enterRule();

        try {
            // InternalUsex.g:1686:2: ( ( ( (lv_originCardinality_0_0= ruleCardinalityValue ) ) otherlv_1= '..' ( (lv_destinyCardinality_2_0= ruleCardinalityValue ) ) ) )
            // InternalUsex.g:1687:2: ( ( (lv_originCardinality_0_0= ruleCardinalityValue ) ) otherlv_1= '..' ( (lv_destinyCardinality_2_0= ruleCardinalityValue ) ) )
            {
            // InternalUsex.g:1687:2: ( ( (lv_originCardinality_0_0= ruleCardinalityValue ) ) otherlv_1= '..' ( (lv_destinyCardinality_2_0= ruleCardinalityValue ) ) )
            // InternalUsex.g:1688:3: ( (lv_originCardinality_0_0= ruleCardinalityValue ) ) otherlv_1= '..' ( (lv_destinyCardinality_2_0= ruleCardinalityValue ) )
            {
            // InternalUsex.g:1688:3: ( (lv_originCardinality_0_0= ruleCardinalityValue ) )
            // InternalUsex.g:1689:4: (lv_originCardinality_0_0= ruleCardinalityValue )
            {
            // InternalUsex.g:1689:4: (lv_originCardinality_0_0= ruleCardinalityValue )
            // InternalUsex.g:1690:5: lv_originCardinality_0_0= ruleCardinalityValue
            {

            					newCompositeNode(grammarAccess.getDoubleCardinalityAccess().getOriginCardinalityCardinalityValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_originCardinality_0_0=ruleCardinalityValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleCardinalityRule());
            					}
            					set(
            						current,
            						"originCardinality",
            						lv_originCardinality_0_0,
            						"org.xtext.uma.usex.Usex.CardinalityValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleCardinalityAccess().getFullStopFullStopKeyword_1());
            		
            // InternalUsex.g:1711:3: ( (lv_destinyCardinality_2_0= ruleCardinalityValue ) )
            // InternalUsex.g:1712:4: (lv_destinyCardinality_2_0= ruleCardinalityValue )
            {
            // InternalUsex.g:1712:4: (lv_destinyCardinality_2_0= ruleCardinalityValue )
            // InternalUsex.g:1713:5: lv_destinyCardinality_2_0= ruleCardinalityValue
            {

            					newCompositeNode(grammarAccess.getDoubleCardinalityAccess().getDestinyCardinalityCardinalityValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_destinyCardinality_2_0=ruleCardinalityValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleCardinalityRule());
            					}
            					set(
            						current,
            						"destinyCardinality",
            						lv_destinyCardinality_2_0,
            						"org.xtext.uma.usex.Usex.CardinalityValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleDoubleCardinality"


    // $ANTLR start "entryRuleCardinalityValue"
    // InternalUsex.g:1734:1: entryRuleCardinalityValue returns [EObject current=null] : iv_ruleCardinalityValue= ruleCardinalityValue EOF ;
    public final EObject entryRuleCardinalityValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinalityValue = null;


        try {
            // InternalUsex.g:1734:57: (iv_ruleCardinalityValue= ruleCardinalityValue EOF )
            // InternalUsex.g:1735:2: iv_ruleCardinalityValue= ruleCardinalityValue EOF
            {
             newCompositeNode(grammarAccess.getCardinalityValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinalityValue=ruleCardinalityValue();

            state._fsp--;

             current =iv_ruleCardinalityValue; 
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
    // $ANTLR end "entryRuleCardinalityValue"


    // $ANTLR start "ruleCardinalityValue"
    // InternalUsex.g:1741:1: ruleCardinalityValue returns [EObject current=null] : (this_IntCardinality_0= ruleIntCardinality | this_AsteriskCardinality_1= ruleAsteriskCardinality ) ;
    public final EObject ruleCardinalityValue() throws RecognitionException {
        EObject current = null;

        EObject this_IntCardinality_0 = null;

        EObject this_AsteriskCardinality_1 = null;



        	enterRule();

        try {
            // InternalUsex.g:1747:2: ( (this_IntCardinality_0= ruleIntCardinality | this_AsteriskCardinality_1= ruleAsteriskCardinality ) )
            // InternalUsex.g:1748:2: (this_IntCardinality_0= ruleIntCardinality | this_AsteriskCardinality_1= ruleAsteriskCardinality )
            {
            // InternalUsex.g:1748:2: (this_IntCardinality_0= ruleIntCardinality | this_AsteriskCardinality_1= ruleAsteriskCardinality )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ASTERISK) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUsex.g:1749:3: this_IntCardinality_0= ruleIntCardinality
                    {

                    			newCompositeNode(grammarAccess.getCardinalityValueAccess().getIntCardinalityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntCardinality_0=ruleIntCardinality();

                    state._fsp--;


                    			current = this_IntCardinality_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUsex.g:1758:3: this_AsteriskCardinality_1= ruleAsteriskCardinality
                    {

                    			newCompositeNode(grammarAccess.getCardinalityValueAccess().getAsteriskCardinalityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsteriskCardinality_1=ruleAsteriskCardinality();

                    state._fsp--;


                    			current = this_AsteriskCardinality_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCardinalityValue"


    // $ANTLR start "entryRuleIntCardinality"
    // InternalUsex.g:1770:1: entryRuleIntCardinality returns [EObject current=null] : iv_ruleIntCardinality= ruleIntCardinality EOF ;
    public final EObject entryRuleIntCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntCardinality = null;


        try {
            // InternalUsex.g:1770:55: (iv_ruleIntCardinality= ruleIntCardinality EOF )
            // InternalUsex.g:1771:2: iv_ruleIntCardinality= ruleIntCardinality EOF
            {
             newCompositeNode(grammarAccess.getIntCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntCardinality=ruleIntCardinality();

            state._fsp--;

             current =iv_ruleIntCardinality; 
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
    // $ANTLR end "entryRuleIntCardinality"


    // $ANTLR start "ruleIntCardinality"
    // InternalUsex.g:1777:1: ruleIntCardinality returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:1783:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalUsex.g:1784:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalUsex.g:1784:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalUsex.g:1785:3: (lv_value_0_0= RULE_INT )
            {
            // InternalUsex.g:1785:3: (lv_value_0_0= RULE_INT )
            // InternalUsex.g:1786:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntCardinalityAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntCardinalityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.uma.usex.Usex.INT");
            			

            }


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
    // $ANTLR end "ruleIntCardinality"


    // $ANTLR start "entryRuleAsteriskCardinality"
    // InternalUsex.g:1805:1: entryRuleAsteriskCardinality returns [EObject current=null] : iv_ruleAsteriskCardinality= ruleAsteriskCardinality EOF ;
    public final EObject entryRuleAsteriskCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsteriskCardinality = null;


        try {
            // InternalUsex.g:1805:60: (iv_ruleAsteriskCardinality= ruleAsteriskCardinality EOF )
            // InternalUsex.g:1806:2: iv_ruleAsteriskCardinality= ruleAsteriskCardinality EOF
            {
             newCompositeNode(grammarAccess.getAsteriskCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsteriskCardinality=ruleAsteriskCardinality();

            state._fsp--;

             current =iv_ruleAsteriskCardinality; 
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
    // $ANTLR end "entryRuleAsteriskCardinality"


    // $ANTLR start "ruleAsteriskCardinality"
    // InternalUsex.g:1812:1: ruleAsteriskCardinality returns [EObject current=null] : ( (lv_value_0_0= RULE_ASTERISK ) ) ;
    public final EObject ruleAsteriskCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalUsex.g:1818:2: ( ( (lv_value_0_0= RULE_ASTERISK ) ) )
            // InternalUsex.g:1819:2: ( (lv_value_0_0= RULE_ASTERISK ) )
            {
            // InternalUsex.g:1819:2: ( (lv_value_0_0= RULE_ASTERISK ) )
            // InternalUsex.g:1820:3: (lv_value_0_0= RULE_ASTERISK )
            {
            // InternalUsex.g:1820:3: (lv_value_0_0= RULE_ASTERISK )
            // InternalUsex.g:1821:4: lv_value_0_0= RULE_ASTERISK
            {
            lv_value_0_0=(Token)match(input,RULE_ASTERISK,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getAsteriskCardinalityAccess().getValueASTERISKTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAsteriskCardinalityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.uma.usex.Usex.ASTERISK");
            			

            }


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
    // $ANTLR end "ruleAsteriskCardinality"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\4\uffff\1\7\10\uffff\5\7\2\uffff";
    static final String dfa_3s = "\1\4\1\33\1\4\1\24\3\4\1\uffff\13\4\1\uffff";
    static final String dfa_4s = "\1\4\1\33\1\34\1\24\1\41\2\32\1\uffff\5\37\5\41\1\34\1\uffff";
    static final String dfa_5s = "\7\uffff\1\1\13\uffff\1\2";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\27\uffff\1\4",
            "\1\5",
            "\1\7\15\uffff\2\7\1\6\10\uffff\1\7\2\uffff\2\7",
            "\1\14\22\uffff\1\10\1\11\1\12\1\13",
            "\1\21\22\uffff\1\15\1\16\1\17\1\20",
            "",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\7\15\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\15\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\15\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\15\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\15\uffff\2\7\11\uffff\1\7\1\23\1\uffff\2\7",
            "\1\3\27\uffff\1\4",
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
            return "737:2: (this_Method_0= ruleMethod | this_Query_1= ruleQuery )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002800008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000E0010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C0010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007800010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000320100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000320000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});

}