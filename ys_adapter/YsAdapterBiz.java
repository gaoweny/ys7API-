package com.zenhome.cloud2cloud.service.ys_adapter;

import com.zenhome.cloud2cloud.domain.http.RetBody;
import com.zenhome.cloud2cloud.domain.http.rqbean.BaseBindDev;
import com.zenhome.cloud2cloud.domain.http.rqbean.ReqBindDev;

/**
 * Created by Gao on 2017/7/26.
 */
public interface YsAdapterBiz {
    RetBody handBindDevices(ReqBindDev reqBindDev);
    RetBody handUnbindDevices(BaseBindDev req);
}
