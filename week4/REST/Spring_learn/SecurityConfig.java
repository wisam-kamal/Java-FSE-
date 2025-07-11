@Override
protected void configure(HttpSecurity httpSecurity) throws Exception {
    httpSecurity.csrf().disable().httpBasic().and()
        .authorizeRequests()
        .antMatchers("/countries").hasRole("USER")
        .antMatchers("/authenticate").hasAnyRole("USER", "ADMIN"); // allow both roles
}
