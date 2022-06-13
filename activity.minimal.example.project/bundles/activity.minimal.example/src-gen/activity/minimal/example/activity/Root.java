/**
 */
package activity.minimal.example.activity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activity.minimal.example.activity.Root#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see activity.minimal.example.activity.ActivityPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link activity.minimal.example.activity.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see activity.minimal.example.activity.ActivityPackage#getRoot_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // Root
