package com.greglturnquist.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //1
public class DatabaseLoader implements CommandLineRunner { //2 executa depoois que os beens forem criados e registrados
    private final EmployeeRepository repository;
    @Autowired //3 pega
    public DatabaseLoader(EmployeeRepository repository){
        this.repository=repository;
    }
    @Override
    public void run(String...Strings) throws Exception{ //carrega os dados
        this.repository.save(new Employee("Guilherme","Miguel","estagiario"));
    }
}
