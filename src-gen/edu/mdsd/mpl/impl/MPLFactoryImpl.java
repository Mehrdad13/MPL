/**
 */
package edu.mdsd.mpl.impl;

import edu.mdsd.mpl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MPLFactoryImpl extends EFactoryImpl implements MPLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPLFactory init() {
		try {
			MPLFactory theMPLFactory = (MPLFactory)EPackage.Registry.INSTANCE.getEFactory(MPLPackage.eNS_URI);
			if (theMPLFactory != null) {
				return theMPLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MPLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MPLPackage.PROGRAM: return createProgram();
			case MPLPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case MPLPackage.ASSIGNMET: return createAssignmet();
			case MPLPackage.EXPRESSION_STATEMENT: return createExpressionStatement();
			case MPLPackage.VARIABLE: return createVariable();
			case MPLPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
			case MPLPackage.LITERAL_VALUE: return createLiteralValue();
			case MPLPackage.VARIABLE_REFRENCE: return createVariableRefrence();
			case MPLPackage.ADD_EXPRESSION: return createAddExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignmet createAssignmet() {
		AssignmetImpl assignmet = new AssignmetImpl();
		return assignmet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionStatement createExpressionStatement() {
		ExpressionStatementImpl expressionStatement = new ExpressionStatementImpl();
		return expressionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralValue createLiteralValue() {
		LiteralValueImpl literalValue = new LiteralValueImpl();
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableRefrence createVariableRefrence() {
		VariableRefrenceImpl variableRefrence = new VariableRefrenceImpl();
		return variableRefrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddExpression createAddExpression() {
		AddExpressionImpl addExpression = new AddExpressionImpl();
		return addExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPLPackage getMPLPackage() {
		return (MPLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MPLPackage getPackage() {
		return MPLPackage.eINSTANCE;
	}

} //MPLFactoryImpl
