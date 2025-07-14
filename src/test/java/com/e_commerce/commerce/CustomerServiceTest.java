package com.e_commerce.commerce;

import com.e_commerce.commerce.dto.CustomerSaveRequestDto;
import com.e_commerce.commerce.model.Customer;
import com.e_commerce.commerce.repository.CustomerRepository;
import com.e_commerce.commerce.service.CustomerService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
public class CustomerServiceTest {

    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Mock
    private ModelMapper modelMapper;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        customerService = new CustomerService(customerRepository, modelMapper);
    }

    @Test
    public void should_Success_When_AddCustomer() {
        // arrange
        CustomerSaveRequestDto dto = new CustomerSaveRequestDto();
        Customer customer = new Customer();

        when(modelMapper.map(dto, Customer.class)).thenReturn(customer);

        // act
        Boolean result = customerService.saveCustomer(dto);

        // assert
        verify(customerRepository, times(1)).save(customer);
        assert(result);
    }
}
