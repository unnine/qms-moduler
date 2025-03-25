package iit.qms.web.sample.controller;

import iit.qms.web.sample.service.CapaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class CapaController {

    private final CapaService capaService;


    @GetMapping
    public ResponseEntity<?> search() {
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> request() {
        capaService.request();
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{processId}/next-process")
    public ResponseEntity<?> nextProcess(@PathVariable Long processId) {
        capaService.toNextProcess(processId);
        return ResponseEntity.ok().build();
    }

}
