package edu.esprit.successPathWeb.ctr;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import edu.esprit.successPath.services.ManagmentServicesLocal;
import edu.esprit.successPath.persistence.Sos;

@ManagedBean
@SessionScoped
public class ManagementServicesCtr {

	// model
	private Sos sos = new Sos();
	private List<Sos> soss = new ArrayList<Sos>();
	private DataModel<Sos> dataModel = new ListDataModel<Sos>();
	private String myLogin;
	private String myPwd;

	// injection of the proxy
	@EJB
	private ManagmentServicesLocal managmentServicesLocal;

	// methods
	public String doPublishSos() {
		managmentServicesLocal.publishSos(sos);
		return "add";

	}

	public String doDeleteSos() {
		Sos sosTMP = dataModel.getRowData();
		managmentServicesLocal.deleteSos(sosTMP);
		return "";

	}

	public String doIdentifyStudent() {

		return managmentServicesLocal.identifyStudent(myLogin, myPwd);

	}

	public Sos getSos() {
		return sos;
	}

	public void setSos(Sos sos) {
		this.sos = sos;
	}

	public List<Sos> getSoss() {
		soss = managmentServicesLocal.findAllSoss();
		return soss;
	}

	public void setSoss(List<Sos> soss) {
		this.soss = soss;
	}

	public DataModel<Sos> getDataModel() {
		dataModel.setWrappedData(managmentServicesLocal.findAllSoss());
		return dataModel;
	}

	public void setDataModel(DataModel<Sos> dataModel) {
		this.dataModel = dataModel;
	}

	public String getMyLogin() {
		return myLogin;
	}

	public void setMyLogin(String myLogin) {
		this.myLogin = myLogin;
	}

	public String getMyPwd() {
		return myPwd;
	}

	public void setMyPwd(String myPwd) {
		this.myPwd = myPwd;
	}

	public ManagmentServicesLocal getManagmentServicesLocal() {
		return managmentServicesLocal;
	}

	public void setManagmentServicesLocal(
			ManagmentServicesLocal managmentServicesLocal) {
		this.managmentServicesLocal = managmentServicesLocal;
	}

}
