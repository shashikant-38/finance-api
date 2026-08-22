package com.example.LoanApplicationService.controller;

import com.example.LoanApplicationService.model.LoanApplication;
import com.example.LoanApplicationService.service.LoanApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loans")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    // Create loan application
    @PostMapping
    public ResponseEntity<LoanApplication> createLoan(
            @RequestBody LoanApplication loanApplication) {

        LoanApplication savedLoan =
                loanApplicationService.createLoan(loanApplication);

        return new ResponseEntity<>(savedLoan, HttpStatus.CREATED);
    }

    // Get all loan applications
    @GetMapping
    public ResponseEntity<List<LoanApplication>> getAllLoans() {

        List<LoanApplication> loans =
                loanApplicationService.getAllLoans();

        return ResponseEntity.ok(loans);
    }

    // Get loan by ID
    @GetMapping("/{id}")
    public ResponseEntity<LoanApplication> getLoanById(
            @PathVariable Long id) {

        LoanApplication loan =
                loanApplicationService.getLoanById(id);

        return ResponseEntity.ok(loan);
    }


}