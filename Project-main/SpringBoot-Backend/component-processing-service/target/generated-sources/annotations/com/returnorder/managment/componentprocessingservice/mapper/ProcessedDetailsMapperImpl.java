package com.returnorder.managment.componentprocessingservice.mapper;

import com.returnorder.managment.componentprocessingservice.dto.ProcessedDetailsDTO;
import com.returnorder.managment.componentprocessingservice.entity.ProcessRequest;
import com.returnorder.managment.componentprocessingservice.entity.ProcessResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-24T15:06:22+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class ProcessedDetailsMapperImpl implements ProcessedDetailsMapper {

    @Override
    public ProcessedDetailsDTO processResponseEntityToProcessedDetailsDto(ProcessRequest processRequest, ProcessResponse processResponse) {
        if ( processRequest == null && processResponse == null ) {
            return null;
        }

        ProcessedDetailsDTO processedDetailsDTO = new ProcessedDetailsDTO();

        if ( processRequest != null ) {
            processedDetailsDTO.setCustomerName( processRequest.getCustomerName() );
            processedDetailsDTO.setCustomerNumber( processRequest.getContactNumber() );
            processedDetailsDTO.setComponentType( processRequest.getComponentType() );
            processedDetailsDTO.setComponentName( processRequest.getComponentName() );
            processedDetailsDTO.setQuantity( processRequest.getQuantity() );
        }
        if ( processResponse != null ) {
            processedDetailsDTO.setDateOfDelivery( processResponse.getDateOfDelivery() );
            processedDetailsDTO.setPackagingAndDeliveryCharge( processResponse.getPackagingAndDeliveryCharge() );
            processedDetailsDTO.setProcessingCharge( processResponse.getProcessingCharge() );
        }

        return processedDetailsDTO;
    }
}
