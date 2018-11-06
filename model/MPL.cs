SYNTAXDEF mpl
FOR <http://mdsd.edu/mpl/1.0>
START Program


OPTIONS {
	reloadGeneratorModel = "true";
	defaultTokenName= "IDENTIFIER_TOKEN";
}

TOKENS{
DEFINE IDENTIFIER_TOKEN $ ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*$;
DEFINE INTEGER_TOKEN $('-')?('0'..'9')+$;
DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
DEFINE ML_COMMENT  $'/*'.*'*/'$;
}


RULES {
Program::="Program" name[] (variabledeclarations ("," variabledeclarations)* ".")? (statement)* "End" ".";
VariableDeclaration::= variable;
Variable::= name[];

@Operator(type="primitive", weight="5", superclass="Expression")

VariableRefrence::= variable[];

@Operator(type="primitive", weight="5", superclass="Expression")
LiteralValue::= rawValue[INTEGER_TOKEN];
 
   @Operator(type="binary_left_associative", weight="1", superclass="Expression")
 AddExpression::= operand1 "+" operand2;

 
    
 Assignment::= leftHandSide ":=" rightHandSide ".";
    
   

	
	
}