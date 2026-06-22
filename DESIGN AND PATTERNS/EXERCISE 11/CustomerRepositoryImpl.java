class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if(id == 101) {
            return "Shree Hari";
        }

        return "Customer Not Found";
    }
}