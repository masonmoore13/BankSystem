package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.bank.data.BranchRepository;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;

@Service
public class BranchService {

	@Autowired
	private BranchRepository branchRepository;

	public void newBranch() {
		Branch newBranch = new Branch("Branch A");

		branchRepository.save(newBranch);
	}

	public List<Map<String, Object>> getAllBranches() {
		List<Map<String, Object>> branchList = new ArrayList<Map<String, Object>>();

		Map<String, Object> branchInfo = new HashMap<String, Object>();

		Branch branchA = new Branch("Branch A", 1);

		branchInfo.put("name", branchA.getBranchName());
		branchInfo.put("branchId", branchA.getBranchId());

		Map<String, Object> branchInfo2 = new HashMap<String, Object>();

		Branch branchB = new Branch("Branch B", 2);

		branchInfo2.put("name", branchB.getBranchName());
		branchInfo2.put("branchId", branchB.getBranchId());

		branchList.add(branchInfo);
		branchList.add(branchInfo2);

		return branchList;
	}

	public Map<String, Object> buildBranchInfo(Branch branch) {
		Map<String, Object> branchInfo = new HashMap<String, Object>();
		branchInfo.put("name", branch.getBranchName());
		branchInfo.put("branchId", branch.getBranchId());

		return branchInfo;

	}
}
