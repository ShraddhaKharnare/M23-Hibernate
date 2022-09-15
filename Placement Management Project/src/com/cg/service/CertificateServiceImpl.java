package com.cg.service;

import com.cg.dao.CertificateDao;
import com.cg.dao.CertificateDaoImpl;
import com.cg.entites.Certificate;

public class CertificateServiceImpl implements CertificateService
{
public CertificateDao dao;

	public CertificateServiceImpl() {
	super();
	dao=new CertificateDaoImpl();
}
	
	
	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int cert_id) {
		Certificate certificate=dao.searchCertificate(cert_id);
		return certificate;
				
	}

	@Override
	public Certificate deleteCertificate(int cert_id) {
		Certificate certificate=dao.deleteCertificate(cert_id);
		return certificate;
	}

	

}
