/**
 * 
 */
package shared;

import java.io.Serializable;


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Etrange02
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class AbstractInstruction implements IInstruction, Serializable {
	
	private static final long serialVersionUID = 5531059771292171658L;
	private String readableRequest;
	private byte[] binaryRequest;
	private byte[] binaryResponse;
	private String name;
	
	public AbstractInstruction() {
		this.binaryRequest = new byte[1024];
		this.binaryResponse = new byte[1024];
	}

	/** 
	 * @return readableRequest
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getReadableRequest() {
		return readableRequest;
	}

	/** 
	 * @param readableRequest readableRequest � d�finir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setReadableRequest(String readableRequest) {
		this.readableRequest = readableRequest;
	}

	/** 
	 * @return binaryRequest
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getBinaryRequest() {
		return binaryRequest;
	}

	/** 
	 * @param binaryRequest binaryRequest � d�finir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBinaryRequest(byte[] binaryRequest) {
		this.binaryRequest = binaryRequest;
	}

	/** 
	 * @return binaryResponse
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public byte[] getBinaryResponse() {
		return binaryResponse;
	}

	/** 
	 * @param binaryResponse binaryResponse � d�finir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBinaryResponse(byte[] binaryResponse) {
		this.binaryResponse = binaryResponse;
	}

	/** 
	 * @return name
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getName() {
		return name;
	}

	/** 
	 * @param name name � d�finir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setName(String name) {
		this.name = name;
	}

}