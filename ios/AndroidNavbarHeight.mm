#import "AndroidNavbarHeight.h"

@implementation AndroidNavbarHeight
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(getNavigationBarHeightAsync: (RCTPromiseResolveBlock)resolve
                  reject:(RCTPromiseRejectBlock)reject)
{
    resolve([NSNumber numberWithDouble:0.0]);
}

RCT_EXPORT_BLOCKING_SYNCHRONOUS_METHOD(getNavigationBarHeight)
{
    return [NSNumber numberWithDouble:0.0];
}

// Don't compile this code when we build for the old architecture.
#ifdef RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeAndroidNavbarHeightSpecJSI>(params);
}
#endif

@end
