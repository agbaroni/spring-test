package io.github.agbaroni.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "accounts",
		consumes = "application/json",
		produces = "application/json")
public class Accounts {

    @GetMapping("/{username}")
    public Account getAccount(@PathVariable String username) {
	if ("alessio".equals(username)) {
	    var account = new Account();

	    account.setUsername(username);

	    return account;
	}

	return null;
    }
}
