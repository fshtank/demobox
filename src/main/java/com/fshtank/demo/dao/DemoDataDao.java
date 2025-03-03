package com.fshtank.demo.dao;




import com.fshtank.demo.model.DemoData;
import com.fshtank.demo.model.DemoWebRequest;

import java.util.List;

public interface DemoDataDao {

//     public List<BlsData> getCampaigns(BlsWebRequest blsWebRequest);
        public List<DemoData> getCampaigns(DemoWebRequest demoWebRequest) ;


}
