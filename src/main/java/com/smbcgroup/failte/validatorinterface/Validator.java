package com.smbcgroup.failte.validatorinterface;

import com.smbcgroup.failte.exception.ValidatorException;

/**
 * @author Mark
 * 16 Jun 2019
 */
public interface Validator {

	public boolean validate() throws ValidatorException;
}
