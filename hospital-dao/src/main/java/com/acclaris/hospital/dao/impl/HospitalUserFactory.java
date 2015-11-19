package com.acclaris.hospital.dao.impl;
import com.acclaris.hospital.model.user.HospitalUser;
import com.acclaris.hospital.model.user.manager.DoctorManager;
import com.acclaris.hospital.model.user.manager.InventoryManager;
import com.acclaris.hospital.model.user.manager.VehicleManager;
import com.acclaris.hospital.model.user.staff.Doctor;
import com.acclaris.hospital.model.user.staff.Driver;
import com.acclaris.hospital.model.user.staff.Nurse;

public class HospitalUserFactory {

	public static HospitalUser getHospitalUser(String roleId) {
		HospitalUser hospitalUser = null;
		if (roleId == null) {
			return null;
		}

		switch (roleId) {
		case "2":
			hospitalUser = new InventoryManager();
			break;
		case "3":
			hospitalUser = new VehicleManager();
			break;
		case "4":
			hospitalUser = new InventoryManager();
			break;
		case "5":
			hospitalUser = new DoctorManager();
			break;
		case "6":
			hospitalUser = new InventoryManager();
			break;
		case "7":
			hospitalUser = new Doctor();
			break;
		case "8":
			hospitalUser = new Driver();
			break;
		case "9":
			hospitalUser = new Nurse();
			break;

		default:
			break;
		}

		return hospitalUser;
	}

}
