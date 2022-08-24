package com.returnorder.managment.componentprocessingservice.mapper;

import com.returnorder.managment.componentprocessingservice.dto.ProcessResponseDTO;
import com.returnorder.managment.componentprocessingservice.entity.ProcessResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-24T15:06:24+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 1.4.100.v20220318-0906, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class ProcessResponseMapperImpl implements ProcessResponseMapper {

    @Override
    public ProcessResponse processResponseDtoToProcessResponseEntity(ProcessResponseDTO processResponseDto) {
        if ( processResponseDto == null ) {
            return null;
        }

        ProcessResponse processResponse = new ProcessResponse();

        processResponse.setDateOfDelivery( processResponseDto.getDateOfDelivery() );
        processResponse.setPackagingAndDeliveryCharge( processResponseDto.getPackagingAndDeliveryCharge() );
        processResponse.setProcessingCharge( processResponseDto.getProcessingCharge() );

        return processResponse;
    }
}
