public String findByLogin(String userName, String password) {
        String result = "LoginFailure";
        if (studentRepository != null) {
//			boolean status = studentRepository.findByLoginSQL(userName, password);
            boolean status = studentRepository.findByLogin(userName, password);
            if (status) {
                result = "LoginSuccess";
            }
        }
        return result;
    }