package org.xtext.uma.usex.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.uma.usex.services.UsexGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUsexParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ASTERISK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Real'", "'Integer'", "'Boolean'", "'model'", "'class'", "'end'", "'attributes'", "'operations'", "'constraints'", "':'", "'init'", "'derived'", "'('", "')'", "'begin'", "'='", "','", "'pre'", "'post'", "'inv'", "'association'", "'between'", "'composition'", "'['", "']'", "'role'", "'..'"
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

    	public void setGrammarAccess(UsexGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUsex.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUsex.g:54:1: ( ruleModel EOF )
            // InternalUsex.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUsex.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalUsex.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalUsex.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalUsex.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalUsex.g:69:3: ( rule__Model__Group__0 )
            // InternalUsex.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalUsex.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalUsex.g:79:1: ( ruleAbstractElement EOF )
            // InternalUsex.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalUsex.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalUsex.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalUsex.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalUsex.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalUsex.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalUsex.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleUseClass"
    // InternalUsex.g:103:1: entryRuleUseClass : ruleUseClass EOF ;
    public final void entryRuleUseClass() throws RecognitionException {
        try {
            // InternalUsex.g:104:1: ( ruleUseClass EOF )
            // InternalUsex.g:105:1: ruleUseClass EOF
            {
             before(grammarAccess.getUseClassRule()); 
            pushFollow(FOLLOW_1);
            ruleUseClass();

            state._fsp--;

             after(grammarAccess.getUseClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseClass"


    // $ANTLR start "ruleUseClass"
    // InternalUsex.g:112:1: ruleUseClass : ( ( rule__UseClass__Group__0 ) ) ;
    public final void ruleUseClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:116:2: ( ( ( rule__UseClass__Group__0 ) ) )
            // InternalUsex.g:117:2: ( ( rule__UseClass__Group__0 ) )
            {
            // InternalUsex.g:117:2: ( ( rule__UseClass__Group__0 ) )
            // InternalUsex.g:118:3: ( rule__UseClass__Group__0 )
            {
             before(grammarAccess.getUseClassAccess().getGroup()); 
            // InternalUsex.g:119:3: ( rule__UseClass__Group__0 )
            // InternalUsex.g:119:4: rule__UseClass__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseClass__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalUsex.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUsex.g:129:1: ( ruleAttribute EOF )
            // InternalUsex.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUsex.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUsex.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUsex.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUsex.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUsex.g:144:3: ( rule__Attribute__Group__0 )
            // InternalUsex.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUsex.g:153:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalUsex.g:154:1: ( ruleAttributeType EOF )
            // InternalUsex.g:155:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUsex.g:162:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:166:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalUsex.g:167:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalUsex.g:167:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalUsex.g:168:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalUsex.g:169:3: ( rule__AttributeType__Alternatives )
            // InternalUsex.g:169:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalUsex.g:178:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalUsex.g:179:1: ( rulePrimitiveType EOF )
            // InternalUsex.g:180:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalUsex.g:187:1: rulePrimitiveType : ( ( rule__PrimitiveType__TypeAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:191:2: ( ( ( rule__PrimitiveType__TypeAssignment ) ) )
            // InternalUsex.g:192:2: ( ( rule__PrimitiveType__TypeAssignment ) )
            {
            // InternalUsex.g:192:2: ( ( rule__PrimitiveType__TypeAssignment ) )
            // InternalUsex.g:193:3: ( rule__PrimitiveType__TypeAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment()); 
            // InternalUsex.g:194:3: ( rule__PrimitiveType__TypeAssignment )
            // InternalUsex.g:194:4: rule__PrimitiveType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleClassType"
    // InternalUsex.g:203:1: entryRuleClassType : ruleClassType EOF ;
    public final void entryRuleClassType() throws RecognitionException {
        try {
            // InternalUsex.g:204:1: ( ruleClassType EOF )
            // InternalUsex.g:205:1: ruleClassType EOF
            {
             before(grammarAccess.getClassTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleClassType();

            state._fsp--;

             after(grammarAccess.getClassTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassType"


    // $ANTLR start "ruleClassType"
    // InternalUsex.g:212:1: ruleClassType : ( ( rule__ClassType__TypeAssignment ) ) ;
    public final void ruleClassType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:216:2: ( ( ( rule__ClassType__TypeAssignment ) ) )
            // InternalUsex.g:217:2: ( ( rule__ClassType__TypeAssignment ) )
            {
            // InternalUsex.g:217:2: ( ( rule__ClassType__TypeAssignment ) )
            // InternalUsex.g:218:3: ( rule__ClassType__TypeAssignment )
            {
             before(grammarAccess.getClassTypeAccess().getTypeAssignment()); 
            // InternalUsex.g:219:3: ( rule__ClassType__TypeAssignment )
            // InternalUsex.g:219:4: rule__ClassType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ClassType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassType"


    // $ANTLR start "entryRuleAttributeInitialization"
    // InternalUsex.g:228:1: entryRuleAttributeInitialization : ruleAttributeInitialization EOF ;
    public final void entryRuleAttributeInitialization() throws RecognitionException {
        try {
            // InternalUsex.g:229:1: ( ruleAttributeInitialization EOF )
            // InternalUsex.g:230:1: ruleAttributeInitialization EOF
            {
             before(grammarAccess.getAttributeInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeInitialization();

            state._fsp--;

             after(grammarAccess.getAttributeInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeInitialization"


    // $ANTLR start "ruleAttributeInitialization"
    // InternalUsex.g:237:1: ruleAttributeInitialization : ( ( rule__AttributeInitialization__Alternatives ) ) ;
    public final void ruleAttributeInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:241:2: ( ( ( rule__AttributeInitialization__Alternatives ) ) )
            // InternalUsex.g:242:2: ( ( rule__AttributeInitialization__Alternatives ) )
            {
            // InternalUsex.g:242:2: ( ( rule__AttributeInitialization__Alternatives ) )
            // InternalUsex.g:243:3: ( rule__AttributeInitialization__Alternatives )
            {
             before(grammarAccess.getAttributeInitializationAccess().getAlternatives()); 
            // InternalUsex.g:244:3: ( rule__AttributeInitialization__Alternatives )
            // InternalUsex.g:244:4: rule__AttributeInitialization__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeInitialization__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeInitializationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeInitialization"


    // $ANTLR start "entryRuleDoubleInitialization"
    // InternalUsex.g:253:1: entryRuleDoubleInitialization : ruleDoubleInitialization EOF ;
    public final void entryRuleDoubleInitialization() throws RecognitionException {
        try {
            // InternalUsex.g:254:1: ( ruleDoubleInitialization EOF )
            // InternalUsex.g:255:1: ruleDoubleInitialization EOF
            {
             before(grammarAccess.getDoubleInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleInitialization();

            state._fsp--;

             after(grammarAccess.getDoubleInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleInitialization"


    // $ANTLR start "ruleDoubleInitialization"
    // InternalUsex.g:262:1: ruleDoubleInitialization : ( ( rule__DoubleInitialization__ValueAssignment ) ) ;
    public final void ruleDoubleInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:266:2: ( ( ( rule__DoubleInitialization__ValueAssignment ) ) )
            // InternalUsex.g:267:2: ( ( rule__DoubleInitialization__ValueAssignment ) )
            {
            // InternalUsex.g:267:2: ( ( rule__DoubleInitialization__ValueAssignment ) )
            // InternalUsex.g:268:3: ( rule__DoubleInitialization__ValueAssignment )
            {
             before(grammarAccess.getDoubleInitializationAccess().getValueAssignment()); 
            // InternalUsex.g:269:3: ( rule__DoubleInitialization__ValueAssignment )
            // InternalUsex.g:269:4: rule__DoubleInitialization__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DoubleInitialization__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDoubleInitializationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleInitialization"


    // $ANTLR start "entryRuleBooleanInitialization"
    // InternalUsex.g:278:1: entryRuleBooleanInitialization : ruleBooleanInitialization EOF ;
    public final void entryRuleBooleanInitialization() throws RecognitionException {
        try {
            // InternalUsex.g:279:1: ( ruleBooleanInitialization EOF )
            // InternalUsex.g:280:1: ruleBooleanInitialization EOF
            {
             before(grammarAccess.getBooleanInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanInitialization();

            state._fsp--;

             after(grammarAccess.getBooleanInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanInitialization"


    // $ANTLR start "ruleBooleanInitialization"
    // InternalUsex.g:287:1: ruleBooleanInitialization : ( ( rule__BooleanInitialization__ValueAssignment ) ) ;
    public final void ruleBooleanInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:291:2: ( ( ( rule__BooleanInitialization__ValueAssignment ) ) )
            // InternalUsex.g:292:2: ( ( rule__BooleanInitialization__ValueAssignment ) )
            {
            // InternalUsex.g:292:2: ( ( rule__BooleanInitialization__ValueAssignment ) )
            // InternalUsex.g:293:3: ( rule__BooleanInitialization__ValueAssignment )
            {
             before(grammarAccess.getBooleanInitializationAccess().getValueAssignment()); 
            // InternalUsex.g:294:3: ( rule__BooleanInitialization__ValueAssignment )
            // InternalUsex.g:294:4: rule__BooleanInitialization__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanInitialization__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanInitializationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanInitialization"


    // $ANTLR start "entryRuleIntegerInitialization"
    // InternalUsex.g:303:1: entryRuleIntegerInitialization : ruleIntegerInitialization EOF ;
    public final void entryRuleIntegerInitialization() throws RecognitionException {
        try {
            // InternalUsex.g:304:1: ( ruleIntegerInitialization EOF )
            // InternalUsex.g:305:1: ruleIntegerInitialization EOF
            {
             before(grammarAccess.getIntegerInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerInitialization();

            state._fsp--;

             after(grammarAccess.getIntegerInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerInitialization"


    // $ANTLR start "ruleIntegerInitialization"
    // InternalUsex.g:312:1: ruleIntegerInitialization : ( ( rule__IntegerInitialization__ValueAssignment ) ) ;
    public final void ruleIntegerInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:316:2: ( ( ( rule__IntegerInitialization__ValueAssignment ) ) )
            // InternalUsex.g:317:2: ( ( rule__IntegerInitialization__ValueAssignment ) )
            {
            // InternalUsex.g:317:2: ( ( rule__IntegerInitialization__ValueAssignment ) )
            // InternalUsex.g:318:3: ( rule__IntegerInitialization__ValueAssignment )
            {
             before(grammarAccess.getIntegerInitializationAccess().getValueAssignment()); 
            // InternalUsex.g:319:3: ( rule__IntegerInitialization__ValueAssignment )
            // InternalUsex.g:319:4: rule__IntegerInitialization__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerInitialization__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerInitializationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerInitialization"


    // $ANTLR start "entryRuleStringInitialization"
    // InternalUsex.g:328:1: entryRuleStringInitialization : ruleStringInitialization EOF ;
    public final void entryRuleStringInitialization() throws RecognitionException {
        try {
            // InternalUsex.g:329:1: ( ruleStringInitialization EOF )
            // InternalUsex.g:330:1: ruleStringInitialization EOF
            {
             before(grammarAccess.getStringInitializationRule()); 
            pushFollow(FOLLOW_1);
            ruleStringInitialization();

            state._fsp--;

             after(grammarAccess.getStringInitializationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringInitialization"


    // $ANTLR start "ruleStringInitialization"
    // InternalUsex.g:337:1: ruleStringInitialization : ( ( rule__StringInitialization__ValueAssignment ) ) ;
    public final void ruleStringInitialization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:341:2: ( ( ( rule__StringInitialization__ValueAssignment ) ) )
            // InternalUsex.g:342:2: ( ( rule__StringInitialization__ValueAssignment ) )
            {
            // InternalUsex.g:342:2: ( ( rule__StringInitialization__ValueAssignment ) )
            // InternalUsex.g:343:3: ( rule__StringInitialization__ValueAssignment )
            {
             before(grammarAccess.getStringInitializationAccess().getValueAssignment()); 
            // InternalUsex.g:344:3: ( rule__StringInitialization__ValueAssignment )
            // InternalUsex.g:344:4: rule__StringInitialization__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringInitialization__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringInitializationAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringInitialization"


    // $ANTLR start "entryRuleOperation"
    // InternalUsex.g:353:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalUsex.g:354:1: ( ruleOperation EOF )
            // InternalUsex.g:355:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalUsex.g:362:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:366:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalUsex.g:367:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalUsex.g:367:2: ( ( rule__Operation__Alternatives ) )
            // InternalUsex.g:368:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalUsex.g:369:3: ( rule__Operation__Alternatives )
            // InternalUsex.g:369:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleMethod"
    // InternalUsex.g:378:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalUsex.g:379:1: ( ruleMethod EOF )
            // InternalUsex.g:380:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUsex.g:387:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:391:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalUsex.g:392:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalUsex.g:392:2: ( ( rule__Method__Group__0 ) )
            // InternalUsex.g:393:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalUsex.g:394:3: ( rule__Method__Group__0 )
            // InternalUsex.g:394:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleQuery"
    // InternalUsex.g:403:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalUsex.g:404:1: ( ruleQuery EOF )
            // InternalUsex.g:405:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalUsex.g:412:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:416:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalUsex.g:417:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalUsex.g:417:2: ( ( rule__Query__Group__0 ) )
            // InternalUsex.g:418:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalUsex.g:419:3: ( rule__Query__Group__0 )
            // InternalUsex.g:419:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleParameter"
    // InternalUsex.g:428:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUsex.g:429:1: ( ruleParameter EOF )
            // InternalUsex.g:430:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUsex.g:437:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:441:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalUsex.g:442:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalUsex.g:442:2: ( ( rule__Parameter__Group__0 ) )
            // InternalUsex.g:443:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalUsex.g:444:3: ( rule__Parameter__Group__0 )
            // InternalUsex.g:444:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleCondition"
    // InternalUsex.g:453:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUsex.g:454:1: ( ruleCondition EOF )
            // InternalUsex.g:455:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUsex.g:462:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:466:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalUsex.g:467:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalUsex.g:467:2: ( ( rule__Condition__Alternatives ) )
            // InternalUsex.g:468:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUsex.g:469:3: ( rule__Condition__Alternatives )
            // InternalUsex.g:469:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRulePrecondition"
    // InternalUsex.g:478:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUsex.g:479:1: ( rulePrecondition EOF )
            // InternalUsex.g:480:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUsex.g:487:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:491:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUsex.g:492:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUsex.g:492:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUsex.g:493:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUsex.g:494:3: ( rule__Precondition__Group__0 )
            // InternalUsex.g:494:4: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUsex.g:503:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUsex.g:504:1: ( rulePostcondition EOF )
            // InternalUsex.g:505:1: rulePostcondition EOF
            {
             before(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getPostconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUsex.g:512:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:516:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUsex.g:517:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUsex.g:517:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUsex.g:518:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUsex.g:519:3: ( rule__Postcondition__Group__0 )
            // InternalUsex.g:519:4: rule__Postcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleConditionBody"
    // InternalUsex.g:528:1: entryRuleConditionBody : ruleConditionBody EOF ;
    public final void entryRuleConditionBody() throws RecognitionException {
        try {
            // InternalUsex.g:529:1: ( ruleConditionBody EOF )
            // InternalUsex.g:530:1: ruleConditionBody EOF
            {
             before(grammarAccess.getConditionBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleConditionBody();

            state._fsp--;

             after(grammarAccess.getConditionBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionBody"


    // $ANTLR start "ruleConditionBody"
    // InternalUsex.g:537:1: ruleConditionBody : ( ( rule__ConditionBody__Group__0 ) ) ;
    public final void ruleConditionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:541:2: ( ( ( rule__ConditionBody__Group__0 ) ) )
            // InternalUsex.g:542:2: ( ( rule__ConditionBody__Group__0 ) )
            {
            // InternalUsex.g:542:2: ( ( rule__ConditionBody__Group__0 ) )
            // InternalUsex.g:543:3: ( rule__ConditionBody__Group__0 )
            {
             before(grammarAccess.getConditionBodyAccess().getGroup()); 
            // InternalUsex.g:544:3: ( rule__ConditionBody__Group__0 )
            // InternalUsex.g:544:4: rule__ConditionBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionBody"


    // $ANTLR start "entryRuleConstraint"
    // InternalUsex.g:553:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalUsex.g:554:1: ( ruleConstraint EOF )
            // InternalUsex.g:555:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalUsex.g:562:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:566:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalUsex.g:567:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalUsex.g:567:2: ( ( rule__Constraint__Group__0 ) )
            // InternalUsex.g:568:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalUsex.g:569:3: ( rule__Constraint__Group__0 )
            // InternalUsex.g:569:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleRelation"
    // InternalUsex.g:578:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalUsex.g:579:1: ( ruleRelation EOF )
            // InternalUsex.g:580:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalUsex.g:587:1: ruleRelation : ( ( rule__Relation__Alternatives ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:591:2: ( ( ( rule__Relation__Alternatives ) ) )
            // InternalUsex.g:592:2: ( ( rule__Relation__Alternatives ) )
            {
            // InternalUsex.g:592:2: ( ( rule__Relation__Alternatives ) )
            // InternalUsex.g:593:3: ( rule__Relation__Alternatives )
            {
             before(grammarAccess.getRelationAccess().getAlternatives()); 
            // InternalUsex.g:594:3: ( rule__Relation__Alternatives )
            // InternalUsex.g:594:4: rule__Relation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleAssociation"
    // InternalUsex.g:603:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUsex.g:604:1: ( ruleAssociation EOF )
            // InternalUsex.g:605:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUsex.g:612:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:616:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUsex.g:617:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUsex.g:617:2: ( ( rule__Association__Group__0 ) )
            // InternalUsex.g:618:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUsex.g:619:3: ( rule__Association__Group__0 )
            // InternalUsex.g:619:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleComposition"
    // InternalUsex.g:628:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalUsex.g:629:1: ( ruleComposition EOF )
            // InternalUsex.g:630:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalUsex.g:637:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:641:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalUsex.g:642:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalUsex.g:642:2: ( ( rule__Composition__Group__0 ) )
            // InternalUsex.g:643:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalUsex.g:644:3: ( rule__Composition__Group__0 )
            // InternalUsex.g:644:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleRelationBody"
    // InternalUsex.g:653:1: entryRuleRelationBody : ruleRelationBody EOF ;
    public final void entryRuleRelationBody() throws RecognitionException {
        try {
            // InternalUsex.g:654:1: ( ruleRelationBody EOF )
            // InternalUsex.g:655:1: ruleRelationBody EOF
            {
             before(grammarAccess.getRelationBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationBody();

            state._fsp--;

             after(grammarAccess.getRelationBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationBody"


    // $ANTLR start "ruleRelationBody"
    // InternalUsex.g:662:1: ruleRelationBody : ( ( rule__RelationBody__Group__0 ) ) ;
    public final void ruleRelationBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:666:2: ( ( ( rule__RelationBody__Group__0 ) ) )
            // InternalUsex.g:667:2: ( ( rule__RelationBody__Group__0 ) )
            {
            // InternalUsex.g:667:2: ( ( rule__RelationBody__Group__0 ) )
            // InternalUsex.g:668:3: ( rule__RelationBody__Group__0 )
            {
             before(grammarAccess.getRelationBodyAccess().getGroup()); 
            // InternalUsex.g:669:3: ( rule__RelationBody__Group__0 )
            // InternalUsex.g:669:4: rule__RelationBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationBody"


    // $ANTLR start "entryRuleRelationMember"
    // InternalUsex.g:678:1: entryRuleRelationMember : ruleRelationMember EOF ;
    public final void entryRuleRelationMember() throws RecognitionException {
        try {
            // InternalUsex.g:679:1: ( ruleRelationMember EOF )
            // InternalUsex.g:680:1: ruleRelationMember EOF
            {
             before(grammarAccess.getRelationMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleRelationMember();

            state._fsp--;

             after(grammarAccess.getRelationMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationMember"


    // $ANTLR start "ruleRelationMember"
    // InternalUsex.g:687:1: ruleRelationMember : ( ( rule__RelationMember__Group__0 ) ) ;
    public final void ruleRelationMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:691:2: ( ( ( rule__RelationMember__Group__0 ) ) )
            // InternalUsex.g:692:2: ( ( rule__RelationMember__Group__0 ) )
            {
            // InternalUsex.g:692:2: ( ( rule__RelationMember__Group__0 ) )
            // InternalUsex.g:693:3: ( rule__RelationMember__Group__0 )
            {
             before(grammarAccess.getRelationMemberAccess().getGroup()); 
            // InternalUsex.g:694:3: ( rule__RelationMember__Group__0 )
            // InternalUsex.g:694:4: rule__RelationMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationMember"


    // $ANTLR start "entryRuleCardinalityType"
    // InternalUsex.g:703:1: entryRuleCardinalityType : ruleCardinalityType EOF ;
    public final void entryRuleCardinalityType() throws RecognitionException {
        try {
            // InternalUsex.g:704:1: ( ruleCardinalityType EOF )
            // InternalUsex.g:705:1: ruleCardinalityType EOF
            {
             before(grammarAccess.getCardinalityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinalityType();

            state._fsp--;

             after(grammarAccess.getCardinalityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinalityType"


    // $ANTLR start "ruleCardinalityType"
    // InternalUsex.g:712:1: ruleCardinalityType : ( ( rule__CardinalityType__Alternatives ) ) ;
    public final void ruleCardinalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:716:2: ( ( ( rule__CardinalityType__Alternatives ) ) )
            // InternalUsex.g:717:2: ( ( rule__CardinalityType__Alternatives ) )
            {
            // InternalUsex.g:717:2: ( ( rule__CardinalityType__Alternatives ) )
            // InternalUsex.g:718:3: ( rule__CardinalityType__Alternatives )
            {
             before(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 
            // InternalUsex.g:719:3: ( rule__CardinalityType__Alternatives )
            // InternalUsex.g:719:4: rule__CardinalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalityType"


    // $ANTLR start "entryRuleSimpleCardinality"
    // InternalUsex.g:728:1: entryRuleSimpleCardinality : ruleSimpleCardinality EOF ;
    public final void entryRuleSimpleCardinality() throws RecognitionException {
        try {
            // InternalUsex.g:729:1: ( ruleSimpleCardinality EOF )
            // InternalUsex.g:730:1: ruleSimpleCardinality EOF
            {
             before(grammarAccess.getSimpleCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleCardinality();

            state._fsp--;

             after(grammarAccess.getSimpleCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleCardinality"


    // $ANTLR start "ruleSimpleCardinality"
    // InternalUsex.g:737:1: ruleSimpleCardinality : ( ( rule__SimpleCardinality__CardinalityAssignment ) ) ;
    public final void ruleSimpleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:741:2: ( ( ( rule__SimpleCardinality__CardinalityAssignment ) ) )
            // InternalUsex.g:742:2: ( ( rule__SimpleCardinality__CardinalityAssignment ) )
            {
            // InternalUsex.g:742:2: ( ( rule__SimpleCardinality__CardinalityAssignment ) )
            // InternalUsex.g:743:3: ( rule__SimpleCardinality__CardinalityAssignment )
            {
             before(grammarAccess.getSimpleCardinalityAccess().getCardinalityAssignment()); 
            // InternalUsex.g:744:3: ( rule__SimpleCardinality__CardinalityAssignment )
            // InternalUsex.g:744:4: rule__SimpleCardinality__CardinalityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCardinality__CardinalityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimpleCardinalityAccess().getCardinalityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleCardinality"


    // $ANTLR start "entryRuleDoubleCardinality"
    // InternalUsex.g:753:1: entryRuleDoubleCardinality : ruleDoubleCardinality EOF ;
    public final void entryRuleDoubleCardinality() throws RecognitionException {
        try {
            // InternalUsex.g:754:1: ( ruleDoubleCardinality EOF )
            // InternalUsex.g:755:1: ruleDoubleCardinality EOF
            {
             before(grammarAccess.getDoubleCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleCardinality();

            state._fsp--;

             after(grammarAccess.getDoubleCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleCardinality"


    // $ANTLR start "ruleDoubleCardinality"
    // InternalUsex.g:762:1: ruleDoubleCardinality : ( ( rule__DoubleCardinality__Group__0 ) ) ;
    public final void ruleDoubleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:766:2: ( ( ( rule__DoubleCardinality__Group__0 ) ) )
            // InternalUsex.g:767:2: ( ( rule__DoubleCardinality__Group__0 ) )
            {
            // InternalUsex.g:767:2: ( ( rule__DoubleCardinality__Group__0 ) )
            // InternalUsex.g:768:3: ( rule__DoubleCardinality__Group__0 )
            {
             before(grammarAccess.getDoubleCardinalityAccess().getGroup()); 
            // InternalUsex.g:769:3: ( rule__DoubleCardinality__Group__0 )
            // InternalUsex.g:769:4: rule__DoubleCardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleCardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleCardinality"


    // $ANTLR start "entryRuleCardinalityValue"
    // InternalUsex.g:778:1: entryRuleCardinalityValue : ruleCardinalityValue EOF ;
    public final void entryRuleCardinalityValue() throws RecognitionException {
        try {
            // InternalUsex.g:779:1: ( ruleCardinalityValue EOF )
            // InternalUsex.g:780:1: ruleCardinalityValue EOF
            {
             before(grammarAccess.getCardinalityValueRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinalityValue();

            state._fsp--;

             after(grammarAccess.getCardinalityValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinalityValue"


    // $ANTLR start "ruleCardinalityValue"
    // InternalUsex.g:787:1: ruleCardinalityValue : ( ( rule__CardinalityValue__Alternatives ) ) ;
    public final void ruleCardinalityValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:791:2: ( ( ( rule__CardinalityValue__Alternatives ) ) )
            // InternalUsex.g:792:2: ( ( rule__CardinalityValue__Alternatives ) )
            {
            // InternalUsex.g:792:2: ( ( rule__CardinalityValue__Alternatives ) )
            // InternalUsex.g:793:3: ( rule__CardinalityValue__Alternatives )
            {
             before(grammarAccess.getCardinalityValueAccess().getAlternatives()); 
            // InternalUsex.g:794:3: ( rule__CardinalityValue__Alternatives )
            // InternalUsex.g:794:4: rule__CardinalityValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CardinalityValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinalityValue"


    // $ANTLR start "entryRuleIntCardinality"
    // InternalUsex.g:803:1: entryRuleIntCardinality : ruleIntCardinality EOF ;
    public final void entryRuleIntCardinality() throws RecognitionException {
        try {
            // InternalUsex.g:804:1: ( ruleIntCardinality EOF )
            // InternalUsex.g:805:1: ruleIntCardinality EOF
            {
             before(grammarAccess.getIntCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleIntCardinality();

            state._fsp--;

             after(grammarAccess.getIntCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntCardinality"


    // $ANTLR start "ruleIntCardinality"
    // InternalUsex.g:812:1: ruleIntCardinality : ( ( rule__IntCardinality__ValueAssignment ) ) ;
    public final void ruleIntCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:816:2: ( ( ( rule__IntCardinality__ValueAssignment ) ) )
            // InternalUsex.g:817:2: ( ( rule__IntCardinality__ValueAssignment ) )
            {
            // InternalUsex.g:817:2: ( ( rule__IntCardinality__ValueAssignment ) )
            // InternalUsex.g:818:3: ( rule__IntCardinality__ValueAssignment )
            {
             before(grammarAccess.getIntCardinalityAccess().getValueAssignment()); 
            // InternalUsex.g:819:3: ( rule__IntCardinality__ValueAssignment )
            // InternalUsex.g:819:4: rule__IntCardinality__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntCardinality__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntCardinalityAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntCardinality"


    // $ANTLR start "entryRuleAsteriskCardinality"
    // InternalUsex.g:828:1: entryRuleAsteriskCardinality : ruleAsteriskCardinality EOF ;
    public final void entryRuleAsteriskCardinality() throws RecognitionException {
        try {
            // InternalUsex.g:829:1: ( ruleAsteriskCardinality EOF )
            // InternalUsex.g:830:1: ruleAsteriskCardinality EOF
            {
             before(grammarAccess.getAsteriskCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleAsteriskCardinality();

            state._fsp--;

             after(grammarAccess.getAsteriskCardinalityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsteriskCardinality"


    // $ANTLR start "ruleAsteriskCardinality"
    // InternalUsex.g:837:1: ruleAsteriskCardinality : ( ( rule__AsteriskCardinality__ValueAssignment ) ) ;
    public final void ruleAsteriskCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:841:2: ( ( ( rule__AsteriskCardinality__ValueAssignment ) ) )
            // InternalUsex.g:842:2: ( ( rule__AsteriskCardinality__ValueAssignment ) )
            {
            // InternalUsex.g:842:2: ( ( rule__AsteriskCardinality__ValueAssignment ) )
            // InternalUsex.g:843:3: ( rule__AsteriskCardinality__ValueAssignment )
            {
             before(grammarAccess.getAsteriskCardinalityAccess().getValueAssignment()); 
            // InternalUsex.g:844:3: ( rule__AsteriskCardinality__ValueAssignment )
            // InternalUsex.g:844:4: rule__AsteriskCardinality__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AsteriskCardinality__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAsteriskCardinalityAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsteriskCardinality"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalUsex.g:852:1: rule__AbstractElement__Alternatives : ( ( ruleRelation ) | ( ruleUseClass ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:856:1: ( ( ruleRelation ) | ( ruleUseClass ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35||LA1_0==37) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUsex.g:857:2: ( ruleRelation )
                    {
                    // InternalUsex.g:857:2: ( ruleRelation )
                    // InternalUsex.g:858:3: ruleRelation
                    {
                     before(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:863:2: ( ruleUseClass )
                    {
                    // InternalUsex.g:863:2: ( ruleUseClass )
                    // InternalUsex.g:864:3: ruleUseClass
                    {
                     before(grammarAccess.getAbstractElementAccess().getUseClassParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUseClass();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getUseClassParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalUsex.g:873:1: rule__AttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleClassType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:877:1: ( ( rulePrimitiveType ) | ( ruleClassType ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=17)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUsex.g:878:2: ( rulePrimitiveType )
                    {
                    // InternalUsex.g:878:2: ( rulePrimitiveType )
                    // InternalUsex.g:879:3: rulePrimitiveType
                    {
                     before(grammarAccess.getAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:884:2: ( ruleClassType )
                    {
                    // InternalUsex.g:884:2: ( ruleClassType )
                    // InternalUsex.g:885:3: ruleClassType
                    {
                     before(grammarAccess.getAttributeTypeAccess().getClassTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassType();

                    state._fsp--;

                     after(grammarAccess.getAttributeTypeAccess().getClassTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__PrimitiveType__TypeAlternatives_0"
    // InternalUsex.g:894:1: rule__PrimitiveType__TypeAlternatives_0 : ( ( 'String' ) | ( 'Real' ) | ( 'Integer' ) | ( 'Boolean' ) );
    public final void rule__PrimitiveType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:898:1: ( ( 'String' ) | ( 'Real' ) | ( 'Integer' ) | ( 'Boolean' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUsex.g:899:2: ( 'String' )
                    {
                    // InternalUsex.g:899:2: ( 'String' )
                    // InternalUsex.g:900:3: 'String'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getTypeStringKeyword_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getTypeStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:905:2: ( 'Real' )
                    {
                    // InternalUsex.g:905:2: ( 'Real' )
                    // InternalUsex.g:906:3: 'Real'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getTypeRealKeyword_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getTypeRealKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUsex.g:911:2: ( 'Integer' )
                    {
                    // InternalUsex.g:911:2: ( 'Integer' )
                    // InternalUsex.g:912:3: 'Integer'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getTypeIntegerKeyword_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getTypeIntegerKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUsex.g:917:2: ( 'Boolean' )
                    {
                    // InternalUsex.g:917:2: ( 'Boolean' )
                    // InternalUsex.g:918:3: 'Boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getTypeBooleanKeyword_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getTypeBooleanKeyword_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__TypeAlternatives_0"


    // $ANTLR start "rule__AttributeInitialization__Alternatives"
    // InternalUsex.g:927:1: rule__AttributeInitialization__Alternatives : ( ( ruleDoubleInitialization ) | ( ruleBooleanInitialization ) | ( ruleIntegerInitialization ) | ( ruleStringInitialization ) );
    public final void rule__AttributeInitialization__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:931:1: ( ( ruleDoubleInitialization ) | ( ruleBooleanInitialization ) | ( ruleIntegerInitialization ) | ( ruleStringInitialization ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt4=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case RULE_STRING:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUsex.g:932:2: ( ruleDoubleInitialization )
                    {
                    // InternalUsex.g:932:2: ( ruleDoubleInitialization )
                    // InternalUsex.g:933:3: ruleDoubleInitialization
                    {
                     before(grammarAccess.getAttributeInitializationAccess().getDoubleInitializationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleInitialization();

                    state._fsp--;

                     after(grammarAccess.getAttributeInitializationAccess().getDoubleInitializationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:938:2: ( ruleBooleanInitialization )
                    {
                    // InternalUsex.g:938:2: ( ruleBooleanInitialization )
                    // InternalUsex.g:939:3: ruleBooleanInitialization
                    {
                     before(grammarAccess.getAttributeInitializationAccess().getBooleanInitializationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanInitialization();

                    state._fsp--;

                     after(grammarAccess.getAttributeInitializationAccess().getBooleanInitializationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUsex.g:944:2: ( ruleIntegerInitialization )
                    {
                    // InternalUsex.g:944:2: ( ruleIntegerInitialization )
                    // InternalUsex.g:945:3: ruleIntegerInitialization
                    {
                     before(grammarAccess.getAttributeInitializationAccess().getIntegerInitializationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerInitialization();

                    state._fsp--;

                     after(grammarAccess.getAttributeInitializationAccess().getIntegerInitializationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUsex.g:950:2: ( ruleStringInitialization )
                    {
                    // InternalUsex.g:950:2: ( ruleStringInitialization )
                    // InternalUsex.g:951:3: ruleStringInitialization
                    {
                     before(grammarAccess.getAttributeInitializationAccess().getStringInitializationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStringInitialization();

                    state._fsp--;

                     after(grammarAccess.getAttributeInitializationAccess().getStringInitializationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeInitialization__Alternatives"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalUsex.g:960:1: rule__Operation__Alternatives : ( ( ruleMethod ) | ( ruleQuery ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:964:1: ( ( ruleMethod ) | ( ruleQuery ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalUsex.g:965:2: ( ruleMethod )
                    {
                    // InternalUsex.g:965:2: ( ruleMethod )
                    // InternalUsex.g:966:3: ruleMethod
                    {
                     before(grammarAccess.getOperationAccess().getMethodParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMethod();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMethodParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:971:2: ( ruleQuery )
                    {
                    // InternalUsex.g:971:2: ( ruleQuery )
                    // InternalUsex.g:972:3: ruleQuery
                    {
                     before(grammarAccess.getOperationAccess().getQueryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getQueryParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalUsex.g:981:1: rule__Condition__Alternatives : ( ( rulePrecondition ) | ( rulePostcondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:985:1: ( ( rulePrecondition ) | ( rulePostcondition ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUsex.g:986:2: ( rulePrecondition )
                    {
                    // InternalUsex.g:986:2: ( rulePrecondition )
                    // InternalUsex.g:987:3: rulePrecondition
                    {
                     before(grammarAccess.getConditionAccess().getPreconditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrecondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getPreconditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:992:2: ( rulePostcondition )
                    {
                    // InternalUsex.g:992:2: ( rulePostcondition )
                    // InternalUsex.g:993:3: rulePostcondition
                    {
                     before(grammarAccess.getConditionAccess().getPostconditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePostcondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getPostconditionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Relation__Alternatives"
    // InternalUsex.g:1002:1: rule__Relation__Alternatives : ( ( ruleAssociation ) | ( ruleComposition ) );
    public final void rule__Relation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1006:1: ( ( ruleAssociation ) | ( ruleComposition ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUsex.g:1007:2: ( ruleAssociation )
                    {
                    // InternalUsex.g:1007:2: ( ruleAssociation )
                    // InternalUsex.g:1008:3: ruleAssociation
                    {
                     before(grammarAccess.getRelationAccess().getAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getRelationAccess().getAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:1013:2: ( ruleComposition )
                    {
                    // InternalUsex.g:1013:2: ( ruleComposition )
                    // InternalUsex.g:1014:3: ruleComposition
                    {
                     before(grammarAccess.getRelationAccess().getCompositionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComposition();

                    state._fsp--;

                     after(grammarAccess.getRelationAccess().getCompositionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Alternatives"


    // $ANTLR start "rule__CardinalityType__Alternatives"
    // InternalUsex.g:1023:1: rule__CardinalityType__Alternatives : ( ( ruleSimpleCardinality ) | ( ruleDoubleCardinality ) );
    public final void rule__CardinalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1027:1: ( ( ruleSimpleCardinality ) | ( ruleDoubleCardinality ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==41) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==39) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ASTERISK) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==39) ) {
                    alt8=1;
                }
                else if ( (LA8_2==41) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUsex.g:1028:2: ( ruleSimpleCardinality )
                    {
                    // InternalUsex.g:1028:2: ( ruleSimpleCardinality )
                    // InternalUsex.g:1029:3: ruleSimpleCardinality
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getSimpleCardinalityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleCardinality();

                    state._fsp--;

                     after(grammarAccess.getCardinalityTypeAccess().getSimpleCardinalityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:1034:2: ( ruleDoubleCardinality )
                    {
                    // InternalUsex.g:1034:2: ( ruleDoubleCardinality )
                    // InternalUsex.g:1035:3: ruleDoubleCardinality
                    {
                     before(grammarAccess.getCardinalityTypeAccess().getDoubleCardinalityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleCardinality();

                    state._fsp--;

                     after(grammarAccess.getCardinalityTypeAccess().getDoubleCardinalityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityType__Alternatives"


    // $ANTLR start "rule__CardinalityValue__Alternatives"
    // InternalUsex.g:1044:1: rule__CardinalityValue__Alternatives : ( ( ruleIntCardinality ) | ( ruleAsteriskCardinality ) );
    public final void rule__CardinalityValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1048:1: ( ( ruleIntCardinality ) | ( ruleAsteriskCardinality ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ASTERISK) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUsex.g:1049:2: ( ruleIntCardinality )
                    {
                    // InternalUsex.g:1049:2: ( ruleIntCardinality )
                    // InternalUsex.g:1050:3: ruleIntCardinality
                    {
                     before(grammarAccess.getCardinalityValueAccess().getIntCardinalityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntCardinality();

                    state._fsp--;

                     after(grammarAccess.getCardinalityValueAccess().getIntCardinalityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUsex.g:1055:2: ( ruleAsteriskCardinality )
                    {
                    // InternalUsex.g:1055:2: ( ruleAsteriskCardinality )
                    // InternalUsex.g:1056:3: ruleAsteriskCardinality
                    {
                     before(grammarAccess.getCardinalityValueAccess().getAsteriskCardinalityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAsteriskCardinality();

                    state._fsp--;

                     after(grammarAccess.getCardinalityValueAccess().getAsteriskCardinalityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CardinalityValue__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUsex.g:1065:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1069:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUsex.g:1070:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalUsex.g:1077:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1081:1: ( ( 'model' ) )
            // InternalUsex.g:1082:1: ( 'model' )
            {
            // InternalUsex.g:1082:1: ( 'model' )
            // InternalUsex.g:1083:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalUsex.g:1092:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1096:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUsex.g:1097:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalUsex.g:1104:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1108:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalUsex.g:1109:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalUsex.g:1109:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalUsex.g:1110:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalUsex.g:1111:2: ( rule__Model__NameAssignment_1 )
            // InternalUsex.g:1111:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalUsex.g:1119:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1123:1: ( rule__Model__Group__2__Impl )
            // InternalUsex.g:1124:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalUsex.g:1130:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1134:1: ( ( ( rule__Model__ElementsAssignment_2 )* ) )
            // InternalUsex.g:1135:1: ( ( rule__Model__ElementsAssignment_2 )* )
            {
            // InternalUsex.g:1135:1: ( ( rule__Model__ElementsAssignment_2 )* )
            // InternalUsex.g:1136:2: ( rule__Model__ElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // InternalUsex.g:1137:2: ( rule__Model__ElementsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19||LA10_0==35||LA10_0==37) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUsex.g:1137:3: rule__Model__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__UseClass__Group__0"
    // InternalUsex.g:1146:1: rule__UseClass__Group__0 : rule__UseClass__Group__0__Impl rule__UseClass__Group__1 ;
    public final void rule__UseClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1150:1: ( rule__UseClass__Group__0__Impl rule__UseClass__Group__1 )
            // InternalUsex.g:1151:2: rule__UseClass__Group__0__Impl rule__UseClass__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UseClass__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__0"


    // $ANTLR start "rule__UseClass__Group__0__Impl"
    // InternalUsex.g:1158:1: rule__UseClass__Group__0__Impl : ( 'class' ) ;
    public final void rule__UseClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1162:1: ( ( 'class' ) )
            // InternalUsex.g:1163:1: ( 'class' )
            {
            // InternalUsex.g:1163:1: ( 'class' )
            // InternalUsex.g:1164:2: 'class'
            {
             before(grammarAccess.getUseClassAccess().getClassKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUseClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__0__Impl"


    // $ANTLR start "rule__UseClass__Group__1"
    // InternalUsex.g:1173:1: rule__UseClass__Group__1 : rule__UseClass__Group__1__Impl rule__UseClass__Group__2 ;
    public final void rule__UseClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1177:1: ( rule__UseClass__Group__1__Impl rule__UseClass__Group__2 )
            // InternalUsex.g:1178:2: rule__UseClass__Group__1__Impl rule__UseClass__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__UseClass__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__1"


    // $ANTLR start "rule__UseClass__Group__1__Impl"
    // InternalUsex.g:1185:1: rule__UseClass__Group__1__Impl : ( ( rule__UseClass__NameAssignment_1 ) ) ;
    public final void rule__UseClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1189:1: ( ( ( rule__UseClass__NameAssignment_1 ) ) )
            // InternalUsex.g:1190:1: ( ( rule__UseClass__NameAssignment_1 ) )
            {
            // InternalUsex.g:1190:1: ( ( rule__UseClass__NameAssignment_1 ) )
            // InternalUsex.g:1191:2: ( rule__UseClass__NameAssignment_1 )
            {
             before(grammarAccess.getUseClassAccess().getNameAssignment_1()); 
            // InternalUsex.g:1192:2: ( rule__UseClass__NameAssignment_1 )
            // InternalUsex.g:1192:3: rule__UseClass__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseClass__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__1__Impl"


    // $ANTLR start "rule__UseClass__Group__2"
    // InternalUsex.g:1200:1: rule__UseClass__Group__2 : rule__UseClass__Group__2__Impl rule__UseClass__Group__3 ;
    public final void rule__UseClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1204:1: ( rule__UseClass__Group__2__Impl rule__UseClass__Group__3 )
            // InternalUsex.g:1205:2: rule__UseClass__Group__2__Impl rule__UseClass__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__UseClass__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__2"


    // $ANTLR start "rule__UseClass__Group__2__Impl"
    // InternalUsex.g:1212:1: rule__UseClass__Group__2__Impl : ( ( rule__UseClass__Group_2__0 )? ) ;
    public final void rule__UseClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1216:1: ( ( ( rule__UseClass__Group_2__0 )? ) )
            // InternalUsex.g:1217:1: ( ( rule__UseClass__Group_2__0 )? )
            {
            // InternalUsex.g:1217:1: ( ( rule__UseClass__Group_2__0 )? )
            // InternalUsex.g:1218:2: ( rule__UseClass__Group_2__0 )?
            {
             before(grammarAccess.getUseClassAccess().getGroup_2()); 
            // InternalUsex.g:1219:2: ( rule__UseClass__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUsex.g:1219:3: rule__UseClass__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseClass__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__2__Impl"


    // $ANTLR start "rule__UseClass__Group__3"
    // InternalUsex.g:1227:1: rule__UseClass__Group__3 : rule__UseClass__Group__3__Impl rule__UseClass__Group__4 ;
    public final void rule__UseClass__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1231:1: ( rule__UseClass__Group__3__Impl rule__UseClass__Group__4 )
            // InternalUsex.g:1232:2: rule__UseClass__Group__3__Impl rule__UseClass__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__UseClass__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__3"


    // $ANTLR start "rule__UseClass__Group__3__Impl"
    // InternalUsex.g:1239:1: rule__UseClass__Group__3__Impl : ( ( rule__UseClass__Group_3__0 )? ) ;
    public final void rule__UseClass__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1243:1: ( ( ( rule__UseClass__Group_3__0 )? ) )
            // InternalUsex.g:1244:1: ( ( rule__UseClass__Group_3__0 )? )
            {
            // InternalUsex.g:1244:1: ( ( rule__UseClass__Group_3__0 )? )
            // InternalUsex.g:1245:2: ( rule__UseClass__Group_3__0 )?
            {
             before(grammarAccess.getUseClassAccess().getGroup_3()); 
            // InternalUsex.g:1246:2: ( rule__UseClass__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUsex.g:1246:3: rule__UseClass__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseClass__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__3__Impl"


    // $ANTLR start "rule__UseClass__Group__4"
    // InternalUsex.g:1254:1: rule__UseClass__Group__4 : rule__UseClass__Group__4__Impl rule__UseClass__Group__5 ;
    public final void rule__UseClass__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1258:1: ( rule__UseClass__Group__4__Impl rule__UseClass__Group__5 )
            // InternalUsex.g:1259:2: rule__UseClass__Group__4__Impl rule__UseClass__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__UseClass__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__4"


    // $ANTLR start "rule__UseClass__Group__4__Impl"
    // InternalUsex.g:1266:1: rule__UseClass__Group__4__Impl : ( ( rule__UseClass__Group_4__0 )? ) ;
    public final void rule__UseClass__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1270:1: ( ( ( rule__UseClass__Group_4__0 )? ) )
            // InternalUsex.g:1271:1: ( ( rule__UseClass__Group_4__0 )? )
            {
            // InternalUsex.g:1271:1: ( ( rule__UseClass__Group_4__0 )? )
            // InternalUsex.g:1272:2: ( rule__UseClass__Group_4__0 )?
            {
             before(grammarAccess.getUseClassAccess().getGroup_4()); 
            // InternalUsex.g:1273:2: ( rule__UseClass__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUsex.g:1273:3: rule__UseClass__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseClass__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__4__Impl"


    // $ANTLR start "rule__UseClass__Group__5"
    // InternalUsex.g:1281:1: rule__UseClass__Group__5 : rule__UseClass__Group__5__Impl ;
    public final void rule__UseClass__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1285:1: ( rule__UseClass__Group__5__Impl )
            // InternalUsex.g:1286:2: rule__UseClass__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseClass__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__5"


    // $ANTLR start "rule__UseClass__Group__5__Impl"
    // InternalUsex.g:1292:1: rule__UseClass__Group__5__Impl : ( 'end' ) ;
    public final void rule__UseClass__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1296:1: ( ( 'end' ) )
            // InternalUsex.g:1297:1: ( 'end' )
            {
            // InternalUsex.g:1297:1: ( 'end' )
            // InternalUsex.g:1298:2: 'end'
            {
             before(grammarAccess.getUseClassAccess().getEndKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUseClassAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group__5__Impl"


    // $ANTLR start "rule__UseClass__Group_2__0"
    // InternalUsex.g:1308:1: rule__UseClass__Group_2__0 : rule__UseClass__Group_2__0__Impl rule__UseClass__Group_2__1 ;
    public final void rule__UseClass__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1312:1: ( rule__UseClass__Group_2__0__Impl rule__UseClass__Group_2__1 )
            // InternalUsex.g:1313:2: rule__UseClass__Group_2__0__Impl rule__UseClass__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__UseClass__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_2__0"


    // $ANTLR start "rule__UseClass__Group_2__0__Impl"
    // InternalUsex.g:1320:1: rule__UseClass__Group_2__0__Impl : ( 'attributes' ) ;
    public final void rule__UseClass__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1324:1: ( ( 'attributes' ) )
            // InternalUsex.g:1325:1: ( 'attributes' )
            {
            // InternalUsex.g:1325:1: ( 'attributes' )
            // InternalUsex.g:1326:2: 'attributes'
            {
             before(grammarAccess.getUseClassAccess().getAttributesKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUseClassAccess().getAttributesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_2__0__Impl"


    // $ANTLR start "rule__UseClass__Group_2__1"
    // InternalUsex.g:1335:1: rule__UseClass__Group_2__1 : rule__UseClass__Group_2__1__Impl ;
    public final void rule__UseClass__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1339:1: ( rule__UseClass__Group_2__1__Impl )
            // InternalUsex.g:1340:2: rule__UseClass__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseClass__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_2__1"


    // $ANTLR start "rule__UseClass__Group_2__1__Impl"
    // InternalUsex.g:1346:1: rule__UseClass__Group_2__1__Impl : ( ( rule__UseClass__AttributesAssignment_2_1 )* ) ;
    public final void rule__UseClass__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1350:1: ( ( ( rule__UseClass__AttributesAssignment_2_1 )* ) )
            // InternalUsex.g:1351:1: ( ( rule__UseClass__AttributesAssignment_2_1 )* )
            {
            // InternalUsex.g:1351:1: ( ( rule__UseClass__AttributesAssignment_2_1 )* )
            // InternalUsex.g:1352:2: ( rule__UseClass__AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getUseClassAccess().getAttributesAssignment_2_1()); 
            // InternalUsex.g:1353:2: ( rule__UseClass__AttributesAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUsex.g:1353:3: rule__UseClass__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseClass__AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUseClassAccess().getAttributesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_2__1__Impl"


    // $ANTLR start "rule__UseClass__Group_3__0"
    // InternalUsex.g:1362:1: rule__UseClass__Group_3__0 : rule__UseClass__Group_3__0__Impl rule__UseClass__Group_3__1 ;
    public final void rule__UseClass__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1366:1: ( rule__UseClass__Group_3__0__Impl rule__UseClass__Group_3__1 )
            // InternalUsex.g:1367:2: rule__UseClass__Group_3__0__Impl rule__UseClass__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__UseClass__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_3__0"


    // $ANTLR start "rule__UseClass__Group_3__0__Impl"
    // InternalUsex.g:1374:1: rule__UseClass__Group_3__0__Impl : ( 'operations' ) ;
    public final void rule__UseClass__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1378:1: ( ( 'operations' ) )
            // InternalUsex.g:1379:1: ( 'operations' )
            {
            // InternalUsex.g:1379:1: ( 'operations' )
            // InternalUsex.g:1380:2: 'operations'
            {
             before(grammarAccess.getUseClassAccess().getOperationsKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUseClassAccess().getOperationsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_3__0__Impl"


    // $ANTLR start "rule__UseClass__Group_3__1"
    // InternalUsex.g:1389:1: rule__UseClass__Group_3__1 : rule__UseClass__Group_3__1__Impl ;
    public final void rule__UseClass__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1393:1: ( rule__UseClass__Group_3__1__Impl )
            // InternalUsex.g:1394:2: rule__UseClass__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseClass__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_3__1"


    // $ANTLR start "rule__UseClass__Group_3__1__Impl"
    // InternalUsex.g:1400:1: rule__UseClass__Group_3__1__Impl : ( ( rule__UseClass__OperationsAssignment_3_1 )* ) ;
    public final void rule__UseClass__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1404:1: ( ( ( rule__UseClass__OperationsAssignment_3_1 )* ) )
            // InternalUsex.g:1405:1: ( ( rule__UseClass__OperationsAssignment_3_1 )* )
            {
            // InternalUsex.g:1405:1: ( ( rule__UseClass__OperationsAssignment_3_1 )* )
            // InternalUsex.g:1406:2: ( rule__UseClass__OperationsAssignment_3_1 )*
            {
             before(grammarAccess.getUseClassAccess().getOperationsAssignment_3_1()); 
            // InternalUsex.g:1407:2: ( rule__UseClass__OperationsAssignment_3_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUsex.g:1407:3: rule__UseClass__OperationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseClass__OperationsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getUseClassAccess().getOperationsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_3__1__Impl"


    // $ANTLR start "rule__UseClass__Group_4__0"
    // InternalUsex.g:1416:1: rule__UseClass__Group_4__0 : rule__UseClass__Group_4__0__Impl rule__UseClass__Group_4__1 ;
    public final void rule__UseClass__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1420:1: ( rule__UseClass__Group_4__0__Impl rule__UseClass__Group_4__1 )
            // InternalUsex.g:1421:2: rule__UseClass__Group_4__0__Impl rule__UseClass__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__UseClass__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseClass__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_4__0"


    // $ANTLR start "rule__UseClass__Group_4__0__Impl"
    // InternalUsex.g:1428:1: rule__UseClass__Group_4__0__Impl : ( 'constraints' ) ;
    public final void rule__UseClass__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1432:1: ( ( 'constraints' ) )
            // InternalUsex.g:1433:1: ( 'constraints' )
            {
            // InternalUsex.g:1433:1: ( 'constraints' )
            // InternalUsex.g:1434:2: 'constraints'
            {
             before(grammarAccess.getUseClassAccess().getConstraintsKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUseClassAccess().getConstraintsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_4__0__Impl"


    // $ANTLR start "rule__UseClass__Group_4__1"
    // InternalUsex.g:1443:1: rule__UseClass__Group_4__1 : rule__UseClass__Group_4__1__Impl ;
    public final void rule__UseClass__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1447:1: ( rule__UseClass__Group_4__1__Impl )
            // InternalUsex.g:1448:2: rule__UseClass__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseClass__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_4__1"


    // $ANTLR start "rule__UseClass__Group_4__1__Impl"
    // InternalUsex.g:1454:1: rule__UseClass__Group_4__1__Impl : ( ( rule__UseClass__ConstraintsAssignment_4_1 )* ) ;
    public final void rule__UseClass__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1458:1: ( ( ( rule__UseClass__ConstraintsAssignment_4_1 )* ) )
            // InternalUsex.g:1459:1: ( ( rule__UseClass__ConstraintsAssignment_4_1 )* )
            {
            // InternalUsex.g:1459:1: ( ( rule__UseClass__ConstraintsAssignment_4_1 )* )
            // InternalUsex.g:1460:2: ( rule__UseClass__ConstraintsAssignment_4_1 )*
            {
             before(grammarAccess.getUseClassAccess().getConstraintsAssignment_4_1()); 
            // InternalUsex.g:1461:2: ( rule__UseClass__ConstraintsAssignment_4_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUsex.g:1461:3: rule__UseClass__ConstraintsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__UseClass__ConstraintsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getUseClassAccess().getConstraintsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUsex.g:1470:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1474:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUsex.g:1475:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUsex.g:1482:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1486:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalUsex.g:1487:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalUsex.g:1487:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalUsex.g:1488:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalUsex.g:1489:2: ( rule__Attribute__NameAssignment_0 )
            // InternalUsex.g:1489:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUsex.g:1497:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1501:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUsex.g:1502:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUsex.g:1509:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1513:1: ( ( ':' ) )
            // InternalUsex.g:1514:1: ( ':' )
            {
            // InternalUsex.g:1514:1: ( ':' )
            // InternalUsex.g:1515:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUsex.g:1524:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1528:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUsex.g:1529:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUsex.g:1536:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__TypeAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1540:1: ( ( ( rule__Attribute__TypeAssignment_2 ) ) )
            // InternalUsex.g:1541:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            {
            // InternalUsex.g:1541:1: ( ( rule__Attribute__TypeAssignment_2 ) )
            // InternalUsex.g:1542:2: ( rule__Attribute__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 
            // InternalUsex.g:1543:2: ( rule__Attribute__TypeAssignment_2 )
            // InternalUsex.g:1543:3: rule__Attribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalUsex.g:1551:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1555:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalUsex.g:1556:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalUsex.g:1563:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__Group_3__0 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1567:1: ( ( ( rule__Attribute__Group_3__0 )? ) )
            // InternalUsex.g:1568:1: ( ( rule__Attribute__Group_3__0 )? )
            {
            // InternalUsex.g:1568:1: ( ( rule__Attribute__Group_3__0 )? )
            // InternalUsex.g:1569:2: ( rule__Attribute__Group_3__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_3()); 
            // InternalUsex.g:1570:2: ( rule__Attribute__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUsex.g:1570:3: rule__Attribute__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalUsex.g:1578:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1582:1: ( rule__Attribute__Group__4__Impl )
            // InternalUsex.g:1583:2: rule__Attribute__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalUsex.g:1589:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1593:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // InternalUsex.g:1594:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // InternalUsex.g:1594:1: ( ( rule__Attribute__Group_4__0 )? )
            // InternalUsex.g:1595:2: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // InternalUsex.g:1596:2: ( rule__Attribute__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUsex.g:1596:3: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group_3__0"
    // InternalUsex.g:1605:1: rule__Attribute__Group_3__0 : rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 ;
    public final void rule__Attribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1609:1: ( rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1 )
            // InternalUsex.g:1610:2: rule__Attribute__Group_3__0__Impl rule__Attribute__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0"


    // $ANTLR start "rule__Attribute__Group_3__0__Impl"
    // InternalUsex.g:1617:1: rule__Attribute__Group_3__0__Impl : ( 'init' ) ;
    public final void rule__Attribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1621:1: ( ( 'init' ) )
            // InternalUsex.g:1622:1: ( 'init' )
            {
            // InternalUsex.g:1622:1: ( 'init' )
            // InternalUsex.g:1623:2: 'init'
            {
             before(grammarAccess.getAttributeAccess().getInitKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getInitKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__0__Impl"


    // $ANTLR start "rule__Attribute__Group_3__1"
    // InternalUsex.g:1632:1: rule__Attribute__Group_3__1 : rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 ;
    public final void rule__Attribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1636:1: ( rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2 )
            // InternalUsex.g:1637:2: rule__Attribute__Group_3__1__Impl rule__Attribute__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1"


    // $ANTLR start "rule__Attribute__Group_3__1__Impl"
    // InternalUsex.g:1644:1: rule__Attribute__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1648:1: ( ( ':' ) )
            // InternalUsex.g:1649:1: ( ':' )
            {
            // InternalUsex.g:1649:1: ( ':' )
            // InternalUsex.g:1650:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group_3__2"
    // InternalUsex.g:1659:1: rule__Attribute__Group_3__2 : rule__Attribute__Group_3__2__Impl ;
    public final void rule__Attribute__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1663:1: ( rule__Attribute__Group_3__2__Impl )
            // InternalUsex.g:1664:2: rule__Attribute__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__2"


    // $ANTLR start "rule__Attribute__Group_3__2__Impl"
    // InternalUsex.g:1670:1: rule__Attribute__Group_3__2__Impl : ( ( rule__Attribute__InitializationAssignment_3_2 ) ) ;
    public final void rule__Attribute__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1674:1: ( ( ( rule__Attribute__InitializationAssignment_3_2 ) ) )
            // InternalUsex.g:1675:1: ( ( rule__Attribute__InitializationAssignment_3_2 ) )
            {
            // InternalUsex.g:1675:1: ( ( rule__Attribute__InitializationAssignment_3_2 ) )
            // InternalUsex.g:1676:2: ( rule__Attribute__InitializationAssignment_3_2 )
            {
             before(grammarAccess.getAttributeAccess().getInitializationAssignment_3_2()); 
            // InternalUsex.g:1677:2: ( rule__Attribute__InitializationAssignment_3_2 )
            // InternalUsex.g:1677:3: rule__Attribute__InitializationAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__InitializationAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getInitializationAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_3__2__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // InternalUsex.g:1686:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1690:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // InternalUsex.g:1691:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // InternalUsex.g:1698:1: rule__Attribute__Group_4__0__Impl : ( 'derived' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1702:1: ( ( 'derived' ) )
            // InternalUsex.g:1703:1: ( 'derived' )
            {
            // InternalUsex.g:1703:1: ( 'derived' )
            // InternalUsex.g:1704:2: 'derived'
            {
             before(grammarAccess.getAttributeAccess().getDerivedKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDerivedKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // InternalUsex.g:1713:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1717:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // InternalUsex.g:1718:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // InternalUsex.g:1725:1: rule__Attribute__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1729:1: ( ( ':' ) )
            // InternalUsex.g:1730:1: ( ':' )
            {
            // InternalUsex.g:1730:1: ( ':' )
            // InternalUsex.g:1731:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__2"
    // InternalUsex.g:1740:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1744:1: ( rule__Attribute__Group_4__2__Impl )
            // InternalUsex.g:1745:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2"


    // $ANTLR start "rule__Attribute__Group_4__2__Impl"
    // InternalUsex.g:1751:1: rule__Attribute__Group_4__2__Impl : ( ( rule__Attribute__DerivedFromAssignment_4_2 ) ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1755:1: ( ( ( rule__Attribute__DerivedFromAssignment_4_2 ) ) )
            // InternalUsex.g:1756:1: ( ( rule__Attribute__DerivedFromAssignment_4_2 ) )
            {
            // InternalUsex.g:1756:1: ( ( rule__Attribute__DerivedFromAssignment_4_2 ) )
            // InternalUsex.g:1757:2: ( rule__Attribute__DerivedFromAssignment_4_2 )
            {
             before(grammarAccess.getAttributeAccess().getDerivedFromAssignment_4_2()); 
            // InternalUsex.g:1758:2: ( rule__Attribute__DerivedFromAssignment_4_2 )
            // InternalUsex.g:1758:3: rule__Attribute__DerivedFromAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DerivedFromAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDerivedFromAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_4__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalUsex.g:1767:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1771:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalUsex.g:1772:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalUsex.g:1779:1: rule__Method__Group__0__Impl : ( ( rule__Method__NameAssignment_0 ) ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1783:1: ( ( ( rule__Method__NameAssignment_0 ) ) )
            // InternalUsex.g:1784:1: ( ( rule__Method__NameAssignment_0 ) )
            {
            // InternalUsex.g:1784:1: ( ( rule__Method__NameAssignment_0 ) )
            // InternalUsex.g:1785:2: ( rule__Method__NameAssignment_0 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_0()); 
            // InternalUsex.g:1786:2: ( rule__Method__NameAssignment_0 )
            // InternalUsex.g:1786:3: rule__Method__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalUsex.g:1794:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1798:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalUsex.g:1799:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalUsex.g:1806:1: rule__Method__Group__1__Impl : ( '(' ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1810:1: ( ( '(' ) )
            // InternalUsex.g:1811:1: ( '(' )
            {
            // InternalUsex.g:1811:1: ( '(' )
            // InternalUsex.g:1812:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalUsex.g:1821:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1825:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalUsex.g:1826:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalUsex.g:1833:1: rule__Method__Group__2__Impl : ( ( rule__Method__InputParametersAssignment_2 )* ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1837:1: ( ( ( rule__Method__InputParametersAssignment_2 )* ) )
            // InternalUsex.g:1838:1: ( ( rule__Method__InputParametersAssignment_2 )* )
            {
            // InternalUsex.g:1838:1: ( ( rule__Method__InputParametersAssignment_2 )* )
            // InternalUsex.g:1839:2: ( rule__Method__InputParametersAssignment_2 )*
            {
             before(grammarAccess.getMethodAccess().getInputParametersAssignment_2()); 
            // InternalUsex.g:1840:2: ( rule__Method__InputParametersAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUsex.g:1840:3: rule__Method__InputParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Method__InputParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getInputParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalUsex.g:1848:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1852:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalUsex.g:1853:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalUsex.g:1860:1: rule__Method__Group__3__Impl : ( ')' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1864:1: ( ( ')' ) )
            // InternalUsex.g:1865:1: ( ')' )
            {
            // InternalUsex.g:1865:1: ( ')' )
            // InternalUsex.g:1866:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalUsex.g:1875:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1879:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalUsex.g:1880:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalUsex.g:1887:1: rule__Method__Group__4__Impl : ( ( rule__Method__Group_4__0 )? ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1891:1: ( ( ( rule__Method__Group_4__0 )? ) )
            // InternalUsex.g:1892:1: ( ( rule__Method__Group_4__0 )? )
            {
            // InternalUsex.g:1892:1: ( ( rule__Method__Group_4__0 )? )
            // InternalUsex.g:1893:2: ( rule__Method__Group_4__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_4()); 
            // InternalUsex.g:1894:2: ( rule__Method__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUsex.g:1894:3: rule__Method__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalUsex.g:1902:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1906:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalUsex.g:1907:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalUsex.g:1914:1: rule__Method__Group__5__Impl : ( ( rule__Method__Group_5__0 )? ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1918:1: ( ( ( rule__Method__Group_5__0 )? ) )
            // InternalUsex.g:1919:1: ( ( rule__Method__Group_5__0 )? )
            {
            // InternalUsex.g:1919:1: ( ( rule__Method__Group_5__0 )? )
            // InternalUsex.g:1920:2: ( rule__Method__Group_5__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_5()); 
            // InternalUsex.g:1921:2: ( rule__Method__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUsex.g:1921:3: rule__Method__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalUsex.g:1929:1: rule__Method__Group__6 : rule__Method__Group__6__Impl ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1933:1: ( rule__Method__Group__6__Impl )
            // InternalUsex.g:1934:2: rule__Method__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalUsex.g:1940:1: rule__Method__Group__6__Impl : ( ( rule__Method__ConditionsAssignment_6 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1944:1: ( ( ( rule__Method__ConditionsAssignment_6 )* ) )
            // InternalUsex.g:1945:1: ( ( rule__Method__ConditionsAssignment_6 )* )
            {
            // InternalUsex.g:1945:1: ( ( rule__Method__ConditionsAssignment_6 )* )
            // InternalUsex.g:1946:2: ( rule__Method__ConditionsAssignment_6 )*
            {
             before(grammarAccess.getMethodAccess().getConditionsAssignment_6()); 
            // InternalUsex.g:1947:2: ( rule__Method__ConditionsAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=33)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUsex.g:1947:3: rule__Method__ConditionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Method__ConditionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getConditionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group_4__0"
    // InternalUsex.g:1956:1: rule__Method__Group_4__0 : rule__Method__Group_4__0__Impl rule__Method__Group_4__1 ;
    public final void rule__Method__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1960:1: ( rule__Method__Group_4__0__Impl rule__Method__Group_4__1 )
            // InternalUsex.g:1961:2: rule__Method__Group_4__0__Impl rule__Method__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Method__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0"


    // $ANTLR start "rule__Method__Group_4__0__Impl"
    // InternalUsex.g:1968:1: rule__Method__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Method__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1972:1: ( ( ':' ) )
            // InternalUsex.g:1973:1: ( ':' )
            {
            // InternalUsex.g:1973:1: ( ':' )
            // InternalUsex.g:1974:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__0__Impl"


    // $ANTLR start "rule__Method__Group_4__1"
    // InternalUsex.g:1983:1: rule__Method__Group_4__1 : rule__Method__Group_4__1__Impl ;
    public final void rule__Method__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1987:1: ( rule__Method__Group_4__1__Impl )
            // InternalUsex.g:1988:2: rule__Method__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1"


    // $ANTLR start "rule__Method__Group_4__1__Impl"
    // InternalUsex.g:1994:1: rule__Method__Group_4__1__Impl : ( ( rule__Method__ReturnParameterAssignment_4_1 ) ) ;
    public final void rule__Method__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:1998:1: ( ( ( rule__Method__ReturnParameterAssignment_4_1 ) ) )
            // InternalUsex.g:1999:1: ( ( rule__Method__ReturnParameterAssignment_4_1 ) )
            {
            // InternalUsex.g:1999:1: ( ( rule__Method__ReturnParameterAssignment_4_1 ) )
            // InternalUsex.g:2000:2: ( rule__Method__ReturnParameterAssignment_4_1 )
            {
             before(grammarAccess.getMethodAccess().getReturnParameterAssignment_4_1()); 
            // InternalUsex.g:2001:2: ( rule__Method__ReturnParameterAssignment_4_1 )
            // InternalUsex.g:2001:3: rule__Method__ReturnParameterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturnParameterAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnParameterAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group_5__0"
    // InternalUsex.g:2010:1: rule__Method__Group_5__0 : rule__Method__Group_5__0__Impl rule__Method__Group_5__1 ;
    public final void rule__Method__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2014:1: ( rule__Method__Group_5__0__Impl rule__Method__Group_5__1 )
            // InternalUsex.g:2015:2: rule__Method__Group_5__0__Impl rule__Method__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Method__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0"


    // $ANTLR start "rule__Method__Group_5__0__Impl"
    // InternalUsex.g:2022:1: rule__Method__Group_5__0__Impl : ( 'begin' ) ;
    public final void rule__Method__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2026:1: ( ( 'begin' ) )
            // InternalUsex.g:2027:1: ( 'begin' )
            {
            // InternalUsex.g:2027:1: ( 'begin' )
            // InternalUsex.g:2028:2: 'begin'
            {
             before(grammarAccess.getMethodAccess().getBeginKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getBeginKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__0__Impl"


    // $ANTLR start "rule__Method__Group_5__1"
    // InternalUsex.g:2037:1: rule__Method__Group_5__1 : rule__Method__Group_5__1__Impl rule__Method__Group_5__2 ;
    public final void rule__Method__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2041:1: ( rule__Method__Group_5__1__Impl rule__Method__Group_5__2 )
            // InternalUsex.g:2042:2: rule__Method__Group_5__1__Impl rule__Method__Group_5__2
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1"


    // $ANTLR start "rule__Method__Group_5__1__Impl"
    // InternalUsex.g:2049:1: rule__Method__Group_5__1__Impl : ( ( rule__Method__OperationBodyAssignment_5_1 ) ) ;
    public final void rule__Method__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2053:1: ( ( ( rule__Method__OperationBodyAssignment_5_1 ) ) )
            // InternalUsex.g:2054:1: ( ( rule__Method__OperationBodyAssignment_5_1 ) )
            {
            // InternalUsex.g:2054:1: ( ( rule__Method__OperationBodyAssignment_5_1 ) )
            // InternalUsex.g:2055:2: ( rule__Method__OperationBodyAssignment_5_1 )
            {
             before(grammarAccess.getMethodAccess().getOperationBodyAssignment_5_1()); 
            // InternalUsex.g:2056:2: ( rule__Method__OperationBodyAssignment_5_1 )
            // InternalUsex.g:2056:3: rule__Method__OperationBodyAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__OperationBodyAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getOperationBodyAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__1__Impl"


    // $ANTLR start "rule__Method__Group_5__2"
    // InternalUsex.g:2064:1: rule__Method__Group_5__2 : rule__Method__Group_5__2__Impl ;
    public final void rule__Method__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2068:1: ( rule__Method__Group_5__2__Impl )
            // InternalUsex.g:2069:2: rule__Method__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__2"


    // $ANTLR start "rule__Method__Group_5__2__Impl"
    // InternalUsex.g:2075:1: rule__Method__Group_5__2__Impl : ( 'end' ) ;
    public final void rule__Method__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2079:1: ( ( 'end' ) )
            // InternalUsex.g:2080:1: ( 'end' )
            {
            // InternalUsex.g:2080:1: ( 'end' )
            // InternalUsex.g:2081:2: 'end'
            {
             before(grammarAccess.getMethodAccess().getEndKeyword_5_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getEndKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_5__2__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalUsex.g:2091:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2095:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalUsex.g:2096:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalUsex.g:2103:1: rule__Query__Group__0__Impl : ( ( rule__Query__NameAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2107:1: ( ( ( rule__Query__NameAssignment_0 ) ) )
            // InternalUsex.g:2108:1: ( ( rule__Query__NameAssignment_0 ) )
            {
            // InternalUsex.g:2108:1: ( ( rule__Query__NameAssignment_0 ) )
            // InternalUsex.g:2109:2: ( rule__Query__NameAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_0()); 
            // InternalUsex.g:2110:2: ( rule__Query__NameAssignment_0 )
            // InternalUsex.g:2110:3: rule__Query__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalUsex.g:2118:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2122:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalUsex.g:2123:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalUsex.g:2130:1: rule__Query__Group__1__Impl : ( '(' ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2134:1: ( ( '(' ) )
            // InternalUsex.g:2135:1: ( '(' )
            {
            // InternalUsex.g:2135:1: ( '(' )
            // InternalUsex.g:2136:2: '('
            {
             before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalUsex.g:2145:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2149:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalUsex.g:2150:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalUsex.g:2157:1: rule__Query__Group__2__Impl : ( ( rule__Query__InputParametersAssignment_2 )* ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2161:1: ( ( ( rule__Query__InputParametersAssignment_2 )* ) )
            // InternalUsex.g:2162:1: ( ( rule__Query__InputParametersAssignment_2 )* )
            {
            // InternalUsex.g:2162:1: ( ( rule__Query__InputParametersAssignment_2 )* )
            // InternalUsex.g:2163:2: ( rule__Query__InputParametersAssignment_2 )*
            {
             before(grammarAccess.getQueryAccess().getInputParametersAssignment_2()); 
            // InternalUsex.g:2164:2: ( rule__Query__InputParametersAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUsex.g:2164:3: rule__Query__InputParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Query__InputParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getInputParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalUsex.g:2172:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2176:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalUsex.g:2177:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalUsex.g:2184:1: rule__Query__Group__3__Impl : ( ')' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2188:1: ( ( ')' ) )
            // InternalUsex.g:2189:1: ( ')' )
            {
            // InternalUsex.g:2189:1: ( ')' )
            // InternalUsex.g:2190:2: ')'
            {
             before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalUsex.g:2199:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2203:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalUsex.g:2204:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalUsex.g:2211:1: rule__Query__Group__4__Impl : ( ':' ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2215:1: ( ( ':' ) )
            // InternalUsex.g:2216:1: ( ':' )
            {
            // InternalUsex.g:2216:1: ( ':' )
            // InternalUsex.g:2217:2: ':'
            {
             before(grammarAccess.getQueryAccess().getColonKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalUsex.g:2226:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2230:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalUsex.g:2231:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalUsex.g:2238:1: rule__Query__Group__5__Impl : ( ( rule__Query__ReturnParameterAssignment_5 ) ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2242:1: ( ( ( rule__Query__ReturnParameterAssignment_5 ) ) )
            // InternalUsex.g:2243:1: ( ( rule__Query__ReturnParameterAssignment_5 ) )
            {
            // InternalUsex.g:2243:1: ( ( rule__Query__ReturnParameterAssignment_5 ) )
            // InternalUsex.g:2244:2: ( rule__Query__ReturnParameterAssignment_5 )
            {
             before(grammarAccess.getQueryAccess().getReturnParameterAssignment_5()); 
            // InternalUsex.g:2245:2: ( rule__Query__ReturnParameterAssignment_5 )
            // InternalUsex.g:2245:3: rule__Query__ReturnParameterAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Query__ReturnParameterAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getReturnParameterAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // InternalUsex.g:2253:1: rule__Query__Group__6 : rule__Query__Group__6__Impl rule__Query__Group__7 ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2257:1: ( rule__Query__Group__6__Impl rule__Query__Group__7 )
            // InternalUsex.g:2258:2: rule__Query__Group__6__Impl rule__Query__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // InternalUsex.g:2265:1: rule__Query__Group__6__Impl : ( '=' ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2269:1: ( ( '=' ) )
            // InternalUsex.g:2270:1: ( '=' )
            {
            // InternalUsex.g:2270:1: ( '=' )
            // InternalUsex.g:2271:2: '='
            {
             before(grammarAccess.getQueryAccess().getEqualsSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__Query__Group__7"
    // InternalUsex.g:2280:1: rule__Query__Group__7 : rule__Query__Group__7__Impl ;
    public final void rule__Query__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2284:1: ( rule__Query__Group__7__Impl )
            // InternalUsex.g:2285:2: rule__Query__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__7"


    // $ANTLR start "rule__Query__Group__7__Impl"
    // InternalUsex.g:2291:1: rule__Query__Group__7__Impl : ( ( rule__Query__OperationBodyAssignment_7 ) ) ;
    public final void rule__Query__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2295:1: ( ( ( rule__Query__OperationBodyAssignment_7 ) ) )
            // InternalUsex.g:2296:1: ( ( rule__Query__OperationBodyAssignment_7 ) )
            {
            // InternalUsex.g:2296:1: ( ( rule__Query__OperationBodyAssignment_7 ) )
            // InternalUsex.g:2297:2: ( rule__Query__OperationBodyAssignment_7 )
            {
             before(grammarAccess.getQueryAccess().getOperationBodyAssignment_7()); 
            // InternalUsex.g:2298:2: ( rule__Query__OperationBodyAssignment_7 )
            // InternalUsex.g:2298:3: rule__Query__OperationBodyAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Query__OperationBodyAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getOperationBodyAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalUsex.g:2307:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2311:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUsex.g:2312:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalUsex.g:2319:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2323:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUsex.g:2324:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUsex.g:2324:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUsex.g:2325:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUsex.g:2326:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUsex.g:2326:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalUsex.g:2334:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2338:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUsex.g:2339:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalUsex.g:2346:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2350:1: ( ( ':' ) )
            // InternalUsex.g:2351:1: ( ':' )
            {
            // InternalUsex.g:2351:1: ( ':' )
            // InternalUsex.g:2352:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalUsex.g:2361:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2365:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalUsex.g:2366:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalUsex.g:2373:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2377:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalUsex.g:2378:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalUsex.g:2378:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalUsex.g:2379:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalUsex.g:2380:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalUsex.g:2380:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalUsex.g:2388:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2392:1: ( rule__Parameter__Group__3__Impl )
            // InternalUsex.g:2393:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalUsex.g:2399:1: rule__Parameter__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2403:1: ( ( ( ',' )? ) )
            // InternalUsex.g:2404:1: ( ( ',' )? )
            {
            // InternalUsex.g:2404:1: ( ( ',' )? )
            // InternalUsex.g:2405:2: ( ',' )?
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_3()); 
            // InternalUsex.g:2406:2: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUsex.g:2406:3: ','
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalUsex.g:2415:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2419:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUsex.g:2420:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // InternalUsex.g:2427:1: rule__Precondition__Group__0__Impl : ( 'pre' ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2431:1: ( ( 'pre' ) )
            // InternalUsex.g:2432:1: ( 'pre' )
            {
            // InternalUsex.g:2432:1: ( 'pre' )
            // InternalUsex.g:2433:2: 'pre'
            {
             before(grammarAccess.getPreconditionAccess().getPreKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getPreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // InternalUsex.g:2442:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2446:1: ( rule__Precondition__Group__1__Impl )
            // InternalUsex.g:2447:2: rule__Precondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // InternalUsex.g:2453:1: rule__Precondition__Group__1__Impl : ( ( rule__Precondition__ConditionBodyAssignment_1 ) ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2457:1: ( ( ( rule__Precondition__ConditionBodyAssignment_1 ) ) )
            // InternalUsex.g:2458:1: ( ( rule__Precondition__ConditionBodyAssignment_1 ) )
            {
            // InternalUsex.g:2458:1: ( ( rule__Precondition__ConditionBodyAssignment_1 ) )
            // InternalUsex.g:2459:2: ( rule__Precondition__ConditionBodyAssignment_1 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionBodyAssignment_1()); 
            // InternalUsex.g:2460:2: ( rule__Precondition__ConditionBodyAssignment_1 )
            // InternalUsex.g:2460:3: rule__Precondition__ConditionBodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__ConditionBodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getConditionBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__0"
    // InternalUsex.g:2469:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2473:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUsex.g:2474:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Postcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0"


    // $ANTLR start "rule__Postcondition__Group__0__Impl"
    // InternalUsex.g:2481:1: rule__Postcondition__Group__0__Impl : ( 'post' ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2485:1: ( ( 'post' ) )
            // InternalUsex.g:2486:1: ( 'post' )
            {
            // InternalUsex.g:2486:1: ( 'post' )
            // InternalUsex.g:2487:2: 'post'
            {
             before(grammarAccess.getPostconditionAccess().getPostKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getPostKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0__Impl"


    // $ANTLR start "rule__Postcondition__Group__1"
    // InternalUsex.g:2496:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2500:1: ( rule__Postcondition__Group__1__Impl )
            // InternalUsex.g:2501:2: rule__Postcondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1"


    // $ANTLR start "rule__Postcondition__Group__1__Impl"
    // InternalUsex.g:2507:1: rule__Postcondition__Group__1__Impl : ( ( rule__Postcondition__ConditionBodyAssignment_1 ) ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2511:1: ( ( ( rule__Postcondition__ConditionBodyAssignment_1 ) ) )
            // InternalUsex.g:2512:1: ( ( rule__Postcondition__ConditionBodyAssignment_1 ) )
            {
            // InternalUsex.g:2512:1: ( ( rule__Postcondition__ConditionBodyAssignment_1 ) )
            // InternalUsex.g:2513:2: ( rule__Postcondition__ConditionBodyAssignment_1 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionBodyAssignment_1()); 
            // InternalUsex.g:2514:2: ( rule__Postcondition__ConditionBodyAssignment_1 )
            // InternalUsex.g:2514:3: rule__Postcondition__ConditionBodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__ConditionBodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getConditionBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1__Impl"


    // $ANTLR start "rule__ConditionBody__Group__0"
    // InternalUsex.g:2523:1: rule__ConditionBody__Group__0 : rule__ConditionBody__Group__0__Impl rule__ConditionBody__Group__1 ;
    public final void rule__ConditionBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2527:1: ( rule__ConditionBody__Group__0__Impl rule__ConditionBody__Group__1 )
            // InternalUsex.g:2528:2: rule__ConditionBody__Group__0__Impl rule__ConditionBody__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConditionBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__Group__0"


    // $ANTLR start "rule__ConditionBody__Group__0__Impl"
    // InternalUsex.g:2535:1: rule__ConditionBody__Group__0__Impl : ( ( rule__ConditionBody__NameAssignment_0 )? ) ;
    public final void rule__ConditionBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2539:1: ( ( ( rule__ConditionBody__NameAssignment_0 )? ) )
            // InternalUsex.g:2540:1: ( ( rule__ConditionBody__NameAssignment_0 )? )
            {
            // InternalUsex.g:2540:1: ( ( rule__ConditionBody__NameAssignment_0 )? )
            // InternalUsex.g:2541:2: ( rule__ConditionBody__NameAssignment_0 )?
            {
             before(grammarAccess.getConditionBodyAccess().getNameAssignment_0()); 
            // InternalUsex.g:2542:2: ( rule__ConditionBody__NameAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUsex.g:2542:3: rule__ConditionBody__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConditionBody__NameAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionBodyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__Group__0__Impl"


    // $ANTLR start "rule__ConditionBody__Group__1"
    // InternalUsex.g:2550:1: rule__ConditionBody__Group__1 : rule__ConditionBody__Group__1__Impl rule__ConditionBody__Group__2 ;
    public final void rule__ConditionBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2554:1: ( rule__ConditionBody__Group__1__Impl rule__ConditionBody__Group__2 )
            // InternalUsex.g:2555:2: rule__ConditionBody__Group__1__Impl rule__ConditionBody__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ConditionBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConditionBody__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__Group__1"


    // $ANTLR start "rule__ConditionBody__Group__1__Impl"
    // InternalUsex.g:2562:1: rule__ConditionBody__Group__1__Impl : ( ':' ) ;
    public final void rule__ConditionBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2566:1: ( ( ':' ) )
            // InternalUsex.g:2567:1: ( ':' )
            {
            // InternalUsex.g:2567:1: ( ':' )
            // InternalUsex.g:2568:2: ':'
            {
             before(grammarAccess.getConditionBodyAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getConditionBodyAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__Group__1__Impl"


    // $ANTLR start "rule__ConditionBody__Group__2"
    // InternalUsex.g:2577:1: rule__ConditionBody__Group__2 : rule__ConditionBody__Group__2__Impl ;
    public final void rule__ConditionBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2581:1: ( rule__ConditionBody__Group__2__Impl )
            // InternalUsex.g:2582:2: rule__ConditionBody__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBody__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__Group__2"


    // $ANTLR start "rule__ConditionBody__Group__2__Impl"
    // InternalUsex.g:2588:1: rule__ConditionBody__Group__2__Impl : ( ( rule__ConditionBody__ConditionAssignment_2 ) ) ;
    public final void rule__ConditionBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2592:1: ( ( ( rule__ConditionBody__ConditionAssignment_2 ) ) )
            // InternalUsex.g:2593:1: ( ( rule__ConditionBody__ConditionAssignment_2 ) )
            {
            // InternalUsex.g:2593:1: ( ( rule__ConditionBody__ConditionAssignment_2 ) )
            // InternalUsex.g:2594:2: ( rule__ConditionBody__ConditionAssignment_2 )
            {
             before(grammarAccess.getConditionBodyAccess().getConditionAssignment_2()); 
            // InternalUsex.g:2595:2: ( rule__ConditionBody__ConditionAssignment_2 )
            // InternalUsex.g:2595:3: rule__ConditionBody__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConditionBody__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionBodyAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalUsex.g:2604:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2608:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalUsex.g:2609:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalUsex.g:2616:1: rule__Constraint__Group__0__Impl : ( 'inv' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2620:1: ( ( 'inv' ) )
            // InternalUsex.g:2621:1: ( 'inv' )
            {
            // InternalUsex.g:2621:1: ( 'inv' )
            // InternalUsex.g:2622:2: 'inv'
            {
             before(grammarAccess.getConstraintAccess().getInvKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getInvKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalUsex.g:2631:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2635:1: ( rule__Constraint__Group__1__Impl )
            // InternalUsex.g:2636:2: rule__Constraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalUsex.g:2642:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__ConditionBodyAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2646:1: ( ( ( rule__Constraint__ConditionBodyAssignment_1 ) ) )
            // InternalUsex.g:2647:1: ( ( rule__Constraint__ConditionBodyAssignment_1 ) )
            {
            // InternalUsex.g:2647:1: ( ( rule__Constraint__ConditionBodyAssignment_1 ) )
            // InternalUsex.g:2648:2: ( rule__Constraint__ConditionBodyAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getConditionBodyAssignment_1()); 
            // InternalUsex.g:2649:2: ( rule__Constraint__ConditionBodyAssignment_1 )
            // InternalUsex.g:2649:3: rule__Constraint__ConditionBodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ConditionBodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getConditionBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalUsex.g:2658:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2662:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUsex.g:2663:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalUsex.g:2670:1: rule__Association__Group__0__Impl : ( 'association' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2674:1: ( ( 'association' ) )
            // InternalUsex.g:2675:1: ( 'association' )
            {
            // InternalUsex.g:2675:1: ( 'association' )
            // InternalUsex.g:2676:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalUsex.g:2685:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2689:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUsex.g:2690:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalUsex.g:2697:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2701:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // InternalUsex.g:2702:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // InternalUsex.g:2702:1: ( ( rule__Association__NameAssignment_1 ) )
            // InternalUsex.g:2703:2: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // InternalUsex.g:2704:2: ( rule__Association__NameAssignment_1 )
            // InternalUsex.g:2704:3: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalUsex.g:2712:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2716:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUsex.g:2717:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalUsex.g:2724:1: rule__Association__Group__2__Impl : ( 'between' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2728:1: ( ( 'between' ) )
            // InternalUsex.g:2729:1: ( 'between' )
            {
            // InternalUsex.g:2729:1: ( 'between' )
            // InternalUsex.g:2730:2: 'between'
            {
             before(grammarAccess.getAssociationAccess().getBetweenKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getBetweenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalUsex.g:2739:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2743:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUsex.g:2744:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalUsex.g:2751:1: rule__Association__Group__3__Impl : ( ( rule__Association__RelationBodyAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2755:1: ( ( ( rule__Association__RelationBodyAssignment_3 ) ) )
            // InternalUsex.g:2756:1: ( ( rule__Association__RelationBodyAssignment_3 ) )
            {
            // InternalUsex.g:2756:1: ( ( rule__Association__RelationBodyAssignment_3 ) )
            // InternalUsex.g:2757:2: ( rule__Association__RelationBodyAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getRelationBodyAssignment_3()); 
            // InternalUsex.g:2758:2: ( rule__Association__RelationBodyAssignment_3 )
            // InternalUsex.g:2758:3: rule__Association__RelationBodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Association__RelationBodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRelationBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalUsex.g:2766:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2770:1: ( rule__Association__Group__4__Impl )
            // InternalUsex.g:2771:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalUsex.g:2777:1: rule__Association__Group__4__Impl : ( 'end' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2781:1: ( ( 'end' ) )
            // InternalUsex.g:2782:1: ( 'end' )
            {
            // InternalUsex.g:2782:1: ( 'end' )
            // InternalUsex.g:2783:2: 'end'
            {
             before(grammarAccess.getAssociationAccess().getEndKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalUsex.g:2793:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2797:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalUsex.g:2798:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalUsex.g:2805:1: rule__Composition__Group__0__Impl : ( 'composition' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2809:1: ( ( 'composition' ) )
            // InternalUsex.g:2810:1: ( 'composition' )
            {
            // InternalUsex.g:2810:1: ( 'composition' )
            // InternalUsex.g:2811:2: 'composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalUsex.g:2820:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2824:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalUsex.g:2825:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalUsex.g:2832:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__NameAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2836:1: ( ( ( rule__Composition__NameAssignment_1 ) ) )
            // InternalUsex.g:2837:1: ( ( rule__Composition__NameAssignment_1 ) )
            {
            // InternalUsex.g:2837:1: ( ( rule__Composition__NameAssignment_1 ) )
            // InternalUsex.g:2838:2: ( rule__Composition__NameAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_1()); 
            // InternalUsex.g:2839:2: ( rule__Composition__NameAssignment_1 )
            // InternalUsex.g:2839:3: rule__Composition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalUsex.g:2847:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2851:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalUsex.g:2852:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Composition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalUsex.g:2859:1: rule__Composition__Group__2__Impl : ( 'between' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2863:1: ( ( 'between' ) )
            // InternalUsex.g:2864:1: ( 'between' )
            {
            // InternalUsex.g:2864:1: ( 'between' )
            // InternalUsex.g:2865:2: 'between'
            {
             before(grammarAccess.getCompositionAccess().getBetweenKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getBetweenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Composition__Group__3"
    // InternalUsex.g:2874:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2878:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalUsex.g:2879:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Composition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3"


    // $ANTLR start "rule__Composition__Group__3__Impl"
    // InternalUsex.g:2886:1: rule__Composition__Group__3__Impl : ( ( rule__Composition__RelationBodyAssignment_3 ) ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2890:1: ( ( ( rule__Composition__RelationBodyAssignment_3 ) ) )
            // InternalUsex.g:2891:1: ( ( rule__Composition__RelationBodyAssignment_3 ) )
            {
            // InternalUsex.g:2891:1: ( ( rule__Composition__RelationBodyAssignment_3 ) )
            // InternalUsex.g:2892:2: ( rule__Composition__RelationBodyAssignment_3 )
            {
             before(grammarAccess.getCompositionAccess().getRelationBodyAssignment_3()); 
            // InternalUsex.g:2893:2: ( rule__Composition__RelationBodyAssignment_3 )
            // InternalUsex.g:2893:3: rule__Composition__RelationBodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Composition__RelationBodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getRelationBodyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3__Impl"


    // $ANTLR start "rule__Composition__Group__4"
    // InternalUsex.g:2901:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2905:1: ( rule__Composition__Group__4__Impl )
            // InternalUsex.g:2906:2: rule__Composition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4"


    // $ANTLR start "rule__Composition__Group__4__Impl"
    // InternalUsex.g:2912:1: rule__Composition__Group__4__Impl : ( 'end' ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2916:1: ( ( 'end' ) )
            // InternalUsex.g:2917:1: ( 'end' )
            {
            // InternalUsex.g:2917:1: ( 'end' )
            // InternalUsex.g:2918:2: 'end'
            {
             before(grammarAccess.getCompositionAccess().getEndKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getEndKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4__Impl"


    // $ANTLR start "rule__RelationBody__Group__0"
    // InternalUsex.g:2928:1: rule__RelationBody__Group__0 : rule__RelationBody__Group__0__Impl rule__RelationBody__Group__1 ;
    public final void rule__RelationBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2932:1: ( rule__RelationBody__Group__0__Impl rule__RelationBody__Group__1 )
            // InternalUsex.g:2933:2: rule__RelationBody__Group__0__Impl rule__RelationBody__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RelationBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationBody__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationBody__Group__0"


    // $ANTLR start "rule__RelationBody__Group__0__Impl"
    // InternalUsex.g:2940:1: rule__RelationBody__Group__0__Impl : ( ( rule__RelationBody__OriginClassAssignment_0 ) ) ;
    public final void rule__RelationBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2944:1: ( ( ( rule__RelationBody__OriginClassAssignment_0 ) ) )
            // InternalUsex.g:2945:1: ( ( rule__RelationBody__OriginClassAssignment_0 ) )
            {
            // InternalUsex.g:2945:1: ( ( rule__RelationBody__OriginClassAssignment_0 ) )
            // InternalUsex.g:2946:2: ( rule__RelationBody__OriginClassAssignment_0 )
            {
             before(grammarAccess.getRelationBodyAccess().getOriginClassAssignment_0()); 
            // InternalUsex.g:2947:2: ( rule__RelationBody__OriginClassAssignment_0 )
            // InternalUsex.g:2947:3: rule__RelationBody__OriginClassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationBody__OriginClassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationBodyAccess().getOriginClassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationBody__Group__0__Impl"


    // $ANTLR start "rule__RelationBody__Group__1"
    // InternalUsex.g:2955:1: rule__RelationBody__Group__1 : rule__RelationBody__Group__1__Impl ;
    public final void rule__RelationBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2959:1: ( rule__RelationBody__Group__1__Impl )
            // InternalUsex.g:2960:2: rule__RelationBody__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationBody__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationBody__Group__1"


    // $ANTLR start "rule__RelationBody__Group__1__Impl"
    // InternalUsex.g:2966:1: rule__RelationBody__Group__1__Impl : ( ( rule__RelationBody__DestinyClassAssignment_1 ) ) ;
    public final void rule__RelationBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2970:1: ( ( ( rule__RelationBody__DestinyClassAssignment_1 ) ) )
            // InternalUsex.g:2971:1: ( ( rule__RelationBody__DestinyClassAssignment_1 ) )
            {
            // InternalUsex.g:2971:1: ( ( rule__RelationBody__DestinyClassAssignment_1 ) )
            // InternalUsex.g:2972:2: ( rule__RelationBody__DestinyClassAssignment_1 )
            {
             before(grammarAccess.getRelationBodyAccess().getDestinyClassAssignment_1()); 
            // InternalUsex.g:2973:2: ( rule__RelationBody__DestinyClassAssignment_1 )
            // InternalUsex.g:2973:3: rule__RelationBody__DestinyClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RelationBody__DestinyClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationBodyAccess().getDestinyClassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationBody__Group__1__Impl"


    // $ANTLR start "rule__RelationMember__Group__0"
    // InternalUsex.g:2982:1: rule__RelationMember__Group__0 : rule__RelationMember__Group__0__Impl rule__RelationMember__Group__1 ;
    public final void rule__RelationMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2986:1: ( rule__RelationMember__Group__0__Impl rule__RelationMember__Group__1 )
            // InternalUsex.g:2987:2: rule__RelationMember__Group__0__Impl rule__RelationMember__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RelationMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__0"


    // $ANTLR start "rule__RelationMember__Group__0__Impl"
    // InternalUsex.g:2994:1: rule__RelationMember__Group__0__Impl : ( ( rule__RelationMember__ClassAssignment_0 ) ) ;
    public final void rule__RelationMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:2998:1: ( ( ( rule__RelationMember__ClassAssignment_0 ) ) )
            // InternalUsex.g:2999:1: ( ( rule__RelationMember__ClassAssignment_0 ) )
            {
            // InternalUsex.g:2999:1: ( ( rule__RelationMember__ClassAssignment_0 ) )
            // InternalUsex.g:3000:2: ( rule__RelationMember__ClassAssignment_0 )
            {
             before(grammarAccess.getRelationMemberAccess().getClassAssignment_0()); 
            // InternalUsex.g:3001:2: ( rule__RelationMember__ClassAssignment_0 )
            // InternalUsex.g:3001:3: rule__RelationMember__ClassAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RelationMember__ClassAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationMemberAccess().getClassAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__0__Impl"


    // $ANTLR start "rule__RelationMember__Group__1"
    // InternalUsex.g:3009:1: rule__RelationMember__Group__1 : rule__RelationMember__Group__1__Impl rule__RelationMember__Group__2 ;
    public final void rule__RelationMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3013:1: ( rule__RelationMember__Group__1__Impl rule__RelationMember__Group__2 )
            // InternalUsex.g:3014:2: rule__RelationMember__Group__1__Impl rule__RelationMember__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__RelationMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__1"


    // $ANTLR start "rule__RelationMember__Group__1__Impl"
    // InternalUsex.g:3021:1: rule__RelationMember__Group__1__Impl : ( '[' ) ;
    public final void rule__RelationMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3025:1: ( ( '[' ) )
            // InternalUsex.g:3026:1: ( '[' )
            {
            // InternalUsex.g:3026:1: ( '[' )
            // InternalUsex.g:3027:2: '['
            {
             before(grammarAccess.getRelationMemberAccess().getLeftSquareBracketKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRelationMemberAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__1__Impl"


    // $ANTLR start "rule__RelationMember__Group__2"
    // InternalUsex.g:3036:1: rule__RelationMember__Group__2 : rule__RelationMember__Group__2__Impl rule__RelationMember__Group__3 ;
    public final void rule__RelationMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3040:1: ( rule__RelationMember__Group__2__Impl rule__RelationMember__Group__3 )
            // InternalUsex.g:3041:2: rule__RelationMember__Group__2__Impl rule__RelationMember__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__RelationMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__2"


    // $ANTLR start "rule__RelationMember__Group__2__Impl"
    // InternalUsex.g:3048:1: rule__RelationMember__Group__2__Impl : ( ( rule__RelationMember__CardinalityAssignment_2 ) ) ;
    public final void rule__RelationMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3052:1: ( ( ( rule__RelationMember__CardinalityAssignment_2 ) ) )
            // InternalUsex.g:3053:1: ( ( rule__RelationMember__CardinalityAssignment_2 ) )
            {
            // InternalUsex.g:3053:1: ( ( rule__RelationMember__CardinalityAssignment_2 ) )
            // InternalUsex.g:3054:2: ( rule__RelationMember__CardinalityAssignment_2 )
            {
             before(grammarAccess.getRelationMemberAccess().getCardinalityAssignment_2()); 
            // InternalUsex.g:3055:2: ( rule__RelationMember__CardinalityAssignment_2 )
            // InternalUsex.g:3055:3: rule__RelationMember__CardinalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RelationMember__CardinalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationMemberAccess().getCardinalityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__2__Impl"


    // $ANTLR start "rule__RelationMember__Group__3"
    // InternalUsex.g:3063:1: rule__RelationMember__Group__3 : rule__RelationMember__Group__3__Impl rule__RelationMember__Group__4 ;
    public final void rule__RelationMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3067:1: ( rule__RelationMember__Group__3__Impl rule__RelationMember__Group__4 )
            // InternalUsex.g:3068:2: rule__RelationMember__Group__3__Impl rule__RelationMember__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__RelationMember__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__3"


    // $ANTLR start "rule__RelationMember__Group__3__Impl"
    // InternalUsex.g:3075:1: rule__RelationMember__Group__3__Impl : ( ']' ) ;
    public final void rule__RelationMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3079:1: ( ( ']' ) )
            // InternalUsex.g:3080:1: ( ']' )
            {
            // InternalUsex.g:3080:1: ( ']' )
            // InternalUsex.g:3081:2: ']'
            {
             before(grammarAccess.getRelationMemberAccess().getRightSquareBracketKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRelationMemberAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__3__Impl"


    // $ANTLR start "rule__RelationMember__Group__4"
    // InternalUsex.g:3090:1: rule__RelationMember__Group__4 : rule__RelationMember__Group__4__Impl rule__RelationMember__Group__5 ;
    public final void rule__RelationMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3094:1: ( rule__RelationMember__Group__4__Impl rule__RelationMember__Group__5 )
            // InternalUsex.g:3095:2: rule__RelationMember__Group__4__Impl rule__RelationMember__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__RelationMember__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__4"


    // $ANTLR start "rule__RelationMember__Group__4__Impl"
    // InternalUsex.g:3102:1: rule__RelationMember__Group__4__Impl : ( 'role' ) ;
    public final void rule__RelationMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3106:1: ( ( 'role' ) )
            // InternalUsex.g:3107:1: ( 'role' )
            {
            // InternalUsex.g:3107:1: ( 'role' )
            // InternalUsex.g:3108:2: 'role'
            {
             before(grammarAccess.getRelationMemberAccess().getRoleKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRelationMemberAccess().getRoleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__4__Impl"


    // $ANTLR start "rule__RelationMember__Group__5"
    // InternalUsex.g:3117:1: rule__RelationMember__Group__5 : rule__RelationMember__Group__5__Impl ;
    public final void rule__RelationMember__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3121:1: ( rule__RelationMember__Group__5__Impl )
            // InternalUsex.g:3122:2: rule__RelationMember__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelationMember__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__5"


    // $ANTLR start "rule__RelationMember__Group__5__Impl"
    // InternalUsex.g:3128:1: rule__RelationMember__Group__5__Impl : ( ( rule__RelationMember__RoleNameAssignment_5 ) ) ;
    public final void rule__RelationMember__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3132:1: ( ( ( rule__RelationMember__RoleNameAssignment_5 ) ) )
            // InternalUsex.g:3133:1: ( ( rule__RelationMember__RoleNameAssignment_5 ) )
            {
            // InternalUsex.g:3133:1: ( ( rule__RelationMember__RoleNameAssignment_5 ) )
            // InternalUsex.g:3134:2: ( rule__RelationMember__RoleNameAssignment_5 )
            {
             before(grammarAccess.getRelationMemberAccess().getRoleNameAssignment_5()); 
            // InternalUsex.g:3135:2: ( rule__RelationMember__RoleNameAssignment_5 )
            // InternalUsex.g:3135:3: rule__RelationMember__RoleNameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RelationMember__RoleNameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationMemberAccess().getRoleNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__Group__5__Impl"


    // $ANTLR start "rule__DoubleCardinality__Group__0"
    // InternalUsex.g:3144:1: rule__DoubleCardinality__Group__0 : rule__DoubleCardinality__Group__0__Impl rule__DoubleCardinality__Group__1 ;
    public final void rule__DoubleCardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3148:1: ( rule__DoubleCardinality__Group__0__Impl rule__DoubleCardinality__Group__1 )
            // InternalUsex.g:3149:2: rule__DoubleCardinality__Group__0__Impl rule__DoubleCardinality__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__DoubleCardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleCardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__Group__0"


    // $ANTLR start "rule__DoubleCardinality__Group__0__Impl"
    // InternalUsex.g:3156:1: rule__DoubleCardinality__Group__0__Impl : ( ( rule__DoubleCardinality__OriginCardinalityAssignment_0 ) ) ;
    public final void rule__DoubleCardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3160:1: ( ( ( rule__DoubleCardinality__OriginCardinalityAssignment_0 ) ) )
            // InternalUsex.g:3161:1: ( ( rule__DoubleCardinality__OriginCardinalityAssignment_0 ) )
            {
            // InternalUsex.g:3161:1: ( ( rule__DoubleCardinality__OriginCardinalityAssignment_0 ) )
            // InternalUsex.g:3162:2: ( rule__DoubleCardinality__OriginCardinalityAssignment_0 )
            {
             before(grammarAccess.getDoubleCardinalityAccess().getOriginCardinalityAssignment_0()); 
            // InternalUsex.g:3163:2: ( rule__DoubleCardinality__OriginCardinalityAssignment_0 )
            // InternalUsex.g:3163:3: rule__DoubleCardinality__OriginCardinalityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleCardinality__OriginCardinalityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleCardinalityAccess().getOriginCardinalityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__Group__0__Impl"


    // $ANTLR start "rule__DoubleCardinality__Group__1"
    // InternalUsex.g:3171:1: rule__DoubleCardinality__Group__1 : rule__DoubleCardinality__Group__1__Impl rule__DoubleCardinality__Group__2 ;
    public final void rule__DoubleCardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3175:1: ( rule__DoubleCardinality__Group__1__Impl rule__DoubleCardinality__Group__2 )
            // InternalUsex.g:3176:2: rule__DoubleCardinality__Group__1__Impl rule__DoubleCardinality__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__DoubleCardinality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleCardinality__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__Group__1"


    // $ANTLR start "rule__DoubleCardinality__Group__1__Impl"
    // InternalUsex.g:3183:1: rule__DoubleCardinality__Group__1__Impl : ( '..' ) ;
    public final void rule__DoubleCardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3187:1: ( ( '..' ) )
            // InternalUsex.g:3188:1: ( '..' )
            {
            // InternalUsex.g:3188:1: ( '..' )
            // InternalUsex.g:3189:2: '..'
            {
             before(grammarAccess.getDoubleCardinalityAccess().getFullStopFullStopKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDoubleCardinalityAccess().getFullStopFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__Group__1__Impl"


    // $ANTLR start "rule__DoubleCardinality__Group__2"
    // InternalUsex.g:3198:1: rule__DoubleCardinality__Group__2 : rule__DoubleCardinality__Group__2__Impl ;
    public final void rule__DoubleCardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3202:1: ( rule__DoubleCardinality__Group__2__Impl )
            // InternalUsex.g:3203:2: rule__DoubleCardinality__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleCardinality__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__Group__2"


    // $ANTLR start "rule__DoubleCardinality__Group__2__Impl"
    // InternalUsex.g:3209:1: rule__DoubleCardinality__Group__2__Impl : ( ( rule__DoubleCardinality__DestinyCardinalityAssignment_2 ) ) ;
    public final void rule__DoubleCardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3213:1: ( ( ( rule__DoubleCardinality__DestinyCardinalityAssignment_2 ) ) )
            // InternalUsex.g:3214:1: ( ( rule__DoubleCardinality__DestinyCardinalityAssignment_2 ) )
            {
            // InternalUsex.g:3214:1: ( ( rule__DoubleCardinality__DestinyCardinalityAssignment_2 ) )
            // InternalUsex.g:3215:2: ( rule__DoubleCardinality__DestinyCardinalityAssignment_2 )
            {
             before(grammarAccess.getDoubleCardinalityAccess().getDestinyCardinalityAssignment_2()); 
            // InternalUsex.g:3216:2: ( rule__DoubleCardinality__DestinyCardinalityAssignment_2 )
            // InternalUsex.g:3216:3: rule__DoubleCardinality__DestinyCardinalityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleCardinality__DestinyCardinalityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleCardinalityAccess().getDestinyCardinalityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__Group__2__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalUsex.g:3225:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3229:1: ( ( RULE_ID ) )
            // InternalUsex.g:3230:2: ( RULE_ID )
            {
            // InternalUsex.g:3230:2: ( RULE_ID )
            // InternalUsex.g:3231:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // InternalUsex.g:3240:1: rule__Model__ElementsAssignment_2 : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3244:1: ( ( ruleAbstractElement ) )
            // InternalUsex.g:3245:2: ( ruleAbstractElement )
            {
            // InternalUsex.g:3245:2: ( ruleAbstractElement )
            // InternalUsex.g:3246:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment_2"


    // $ANTLR start "rule__UseClass__NameAssignment_1"
    // InternalUsex.g:3255:1: rule__UseClass__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseClass__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3259:1: ( ( RULE_ID ) )
            // InternalUsex.g:3260:2: ( RULE_ID )
            {
            // InternalUsex.g:3260:2: ( RULE_ID )
            // InternalUsex.g:3261:3: RULE_ID
            {
             before(grammarAccess.getUseClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__NameAssignment_1"


    // $ANTLR start "rule__UseClass__AttributesAssignment_2_1"
    // InternalUsex.g:3270:1: rule__UseClass__AttributesAssignment_2_1 : ( ruleAttribute ) ;
    public final void rule__UseClass__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3274:1: ( ( ruleAttribute ) )
            // InternalUsex.g:3275:2: ( ruleAttribute )
            {
            // InternalUsex.g:3275:2: ( ruleAttribute )
            // InternalUsex.g:3276:3: ruleAttribute
            {
             before(grammarAccess.getUseClassAccess().getAttributesAttributeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getUseClassAccess().getAttributesAttributeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__AttributesAssignment_2_1"


    // $ANTLR start "rule__UseClass__OperationsAssignment_3_1"
    // InternalUsex.g:3285:1: rule__UseClass__OperationsAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__UseClass__OperationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3289:1: ( ( ruleOperation ) )
            // InternalUsex.g:3290:2: ( ruleOperation )
            {
            // InternalUsex.g:3290:2: ( ruleOperation )
            // InternalUsex.g:3291:3: ruleOperation
            {
             before(grammarAccess.getUseClassAccess().getOperationsOperationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getUseClassAccess().getOperationsOperationParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__OperationsAssignment_3_1"


    // $ANTLR start "rule__UseClass__ConstraintsAssignment_4_1"
    // InternalUsex.g:3300:1: rule__UseClass__ConstraintsAssignment_4_1 : ( ruleConstraint ) ;
    public final void rule__UseClass__ConstraintsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3304:1: ( ( ruleConstraint ) )
            // InternalUsex.g:3305:2: ( ruleConstraint )
            {
            // InternalUsex.g:3305:2: ( ruleConstraint )
            // InternalUsex.g:3306:3: ruleConstraint
            {
             before(grammarAccess.getUseClassAccess().getConstraintsConstraintParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getUseClassAccess().getConstraintsConstraintParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseClass__ConstraintsAssignment_4_1"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalUsex.g:3315:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3319:1: ( ( RULE_ID ) )
            // InternalUsex.g:3320:2: ( RULE_ID )
            {
            // InternalUsex.g:3320:2: ( RULE_ID )
            // InternalUsex.g:3321:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__TypeAssignment_2"
    // InternalUsex.g:3330:1: rule__Attribute__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3334:1: ( ( ruleAttributeType ) )
            // InternalUsex.g:3335:2: ( ruleAttributeType )
            {
            // InternalUsex.g:3335:2: ( ruleAttributeType )
            // InternalUsex.g:3336:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_2"


    // $ANTLR start "rule__Attribute__InitializationAssignment_3_2"
    // InternalUsex.g:3345:1: rule__Attribute__InitializationAssignment_3_2 : ( ruleAttributeInitialization ) ;
    public final void rule__Attribute__InitializationAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3349:1: ( ( ruleAttributeInitialization ) )
            // InternalUsex.g:3350:2: ( ruleAttributeInitialization )
            {
            // InternalUsex.g:3350:2: ( ruleAttributeInitialization )
            // InternalUsex.g:3351:3: ruleAttributeInitialization
            {
             before(grammarAccess.getAttributeAccess().getInitializationAttributeInitializationParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeInitialization();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getInitializationAttributeInitializationParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__InitializationAssignment_3_2"


    // $ANTLR start "rule__Attribute__DerivedFromAssignment_4_2"
    // InternalUsex.g:3360:1: rule__Attribute__DerivedFromAssignment_4_2 : ( RULE_ID ) ;
    public final void rule__Attribute__DerivedFromAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3364:1: ( ( RULE_ID ) )
            // InternalUsex.g:3365:2: ( RULE_ID )
            {
            // InternalUsex.g:3365:2: ( RULE_ID )
            // InternalUsex.g:3366:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getDerivedFromIDTerminalRuleCall_4_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getDerivedFromIDTerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DerivedFromAssignment_4_2"


    // $ANTLR start "rule__PrimitiveType__TypeAssignment"
    // InternalUsex.g:3375:1: rule__PrimitiveType__TypeAssignment : ( ( rule__PrimitiveType__TypeAlternatives_0 ) ) ;
    public final void rule__PrimitiveType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3379:1: ( ( ( rule__PrimitiveType__TypeAlternatives_0 ) ) )
            // InternalUsex.g:3380:2: ( ( rule__PrimitiveType__TypeAlternatives_0 ) )
            {
            // InternalUsex.g:3380:2: ( ( rule__PrimitiveType__TypeAlternatives_0 ) )
            // InternalUsex.g:3381:3: ( rule__PrimitiveType__TypeAlternatives_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeAlternatives_0()); 
            // InternalUsex.g:3382:3: ( rule__PrimitiveType__TypeAlternatives_0 )
            // InternalUsex.g:3382:4: rule__PrimitiveType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__TypeAssignment"


    // $ANTLR start "rule__ClassType__TypeAssignment"
    // InternalUsex.g:3390:1: rule__ClassType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ClassType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3394:1: ( ( ( RULE_ID ) ) )
            // InternalUsex.g:3395:2: ( ( RULE_ID ) )
            {
            // InternalUsex.g:3395:2: ( ( RULE_ID ) )
            // InternalUsex.g:3396:3: ( RULE_ID )
            {
             before(grammarAccess.getClassTypeAccess().getTypeUseClassCrossReference_0()); 
            // InternalUsex.g:3397:3: ( RULE_ID )
            // InternalUsex.g:3398:4: RULE_ID
            {
             before(grammarAccess.getClassTypeAccess().getTypeUseClassIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassTypeAccess().getTypeUseClassIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getClassTypeAccess().getTypeUseClassCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassType__TypeAssignment"


    // $ANTLR start "rule__DoubleInitialization__ValueAssignment"
    // InternalUsex.g:3409:1: rule__DoubleInitialization__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__DoubleInitialization__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3413:1: ( ( RULE_DOUBLE ) )
            // InternalUsex.g:3414:2: ( RULE_DOUBLE )
            {
            // InternalUsex.g:3414:2: ( RULE_DOUBLE )
            // InternalUsex.g:3415:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleInitializationAccess().getValueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleInitializationAccess().getValueDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleInitialization__ValueAssignment"


    // $ANTLR start "rule__BooleanInitialization__ValueAssignment"
    // InternalUsex.g:3424:1: rule__BooleanInitialization__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanInitialization__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3428:1: ( ( RULE_BOOLEAN ) )
            // InternalUsex.g:3429:2: ( RULE_BOOLEAN )
            {
            // InternalUsex.g:3429:2: ( RULE_BOOLEAN )
            // InternalUsex.g:3430:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanInitializationAccess().getValueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanInitializationAccess().getValueBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanInitialization__ValueAssignment"


    // $ANTLR start "rule__IntegerInitialization__ValueAssignment"
    // InternalUsex.g:3439:1: rule__IntegerInitialization__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerInitialization__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3443:1: ( ( RULE_INT ) )
            // InternalUsex.g:3444:2: ( RULE_INT )
            {
            // InternalUsex.g:3444:2: ( RULE_INT )
            // InternalUsex.g:3445:3: RULE_INT
            {
             before(grammarAccess.getIntegerInitializationAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerInitializationAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerInitialization__ValueAssignment"


    // $ANTLR start "rule__StringInitialization__ValueAssignment"
    // InternalUsex.g:3454:1: rule__StringInitialization__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringInitialization__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3458:1: ( ( RULE_STRING ) )
            // InternalUsex.g:3459:2: ( RULE_STRING )
            {
            // InternalUsex.g:3459:2: ( RULE_STRING )
            // InternalUsex.g:3460:3: RULE_STRING
            {
             before(grammarAccess.getStringInitializationAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringInitializationAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringInitialization__ValueAssignment"


    // $ANTLR start "rule__Method__NameAssignment_0"
    // InternalUsex.g:3469:1: rule__Method__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3473:1: ( ( RULE_ID ) )
            // InternalUsex.g:3474:2: ( RULE_ID )
            {
            // InternalUsex.g:3474:2: ( RULE_ID )
            // InternalUsex.g:3475:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_0"


    // $ANTLR start "rule__Method__InputParametersAssignment_2"
    // InternalUsex.g:3484:1: rule__Method__InputParametersAssignment_2 : ( ruleParameter ) ;
    public final void rule__Method__InputParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3488:1: ( ( ruleParameter ) )
            // InternalUsex.g:3489:2: ( ruleParameter )
            {
            // InternalUsex.g:3489:2: ( ruleParameter )
            // InternalUsex.g:3490:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getInputParametersParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getInputParametersParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__InputParametersAssignment_2"


    // $ANTLR start "rule__Method__ReturnParameterAssignment_4_1"
    // InternalUsex.g:3499:1: rule__Method__ReturnParameterAssignment_4_1 : ( ruleAttributeType ) ;
    public final void rule__Method__ReturnParameterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3503:1: ( ( ruleAttributeType ) )
            // InternalUsex.g:3504:2: ( ruleAttributeType )
            {
            // InternalUsex.g:3504:2: ( ruleAttributeType )
            // InternalUsex.g:3505:3: ruleAttributeType
            {
             before(grammarAccess.getMethodAccess().getReturnParameterAttributeTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnParameterAttributeTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnParameterAssignment_4_1"


    // $ANTLR start "rule__Method__OperationBodyAssignment_5_1"
    // InternalUsex.g:3514:1: rule__Method__OperationBodyAssignment_5_1 : ( RULE_ID ) ;
    public final void rule__Method__OperationBodyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3518:1: ( ( RULE_ID ) )
            // InternalUsex.g:3519:2: ( RULE_ID )
            {
            // InternalUsex.g:3519:2: ( RULE_ID )
            // InternalUsex.g:3520:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getOperationBodyIDTerminalRuleCall_5_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getOperationBodyIDTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__OperationBodyAssignment_5_1"


    // $ANTLR start "rule__Method__ConditionsAssignment_6"
    // InternalUsex.g:3529:1: rule__Method__ConditionsAssignment_6 : ( ruleCondition ) ;
    public final void rule__Method__ConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3533:1: ( ( ruleCondition ) )
            // InternalUsex.g:3534:2: ( ruleCondition )
            {
            // InternalUsex.g:3534:2: ( ruleCondition )
            // InternalUsex.g:3535:3: ruleCondition
            {
             before(grammarAccess.getMethodAccess().getConditionsConditionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getConditionsConditionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ConditionsAssignment_6"


    // $ANTLR start "rule__Query__NameAssignment_0"
    // InternalUsex.g:3544:1: rule__Query__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3548:1: ( ( RULE_ID ) )
            // InternalUsex.g:3549:2: ( RULE_ID )
            {
            // InternalUsex.g:3549:2: ( RULE_ID )
            // InternalUsex.g:3550:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NameAssignment_0"


    // $ANTLR start "rule__Query__InputParametersAssignment_2"
    // InternalUsex.g:3559:1: rule__Query__InputParametersAssignment_2 : ( ruleParameter ) ;
    public final void rule__Query__InputParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3563:1: ( ( ruleParameter ) )
            // InternalUsex.g:3564:2: ( ruleParameter )
            {
            // InternalUsex.g:3564:2: ( ruleParameter )
            // InternalUsex.g:3565:3: ruleParameter
            {
             before(grammarAccess.getQueryAccess().getInputParametersParameterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getInputParametersParameterParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__InputParametersAssignment_2"


    // $ANTLR start "rule__Query__ReturnParameterAssignment_5"
    // InternalUsex.g:3574:1: rule__Query__ReturnParameterAssignment_5 : ( ruleAttributeType ) ;
    public final void rule__Query__ReturnParameterAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3578:1: ( ( ruleAttributeType ) )
            // InternalUsex.g:3579:2: ( ruleAttributeType )
            {
            // InternalUsex.g:3579:2: ( ruleAttributeType )
            // InternalUsex.g:3580:3: ruleAttributeType
            {
             before(grammarAccess.getQueryAccess().getReturnParameterAttributeTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getReturnParameterAttributeTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ReturnParameterAssignment_5"


    // $ANTLR start "rule__Query__OperationBodyAssignment_7"
    // InternalUsex.g:3589:1: rule__Query__OperationBodyAssignment_7 : ( RULE_ID ) ;
    public final void rule__Query__OperationBodyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3593:1: ( ( RULE_ID ) )
            // InternalUsex.g:3594:2: ( RULE_ID )
            {
            // InternalUsex.g:3594:2: ( RULE_ID )
            // InternalUsex.g:3595:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getOperationBodyIDTerminalRuleCall_7_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getOperationBodyIDTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__OperationBodyAssignment_7"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalUsex.g:3604:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3608:1: ( ( RULE_ID ) )
            // InternalUsex.g:3609:2: ( RULE_ID )
            {
            // InternalUsex.g:3609:2: ( RULE_ID )
            // InternalUsex.g:3610:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalUsex.g:3619:1: rule__Parameter__TypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3623:1: ( ( ruleAttributeType ) )
            // InternalUsex.g:3624:2: ( ruleAttributeType )
            {
            // InternalUsex.g:3624:2: ( ruleAttributeType )
            // InternalUsex.g:3625:3: ruleAttributeType
            {
             before(grammarAccess.getParameterAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeAttributeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Precondition__ConditionBodyAssignment_1"
    // InternalUsex.g:3634:1: rule__Precondition__ConditionBodyAssignment_1 : ( ruleConditionBody ) ;
    public final void rule__Precondition__ConditionBodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3638:1: ( ( ruleConditionBody ) )
            // InternalUsex.g:3639:2: ( ruleConditionBody )
            {
            // InternalUsex.g:3639:2: ( ruleConditionBody )
            // InternalUsex.g:3640:3: ruleConditionBody
            {
             before(grammarAccess.getPreconditionAccess().getConditionBodyConditionBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionBody();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getConditionBodyConditionBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__ConditionBodyAssignment_1"


    // $ANTLR start "rule__Postcondition__ConditionBodyAssignment_1"
    // InternalUsex.g:3649:1: rule__Postcondition__ConditionBodyAssignment_1 : ( ruleConditionBody ) ;
    public final void rule__Postcondition__ConditionBodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3653:1: ( ( ruleConditionBody ) )
            // InternalUsex.g:3654:2: ( ruleConditionBody )
            {
            // InternalUsex.g:3654:2: ( ruleConditionBody )
            // InternalUsex.g:3655:3: ruleConditionBody
            {
             before(grammarAccess.getPostconditionAccess().getConditionBodyConditionBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionBody();

            state._fsp--;

             after(grammarAccess.getPostconditionAccess().getConditionBodyConditionBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__ConditionBodyAssignment_1"


    // $ANTLR start "rule__ConditionBody__NameAssignment_0"
    // InternalUsex.g:3664:1: rule__ConditionBody__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConditionBody__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3668:1: ( ( RULE_ID ) )
            // InternalUsex.g:3669:2: ( RULE_ID )
            {
            // InternalUsex.g:3669:2: ( RULE_ID )
            // InternalUsex.g:3670:3: RULE_ID
            {
             before(grammarAccess.getConditionBodyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionBodyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__NameAssignment_0"


    // $ANTLR start "rule__ConditionBody__ConditionAssignment_2"
    // InternalUsex.g:3679:1: rule__ConditionBody__ConditionAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConditionBody__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3683:1: ( ( RULE_ID ) )
            // InternalUsex.g:3684:2: ( RULE_ID )
            {
            // InternalUsex.g:3684:2: ( RULE_ID )
            // InternalUsex.g:3685:3: RULE_ID
            {
             before(grammarAccess.getConditionBodyAccess().getConditionIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionBodyAccess().getConditionIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionBody__ConditionAssignment_2"


    // $ANTLR start "rule__Constraint__ConditionBodyAssignment_1"
    // InternalUsex.g:3694:1: rule__Constraint__ConditionBodyAssignment_1 : ( ruleConditionBody ) ;
    public final void rule__Constraint__ConditionBodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3698:1: ( ( ruleConditionBody ) )
            // InternalUsex.g:3699:2: ( ruleConditionBody )
            {
            // InternalUsex.g:3699:2: ( ruleConditionBody )
            // InternalUsex.g:3700:3: ruleConditionBody
            {
             before(grammarAccess.getConstraintAccess().getConditionBodyConditionBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConditionBody();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getConditionBodyConditionBodyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ConditionBodyAssignment_1"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // InternalUsex.g:3709:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3713:1: ( ( RULE_ID ) )
            // InternalUsex.g:3714:2: ( RULE_ID )
            {
            // InternalUsex.g:3714:2: ( RULE_ID )
            // InternalUsex.g:3715:3: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__RelationBodyAssignment_3"
    // InternalUsex.g:3724:1: rule__Association__RelationBodyAssignment_3 : ( ruleRelationBody ) ;
    public final void rule__Association__RelationBodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3728:1: ( ( ruleRelationBody ) )
            // InternalUsex.g:3729:2: ( ruleRelationBody )
            {
            // InternalUsex.g:3729:2: ( ruleRelationBody )
            // InternalUsex.g:3730:3: ruleRelationBody
            {
             before(grammarAccess.getAssociationAccess().getRelationBodyRelationBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationBody();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRelationBodyRelationBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RelationBodyAssignment_3"


    // $ANTLR start "rule__Composition__NameAssignment_1"
    // InternalUsex.g:3739:1: rule__Composition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Composition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3743:1: ( ( RULE_ID ) )
            // InternalUsex.g:3744:2: ( RULE_ID )
            {
            // InternalUsex.g:3744:2: ( RULE_ID )
            // InternalUsex.g:3745:3: RULE_ID
            {
             before(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAssignment_1"


    // $ANTLR start "rule__Composition__RelationBodyAssignment_3"
    // InternalUsex.g:3754:1: rule__Composition__RelationBodyAssignment_3 : ( ruleRelationBody ) ;
    public final void rule__Composition__RelationBodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3758:1: ( ( ruleRelationBody ) )
            // InternalUsex.g:3759:2: ( ruleRelationBody )
            {
            // InternalUsex.g:3759:2: ( ruleRelationBody )
            // InternalUsex.g:3760:3: ruleRelationBody
            {
             before(grammarAccess.getCompositionAccess().getRelationBodyRelationBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationBody();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getRelationBodyRelationBodyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__RelationBodyAssignment_3"


    // $ANTLR start "rule__RelationBody__OriginClassAssignment_0"
    // InternalUsex.g:3769:1: rule__RelationBody__OriginClassAssignment_0 : ( ruleRelationMember ) ;
    public final void rule__RelationBody__OriginClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3773:1: ( ( ruleRelationMember ) )
            // InternalUsex.g:3774:2: ( ruleRelationMember )
            {
            // InternalUsex.g:3774:2: ( ruleRelationMember )
            // InternalUsex.g:3775:3: ruleRelationMember
            {
             before(grammarAccess.getRelationBodyAccess().getOriginClassRelationMemberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationMember();

            state._fsp--;

             after(grammarAccess.getRelationBodyAccess().getOriginClassRelationMemberParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationBody__OriginClassAssignment_0"


    // $ANTLR start "rule__RelationBody__DestinyClassAssignment_1"
    // InternalUsex.g:3784:1: rule__RelationBody__DestinyClassAssignment_1 : ( ruleRelationMember ) ;
    public final void rule__RelationBody__DestinyClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3788:1: ( ( ruleRelationMember ) )
            // InternalUsex.g:3789:2: ( ruleRelationMember )
            {
            // InternalUsex.g:3789:2: ( ruleRelationMember )
            // InternalUsex.g:3790:3: ruleRelationMember
            {
             before(grammarAccess.getRelationBodyAccess().getDestinyClassRelationMemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelationMember();

            state._fsp--;

             after(grammarAccess.getRelationBodyAccess().getDestinyClassRelationMemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationBody__DestinyClassAssignment_1"


    // $ANTLR start "rule__RelationMember__ClassAssignment_0"
    // InternalUsex.g:3799:1: rule__RelationMember__ClassAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RelationMember__ClassAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3803:1: ( ( ( RULE_ID ) ) )
            // InternalUsex.g:3804:2: ( ( RULE_ID ) )
            {
            // InternalUsex.g:3804:2: ( ( RULE_ID ) )
            // InternalUsex.g:3805:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationMemberAccess().getClassUseClassCrossReference_0_0()); 
            // InternalUsex.g:3806:3: ( RULE_ID )
            // InternalUsex.g:3807:4: RULE_ID
            {
             before(grammarAccess.getRelationMemberAccess().getClassUseClassIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationMemberAccess().getClassUseClassIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRelationMemberAccess().getClassUseClassCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__ClassAssignment_0"


    // $ANTLR start "rule__RelationMember__CardinalityAssignment_2"
    // InternalUsex.g:3818:1: rule__RelationMember__CardinalityAssignment_2 : ( ruleCardinalityType ) ;
    public final void rule__RelationMember__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3822:1: ( ( ruleCardinalityType ) )
            // InternalUsex.g:3823:2: ( ruleCardinalityType )
            {
            // InternalUsex.g:3823:2: ( ruleCardinalityType )
            // InternalUsex.g:3824:3: ruleCardinalityType
            {
             before(grammarAccess.getRelationMemberAccess().getCardinalityCardinalityTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityType();

            state._fsp--;

             after(grammarAccess.getRelationMemberAccess().getCardinalityCardinalityTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__CardinalityAssignment_2"


    // $ANTLR start "rule__RelationMember__RoleNameAssignment_5"
    // InternalUsex.g:3833:1: rule__RelationMember__RoleNameAssignment_5 : ( RULE_ID ) ;
    public final void rule__RelationMember__RoleNameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3837:1: ( ( RULE_ID ) )
            // InternalUsex.g:3838:2: ( RULE_ID )
            {
            // InternalUsex.g:3838:2: ( RULE_ID )
            // InternalUsex.g:3839:3: RULE_ID
            {
             before(grammarAccess.getRelationMemberAccess().getRoleNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationMemberAccess().getRoleNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationMember__RoleNameAssignment_5"


    // $ANTLR start "rule__SimpleCardinality__CardinalityAssignment"
    // InternalUsex.g:3848:1: rule__SimpleCardinality__CardinalityAssignment : ( ruleCardinalityValue ) ;
    public final void rule__SimpleCardinality__CardinalityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3852:1: ( ( ruleCardinalityValue ) )
            // InternalUsex.g:3853:2: ( ruleCardinalityValue )
            {
            // InternalUsex.g:3853:2: ( ruleCardinalityValue )
            // InternalUsex.g:3854:3: ruleCardinalityValue
            {
             before(grammarAccess.getSimpleCardinalityAccess().getCardinalityCardinalityValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityValue();

            state._fsp--;

             after(grammarAccess.getSimpleCardinalityAccess().getCardinalityCardinalityValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCardinality__CardinalityAssignment"


    // $ANTLR start "rule__DoubleCardinality__OriginCardinalityAssignment_0"
    // InternalUsex.g:3863:1: rule__DoubleCardinality__OriginCardinalityAssignment_0 : ( ruleCardinalityValue ) ;
    public final void rule__DoubleCardinality__OriginCardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3867:1: ( ( ruleCardinalityValue ) )
            // InternalUsex.g:3868:2: ( ruleCardinalityValue )
            {
            // InternalUsex.g:3868:2: ( ruleCardinalityValue )
            // InternalUsex.g:3869:3: ruleCardinalityValue
            {
             before(grammarAccess.getDoubleCardinalityAccess().getOriginCardinalityCardinalityValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityValue();

            state._fsp--;

             after(grammarAccess.getDoubleCardinalityAccess().getOriginCardinalityCardinalityValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__OriginCardinalityAssignment_0"


    // $ANTLR start "rule__DoubleCardinality__DestinyCardinalityAssignment_2"
    // InternalUsex.g:3878:1: rule__DoubleCardinality__DestinyCardinalityAssignment_2 : ( ruleCardinalityValue ) ;
    public final void rule__DoubleCardinality__DestinyCardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3882:1: ( ( ruleCardinalityValue ) )
            // InternalUsex.g:3883:2: ( ruleCardinalityValue )
            {
            // InternalUsex.g:3883:2: ( ruleCardinalityValue )
            // InternalUsex.g:3884:3: ruleCardinalityValue
            {
             before(grammarAccess.getDoubleCardinalityAccess().getDestinyCardinalityCardinalityValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinalityValue();

            state._fsp--;

             after(grammarAccess.getDoubleCardinalityAccess().getDestinyCardinalityCardinalityValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleCardinality__DestinyCardinalityAssignment_2"


    // $ANTLR start "rule__IntCardinality__ValueAssignment"
    // InternalUsex.g:3893:1: rule__IntCardinality__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntCardinality__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3897:1: ( ( RULE_INT ) )
            // InternalUsex.g:3898:2: ( RULE_INT )
            {
            // InternalUsex.g:3898:2: ( RULE_INT )
            // InternalUsex.g:3899:3: RULE_INT
            {
             before(grammarAccess.getIntCardinalityAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntCardinalityAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntCardinality__ValueAssignment"


    // $ANTLR start "rule__AsteriskCardinality__ValueAssignment"
    // InternalUsex.g:3908:1: rule__AsteriskCardinality__ValueAssignment : ( RULE_ASTERISK ) ;
    public final void rule__AsteriskCardinality__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUsex.g:3912:1: ( ( RULE_ASTERISK ) )
            // InternalUsex.g:3913:2: ( RULE_ASTERISK )
            {
            // InternalUsex.g:3913:2: ( RULE_ASTERISK )
            // InternalUsex.g:3914:3: RULE_ASTERISK
            {
             before(grammarAccess.getAsteriskCardinalityAccess().getValueASTERISKTerminalRuleCall_0()); 
            match(input,RULE_ASTERISK,FOLLOW_2); 
             after(grammarAccess.getAsteriskCardinalityAccess().getValueASTERISKTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AsteriskCardinality__ValueAssignment"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\24\uffff";
    static final String dfa_2s = "\4\uffff\1\7\10\uffff\5\7\2\uffff";
    static final String dfa_3s = "\1\4\1\33\1\4\1\30\3\4\1\uffff\13\4\1\uffff";
    static final String dfa_4s = "\1\4\1\33\1\34\1\30\1\41\2\21\1\uffff\5\37\5\41\1\34\1\uffff";
    static final String dfa_5s = "\7\uffff\1\1\13\uffff\1\2";
    static final String dfa_6s = "\24\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\3\27\uffff\1\4",
            "\1\5",
            "\1\7\17\uffff\1\7\2\uffff\1\7\1\6\4\uffff\1\7\2\uffff\2\7",
            "\1\14\11\uffff\1\10\1\11\1\12\1\13",
            "\1\21\11\uffff\1\15\1\16\1\17\1\20",
            "",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\3\27\uffff\1\4\2\uffff\1\22",
            "\1\7\17\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\17\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\17\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\17\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\23\1\uffff\2\7",
            "\1\7\17\uffff\1\7\2\uffff\1\7\5\uffff\1\7\1\23\1\uffff\2\7",
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

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "960:1: rule__Operation__Alternatives : ( ( ruleMethod ) | ( ruleQuery ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002800080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002800080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000003C010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000321000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});

}