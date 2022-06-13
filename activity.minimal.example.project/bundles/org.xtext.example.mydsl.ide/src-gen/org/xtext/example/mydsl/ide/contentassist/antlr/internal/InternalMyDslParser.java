package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'}'", "'activities'", "','", "'Activity'", "'sequences'", "'Sequence'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoot"
    // InternalMyDsl.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRoot EOF )
            // InternalMyDsl.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalMyDsl.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Root__Group__0 )
            // InternalMyDsl.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:103:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleActivity EOF )
            // InternalMyDsl.g:105:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:112:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Activity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Activity__Group__0 )
            // InternalMyDsl.g:119:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleSequence"
    // InternalMyDsl.g:128:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSequence EOF )
            // InternalMyDsl.g:130:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalMyDsl.g:137:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Sequence__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Sequence__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Sequence__Group__0 )
            // InternalMyDsl.g:144:4: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:157:2: ( RULE_STRING )
                    // InternalMyDsl.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:163:2: ( RULE_ID )
                    // InternalMyDsl.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Root__Group__0"
    // InternalMyDsl.g:173:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:177:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalMyDsl.g:178:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalMyDsl.g:185:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:189:1: ( ( () ) )
            // InternalMyDsl.g:190:1: ( () )
            {
            // InternalMyDsl.g:190:1: ( () )
            // InternalMyDsl.g:191:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // InternalMyDsl.g:192:2: ()
            // InternalMyDsl.g:192:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalMyDsl.g:200:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:204:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalMyDsl.g:205:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalMyDsl.g:212:1: rule__Root__Group__1__Impl : ( 'Root' ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:1: ( ( 'Root' ) )
            // InternalMyDsl.g:217:1: ( 'Root' )
            {
            // InternalMyDsl.g:217:1: ( 'Root' )
            // InternalMyDsl.g:218:2: 'Root'
            {
             before(grammarAccess.getRootAccess().getRootKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRootKeyword_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalMyDsl.g:227:1: rule__Root__Group__2 : rule__Root__Group__2__Impl rule__Root__Group__3 ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:231:1: ( rule__Root__Group__2__Impl rule__Root__Group__3 )
            // InternalMyDsl.g:232:2: rule__Root__Group__2__Impl rule__Root__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__3();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalMyDsl.g:239:1: rule__Root__Group__2__Impl : ( ( rule__Root__NameAssignment_2 ) ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:243:1: ( ( ( rule__Root__NameAssignment_2 ) ) )
            // InternalMyDsl.g:244:1: ( ( rule__Root__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:244:1: ( ( rule__Root__NameAssignment_2 ) )
            // InternalMyDsl.g:245:2: ( rule__Root__NameAssignment_2 )
            {
             before(grammarAccess.getRootAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:246:2: ( rule__Root__NameAssignment_2 )
            // InternalMyDsl.g:246:3: rule__Root__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Root__Group__3"
    // InternalMyDsl.g:254:1: rule__Root__Group__3 : rule__Root__Group__3__Impl rule__Root__Group__4 ;
    public final void rule__Root__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:258:1: ( rule__Root__Group__3__Impl rule__Root__Group__4 )
            // InternalMyDsl.g:259:2: rule__Root__Group__3__Impl rule__Root__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__4();

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
    // $ANTLR end "rule__Root__Group__3"


    // $ANTLR start "rule__Root__Group__3__Impl"
    // InternalMyDsl.g:266:1: rule__Root__Group__3__Impl : ( '{' ) ;
    public final void rule__Root__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:270:1: ( ( '{' ) )
            // InternalMyDsl.g:271:1: ( '{' )
            {
            // InternalMyDsl.g:271:1: ( '{' )
            // InternalMyDsl.g:272:2: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Root__Group__3__Impl"


    // $ANTLR start "rule__Root__Group__4"
    // InternalMyDsl.g:281:1: rule__Root__Group__4 : rule__Root__Group__4__Impl rule__Root__Group__5 ;
    public final void rule__Root__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:285:1: ( rule__Root__Group__4__Impl rule__Root__Group__5 )
            // InternalMyDsl.g:286:2: rule__Root__Group__4__Impl rule__Root__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Root__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__5();

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
    // $ANTLR end "rule__Root__Group__4"


    // $ANTLR start "rule__Root__Group__4__Impl"
    // InternalMyDsl.g:293:1: rule__Root__Group__4__Impl : ( ( rule__Root__Group_4__0 )? ) ;
    public final void rule__Root__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ( rule__Root__Group_4__0 )? ) )
            // InternalMyDsl.g:298:1: ( ( rule__Root__Group_4__0 )? )
            {
            // InternalMyDsl.g:298:1: ( ( rule__Root__Group_4__0 )? )
            // InternalMyDsl.g:299:2: ( rule__Root__Group_4__0 )?
            {
             before(grammarAccess.getRootAccess().getGroup_4()); 
            // InternalMyDsl.g:300:2: ( rule__Root__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:300:3: rule__Root__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Root__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRootAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Root__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__5"
    // InternalMyDsl.g:308:1: rule__Root__Group__5 : rule__Root__Group__5__Impl ;
    public final void rule__Root__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:312:1: ( rule__Root__Group__5__Impl )
            // InternalMyDsl.g:313:2: rule__Root__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__5__Impl();

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
    // $ANTLR end "rule__Root__Group__5"


    // $ANTLR start "rule__Root__Group__5__Impl"
    // InternalMyDsl.g:319:1: rule__Root__Group__5__Impl : ( '}' ) ;
    public final void rule__Root__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:323:1: ( ( '}' ) )
            // InternalMyDsl.g:324:1: ( '}' )
            {
            // InternalMyDsl.g:324:1: ( '}' )
            // InternalMyDsl.g:325:2: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Root__Group__5__Impl"


    // $ANTLR start "rule__Root__Group_4__0"
    // InternalMyDsl.g:335:1: rule__Root__Group_4__0 : rule__Root__Group_4__0__Impl rule__Root__Group_4__1 ;
    public final void rule__Root__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:339:1: ( rule__Root__Group_4__0__Impl rule__Root__Group_4__1 )
            // InternalMyDsl.g:340:2: rule__Root__Group_4__0__Impl rule__Root__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_4__1();

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
    // $ANTLR end "rule__Root__Group_4__0"


    // $ANTLR start "rule__Root__Group_4__0__Impl"
    // InternalMyDsl.g:347:1: rule__Root__Group_4__0__Impl : ( 'activities' ) ;
    public final void rule__Root__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( 'activities' ) )
            // InternalMyDsl.g:352:1: ( 'activities' )
            {
            // InternalMyDsl.g:352:1: ( 'activities' )
            // InternalMyDsl.g:353:2: 'activities'
            {
             before(grammarAccess.getRootAccess().getActivitiesKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getActivitiesKeyword_4_0()); 

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
    // $ANTLR end "rule__Root__Group_4__0__Impl"


    // $ANTLR start "rule__Root__Group_4__1"
    // InternalMyDsl.g:362:1: rule__Root__Group_4__1 : rule__Root__Group_4__1__Impl rule__Root__Group_4__2 ;
    public final void rule__Root__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:1: ( rule__Root__Group_4__1__Impl rule__Root__Group_4__2 )
            // InternalMyDsl.g:367:2: rule__Root__Group_4__1__Impl rule__Root__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_4__2();

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
    // $ANTLR end "rule__Root__Group_4__1"


    // $ANTLR start "rule__Root__Group_4__1__Impl"
    // InternalMyDsl.g:374:1: rule__Root__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Root__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( '{' ) )
            // InternalMyDsl.g:379:1: ( '{' )
            {
            // InternalMyDsl.g:379:1: ( '{' )
            // InternalMyDsl.g:380:2: '{'
            {
             before(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Root__Group_4__1__Impl"


    // $ANTLR start "rule__Root__Group_4__2"
    // InternalMyDsl.g:389:1: rule__Root__Group_4__2 : rule__Root__Group_4__2__Impl rule__Root__Group_4__3 ;
    public final void rule__Root__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:393:1: ( rule__Root__Group_4__2__Impl rule__Root__Group_4__3 )
            // InternalMyDsl.g:394:2: rule__Root__Group_4__2__Impl rule__Root__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_4__3();

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
    // $ANTLR end "rule__Root__Group_4__2"


    // $ANTLR start "rule__Root__Group_4__2__Impl"
    // InternalMyDsl.g:401:1: rule__Root__Group_4__2__Impl : ( ( rule__Root__ActivitiesAssignment_4_2 ) ) ;
    public final void rule__Root__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( rule__Root__ActivitiesAssignment_4_2 ) ) )
            // InternalMyDsl.g:406:1: ( ( rule__Root__ActivitiesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:406:1: ( ( rule__Root__ActivitiesAssignment_4_2 ) )
            // InternalMyDsl.g:407:2: ( rule__Root__ActivitiesAssignment_4_2 )
            {
             before(grammarAccess.getRootAccess().getActivitiesAssignment_4_2()); 
            // InternalMyDsl.g:408:2: ( rule__Root__ActivitiesAssignment_4_2 )
            // InternalMyDsl.g:408:3: rule__Root__ActivitiesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Root__ActivitiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getActivitiesAssignment_4_2()); 

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
    // $ANTLR end "rule__Root__Group_4__2__Impl"


    // $ANTLR start "rule__Root__Group_4__3"
    // InternalMyDsl.g:416:1: rule__Root__Group_4__3 : rule__Root__Group_4__3__Impl rule__Root__Group_4__4 ;
    public final void rule__Root__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:420:1: ( rule__Root__Group_4__3__Impl rule__Root__Group_4__4 )
            // InternalMyDsl.g:421:2: rule__Root__Group_4__3__Impl rule__Root__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Root__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_4__4();

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
    // $ANTLR end "rule__Root__Group_4__3"


    // $ANTLR start "rule__Root__Group_4__3__Impl"
    // InternalMyDsl.g:428:1: rule__Root__Group_4__3__Impl : ( ( rule__Root__Group_4_3__0 )* ) ;
    public final void rule__Root__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( ( rule__Root__Group_4_3__0 )* ) )
            // InternalMyDsl.g:433:1: ( ( rule__Root__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:433:1: ( ( rule__Root__Group_4_3__0 )* )
            // InternalMyDsl.g:434:2: ( rule__Root__Group_4_3__0 )*
            {
             before(grammarAccess.getRootAccess().getGroup_4_3()); 
            // InternalMyDsl.g:435:2: ( rule__Root__Group_4_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:435:3: rule__Root__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Root__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Root__Group_4__3__Impl"


    // $ANTLR start "rule__Root__Group_4__4"
    // InternalMyDsl.g:443:1: rule__Root__Group_4__4 : rule__Root__Group_4__4__Impl ;
    public final void rule__Root__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:447:1: ( rule__Root__Group_4__4__Impl )
            // InternalMyDsl.g:448:2: rule__Root__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_4__4__Impl();

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
    // $ANTLR end "rule__Root__Group_4__4"


    // $ANTLR start "rule__Root__Group_4__4__Impl"
    // InternalMyDsl.g:454:1: rule__Root__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Root__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( ( '}' ) )
            // InternalMyDsl.g:459:1: ( '}' )
            {
            // InternalMyDsl.g:459:1: ( '}' )
            // InternalMyDsl.g:460:2: '}'
            {
             before(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Root__Group_4__4__Impl"


    // $ANTLR start "rule__Root__Group_4_3__0"
    // InternalMyDsl.g:470:1: rule__Root__Group_4_3__0 : rule__Root__Group_4_3__0__Impl rule__Root__Group_4_3__1 ;
    public final void rule__Root__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:474:1: ( rule__Root__Group_4_3__0__Impl rule__Root__Group_4_3__1 )
            // InternalMyDsl.g:475:2: rule__Root__Group_4_3__0__Impl rule__Root__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Root__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group_4_3__1();

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
    // $ANTLR end "rule__Root__Group_4_3__0"


    // $ANTLR start "rule__Root__Group_4_3__0__Impl"
    // InternalMyDsl.g:482:1: rule__Root__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Root__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( ( ',' ) )
            // InternalMyDsl.g:487:1: ( ',' )
            {
            // InternalMyDsl.g:487:1: ( ',' )
            // InternalMyDsl.g:488:2: ','
            {
             before(grammarAccess.getRootAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRootAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Root__Group_4_3__0__Impl"


    // $ANTLR start "rule__Root__Group_4_3__1"
    // InternalMyDsl.g:497:1: rule__Root__Group_4_3__1 : rule__Root__Group_4_3__1__Impl ;
    public final void rule__Root__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:501:1: ( rule__Root__Group_4_3__1__Impl )
            // InternalMyDsl.g:502:2: rule__Root__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Root__Group_4_3__1"


    // $ANTLR start "rule__Root__Group_4_3__1__Impl"
    // InternalMyDsl.g:508:1: rule__Root__Group_4_3__1__Impl : ( ( rule__Root__ActivitiesAssignment_4_3_1 ) ) ;
    public final void rule__Root__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( ( ( rule__Root__ActivitiesAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:513:1: ( ( rule__Root__ActivitiesAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:513:1: ( ( rule__Root__ActivitiesAssignment_4_3_1 ) )
            // InternalMyDsl.g:514:2: ( rule__Root__ActivitiesAssignment_4_3_1 )
            {
             before(grammarAccess.getRootAccess().getActivitiesAssignment_4_3_1()); 
            // InternalMyDsl.g:515:2: ( rule__Root__ActivitiesAssignment_4_3_1 )
            // InternalMyDsl.g:515:3: rule__Root__ActivitiesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Root__ActivitiesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getActivitiesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Root__Group_4_3__1__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalMyDsl.g:524:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:528:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalMyDsl.g:529:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalMyDsl.g:536:1: rule__Activity__Group__0__Impl : ( () ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( () ) )
            // InternalMyDsl.g:541:1: ( () )
            {
            // InternalMyDsl.g:541:1: ( () )
            // InternalMyDsl.g:542:2: ()
            {
             before(grammarAccess.getActivityAccess().getActivityAction_0()); 
            // InternalMyDsl.g:543:2: ()
            // InternalMyDsl.g:543:3: 
            {
            }

             after(grammarAccess.getActivityAccess().getActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalMyDsl.g:551:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:555:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalMyDsl.g:556:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__2();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalMyDsl.g:563:1: rule__Activity__Group__1__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( 'Activity' ) )
            // InternalMyDsl.g:568:1: ( 'Activity' )
            {
            // InternalMyDsl.g:568:1: ( 'Activity' )
            // InternalMyDsl.g:569:2: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_1()); 

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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // InternalMyDsl.g:578:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalMyDsl.g:583:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__3();

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
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // InternalMyDsl.g:590:1: rule__Activity__Group__2__Impl : ( ( rule__Activity__NameAssignment_2 ) ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:594:1: ( ( ( rule__Activity__NameAssignment_2 ) ) )
            // InternalMyDsl.g:595:1: ( ( rule__Activity__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:595:1: ( ( rule__Activity__NameAssignment_2 ) )
            // InternalMyDsl.g:596:2: ( rule__Activity__NameAssignment_2 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:597:2: ( rule__Activity__NameAssignment_2 )
            // InternalMyDsl.g:597:3: rule__Activity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // InternalMyDsl.g:605:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:609:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // InternalMyDsl.g:610:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__4();

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
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // InternalMyDsl.g:617:1: rule__Activity__Group__3__Impl : ( '{' ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( '{' ) )
            // InternalMyDsl.g:622:1: ( '{' )
            {
            // InternalMyDsl.g:622:1: ( '{' )
            // InternalMyDsl.g:623:2: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // InternalMyDsl.g:632:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:636:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // InternalMyDsl.g:637:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__5();

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
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // InternalMyDsl.g:644:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // InternalMyDsl.g:649:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // InternalMyDsl.g:649:1: ( ( rule__Activity__Group_4__0 )? )
            // InternalMyDsl.g:650:2: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // InternalMyDsl.g:651:2: ( rule__Activity__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:651:3: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // InternalMyDsl.g:659:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:663:1: ( rule__Activity__Group__5__Impl )
            // InternalMyDsl.g:664:2: rule__Activity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__5__Impl();

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
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // InternalMyDsl.g:670:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( ( '}' ) )
            // InternalMyDsl.g:675:1: ( '}' )
            {
            // InternalMyDsl.g:675:1: ( '}' )
            // InternalMyDsl.g:676:2: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // InternalMyDsl.g:686:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // InternalMyDsl.g:691:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__1();

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
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // InternalMyDsl.g:698:1: rule__Activity__Group_4__0__Impl : ( 'sequences' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( 'sequences' ) )
            // InternalMyDsl.g:703:1: ( 'sequences' )
            {
            // InternalMyDsl.g:703:1: ( 'sequences' )
            // InternalMyDsl.g:704:2: 'sequences'
            {
             before(grammarAccess.getActivityAccess().getSequencesKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getSequencesKeyword_4_0()); 

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
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // InternalMyDsl.g:713:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2 )
            // InternalMyDsl.g:718:2: rule__Activity__Group_4__1__Impl rule__Activity__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__2();

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
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // InternalMyDsl.g:725:1: rule__Activity__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( '{' ) )
            // InternalMyDsl.g:730:1: ( '{' )
            {
            // InternalMyDsl.g:730:1: ( '{' )
            // InternalMyDsl.g:731:2: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__2"
    // InternalMyDsl.g:740:1: rule__Activity__Group_4__2 : rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 ;
    public final void rule__Activity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3 )
            // InternalMyDsl.g:745:2: rule__Activity__Group_4__2__Impl rule__Activity__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Activity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__3();

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
    // $ANTLR end "rule__Activity__Group_4__2"


    // $ANTLR start "rule__Activity__Group_4__2__Impl"
    // InternalMyDsl.g:752:1: rule__Activity__Group_4__2__Impl : ( ( rule__Activity__SequencesAssignment_4_2 ) ) ;
    public final void rule__Activity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:756:1: ( ( ( rule__Activity__SequencesAssignment_4_2 ) ) )
            // InternalMyDsl.g:757:1: ( ( rule__Activity__SequencesAssignment_4_2 ) )
            {
            // InternalMyDsl.g:757:1: ( ( rule__Activity__SequencesAssignment_4_2 ) )
            // InternalMyDsl.g:758:2: ( rule__Activity__SequencesAssignment_4_2 )
            {
             before(grammarAccess.getActivityAccess().getSequencesAssignment_4_2()); 
            // InternalMyDsl.g:759:2: ( rule__Activity__SequencesAssignment_4_2 )
            // InternalMyDsl.g:759:3: rule__Activity__SequencesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Activity__SequencesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSequencesAssignment_4_2()); 

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
    // $ANTLR end "rule__Activity__Group_4__2__Impl"


    // $ANTLR start "rule__Activity__Group_4__3"
    // InternalMyDsl.g:767:1: rule__Activity__Group_4__3 : rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4 ;
    public final void rule__Activity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4 )
            // InternalMyDsl.g:772:2: rule__Activity__Group_4__3__Impl rule__Activity__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Activity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__4();

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
    // $ANTLR end "rule__Activity__Group_4__3"


    // $ANTLR start "rule__Activity__Group_4__3__Impl"
    // InternalMyDsl.g:779:1: rule__Activity__Group_4__3__Impl : ( ( rule__Activity__Group_4_3__0 )* ) ;
    public final void rule__Activity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ( rule__Activity__Group_4_3__0 )* ) )
            // InternalMyDsl.g:784:1: ( ( rule__Activity__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:784:1: ( ( rule__Activity__Group_4_3__0 )* )
            // InternalMyDsl.g:785:2: ( rule__Activity__Group_4_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_4_3()); 
            // InternalMyDsl.g:786:2: ( rule__Activity__Group_4_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:786:3: rule__Activity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Activity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Activity__Group_4__3__Impl"


    // $ANTLR start "rule__Activity__Group_4__4"
    // InternalMyDsl.g:794:1: rule__Activity__Group_4__4 : rule__Activity__Group_4__4__Impl ;
    public final void rule__Activity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( rule__Activity__Group_4__4__Impl )
            // InternalMyDsl.g:799:2: rule__Activity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_4__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_4__4"


    // $ANTLR start "rule__Activity__Group_4__4__Impl"
    // InternalMyDsl.g:805:1: rule__Activity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Activity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( ( '}' ) )
            // InternalMyDsl.g:810:1: ( '}' )
            {
            // InternalMyDsl.g:810:1: ( '}' )
            // InternalMyDsl.g:811:2: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Activity__Group_4__4__Impl"


    // $ANTLR start "rule__Activity__Group_4_3__0"
    // InternalMyDsl.g:821:1: rule__Activity__Group_4_3__0 : rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1 ;
    public final void rule__Activity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1 )
            // InternalMyDsl.g:826:2: rule__Activity__Group_4_3__0__Impl rule__Activity__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Activity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group_4_3__1();

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
    // $ANTLR end "rule__Activity__Group_4_3__0"


    // $ANTLR start "rule__Activity__Group_4_3__0__Impl"
    // InternalMyDsl.g:833:1: rule__Activity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ',' ) )
            // InternalMyDsl.g:838:1: ( ',' )
            {
            // InternalMyDsl.g:838:1: ( ',' )
            // InternalMyDsl.g:839:2: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_4_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Activity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_4_3__1"
    // InternalMyDsl.g:848:1: rule__Activity__Group_4_3__1 : rule__Activity__Group_4_3__1__Impl ;
    public final void rule__Activity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( rule__Activity__Group_4_3__1__Impl )
            // InternalMyDsl.g:853:2: rule__Activity__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Activity__Group_4_3__1"


    // $ANTLR start "rule__Activity__Group_4_3__1__Impl"
    // InternalMyDsl.g:859:1: rule__Activity__Group_4_3__1__Impl : ( ( rule__Activity__SequencesAssignment_4_3_1 ) ) ;
    public final void rule__Activity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( ( ( rule__Activity__SequencesAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:864:1: ( ( rule__Activity__SequencesAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:864:1: ( ( rule__Activity__SequencesAssignment_4_3_1 ) )
            // InternalMyDsl.g:865:2: ( rule__Activity__SequencesAssignment_4_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSequencesAssignment_4_3_1()); 
            // InternalMyDsl.g:866:2: ( rule__Activity__SequencesAssignment_4_3_1 )
            // InternalMyDsl.g:866:3: rule__Activity__SequencesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__SequencesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSequencesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Activity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // InternalMyDsl.g:875:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // InternalMyDsl.g:880:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sequence__Group__1();

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
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // InternalMyDsl.g:887:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( () ) )
            // InternalMyDsl.g:892:1: ( () )
            {
            // InternalMyDsl.g:892:1: ( () )
            // InternalMyDsl.g:893:2: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // InternalMyDsl.g:894:2: ()
            // InternalMyDsl.g:894:3: 
            {
            }

             after(grammarAccess.getSequenceAccess().getSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // InternalMyDsl.g:902:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // InternalMyDsl.g:907:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sequence__Group__2();

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
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // InternalMyDsl.g:914:1: rule__Sequence__Group__1__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( 'Sequence' ) )
            // InternalMyDsl.g:919:1: ( 'Sequence' )
            {
            // InternalMyDsl.g:919:1: ( 'Sequence' )
            // InternalMyDsl.g:920:2: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 

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
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // InternalMyDsl.g:929:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( rule__Sequence__Group__2__Impl )
            // InternalMyDsl.g:934:2: rule__Sequence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__2__Impl();

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
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // InternalMyDsl.g:940:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__NameAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( ( rule__Sequence__NameAssignment_2 ) ) )
            // InternalMyDsl.g:945:1: ( ( rule__Sequence__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:945:1: ( ( rule__Sequence__NameAssignment_2 ) )
            // InternalMyDsl.g:946:2: ( rule__Sequence__NameAssignment_2 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:947:2: ( rule__Sequence__NameAssignment_2 )
            // InternalMyDsl.g:947:3: rule__Sequence__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Root__NameAssignment_2"
    // InternalMyDsl.g:956:1: rule__Root__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Root__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( ( ruleEString ) )
            // InternalMyDsl.g:961:2: ( ruleEString )
            {
            // InternalMyDsl.g:961:2: ( ruleEString )
            // InternalMyDsl.g:962:3: ruleEString
            {
             before(grammarAccess.getRootAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRootAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__NameAssignment_2"


    // $ANTLR start "rule__Root__ActivitiesAssignment_4_2"
    // InternalMyDsl.g:971:1: rule__Root__ActivitiesAssignment_4_2 : ( ruleActivity ) ;
    public final void rule__Root__ActivitiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( ( ruleActivity ) )
            // InternalMyDsl.g:976:2: ( ruleActivity )
            {
            // InternalMyDsl.g:976:2: ( ruleActivity )
            // InternalMyDsl.g:977:3: ruleActivity
            {
             before(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Root__ActivitiesAssignment_4_2"


    // $ANTLR start "rule__Root__ActivitiesAssignment_4_3_1"
    // InternalMyDsl.g:986:1: rule__Root__ActivitiesAssignment_4_3_1 : ( ruleActivity ) ;
    public final void rule__Root__ActivitiesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( ( ruleActivity ) )
            // InternalMyDsl.g:991:2: ( ruleActivity )
            {
            // InternalMyDsl.g:991:2: ( ruleActivity )
            // InternalMyDsl.g:992:3: ruleActivity
            {
             before(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Root__ActivitiesAssignment_4_3_1"


    // $ANTLR start "rule__Activity__NameAssignment_2"
    // InternalMyDsl.g:1001:1: rule__Activity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Activity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1005:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1006:2: ( ruleEString )
            {
            // InternalMyDsl.g:1006:2: ( ruleEString )
            // InternalMyDsl.g:1007:3: ruleEString
            {
             before(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Activity__NameAssignment_2"


    // $ANTLR start "rule__Activity__SequencesAssignment_4_2"
    // InternalMyDsl.g:1016:1: rule__Activity__SequencesAssignment_4_2 : ( ruleSequence ) ;
    public final void rule__Activity__SequencesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( ( ruleSequence ) )
            // InternalMyDsl.g:1021:2: ( ruleSequence )
            {
            // InternalMyDsl.g:1021:2: ( ruleSequence )
            // InternalMyDsl.g:1022:3: ruleSequence
            {
             before(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Activity__SequencesAssignment_4_2"


    // $ANTLR start "rule__Activity__SequencesAssignment_4_3_1"
    // InternalMyDsl.g:1031:1: rule__Activity__SequencesAssignment_4_3_1 : ( ruleSequence ) ;
    public final void rule__Activity__SequencesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( ruleSequence ) )
            // InternalMyDsl.g:1036:2: ( ruleSequence )
            {
            // InternalMyDsl.g:1036:2: ( ruleSequence )
            // InternalMyDsl.g:1037:3: ruleSequence
            {
             before(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Activity__SequencesAssignment_4_3_1"


    // $ANTLR start "rule__Sequence__NameAssignment_2"
    // InternalMyDsl.g:1046:1: rule__Sequence__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sequence__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1050:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1051:2: ( ruleEString )
            {
            // InternalMyDsl.g:1051:2: ( ruleEString )
            // InternalMyDsl.g:1052:3: ruleEString
            {
             before(grammarAccess.getSequenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Sequence__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});

}