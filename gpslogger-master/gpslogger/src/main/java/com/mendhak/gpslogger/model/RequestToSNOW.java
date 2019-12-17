package com.mendhak.gpslogger.model;

public class RequestToSNOW {

        private u_request u_request;

        private u_response u_response;

        private String u_tracking_type;

        private String u_status;

    public RequestToSNOW() {
    }

    public void setU_request(u_request u_request){
            this.u_request = u_request;
        }
        public u_request getU_request(){
            return this.u_request;
        }
        public void setU_response(u_response u_response){
            this.u_response = u_response;
        }
        public u_response getU_response(){
            return this.u_response;
        }
        public void setU_tracking_type(String u_tracking_type){
            this.u_tracking_type = u_tracking_type;
        }
        public String getU_tracking_type(){
            return this.u_tracking_type;
        }
        public void setU_status(String u_status){
            this.u_status = u_status;
        }
        public String getU_status(){
            return this.u_status;
        }

    @Override
    public String toString() {
        return "RequestToSNOW{" +
                "u_request=" + u_request +
                ", u_response=" + u_response +
                ", u_tracking_type='" + u_tracking_type + '\'' +
                ", u_status='" + u_status + '\'' +
                '}';
    }
}
