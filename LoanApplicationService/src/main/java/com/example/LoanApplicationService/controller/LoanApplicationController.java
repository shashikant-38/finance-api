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
    @PostMapping
    public ResponseEntity<LoanApplication> createLoan(
            @RequestBody LoanApplication loanApplication) {

        LoanApplication savedLoan =
                loanApplicationService.createLoan(loanApplication);

        return new ResponseEntity<>(savedLoan, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LoanApplication>> getAllLoans() {

        List<LoanApplication> loans =
                loanApplicationService.getAllLoans();

        return ResponseEntity.ok(loans);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoanApplication> getLoanById(
            @PathVariable Long id) {

        LoanApplication loan =
                loanApplicationService.getLoanById(id);

        return ResponseEntity.ok(loan);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LoanApplication> updateLoan(
            @PathVariable Long id,
            @RequestBody LoanApplication loanApplication) {

        LoanApplication updatedLoan =
                loanApplicationService.updateLoan(id, loanApplication);

        return ResponseEntity.ok(updatedLoan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoan(
            @PathVariable Long id) {

        loanApplicationService.deleteLoan(id);

        return ResponseEntity.noContent().build();
    }
}