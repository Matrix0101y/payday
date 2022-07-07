package az.express.service;

import az.express.data.dto.request.LoginRequestDto;
import az.express.data.dto.request.RegisterRequestDto;
import az.express.data.dto.request.ResetPasswordRequestDto;
import az.express.data.dto.response.LoginResponseDto;

public interface UserService {

    LoginResponseDto login(LoginRequestDto loginRequestDto);

    void register(RegisterRequestDto registerRequestDto);

    void registerConfirm(String activationCode);

    void resendEmail(String email);

    void forgetPassword(String email);

    void resetPassword(ResetPasswordRequestDto requestDto);
}
