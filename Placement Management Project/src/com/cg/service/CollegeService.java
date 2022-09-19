package com.cg.service;

import com.cg.entites.College;

public interface CollegeService
{
	College addCollege(College college);
	College updateCollege(College college);
	boolean deleteCollege(long college_id);
	College searchCollege(long college_id);
}
