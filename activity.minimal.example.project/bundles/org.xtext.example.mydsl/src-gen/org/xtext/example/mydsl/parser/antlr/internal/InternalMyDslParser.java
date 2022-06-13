package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Root'", "'{'", "'activities'", "','", "'}'", "'Activity'", "'sequences'", "'Sequence'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalMyDsl.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalMyDsl.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalMyDsl.g:71:1: ruleRoot returns [EObject current=null] : ( () otherlv_1= 'Root' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_activities_6_0 = null;

        EObject lv_activities_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Root' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Root' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Root' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Root' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRootAccess().getRootKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRootAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: (otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:114:4: otherlv_4= 'activities' otherlv_5= '{' ( (lv_activities_6_0= ruleActivity ) ) (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getActivitiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRootAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:122:4: ( (lv_activities_6_0= ruleActivity ) )
                    // InternalMyDsl.g:123:5: (lv_activities_6_0= ruleActivity )
                    {
                    // InternalMyDsl.g:123:5: (lv_activities_6_0= ruleActivity )
                    // InternalMyDsl.g:124:6: lv_activities_6_0= ruleActivity
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_activities_6_0=ruleActivity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						add(
                    							current,
                    							"activities",
                    							lv_activities_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Activity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:141:4: (otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:142:5: otherlv_7= ',' ( (lv_activities_8_0= ruleActivity ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRootAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:146:5: ( (lv_activities_8_0= ruleActivity ) )
                    	    // InternalMyDsl.g:147:6: (lv_activities_8_0= ruleActivity )
                    	    {
                    	    // InternalMyDsl.g:147:6: (lv_activities_8_0= ruleActivity )
                    	    // InternalMyDsl.g:148:7: lv_activities_8_0= ruleActivity
                    	    {

                    	    							newCompositeNode(grammarAccess.getRootAccess().getActivitiesActivityParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_activities_8_0=ruleActivity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activities",
                    	    								lv_activities_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Activity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRootAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:179:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:179:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:180:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:186:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:192:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:193:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:193:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:194:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:202:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleActivity"
    // InternalMyDsl.g:213:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalMyDsl.g:213:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalMyDsl.g:214:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalMyDsl.g:220:1: ruleActivity returns [EObject current=null] : ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sequences_6_0 = null;

        EObject lv_sequences_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:226:2: ( ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:227:2: ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:227:2: ( () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:228:3: () otherlv_1= 'Activity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalMyDsl.g:228:3: ()
            // InternalMyDsl.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActivityAccess().getActivityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActivityAccess().getActivityKeyword_1());
            		
            // InternalMyDsl.g:239:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:240:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:240:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:241:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActivityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActivityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:262:3: (otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:263:4: otherlv_4= 'sequences' otherlv_5= '{' ( (lv_sequences_6_0= ruleSequence ) ) (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getSequencesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:271:4: ( (lv_sequences_6_0= ruleSequence ) )
                    // InternalMyDsl.g:272:5: (lv_sequences_6_0= ruleSequence )
                    {
                    // InternalMyDsl.g:272:5: (lv_sequences_6_0= ruleSequence )
                    // InternalMyDsl.g:273:6: lv_sequences_6_0= ruleSequence
                    {

                    						newCompositeNode(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sequences_6_0=ruleSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActivityRule());
                    						}
                    						add(
                    							current,
                    							"sequences",
                    							lv_sequences_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Sequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:290:4: (otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:291:5: otherlv_7= ',' ( (lv_sequences_8_0= ruleSequence ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:295:5: ( (lv_sequences_8_0= ruleSequence ) )
                    	    // InternalMyDsl.g:296:6: (lv_sequences_8_0= ruleSequence )
                    	    {
                    	    // InternalMyDsl.g:296:6: (lv_sequences_8_0= ruleSequence )
                    	    // InternalMyDsl.g:297:7: lv_sequences_8_0= ruleSequence
                    	    {

                    	    							newCompositeNode(grammarAccess.getActivityAccess().getSequencesSequenceParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_sequences_8_0=ruleSequence();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActivityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sequences",
                    	    								lv_sequences_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Sequence");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleSequence"
    // InternalMyDsl.g:328:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalMyDsl.g:328:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalMyDsl.g:329:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalMyDsl.g:335:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= 'Sequence' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( ( () otherlv_1= 'Sequence' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:342:2: ( () otherlv_1= 'Sequence' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:342:2: ( () otherlv_1= 'Sequence' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:343:3: () otherlv_1= 'Sequence' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:343:3: ()
            // InternalMyDsl.g:344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceAccess().getSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getSequenceKeyword_1());
            		
            // InternalMyDsl.g:354:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:355:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:355:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:356:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSequenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleSequence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});

}